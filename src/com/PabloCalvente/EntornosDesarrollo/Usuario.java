package com.PabloCalvente.EntornosDesarrollo;

/**
 * 
 * @author Pablo Calvente
 * @version 1.0
 */

public class Usuario {
	private String nick, nombre, password;
	private Noticias not;
	private Comentarios comentarios;

	/**
	 * Constructor del objeto Usuario. Creara el objeto con los parametros pasados
	 * 
	 * @param nick     nick del usuario
	 * @param password contraseña del usuario
	 * @param nombre   nombre de la persona registrada
	 */
	public Usuario(String nick, String password, String nombre) {
		this.nick = nick;
		this.password = password;
		this.nombre = nombre;
		not = new Noticias();
		comentarios = new Comentarios(this);
	}

	/**
	 * Contructor vacio del objeto Usuario. Crea el objeto con unos parametro
	 * validos de inicio.
	 */
	public Usuario() {
		this.nick = "";
		this.password = "123456";
		this.nombre = "";
		not = new Noticias();
		comentarios = new Comentarios(this);
	}

	/**
	 * Devuelve el nick del usuario
	 * 
	 * @return nick del usuario
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * Cambia el nick del usuario
	 * 
	 * @param nick nuevo nick
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * Devuelve el nombre del usuario
	 * 
	 * @return nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre del usuario
	 * 
	 * @param nombre nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Cambia el password del usuario
	 * 
	 * @param password nuevo password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Agrega una Noticia nueva
	 * 
	 * @param noticia noticia a la que se va a añadir
	 */
	public void agregarNoticias(String noticia) {
		not.setNoticias(noticia);
		System.out.println("Añadida noticia");
	}

	/**
	 * Borra la noticia que queramos
	 * 
	 * @param noticia la noticia a borrar
	 */
	public void borrarNoticias(String noticia) {
		if (not.buscarNoticas(noticia) != -1) {
			not.borrarNoticia(not.buscarNoticas(noticia));
			System.out.println("Borrado el comentario seleccionado");
		} else {
			System.out.println("No se puede borrar un comentario que no existe");
		}
	}
}
