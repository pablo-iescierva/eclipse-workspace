import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SessionTest { //creamos 4 usuarios de la clase Session
	 Session usuario1;
	 Session usuario2;
	 Session usuario3;
	 Session usuario4;

	@Before
	public void crearUsuarios() { //Creamos objetos con cada usuario creado anteriormente
		this.usuario1 = new Session();
		this.usuario2 = new Session();
		this.usuario3 = new Session();
		this.usuario4 = new Session();
	}
	//Comprobamos que el nombre y contraseña que recibe el metodo login coinciden con algunos de los usuarios que hay en el archivo usuarios.txt
	//Y que el metodo login con los parametros que recibe nos devuelve true
	@Test 
	public void testUsuario1() {
		boolean nombre1 = usuario1.login("dmunuera", "123456");
		assertTrue(nombre1);
	}
	//Comprobamos que el nombre y contraseña que recibe el metodo login coinciden con algunos de los usuarios que hay en el archivo usuarios.txt
	//Y que el metodo login con los parametros que recibe nos devuelve true
	@Test
	public void testUsuario2() {
		boolean nombre2 = usuario2.login("pepe", "654321");
		assertTrue(nombre2);
	}
	//Comprobamos que el nombre y contraseña que recibe el metodo login no coinciden con ninguno de los usuarios que hay en el archivo usuarios.txt
	//Y que el metodo login con los parametros que recibe nos devuelve false
	@Test
	public void testUsuario3() {
		boolean nombre3 = usuario3.login("julian", "11111");
		assertFalse(nombre3);
	}
	//Comprobamos que el nombre y contraseña que recibe el metodo login no coinciden con ninguno de los usuarios que hay en el archivo usuarios.txt
		//Y que el metodo login con los parametros que recibe nos devuelve false
	@Test
	public void testUsuario4() {
		boolean nombre4 = usuario4.login("luis", "5457");
		assertFalse(nombre4);
	}
	
}
