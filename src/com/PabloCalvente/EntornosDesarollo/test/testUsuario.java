package com.PabloCalvente.EntornosDesarollo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import com.PabloCalvente.EntornosDesarrollo.Usuario;
import com.PabloCalvente.EntornosDesarrollo.Comentarios;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class testUsuario {
	Usuario u1;
	Comentarios c1;

	@BeforeAll
	void iniciar() {
		u1 = new Usuario("Pepera", "123456", "Pepe Ramon");
		c1 = new Comentarios();
	}

	@Test
	void testAgregarNoticia() {
		assertEquals("Añadida noticia", u1.agregarNoticias("Noticia de prueba."));
		assertEquals("Añadida noticia", u1.agregarNoticias("Noticia de prueba2."));
		assertEquals("Añadida noticia", u1.agregarNoticias("Noticia de prueba3"));
	}

	@Test
	void testAñadirCmentario() {
		assertEquals(true, c1.setComentario("Comentario de prueba"));
		assertEquals(true, c1.setComentario("Comentario de prueba2"));
		assertEquals(true, c1.setComentario("Comentario de prueba3"));
		assertEquals(3, c1.getComentario().size());
	}
	
	@Test
	void testBorrarNoticia() {
		assertEquals("Borrada la noticia seleccionada", u1.borrarNoticias("Noticia de prueba."));
		assertEquals("Borrada la noticia seleccionada", u1.borrarNoticias("Noticia de prueba2."));
		assertEquals("No se puede borrar una noticia que no existe", u1.borrarNoticias("Noticia de pruebadfsf."));
	}
}
