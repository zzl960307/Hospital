package com.zhiyou100.model;

public class Drug {
	private String drug_num;
	private String drug_url;
	private double purchas_price;
	private double sale_price;
	private String drug_name;
	private int drug_type;
	private String simple_detail;
	private String prodeced_date;
	private String expiration_date;
	private int quality_date;
	private String detail;
	private String manufacture;
	private String use_infor;
	private int total_stock;
	private int surplus;
	private int status;
	private String noted;
	public String getDrug_num() {
		return drug_num;
	}
	public void setDrug_num(String drug_num) {
		this.drug_num = drug_num;
	}
	public String getDrug_url() {
		return drug_url;
	}
	public void setDrug_url(String drug_url) {
		this.drug_url = drug_url;
	}
	public double getPurchas_price() {
		return purchas_price;
	}
	public void setPurchas_price(double purchas_price) {
		this.purchas_price = purchas_price;
	}
	public double getSale_price() {
		return sale_price;
	}
	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}
	public String getDrug_name() {
		return drug_name;
	}
	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}
	public int getDrug_type() {
		return drug_type;
	}
	public void setDrug_type(int drug_type) {
		this.drug_type = drug_type;
	}
	public String getSimple_detail() {
		return simple_detail;
	}
	public void setSimple_detail(String simple_detail) {
		this.simple_detail = simple_detail;
	}
	public String getProdeced_date() {
		return prodeced_date;
	}
	public void setProdeced_date(String prodeced_date) {
		this.prodeced_date = prodeced_date;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	public int getQuality_date() {
		return quality_date;
	}
	public void setQuality_date(int quality_date) {
		this.quality_date = quality_date;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getUse_infor() {
		return use_infor;
	}
	public void setUse_infor(String use_infor) {
		this.use_infor = use_infor;
	}
	public int getTotal_stock() {
		return total_stock;
	}
	public void setTotal_stock(int total_stock) {
		this.total_stock = total_stock;
	}
	public int getSurplus() {
		return surplus;
	}
	public void setSurplus(int surplus) {
		this.surplus = surplus;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getNoted() {
		return noted;
	}
	public void setNoted(String noted) {
		this.noted = noted;
	}
	@Override
	public String toString() {
		return "Drug [drug_num=" + drug_num + ", drug_url=" + drug_url + ", purchas_price=" + purchas_price
				+ ", sale_price=" + sale_price + ", drug_name=" + drug_name + ", drug_type=" + drug_type
				+ ", simple_detail=" + simple_detail + ", prodeced_date=" + prodeced_date + ", expiration_date="
				+ expiration_date + ", quality_date=" + quality_date + ", detail=" + detail + ", manufacture="
				+ manufacture + ", use_infor=" + use_infor + ", total_stock=" + total_stock + ", surplus=" + surplus
				+ ", status=" + status + ", noted=" + noted + "]";
	}
	
}
