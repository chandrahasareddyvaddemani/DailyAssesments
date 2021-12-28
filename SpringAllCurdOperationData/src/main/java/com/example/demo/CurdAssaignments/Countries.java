package com.example.demo.CurdAssaignments;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries {

   @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "countryId")
	private Integer countryId;
	@Column(name = "name")
	private String name;
	@Column(name = "regionid")
	private Integer regionId;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id", referencedColumnName = "countryid")
    private CountriesCurrencies countriesCurrencies;
	
	public Countries() {
       super();
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", name=" + name + ", regionId=" + regionId + "]";
	}
	
	
}
