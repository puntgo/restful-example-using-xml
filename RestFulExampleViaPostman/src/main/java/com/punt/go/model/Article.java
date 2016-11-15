package com.punt.go.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Article implements Serializable{

	private static final long serialVersionUID = -5036071239654742742L;

	@XmlAttribute(name="ArticleNumber")
	private Integer ArticleNumber;   
	
	@XmlAttribute(name="PendingPOQuantity")
	private Integer PendingPOQuantity;  
	
	@XmlAttribute(name="BranchQuantity")
	private Integer BranchQuantity;  
	
	@XmlAttribute(name="HubQuantity")
	private Integer HubQuantity;  
	
	@XmlAttribute(name="DepotQuantity")
	private Integer DepotQuantity;  
	
	@XmlAttribute(name="Recommendations")
	private String Recommendations;  
	
	@XmlAttribute(name="Flag")
	private String Flag;  
	
	@XmlAttribute(name="RecommendedQuantity")
	private String RecommendedQuantity; 

	@XmlAttribute(name="Pcode")
	private Integer Pcode;

	public Integer getArticleNumber() {
		return ArticleNumber;
	}

	public void setArticleNumber(Integer articleNumber) {
		ArticleNumber = articleNumber;
	}

	public Integer getPendingPOQuantity() {
		return PendingPOQuantity;
	}

	public void setPendingPOQuantity(Integer pendingPOQuantity) {
		PendingPOQuantity = pendingPOQuantity;
	}

	public Integer getBranchQuantity() {
		return BranchQuantity;
	}

	public void setBranchQuantity(Integer branchQuantity) {
		BranchQuantity = branchQuantity;
	}

	public Integer getHubQuantity() {
		return HubQuantity;
	}

	public void setHubQuantity(Integer hubQuantity) {
		HubQuantity = hubQuantity;
	}

	public Integer getDepotQuantity() {
		return DepotQuantity;
	}

	public void setDepotQuantity(Integer depotQuantity) {
		DepotQuantity = depotQuantity;
	}

	public String getRecommendations() {
		return Recommendations;
	}

	public void setRecommendations(String recommendations) {
		Recommendations = recommendations;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

	public String getRecommendedQuantity() {
		return RecommendedQuantity;
	}

	public void setRecommendedQuantity(String recommendedQuantity) {
		RecommendedQuantity = recommendedQuantity;
	}

	public Integer getPcode() {
		return Pcode;
	}

	public void setPcode(Integer pcode) {
		Pcode = pcode;
	}

	@Override
	public String toString() {
		return "Articles [ArticleNumber=" + ArticleNumber
				+ ", PendingPOQuantity=" + PendingPOQuantity
				+ ", BranchQuantity=" + BranchQuantity + ", HubQuantity="
				+ HubQuantity + ", DepotQuantity=" + DepotQuantity
				+ ", Recommendations=" + Recommendations + ", Flag=" + Flag
				+ ", RecommendedQuantity=" + RecommendedQuantity + ", Pcode="
				+ Pcode + "]";
	}
}