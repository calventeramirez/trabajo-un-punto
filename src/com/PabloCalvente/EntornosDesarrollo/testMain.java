package com.PabloCalvente.EntornosDesarrollo;

public class testMain {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("pepera", "123456", "Pepe Ramon");
		Comentarios c1 = new Comentarios();

		u1.agregarNoticias("ESTA NOTICIA ES NUEVA");
		System.out.println("El usuario se llama " + u1.getNombre());
		u1.setNombre("PEPE LUSI");
		System.out.println("El usuario se llama " + u1.getNombre());
		u1.borrarNoticias("ESTA NOTICIA ES NUEVA");
		c1.setComentario("comentario 1");
		c1.setComentario("comentario 2");
		c1.setComentario("comentario 3");
		System.out.println(c1.getComentario());
		System.out.println(u1.borrarNoticias("ksdfjkasdhfjk"));
	}
}
