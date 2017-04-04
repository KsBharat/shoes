package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class VW_XMAP_PS {
	
	
	@Id
	private String psid;
	
	private String productid;
	private String productname;
	private String supplierid;
	private String suppliername;
	private String productsupplierprice;
	private String productsupplierstock;
	@Transient
	public MultipartFile psfile;
	public MultipartFile getPsfile() {
		return psfile;
	}
	public void setPsfile(MultipartFile psfile) {
		this.psfile = psfile;
	}
	public String getPsid() {
		return psid;
	}
	public void setPsid(String psid) {
		this.psid = psid;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getProductsupplierprice() {
		return productsupplierprice;
	}
	public void setProductsupplierprice(String productsupplierprice) {
		this.productsupplierprice = productsupplierprice;
	}
	public String getProductsupplierstock() {
		return productsupplierstock;
	}
	public void setProductsupplierstock(String productsupplierstock) {
		this.productsupplierstock = productsupplierstock;
	}
	
	

}
