package UVSQ;
import UVSQ.Person.PersonBuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	private Person Person1;
	
	@Before()
	public void setUp() {
		Person1 = new PersonBuilder("HAMMOUCHE", "Koussaila", Fonction.directeuur)
				.dateNaissance(LocalDate.parse("1970-01-01", DateTimeFormatter.ISO_DATE))
			
				.build();	
	}
	
	@Test()
	public void testGetNom() {
		assertEquals(Person1.getNom(), "HAMMOUCHE");
	}
	
	@Test()
	public void testgetPrenom() {
		assertTrue(Person1.getPrenom().compareTo("Koussaila") == 0);
	}
	

	
	}
	
