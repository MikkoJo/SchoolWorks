package restservice;

import java.util.List;
import java.util.stream.IntStream;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import domain.Company;
import domain.CompanyDao;

/*
 * curl -X GET http://localhost:9080/restcompanies/rest/companies
 * curl -X POST -H "Content-Type: application/xml" -d '<company><id>100</id><name>My Next Company</name><address>Harley Street</address><industry>Metal</industry></company>' http://localhost:9080/restcompanies/rest/companies/new
 * curl -X POST -H "Content-Type: application/xml" -d '<company><id>100</id><name>Shining Company</name><address>Savile Row</address><industry>Tele</industry></company>' http://localhost:9080/restcompanies/rest/companies/new
 * 

 */

@Path("/companies")
public class CompanyResource {
	CompanyDao dao = CompanyDao.getInstance();

	public CompanyResource() {
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Company> getCompanies() {
		return dao.getAll();
	}

	@GET
	@Path("html")
	@Produces(MediaType.TEXT_HTML)
	public String getCompaniesHtml() {
		StringBuilder response = new StringBuilder();
		List<Company> companies = dao.getAll();
		response.append("<TABLE border=1>");
		response.append("<tr><th>Nimi</th><th>ID</th><th>Osoite</th><th>Toimiala</th></tr>");
//		IntStream.range(0,  companies.size()).forEach(i -> {
//			response.append("<TR><TD COLSPAN='2' ALIGN='CENter'>Yritys " + (i+1) +"</TD></TR>");
//			response.append("<TR><TD>Nimi</TD><TD>" + companies.get(i).getName() + "</TD></TR>");
//			response.append("<TR><TD>Id</TD><TD>" + companies.get(i).getId() + "</TD></TR>");
//			response.append("<TR><TD>Osoite</TD><TD>" + companies.get(i).getAddress() + "</TD></TR>");
//			response.append("<TR><TD>Toimiala</TD><TD>" + companies.get(i).getIndustry() + "</TD></TR><BR>");
//			
//		});
		companies.forEach(c -> {
			response.append("<TR><TD>" + c.getName() + "</TD>");
			response.append("<TD>" + c.getId() + "</TD>");
			response.append("<TD>" + c.getAddress() + "</TD>");
			response.append("<TD>" + c.getIndustry() + "</TD></TR>");

		});
		response.append("</TABLE");
		return response.toString();
	}

	@GET
	@Path("json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Company> getCompaniesJson() {
		return getCompanies();
	}

	@GET
	@Path("text")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCompaniesText() {
		return getCompanies().toString();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Company getCompany(@PathParam("id") int id) {
		return dao.get(id);
	}

	@Path("/new")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	@POST
	public String addCompany(Company comp) {
		dao.addCompany(comp);
		return "OK";
	}

	@Path("/update/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	@PUT
	public String updateCompany(@PathParam("id") int id, Company comp) {
		dao.updateCompany(id, comp);
		return "OK";
	}

	@Path("/new/json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@POST
	public String addCompanyJson(Company comp) {
		addCompany(comp);
		return "OK";
	}

	@Path("/update/{id}/json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@PUT
	public String updateCompanyJson(@PathParam("id") int id, Company comp) {
		updateCompany(id, comp);
		return "OK";
	}

}
