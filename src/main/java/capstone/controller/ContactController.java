package capstone.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

import capstone.model.Contact;

@Controller
@Path("/contacts")
public class ContactController {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listAllContacts() {
		Contact contact = new Contact();
		contact.setFristName("Almat");
		contact.setLastName("Aitzhanov1");
		return Response.ok(contact).build();
	}

}
