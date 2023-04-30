package com.PabloCalvente.EntornosDesarrollo;

import java.util.ArrayList;

/**
 * 
 * @author Pablo Calvente
 * @version 1.0
 */
public class Noticias {
	private ArrayList<String> noticias;

	/**
	 * Constructor de la clase Noticias. Asignara una noticia inical al array de las
	 * noticias.
	 * 
	 * @param not noticia inicial.
	 */
	public Noticias(String not) {
		noticias = new ArrayList<>();
		noticias.add(not);
	}

	/**
	 * Constructor vacio de la clase Noticias. Inicializara un array vacio de
	 * noticias.
	 */
	public Noticias() {
		noticias = new ArrayList<>();
	}

	/**
	 * Devuelve una noticia con la posicion dada
	 * 
	 * @param pos posicion en el array de la noticia
	 * @return la noticia de la posicion indicada
	 */
	public String getNoticias(int pos) {
		return noticias.get(pos);
	}

	/**
	 * Añade una noticia al array de esta.
	 * 
	 * @param n la noticia que se va a añadir
	 */
	public boolean setNoticias(String n) {
		return this.noticias.add(n);
	}

	/**
	 * Elimina la noticia de la posicion dada.
	 * 
	 * @param pos posicion de la noticia a eliminar
	 */
	public void borrarNoticia(int pos) {
		noticias.remove(pos);
	}

	/**
	 * Devuelve la posicion de la noticia que se esta buscando
	 * 
	 * @param noticias noticia a buscar el indice
	 * @return posicion del comentario o -1 si no lo encuentra
	 */
	public int buscarNoticas(String noticias) {
		return this.noticias.indexOf(noticias);
	}

	/**
	 * Representacion del objeto noticias
	 */
	@Override
	public String toString() {
		return "Noticias: " + noticias;
	}

}
