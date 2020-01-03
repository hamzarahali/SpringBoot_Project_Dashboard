package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.AdminDao;
import com.example.demo.dao.DaoClient;
import com.example.demo.entites.Article;
import com.example.demo.entites.Client;

@SpringBootApplication
public class AdminOrendaJeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AdminOrendaJeApplication.class, args);
	
		AdminDao ar = ctx.getBean(AdminDao.class);
		DaoClient cd = ctx.getBean(DaoClient.class);
		
		Article art = new Article("STAR ONE Four Electrique","STAR ONE Four Electrique - 36 Litres - Silver - Garantie 1 an\n" + 
				"Marque: STAR ONE | Produits similaires par STAR ONE","88 TND","four.jpg","électroménager");
		ar.save(art);
		
		
		Client clt = new Client ("Syrine","Dayra","24 rue 1510","syrinedayra@gmail.com","SD123456789") ;
		cd.save(clt) ; 
	
	
	}

}
