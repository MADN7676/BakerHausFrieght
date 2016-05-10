package com.backer.entities;

import java.sql.Date;

public class FreightDetail {
	
	private String invoiceNumber;
	
	private Date invoiceDate;
	
	private Float frtCharges;
	
	private Float lumperCharges;
	
	private Float hst;
	
	private String remarks;
	
	private Integer order1;
	
	private Integer order2;
	
	private Integer order3;
	
	private Integer order4;
	
	private Integer order5;
	
	private Integer order6;
	
	private Date createDate;
	
	private String createUserId;
	
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Float getFrtCharges() {
		return frtCharges;
	}

	public void setFrtCharges(Float float1) {
		this.frtCharges = float1;
	}

	public Float getLumperCharges() {
		return lumperCharges;
	}

	public void setLumperCharges(Float float1) {
		this.lumperCharges = float1;
	}

	public Float getHst() {
		return hst;
	}

	public void setHst(Float float1) {
		this.hst = float1;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getOrder1() {
		return order1;
	}

	public void setOrder1(Integer order1) {
		this.order1 = order1;
	}

	public Integer getOrder2() {
		return order2;
	}

	public void setOrder2(Integer order2) {
		this.order2 = order2;
	}

	public Integer getOrder3() {
		return order3;
	}

	public void setOrder3(Integer order3) {
		this.order3 = order3;
	}

	public Integer getOrder4() {
		return order4;
	}

	public void setOrder4(Integer order4) {
		this.order4 = order4;
	}

	public Integer getOrder5() {
		return order5;
	}

	public void setOrder5(Integer order5) {
		this.order5 = order5;
	}

	public Integer getOrder6() {
		return order6;
	}

	public void setOrder6(Integer order6) {
		this.order6 = order6;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	
}
