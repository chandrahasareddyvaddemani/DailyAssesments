package com.example.demo.CurdAssaignments;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "currencies")
public class Currencies {

	@Id
	@Column(name = "currencyid")
	private Integer currencyId;

	@Column(name = "name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "currency_id", referencedColumnName = "currencyid")
	private CountriesCurrencies countriesCurrencies;
	
	 @OneToMany(fetch = FetchType.LAZY)
	 private Set<Sales> sales;	 
	 

	public Currencies() {
		super();
	}

	public CountriesCurrencies getCountriesCurrencies() {
		return countriesCurrencies;
	}

	public void setCountriesCurrencies(CountriesCurrencies countriesCurrencies) {
		this.countriesCurrencies = countriesCurrencies;
	}

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Currencies [currencyId=" + currencyId + ", name=" + name + "]";
	}

}
