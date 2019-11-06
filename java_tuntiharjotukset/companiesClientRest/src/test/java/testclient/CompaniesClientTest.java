package testclient;

import static org.junit.Assert.*;

import java.util.List;

import javax.ws.rs.client.*;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.*;

import domain.*;

/*
Testiohjelma REST-palveluun osoitteessa: 
http://localhost:8080/api/companies

Huom! Osoite voi vaihtua riippuens siitä, että miten tätä palvelua suoritetaan
*/ 
public class CompaniesClientTest {

	private Client client;
	private String baseURI = "http://localhost:8080/api/companies";
	private WebTarget target;

	@Before
	public void init() {
		// entry point to invoke REST Service
		client = ClientBuilder.newClient();
		this.target = client.target(baseURI);
	}

	@Test
	public void PostNewCompany() {
		Company comp = new Company(14, "Monetary Company", "Business Street", "Finance");
		Response response = target.path("new").request().post(Entity.entity(comp, MediaType.APPLICATION_XML),
				Response.class);
		System.out.println("Post response " + response.getStatus());
		assertEquals((Integer)200, (Integer)response.getStatus());
	}

	@Test
	public void getOneCompany() {

		Company company = target.path("13").request().accept(MediaType.APPLICATION_XML).get(Company.class);
		System.out.println(company);
		assertEquals("My Company", company.getName());
		assertEquals("Steel", company.getIndustry());
	}

	@Test
	public void getAllCompanies() {

		// must use GenericType to create list of companies
		List<Company> companies = target.request(MediaType.APPLICATION_XML).get(new GenericType<List<Company>>() {
		});
		System.out.println(companies);

		assertEquals("My Company", companies.get(0).getName());
		assertEquals("Steel", companies.get(0).getIndustry());
		assertEquals("Monetary Company", companies.get(1).getName());
		assertEquals("Finance", companies.get(1).getIndustry());
	}
}
