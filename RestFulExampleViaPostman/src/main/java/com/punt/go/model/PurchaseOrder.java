package com.punt.go.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PurchaseOrder implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@XmlAttribute(name="PONumber")
	private Integer PONumber; 
	
	@XmlAttribute(name="POExpiryDate")
	private String POExpiryDate;
	
	@XmlAttribute(name="MRSalience")
	private Integer MRSalience;
	
	@XmlAttribute(name="RetailerName")
	private String RetailerName;
	
	@XmlAttribute(name="BranchCode")
	private Integer BranchCode;
	
	@XmlElement(name="Article") 
	private List<Article> Article;

	public Integer getPONumber() {
		return PONumber;
	}

	public void setPONumber(Integer pONumber) {
		PONumber = pONumber;
	}

	public String getPOExpiryDate() {
		return POExpiryDate;
	}

	public void setPOExpiryDate(String pOExpiryDate) {
		POExpiryDate = pOExpiryDate;
	}

	public Integer getMRSalience() {
		return MRSalience;
	}

	public void setMRSalience(Integer mRSalience) {
		MRSalience = mRSalience;
	}

	public String getRetailerName() {
		return RetailerName;
	}

	public void setRetailerName(String retailerName) {
		RetailerName = retailerName;
	}

	public Integer getBranchCode() {
		return BranchCode;
	}

	public void setBranchCode(Integer branchCode) {
		BranchCode = branchCode;
	}

	public List<Article> getArticle() {
		return Article;
	}

	public void setArticle(List<Article> article) {
		Article = article;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [PONumber=" + PONumber + ", POExpiryDate="
				+ POExpiryDate + ", MRSalience=" + MRSalience
				+ ", RetailerName=" + RetailerName + ", BranchCode="
				+ BranchCode + ", Article=" + Article + "]";
	}
}

