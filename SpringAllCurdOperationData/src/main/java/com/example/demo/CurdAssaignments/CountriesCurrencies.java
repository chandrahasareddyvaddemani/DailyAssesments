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
@Table(name = "countriescurrencies")
public class CountriesCurrencies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="COUNTRYID")
	private Integer countriesCurrenciesId;
	
//	@Column(name="CURENCYID")
//	private Integer currencyId;
	
	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "currencyid", referencedColumnName = "currencyid")
    private Currencies currencies;
	
	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "countryid", referencedColumnName = "countryid")
    private Countries countries;

	public Integer getCountriesCurrenciesId() {
		return countriesCurrenciesId;
	}

	public void setCountriesCurrenciesId(Integer countriesCurrenciesId) {
		this.countriesCurrenciesId = countriesCurrenciesId;
	}

	public Currencies getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	

	
	
	
}
