package com.example.demo.entites;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="articles")
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Article {
	


	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private String price;
	
	@Column(name="img")
	private String img;
	
	
	public Article() {
		super();
	}
	
public Article(Long id,String title,String description,String price,String img) {
		
		super();
		
		this.id=id;
		this.title=title;
		this.description=description;
		this.price=price;
		this.img=img;
		
	}
	
public Article(String title,String description,String price,String img) {
		
		super();
		
		this.title=title;
		this.description=description;
		this.price=price;
		this.img=img;
		
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
