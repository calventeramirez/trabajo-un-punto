package com.PabloCalvente.EntornosDesarrollo;


public class Usuario {
	private String nick, nombre, password;
	private Noticias not;

	public Usuario(String nick, String password, String nombre) {
		this.nick = nick;
		this.password = password;
		this.nombre = nombre;
		not = new Noticias();
	}

	public Usuario() {
		this.nick = "";
		this.password = "";
		this.nombre = "";
		not = new Noticias();
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void agregarNoticias(String noticia) {
		not.setNoticias(noticia);
		System.out.println("Añadida noticia");
	}

	public void borrarNoticias(String noticia) {
		if (not.buscarNoticas(noticia) != -1) {
			not.borrarNoticia(not.buscarNoticas(noticia));
			System.out.println("Borrado el comentario seleccionado");
		} else {
			System.out.println("No se puede borrar un comentario que no existe");
		}
	}
}
