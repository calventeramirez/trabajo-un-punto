package com.PabloCalvente.EntornosDesarrollo;

import java.util.ArrayList;

/**
 * 
 * @author Pablo Calvente
 * @version 1.0
 */

public class Comentarios {
	Usuario user;
	ArrayList<String> comentario;

	/**
	 * Constructor de la clase Comentarios. Crea el objeto con un comentario y un
	 * usuario.
	 * 
	 * @param comentario        comentario a guardar al crear el comentario
	 * @param usuarioComentario usuario de quien esta creando los usuarios.
	 */
	public Comentarios(String comentario, Usuario usuarioComentario) {
		this.comentario = new ArrayList<>();
		this.comentario.add(comentario);
		user = usuarioComentario;
	}

	/**
	 * Constructor de la clase Comentarios. Crea el objeto sin ningun comentario de
	 * inicio.
	 * 
	 * @param usuarioComentario usuario de quien se esta creando los comentarios
	 */
	public Comentarios(Usuario usuarioComentario) {
		this.comentario = new ArrayList<>();
		user = usuarioComentario;
	}

	/**
	 * Constructor creado para la clase Peliculas. Crea los comentarios para las
	 * peliculas.
	 */
	public Comentarios() {
		user = null;
		comentario = new ArrayList<>();
	}

	/**
	 * Devuelve los comentarios de un usuario
	 * 
	 * @return la lista de comentarios
	 */
	public ArrayList<String> getComentario() {
		return comentario;
	}

	/**
	 * Añade un comentario nuevo a la lista de comentarios
	 * 
	 * @param comentarioNuevo comentario a añadir en la lista
	 * @return devuelve verdadero o falso al intentar añadir el comentario
	 */
	public boolean setComentario(String comentarioNuevo) {
		return this.comentario.add(comentarioNuevo);
	}

	/**
	 * Representacion de los comentarios
	 */
	@Override
	public String toString() {
		return "Comentarios del usuario: " + user + " comentarios: [" + comentario + "]";
	}

}
