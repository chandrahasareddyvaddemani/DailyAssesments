package com.example.demo.CurdAssaignments;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sales {

	@Id
	@Column(name = "saleid")
	private Integer saleId;
	@Column(name = "saleschannel")
	private String salesChannel;
	@Column(name = "ordernumber")
	private Integer orderNumber;
	@Column(name = "productid")
	private Integer productId;
	@Column(name = "customerid")
	private Integer customerId;
	@Column(name = "currencyid")
	private Integer currencyId;
	@Column(name = "netid")
	private Integer netId;
	@Column(name = "tax")
	private Double tax;
	@Column(name = "shippingcost")
	private Double shippingCost;
	@Column(name = "grossamount")
	private Double grossAmount;
	
	 @OneToMany(fetch = FetchType.LAZY)
	 private Set<Customers> customers;	 
	
	public Sales() {
		super();
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public String getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public Integer getNetId() {
		return netId;
	}

	public void setNetId(Integer netId) {
		this.netId = netId;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(Double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public Double getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}

	@Override
	public String toString() {
		return "Sales [saleId=" + saleId + ", salesChannel=" + salesChannel + ", orderNumber=" + orderNumber
				+ ", productId=" + productId + ", customerId=" + customerId + ", currencyId=" + currencyId + ", netId="
				+ netId + ", tax=" + tax + ", shippingCost=" + shippingCost + ", grossAmount=" + grossAmount + "]";
	}
	
	
	
}
