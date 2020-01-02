package com.example.demo.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dao.AdminDao;
import com.example.demo.entites.Article;




@Controller
@RequestMapping(value="/articles")

public class ArticleController {
	
	@Autowired
	AdminDao ad;
	
	@RequestMapping ( value = "/liste" , method = RequestMethod.GET) 
	public String ListView ( Model m ) {
		List liste = (List) ad.findAll();
		m.addAttribute("liste", liste);
		return "tous_article";
	}
	@RequestMapping ( value = "/all" , method = RequestMethod.GET) 
	public String List ( Model m ) {
		List liste = (List) ad.findAll();
		m.addAttribute("liste", liste);
		return "tous";
	}
	
	@RequestMapping(value="/ajout",method=RequestMethod.GET)
	public String ajoutArticle(Model model) {
		
		Article a = new Article();
		model.addAttribute("article", a);
		return "ajout_produit";
	}
	
	@RequestMapping(value="/sauver",method=RequestMethod.POST)
	public String sauver_produit(Article article,Model model) {
		
		ad.save(article);
		List liste = (List) ad.findAll();
		model.addAttribute("liste", liste);
		return "tous_article";
		
	}
	
	@RequestMapping(value="/suppression")
	public String supprimer_article(Model model, @RequestParam(name="id_article", defaultValue="0")int id) {
		ad.deleteById((long) id);
		List liste = (List) ad.findAll();
		model.addAttribute("liste", liste);
		
		return "tous_article";
		
	}
	
	@RequestMapping(value="/afficher", method=RequestMethod.GET)
	public String afficher_article(Model model, @RequestParam(name="id_article", defaultValue="0")int id) {
		
		Optional<Article> a = ad.findById(new Long (id));
		model.addAttribute("article", a);
		ad.deleteById((long) id);
		return "affiche_article";
		
	}
	
	
	@RequestMapping(value="/modifier")
	public String modifier_produit(Article article,Model model, @RequestParam(name="id_article", defaultValue="0")int id) {
		
		ad.save(article);
		
		List liste = (List) ad.findAll();
		model.addAttribute("liste", liste);
		return "tous_article";
		
	}

	
	
	
	
	
	
	
	
}