package Logica;

import java.util.LinkedList;


public class Partido {
	private int goles;
	private int id;
	private double duracion;
	private Pais pais;
	private Pais pais2;
	
	public Partido(int goles, int id, double duracion, Pais pais, Pais pais2) {
		super();
		this.goles = goles;
		this.id = id;
		this.duracion = duracion;
		this.pais = pais;
		this.pais2 = pais2;
	}
	
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Pais getPais2() {
		return pais2;
	}
	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}

	@Override
	public String toString() {
		return pais + " - " + pais2 + "\n" ;
	}
	
	// PARTIDOS POR GRUPO, SE AGREGAN A LA LISTA DE PARTIDOS
	public static void PartidosGrupo(LinkedList<Partido> partidos, LinkedList<Pais> paises, int id)  {
		int t=0;
		Partido partido;
	
		
		for (int i = 1; i <4; i++) {
			if (t <3) {
				id++;
				partido = new Partido(0, id, 0, paises.get(0), paises.get(i));
				partidos.add(partido);
				t++;
				if (t == 3) {
					i=0;
				}
			} else if (i != 1 && t<5) {
				id++;
				partido = new Partido(0, id, 0, paises.get(1), paises.get(i));
				partidos.add(partido);
				t++;
				if (t == 5) {
					i=2;
				}
			} else if (i != 1 && i !=2 ) {
				id++;
				partido = new Partido(0, id, 0, paises.get(2), paises.get(i));
				partidos.add(partido);
			}
			}
	}
			
}
