package com.example.demo.CurdAssaignments;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
public class Regions {

	@Id
	@Column(name = "regionid")
	private Integer regionId;
	@Column(name = "name")
	private String name;
	
	public Regions() {
		super();
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Regions [regionId=" + regionId + ", name=" + name + "]";
	}
	
	
}
