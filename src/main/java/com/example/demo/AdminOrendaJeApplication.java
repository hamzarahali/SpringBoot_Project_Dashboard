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
		
		Article a1 = new Article("STAR ONE Four Electrique","STAR ONE Four Electrique - 36 Litres - Silver - Garantie 1 an Marque: STAR ONE | Produits similaires par STAR ONE","88 TND","four.jpg","electro");
		Article a3 = new Article ("Chaîne HiFi Essentielb MS4001BT Bluetooth","Micro chaine GRUNDIG MS240.Lecteur CD compatible MP3/WMASimple cassette enregistreur (enregistre la radio, le CD, les ports USB ou SD )Enregistrement synchronisé CD/K7Tuner Digital PLL FM RDS 30 mémoiresPort USB + slot SD : Lecture MP3Fonctions Horloge, Alarme et SleepMise à l'heure automatique via le RDSLoudness AutomatiqueUltra Bass SystemEnceintes 2 voies Bass ReflexTélécommande.","420 TND","hifi3.jpg","hifi") ; 
	    Article a4 = new Article ("Chaîne HiFi Essentielb MS4001BT Bluetooth","Micro chaine GRUNDIG MS240.Lecteur CD compatible MP3/WMASimple cassette enregistreur (enregistre la radio, le CD, les ports USB ou SD )Enregistrement synchronisé CD/K7Tuner Digital PLL FM RDS 30 mémoiresPort USB + slot SD : Lecture MP3Fonctions Horloge, Alarme et SleepMise à l'heure automatique via le RDSLoudness AutomatiqueUltra Bass SystemEnceintes 2 voies Bass ReflexTélécommande.","500 TND","hifi1.jpg","hifi") ;
	    ar.save(a1);
	    ar.save(a3);
	    ar.save(a4);
		
		Client clt = new Client ("Syrine","Dayra","24 rue 1510","syrinedayra@gmail.com","SD123456789") ;
		cd.save(clt) ; 
	
	
	}

}
