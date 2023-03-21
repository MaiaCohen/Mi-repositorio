package Logica;

import java.util.LinkedList;

public class Pais {
	
	private String nombre;
	private int golestot;
	private boolean clasif;
	private String grupo;
	private int puntos;
	private String ab;
	private int id;
	private int gf;
	private int gc;
	private int posicion;
	private int	pg;
	private int pp;
	private int pe;
	
	public Pais(String nombre, int golestot, boolean clasif, String grupo, int puntos, String ab, int id, int gf, int gc, int pg, int pp, int pe) {
		super();
		this.nombre = nombre;
		this.golestot = golestot;
		this.clasif = clasif;
		this.grupo = grupo;
		this.puntos = puntos;
		this.ab = ab;
		this.id = id;
		this.gf = gf;
		this.gc = gc;
		this.posicion = 0;
		this.pg = pg;
		this.pp = pp;
		this.pe = pe;
	}
	

	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	public int getPg() {
		return pg;
	}


	public void setPg(int pg) {
		this.pg = pg;
	}


	public int getPp() {
		return pp;
	}


	public void setPp(int pp) {
		this.pp = pp;
	}


	public int getPe() {
		return pe;
	}


	public void setPe(int pe) {
		this.pe = pe;
	}


	public int getGf() {
		return gf;
	}

	public void setGf(int gf) {
		this.gf = gf;
	}

	public int getGc() {
		return gc;
	}

	public void setGc(int gc) {
		this.gc = gc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGolestot() {
		return golestot;
	}

	public void setGolestot(int golestot) {
		this.golestot = golestot;
	}

	public boolean isClasif() {
		return clasif;
	}

	public void setClasif(boolean clasif) {
		this.clasif = clasif;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getAb() {
		return ab;
	}

	public void setAb(String ab) {
		this.ab = ab;
	}

	@Override
	public String toString() {
		return nombre + "\n";
	}
	
	
	
}
