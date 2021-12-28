package com.example.demo.CurdAssaignments;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

	@Id
	@Column(name = "productId")
	private Integer productId;
	@Column(name = "name")
	private String name;
	@Column(name = "shortdescription")
	private String shortDescription;
	@Column(name = "fulldescription")
	private String fullDescription;
	@Column(name = "size")
	private Long size;
	@Column(name = "color")
	private String color;
	
	public Products() {
		super();
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", name=" + name + ", shortDescription=" + shortDescription
				+ ", fullDescription=" + fullDescription + ", size=" + size + ", color=" + color + "]";
	}
	
	
}
