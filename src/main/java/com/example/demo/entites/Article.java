package com.example.demo.entites;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="articles")
@Getter 
@Setter



public class Article {	

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="title")
	private String title;
	@Column(name="description" , columnDefinition = "TEXT")
	
	
	private String description;
	
	@Column(name="price")
	private String price;
	
	@Column(name="img")
	private String img;
	
	@Column ( name = "category" ) 
	private String cat ; 
	
	
	public Article() {
		super();
	}
	
	public Article(Long id, String title, String desc, String prix, String img, String cat) {
		super();
		this.id = id;
		this.title = title;
		this.description = desc;
		this.price = prix;
		this.img = img;
		this.cat = cat;
	}
public Article(String title, String desc, String prix, String img, String cat) {
	super();
	this.title = title;
	this.description = desc;
	this.price = prix;
	this.img = img;
	this.cat = cat;
}



public String getCat() {
	return cat;
}

public void setCat(String cat) {
	this.cat = cat;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}


public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getImg() {
	return img;
}

public void setImg(String img) {
	this.img = img;
}
	
	
	

}
