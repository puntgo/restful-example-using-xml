package com.punt.go.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PurchaseOrderDetails") 
@XmlAccessorType(XmlAccessType.FIELD)
public class PurchaseOrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="PurchaseOrder") 
	private List<PurchaseOrder> PurchaseOrder;

	public List<PurchaseOrder> getPurchaseOrder() {
		return PurchaseOrder;
	}

	public void setPurchaseOrder(List<PurchaseOrder> purchaseOrder) {
		PurchaseOrder = purchaseOrder;
	}

	@Override
	public String toString() {
		return "PurchaseOrderDetails [PurchaseOrder=" + PurchaseOrder + "]";
	}
}
