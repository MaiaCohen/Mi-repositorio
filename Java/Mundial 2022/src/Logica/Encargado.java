package Logica;


import java.util.Scanner;

public class Encargado {
	 private int id;
	 private String nombre;
	 private int contra;
	 
	public Encargado(int id, String nombre, int contra) {
		super();
		this.id = 2022;
		this.nombre = nombre;
		this.contra = 1010;
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
	public int getContra() {
		return contra;
	}
	public void setContra(int contra) {
		this.contra = contra;
	}
	@Override
	public String toString() {
		return "Encargado [id=" + id + ", nombre=" + nombre + ", contra=" + contra + "]";
	}
	 
	// INGRESO ENCARGADO
	public static boolean IngresoEncargado(String nombre, int id, int contra ) {
		//id = 1 2022 contra = 1010
		int exitoso=0; // ingreso exitoso
		int ide, contrae;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese su nombre y apellido ");
		
		nombre=sc.nextLine();
		Encargado encargado = new Encargado (2022, "",  1010);
		
		do {
		
		System.out.println("Ingrese su id ");
		ide=sc.nextInt();
		System.out.println("Ingrese su Contraseña ");			
		contrae=sc.nextInt();
			
			if (ide== encargado.getId() && contrae == encargado.getContra()) {

				System.out.println("Usuario: " + nombre + " Ingreso correctamente ");
				exitoso = 0;
				return true;
				
			}else if (id != encargado.getId() ) {
				System.out.println("Id Incorrecto, ingreseselo otra vez ");
				exitoso = 1;
			}else if (contrae != encargado.getContra()) {
				
				System.out.println("Contra Incorrecta, ingresesela otra vez ");
				exitoso = 1;
			}							
		
		} while ( exitoso == 1);
		return true;
	}
	 
	}
