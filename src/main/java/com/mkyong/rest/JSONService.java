package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class JSONService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Products getProductInJSON() {
		System.out.println("getProductInJSON...");
		Products products= new Products();
		List<Product> productList = new ArrayList<Product>();
		Product product = new Product();
		product.setName("iPad 3");
		product.setQty(999);
		productList.add(product);
		products.setProducts(productList);
		return products; 
	}
	
	@GET
	@Path("/mr/get")
	@Produces("application/json")
	public Products getProductInJSONMr() {
		System.out.println("getProductInJSON...");
		Products products= new Products();
		List<Product> productList = new ArrayList<Product>();
		Product product = new Product();
		product.setName("iPad 3");
		product.setQty(999);
		productList.add(product);
		products.setProducts(productList);
		return products; 
	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createProductInJSON(Product product) {

		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();
		
	}
	
}