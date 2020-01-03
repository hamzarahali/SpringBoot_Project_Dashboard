package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.DaoClient;

@Controller
@RequestMapping(value="/admin")


public class ClientController {
	
	@Autowired
	DaoClient cd;
	
	
/*liste des clients*/
	
	@RequestMapping ( value = "/clients" , method = RequestMethod.GET) 
	public String ListClient ( Model m ) {
		List liste = (List) cd.findAll();
		m.addAttribute("liste", liste);
		return "tous_client";
	}
	
	
	@RequestMapping(value="/suppression")
	public String supprimer_client(Model model, @RequestParam(name="id_client", defaultValue="0")int id) {
		cd.deleteById((long) id);
		List liste = (List) cd.findAll();
		model.addAttribute("liste", liste);
		
		return "tous_client";
		
	}
	
	
	

}
