package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.AdminDao;
import com.example.demo.entites.Article;




@Controller
@RequestMapping(value="/articles")

public class ArticleController {
	
	@Autowired
	AdminDao ad;
	
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
	

}