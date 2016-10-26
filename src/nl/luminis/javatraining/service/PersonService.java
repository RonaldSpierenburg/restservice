package nl.luminis.javatraining.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;

import nl.luminis.javatraining.dao.PersonDAO;
import nl.luminis.javatraining.pojo.Person;

@Stateless
@Transactional
public class PersonService {

	@Inject
	private PersonDAO personDAO;
	
	public void addPerson(Person person) {
		personDAO.savePerson(person);
	}
}
