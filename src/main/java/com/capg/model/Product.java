package com.capg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)

		private Long id;

		private String name;

		private String description;

		private Double price;

		private String pictureUrl;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getPictureUrl() {
			return pictureUrl;
		}

		public void setPictureUrl(String pictureUrl) {
			this.pictureUrl = pictureUrl;
		}

		public Product(Long id, String name, String description, Double price, String pictureUrl) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
			this.pictureUrl = pictureUrl;
		}

		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}




