package nl.luminis.javatraining;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.luminis.javatraining.pojo.Person;
import nl.luminis.javatraining.service.PersonService;
 
@Path("/HelloWorld")
public class HelloWorldResource {
 
	@Inject
	private PersonService personService;
	
	@GET
	@Path("/sayHello")
	public String sayHello() {
		return "<h1>Hello World</h1>";
	}
 
	@GET
	@Path("/person/1")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson() {
		return new Person("Donald", "Duck");
	}
	
	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPersons() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Donald", "Duck"));
		personList.add(new Person("Koning", "Willem-Alexander"));
		return personList;
	}
	
	@POST
	@Path("/person/1")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPerson(Person person) {
		personService.addPerson(person);
		System.out.println("Added a person with firstname " + person.getFirstName() + " and with lastname " + person.getLastName());
	}
}