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
		assertTrue(adresse2.equals(adresse1));
	}
	
	@Test
	public void adressesDistinctesEnMemoireMaisIdentiquesSontEgales(){
		Adresse adresse1 = new Adresse(1,"reu des liles",92100,"Belleville");
		Adresse adresse2 = new Adresse(1,"reu des liles",92100,"Belleville");
		
		assertTrue(adresse1.equals(adresse2));
		assertTrue(adresse2.equals(adresse1));
	}
	
	@Test
	public void adressesDistinctesEnMemoireMaisIdentiquesAlorsHashCodeIdentique(){
		Adresse adresse1 = new Adresse(1,"reu des liles",92100,"Belleville");
		int hashCodeAdresse1 = adresse1.hashCode();
		Adresse adresse2 = new Adresse(1,"reu des liles",92100,"Belleville");
		int hashCodeAdresse2 = adresse2.hashCode();
		
		assertEquals(hashCodeAdresse1, hashCodeAdresse2);
		assertEquals(hashCodeAdresse2, hashCodeAdresse1);
	}
	
	@Test
	public void adressesDifferentesDoncNonEgales(){
		Adresse adresse1 = new Adresse(1,"reu des liles",92100,"Belleville");
		Adresse adresse2 = new Adresse (2,"reu des liles",92100,"Mocheville");
		
		assertFalse(adresse1.equals(adresse2));
		assertFalse(adresse2.equals(adresse1));
	}
	
	@Test
	public void adressesCompareesAValeurNullNonEgales(){
		Adresse adresse1 = new Adresse(1,"reu des liles",92100,"Belleville");
		Adresse adresse2 = null; 
		
		assertFalse(adresse1.equals(adresse2));
		assertFalse(adresse2.equals(adresse1));
	}
}
