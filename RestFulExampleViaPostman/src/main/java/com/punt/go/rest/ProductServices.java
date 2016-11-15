package com.punt.go.rest;

import javax.jws.WebMethod;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.punt.go.model.PurchaseOrderDetails;
 
@Path("/po_allocation")
public class ProductServices {
	
	@WebMethod
	@POST
	@Consumes("application/xml")
	@Path("/invokerules")
	public Response invokeRules(PurchaseOrderDetails purchaseOrderDetails){
		System.out.println("Requested XML - "+purchaseOrderDetails);
		return Response.status(200).entity(purchaseOrderDetails).build();
	}
}