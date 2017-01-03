package co.simplon.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdresseTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	
	//Je teste que ma methode equals fait bien ce que je lui demande
	@Test
	public void adressesIdentiquesEnMemoireSontEgales(){
		Adresse adresse1 = new Adresse(1,"reu des liles",92100,"Belleville");
		Adresse adresse2 = adresse1;
		
		assertTrue(adresse1.equals(adresse2));
	}
	
	@Test
	public void adressesDistinctesEnMemoireMaisIdentiquesSontEgales(){
		Adresse adresse1 = new Adresse(1,"reu des liles",92100,"Belleville");
		Adresse adresse2 = new Adresse (1,"reu des liles",92100,"Belleville");
		
		assertTrue(adresse1.equals(adresse2));	
	}
	
	@Test
	public void adressesDifferentesDoncNonEgales(){
		Adresse adresse1 = new Adresse(1,"reu des liles",92100,"Belleville");
		Adresse adresse2 = new Adresse (2,"reu des liles",92100,"Belleville");
		
		assertFalse(adresse1.equals(adresse2));
	}
	
	@Test
	public void adressesCompareesAValeurNullNonEgales(){
		Adresse adresse1 = new Adresse(1,"reu des liles",92100,"Belleville");
		Adresse adresse2 = null; 
		
		assertFalse(adresse1.equals(adresse2));
	}
}
