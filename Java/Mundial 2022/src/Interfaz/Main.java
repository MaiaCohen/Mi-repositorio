package Interfaz;

import java.util.LinkedList;
import Logica.*;
import java.util.Scanner;

import Logica.Pais;

public class Main {

	public static void main(String[] args) {

		Pais qatar = new Pais ("Qatar", 0, true, "A", 0, "QAT", 1, 0, 0, 0, 0 ,0);
		Pais ecuador = new Pais ("Ecuador", 0, true, "A", 0, "ECU", 2, 0, 0, 0, 0 ,0);
		Pais senegal = new Pais ("Senegal", 0, true, "A", 0, "SEN", 3, 0, 0, 0, 0 ,0);
		Pais holanda = new Pais ("Holanda", 0, true, "A", 0, "HOL", 4, 0, 0, 0, 0 ,0);

		Pais inglaterra = new Pais ("Inglaterra", 0, true, "B", 0, "ING", 5, 0, 0, 0, 0 ,0);
		Pais iran = new Pais ("Iran", 0, true, "B", 0, "IRN", 6, 0, 0, 0, 0 ,0);
		Pais usa = new Pais ("USA", 0, true, "B", 0, "USA", 7, 0, 0, 0, 0 ,0);
		Pais gales = new Pais ("Gales", 0, true, "B", 0, "GAL", 8, 0, 0, 0, 0 ,0);

	  	Pais argentina = new Pais ("Argentina", 0, true, "C", 0, "ARG", 9, 0, 0, 0, 0 ,0);
		Pais arabia = new Pais ("Arabia Saudita", 0, true, "C", 0, "ARB", 10, 0, 0, 0, 0 ,0);
		Pais mexico = new Pais ("Mexico", 0, true, "C", 0, "MEX", 11, 0, 0, 0, 0 ,0);
		Pais polonia = new Pais ("Polonia", 0, true, "C", 0, "POL", 12, 0, 0, 0, 0 ,0);

	  	Pais francia = new Pais ("Francia", 0, true, "D", 0, "FRA", 13, 0, 0, 0, 0 ,0);
		Pais australia = new Pais ("Australia", 0, true, "D", 0, "AUS", 14, 0, 0, 0, 0 ,0);
		Pais dinamarca = new Pais ("Dinamarca", 0, true, "D", 0, "DIN", 15, 0, 0, 0, 0 ,0);
		Pais tunez = new Pais ("Tunez", 0, true, "D", 0, "TUN", 16, 0, 0, 0, 0 ,0);
	 
	 	Pais españa = new Pais ("España", 0, true, "E", 0, "ESP", 17, 0, 0, 0, 0 ,0);
		Pais costarica = new Pais ("Costa Rica", 0, true, "E", 0, "CRC", 18, 0, 0, 0, 0 ,0);
		Pais alemania = new Pais ("Alemania", 0, true, "E", 0, "ALE", 19, 0, 0, 0, 0 ,0);
		Pais japon = new Pais ("Japon", 0, true, "E", 0, "JAP", 20, 0, 0, 0, 0 ,0);

	  	Pais belgica = new Pais ("Belgica", 0, true, "F", 0, "BEL", 21, 0, 0, 0, 0 ,0);
		Pais canada = new Pais ("Canada", 0, false, "F", 0, "CAN", 22, 0, 0, 0, 0 ,0);
		Pais marruecos = new Pais ("Marruecos", 0, false, "F", 0, "MAR", 23, 0, 0, 0, 0 ,0);
		Pais croacia = new Pais ("Croacia", 0, true, "F", 0, "CRO", 24, 0, 0, 0, 0 ,0);
		
		Pais brasil = new Pais ("Brasil", 0, true, "G", 0, "BRA", 25, 0, 0, 0, 0 ,0);
		Pais serbia = new Pais ("Serbia", 0, true, "G", 0, "SER", 26, 0, 0, 0, 0 ,0);
		Pais suiza = new Pais ("Suiza", 0, true, "G", 0, "SUI", 27, 0, 0, 0, 0 ,0);
		Pais camerun = new Pais ("Camerun", 0, true, "G", 0, "CAM", 28, 0, 0, 0, 0 ,0);
		
		Pais portugal = new Pais ("Portugal", 0, true, "H", 0, "POR", 29, 0, 0, 0, 0 ,0);
		Pais ghana = new Pais ("Ghana", 0, true, "H", 0, "GHA", 30, 0, 0, 0, 0 ,0);
		Pais uruguay = new Pais ("Uruguay", 0, true, "H", 0, "URU", 31, 0, 0, 0, 0 ,0);
		Pais corea = new Pais ("Corea del Sur", 0, true, "H", 0, "COR", 32, 0, 0, 0, 0 ,0);
		
		
		//Paises
		LinkedList<Pais> paises = new LinkedList <Pais>();
		paises.add(qatar);
		paises.add(ecuador);
		paises.add(senegal);
		paises.add(holanda);
		paises.add(inglaterra);
		paises.add(usa);
		paises.add(iran);
		paises.add(gales);
		paises.add(españa);
		paises.add(alemania);
		paises.add(costarica);
		paises.add(japon);
		paises.add(belgica);
		paises.add(canada);
		paises.add(marruecos);
		paises.add(croacia);
		paises.add(argentina);
		paises.add(arabia);
		paises.add(mexico);
		paises.add(polonia);
		paises.add(francia);
		paises.add(australia);
		paises.add(dinamarca);
		paises.add(tunez);
		paises.add(brasil);
		paises.add(serbia);
		paises.add(suiza);
		paises.add(camerun);
		paises.add(portugal);
		paises.add(ghana);
		paises.add(uruguay);
		paises.add(corea);
		
		LinkedList<	Pais> grupoA = new LinkedList<Pais>();
		grupoA.add(qatar);
		grupoA.add(ecuador);
		grupoA.add(senegal);
		grupoA.add(holanda);
	
		LinkedList<	Pais> grupoB = new LinkedList<Pais>();
		grupoB.add(inglaterra);
		grupoB.add(iran);
		grupoB.add(usa);
		grupoB.add(gales);

		LinkedList<	Pais> grupoC = new LinkedList<Pais>();
		grupoC.add(argentina);
		grupoC.add(arabia);
		grupoC.add(mexico);
		grupoC.add(polonia);
		
		LinkedList<	Pais> grupoD = new LinkedList<Pais>();
		grupoD.add(francia);
		grupoD.add(australia);
		grupoD.add( dinamarca);
		grupoD.add(tunez);
		
		LinkedList<	Pais> grupoE = new LinkedList<Pais>();
		grupoE.add(españa);
		grupoE.add(costarica);
		grupoE.add(alemania);
		grupoE.add(japon);
		
		LinkedList<	Pais> grupoF = new LinkedList<Pais>();
		grupoF.add(belgica);
		grupoF.add(canada);
		grupoF.add(marruecos);
		grupoF.add(croacia);
		
		LinkedList<	Pais> grupoG = new LinkedList<Pais>();
		grupoG.add(brasil);
		grupoG.add(serbia);
		grupoG.add(suiza);
		grupoG.add(camerun);
		
		LinkedList<	Pais> grupoH = new LinkedList<Pais>();
		grupoH.add(portugal);
		grupoH.add(ghana);
		grupoH.add(uruguay);
		grupoH.add(corea);
		
		LinkedList<Pais> octavos = new LinkedList<Pais>();
		LinkedList<Pais> cuartos = new LinkedList<Pais>();
		LinkedList<Pais> semi = new LinkedList<Pais>();
		LinkedList<Pais> finall = new LinkedList<Pais>();

		LinkedList<Partido> partidoa = new LinkedList<>();
		LinkedList<Partido> partidob = new LinkedList<>();
		LinkedList<Partido> partidoc = new LinkedList<>();
		LinkedList<Partido> partidod = new LinkedList<>();
		LinkedList<Partido> partidoe = new LinkedList<>();
		LinkedList<Partido> partidof = new LinkedList<>();
		LinkedList<Partido> partidog = new LinkedList<>();
		LinkedList<Partido> partidoh = new LinkedList<>();
		int id;
		
		Partido.PartidosGrupo(partidoa, grupoA, id=0);
		Partido.PartidosGrupo(partidob, grupoB, id=6);
		Partido.PartidosGrupo(partidoc, grupoC, id=12);
		Partido.PartidosGrupo(partidod, grupoD, id=18);
		Partido.PartidosGrupo(partidoe, grupoE, id=24);
		Partido.PartidosGrupo(partidof, grupoF, id=30);
		Partido.PartidosGrupo(partidog, grupoG, id=36);
		Partido.PartidosGrupo(partidoh, grupoH, id=42);
	
		/*PartidosGrupo(partidoa, grupoA, id=0);
		PartidosGrupo(partidob, grupoB, id=6);
		PartidosGrupo(partidoc, grupoC, id=12);
		PartidosGrupo(partidod, grupoD, id=18);
		PartidosGrupo(partidoe, grupoE, id=24);
		PartidosGrupo(partidof, grupoF, id=30);
		PartidosGrupo(partidog, grupoG, id=36);
		PartidosGrupo(partidoh, grupoH, id=42);
		*/
		LinkedList<Partido> partidos = new LinkedList<>();
		partidos.addAll(partidoa);
		partidos.addAll(partidob);
		partidos.addAll(partidoc);
		partidos.addAll(partidod);
		partidos.addAll(partidoe);
		partidos.addAll(partidof);
		partidos.addAll(partidog);
		partidos.addAll(partidoh);

		Apuesta apuesta = new Apuesta(0, 0);
		Encargado encargado = new Encargado(2022, "maia", 1010);
		
// ------------ MENU --------------------------
		Scanner entrada = new Scanner(System.in);
		int tot=0, m=1;	
		String r, nombre;
	
			//id = 2022 contra = 1010
			System.out.println(" \t BIENVENIDO AL MUNDIAL DE QATAR 2022 ");
			System.out.println("Ingrese su nombre");
			nombre = entrada.nextLine();
			System.out.println("Hola! " + nombre);
			System.out.println("Desea completar los datos de forma manual o automatica?");
			System.out.println("Se le informa que en la forma automatica podra realizar apuestas. La forma manual es solo para encargados");
			r = entrada.nextLine();
			do {
				switch (r) {
				// funcion manual sin apuestas, solo encargado
				case "manual":
					System.out.println("Debera Ingresar para acceder al menu y validar ser encargado");
					if (encargado.IngresoEncargado("", 2022, 1010)) { // valida metodo encargado de la clase encargado
						do {
							Menu1(paises, octavos, cuartos, semi, finall, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos);
							System.out.println("Ingrese 0 para salir, cualquier otro numero para continuar");
							m= entrada.nextInt();
						} while (m!=0);
					
					}
					
					break;
					//funcion automatica con apuestas
				case "automatica":
					Menu2(paises, octavos, cuartos, semi, finall, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos, apuesta);
					System.out.println("Ingrese 0 para salir, cualquier otro numero para continuar");
					m= entrada.nextInt();
					
					break;
				default:
					System.out.println("La opcion ingresada no es valida");
					m=1;
					break;
				}
				
			} while (m!=0);
			System.out.println("Gracias por participar!");
			

}
		
		// menu funcion manual
		public static void Menu1(LinkedList<Pais> paises, LinkedList<Pais> octavos, LinkedList<Pais> cuartos, LinkedList<Pais> semi, LinkedList<Pais> finall, LinkedList<Pais> grupoA,  LinkedList<Pais> grupoB, LinkedList<Pais> grupoC, LinkedList<Pais> grupoD, LinkedList<Pais> grupoE, LinkedList<Pais> grupoF, LinkedList<Pais> grupoG, LinkedList<Pais> grupoH, LinkedList<Partido> partidos) { 
			Scanner entrada = new Scanner(System.in);

			System.out.println("Bienvenido al mundial de Qatar 2022");
			System.out.println("Ingrese la opcion que desea conocer");
			System.out.println("Si es la primera vez que ingresa debera tocar la opcion 1 y asginar los resultados");
			System.out.println("Antes de avanzar a octavos debera ver las posiciones de cada grupo (opcion 2)");
			System.out.println("1- Equipos y partidos de los grupos");
			System.out.println("2- Posiciones de los grupos");
			System.out.println("3- Octavos de final");
			System.out.println("4- Cuartos de final");
			System.out.println("5- Semifinal");
			System.out.println("6- Final");
			System.out.println("7- Salir");
			int a = entrada.nextInt();
			switch (a) {
			case 1:
				System.out.println("Ingrese: \n 1 para ver los partidos del grupo \n 2 para asignar los resultados del mundial");
				int uno= entrada.nextInt();
				switch (uno) {
				case 1:
					String op;
					System.out.println("Ingrese el grupo del que desea ver los partidos");
					entrada.nextLine();
					op = entrada.nextLine();
					System.out.println("Los partidos del grupo " + op + " son: ");
					for (int i = 0; i < partidos.size(); i++) {
						if (partidos.get(i).getPais().getGrupo().equalsIgnoreCase(op)) {
							System.out.println(partidos.get(i));
						}
					}
					break;
				case 2:
					String res;
					System.out.println("Podra asignar los resultados segun le guste. Ingrese si para continuar");
					entrada.nextLine();
					res = entrada.nextLine();
					if (res.equalsIgnoreCase("si")) {
						Resultados(partidos, paises);
					}
					else {
						System.out.println("No hay nada para ver");
					}
					break;

				default:
					System.out.println("opcion incorrecta");
					break;
				}
				break;
			case 2:
				System.out.println("Los 2 primeros de cada grupo clasifican a octavos de final");
				System.out.println("Se muestran las posiciones de cada grupo");
				Posiciones(paises, grupoA);
				Posiciones(paises, grupoB);
				Posiciones(paises, grupoC);
				Posiciones(paises, grupoD);
				Posiciones(paises, grupoE);
				Posiciones(paises, grupoF);
				Posiciones(paises, grupoG);
				Posiciones(paises, grupoH);
				
				System.out.println("Desea ver algun grupo nuevamente?");
				entrada.nextLine();
				String s = entrada.nextLine();
				if (s.equalsIgnoreCase("si")) {	
				System.out.println("Ingrese el grupo del que desea saber las posiciones");
				entrada.nextLine();
				String g = entrada.nextLine();
				System.out.println("La clasificacion del grupo es: ");
				switch (g.toLowerCase()) {
				case "a":
					Posiciones(paises, grupoA);
					break;
				case "b":
					Posiciones(paises, grupoB);				
					break;
				case "c":
					Posiciones(paises, grupoC);
					break;
				case "d":
					Posiciones(paises, grupoD);
					break;
				case "e":
					Posiciones(paises, grupoE);
					break;
				case "f":
					Posiciones(paises, grupoF);
					break;
				case "g":
					Posiciones(paises, grupoG);
					break;
				case "h":
					Posiciones(paises, grupoH);
					break;

				default:
					System.out.println("La letra ingresada fue: " + g);
					System.out.println("No existe ningun grupo del mundial con la letra ingresada");
					break;
				} 
				} else {	
				}
				break;
			case 3:
				Octavos(paises, octavos, cuartos, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH);
				break;
			case 4:
				Cuartos(paises, cuartos, semi);
				break;
			case 5:
				Semifinal(paises, semi, finall);
				break;
			case 6:
				Final(paises, finall);
				break;
			case 7:
				System.out.println("Nos vemos pronto!");
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			}
		}
		
		//menu funcion automatica con apuestas
		public static void Menu2(LinkedList<Pais> paises, LinkedList<Pais> octavos, LinkedList<Pais> cuartos, LinkedList<Pais> semi, LinkedList<Pais> finall, LinkedList<Pais> grupoA,  LinkedList<Pais> grupoB, LinkedList<Pais> grupoC, LinkedList<Pais> grupoD, LinkedList<Pais> grupoE, LinkedList<Pais> grupoF, LinkedList<Pais> grupoG, LinkedList<Pais> grupoH, LinkedList<Partido> partidos, Apuesta apuesta) { 
			Scanner entrada = new Scanner(System.in);

			System.out.println("Bienvenido al mundial de Qatar 2022");
			System.out.println("Ingrese la opcion que desea conocer");
			System.out.println("Los resultados seran mostrados de forma automatica");
			System.out.println("Si es la primera vez que ingresa debera comenzar por ver los resultados de la fase de grupos (opcion 1)");
			System.out.println("Antes de avanzar a octavos debera ver las posiciones de cada grupo (opcion 2)");
			System.out.println("1- Partidos, resultados y apuestas");
			System.out.println("2- Posiciones de los grupos");
			System.out.println("3- Octavos de final");
			System.out.println("4- Cuartos de final");
			System.out.println("5- Semifinal");
			System.out.println("6- Final");
			System.out.println("7- Salir");
			int a = entrada.nextInt();
			switch (a) {
			case 1:
				System.out.println("Ingrese: \n 1 para ver los partidos del grupo \n 2 para apostar y ver los resultados");
				int uno= entrada.nextInt();
				switch (uno) {
				case 1:
					String op;
					System.out.println("Ingrese el grupo del que desea ver los partidos");
					entrada.nextLine();
					op = entrada.nextLine();
					System.out.println("Los partidos del grupo " + op + " son: ");
					for (int i = 0; i < partidos.size(); i++) {
						if (partidos.get(i).getPais().getGrupo().equalsIgnoreCase(op)) {
							System.out.println(partidos.get(i));
						}
					}
					break;
				case 2:
						ResultadosRandom(partidos, paises, apuesta);
					break;

				default:
					System.out.println("opcion incorrecta");
					break;
				}
				break;
			case 2:
				System.out.println("Los 2 primeros de cada grupo clasifican a octavos de final");
				System.out.println("Se muestran las posiciones de cada grupo");
				Posiciones(paises, grupoA);
				Posiciones(paises, grupoB);
				Posiciones(paises, grupoC);
				Posiciones(paises, grupoD);
				Posiciones(paises, grupoE);
				Posiciones(paises, grupoF);
				Posiciones(paises, grupoG);
				Posiciones(paises, grupoH);
				
				System.out.println("Desea ver algun grupo nuevamente?");
				entrada.nextLine();
				String s = entrada.nextLine();
				if (s.equalsIgnoreCase("si")) {
				System.out.println("Ingrese el grupo del que desea ver las posiciones");
				entrada.nextLine();
				String g = entrada.nextLine();
				System.out.println("La clasificacion del grupo es: ");
				switch (g.toLowerCase()) {
				case "a":
					Posiciones(paises, grupoA);
					break;
				case "b":
					Posiciones(paises, grupoB);				
					break;
				case "c":
					Posiciones(paises, grupoC);
					break;
				case "d":
					Posiciones(paises, grupoD);
					break;
				case "e":
					Posiciones(paises, grupoE);
					break;
				case "f":
					Posiciones(paises, grupoF);
					break;
				case "g":
					Posiciones(paises, grupoG);
					break;
				case "h":
					Posiciones(paises, grupoH);
					break;

				default:
					System.out.println("La letra ingresada fue: " + g);
					System.out.println("No existe ningun grupo del mundial con la letra ingresada");
					break;
				}
				} else {
					System.out.println("-");
				}
				break;
			case 3:
				OctavosRandom(paises, octavos, cuartos, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, apuesta);
				break;
			case 4:
				CuartosRandom(paises, cuartos, semi, apuesta);
				break;
			case 5:
				SemifinalRandom(paises, semi, finall, apuesta);
				break;
			case 6:
				FinalRandom(paises, finall, apuesta);
				break;
			case 7:
				System.out.println("Nos vemos pronto!");
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			}
		}
		
		// resultados fase grupos metodo manual
		public static void Resultados(LinkedList<Partido> partidos, LinkedList<Pais> paises) {
			Scanner entrada = new Scanner(System.in);
			int ga, gb;
			
			System.out.println("Ingrese los resultados de los partidos del mundial");
			for (int i = 0; i < partidos.size(); i++) {
				ga=0;
				gb=0;
				System.out.println("El partido es: ");
				System.out.println(partidos.get(i).getPais());	
				System.out.println(partidos.get(i).getPais2());	
				System.out.println("Ingrese los goles del Equipo: " + partidos.get(i).getPais().getNombre() ); 
				ga = entrada.nextInt();
				
				
				System.out.println("Ingrese los goles del Equipo: " + partidos.get(i).getPais2().getNombre() ); 
				gb = entrada.nextInt();
				
				if (ga>gb) {
					partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos()+3);
					partidos.get(i).getPais().setPg(partidos.get(i).getPais().getPg()+1);
					partidos.get(i).getPais2().setPp(partidos.get(i).getPais().getPp()+1);
					
				} else if (gb>ga) {
					partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos()+3);
					partidos.get(i).getPais2().setPg(partidos.get(i).getPais2().getPg()+1);
					partidos.get(i).getPais().setPp(partidos.get(i).getPais2().getPp()+1);
					
				} else if (ga==gb) {
					partidos.get(i).getPais().setPe(partidos.get(i).getPais().getPe()+1);
					partidos.get(i).getPais2().setPe(partidos.get(i).getPais2().getPe()+1);
					partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos()+1);
					partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos()+1);
				} 
				
				partidos.get(i).getPais().setGc(partidos.get(i).getPais().getGc() + gb);
				partidos.get(i).getPais2().setGc(partidos.get(i).getPais2().getGc() + ga);
				
				ga = partidos.get(i).getPais().getGf() + ga;
				partidos.get(i).getPais().setGf(ga);
				gb = partidos.get(i).getPais2().getGf() + gb;
				partidos.get(i).getPais2().setGf(gb);

		
			}
			}
		
		// resultados metodo automatico con apuestas
		public static void ResultadosRandom(LinkedList<Partido> partidos, LinkedList<Pais> paises, Apuesta apuesta) {
			Scanner entrada = new Scanner(System.in);
		
			int ap;
			System.out.println("Ingrese el deposito para realizar las apuestas");
			System.out.println("Recuerde que de esto depende si tiene o no fondos para realizar las mismas");
			apuesta.setFondos(entrada.nextInt());
			
			System.out.println("Se muestran los resultados de los partidos del mundial");
			for (int i = 0; i < partidos.size(); i++) {
				int ga, gb, apf=0, aa=0;
				ga=0;
				gb=0;
				System.out.println("----------------------------");
				System.out.println("El partido es: ");
				System.out.println(partidos.get(i).getPais());	
				System.out.println(partidos.get(i).getPais2());	
				
				System.out.println("Desea apostar por este partido?");
				System.out.println("Digite 1 para si, 2 para no");
				ap = entrada.nextInt();
				
				if (ap==1) {
					do {
					System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
					System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
					apuesta.setMonto(entrada.nextInt());
					if (apuesta.getFondos()>=apuesta.getMonto()) {
						System.out.println("Monto apostado correctamente");
						apuesta.setFondos(apuesta.getFondos()-apuesta.getMonto());
						// tot= tot - monto;
					} else {
						System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
						System.out.println("Desea realizar un nuevo deposito");
						entrada.nextLine();
						String deposito = entrada.nextLine();
						if (deposito.equalsIgnoreCase("si")) {
							apuesta.setNuevodeposito(0);
							System.out.println("Ingrese el deposito");
							apuesta.setNuevodeposito(entrada.nextInt());
							apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
							System.out.println("Deposito realizado correctamente!");
							System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
						} else {
							System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
						}
					} 
					} while (apuesta.getMonto()>apuesta.getFondos());
					
					System.out.println("-------------------------------");
					System.out.println("Ingrese el equipo que ganara el partido");
					System.out.println("Ingrese 1 para " + partidos.get(i).getPais().getNombre());
					System.out.println("Ingrese 2 para " + partidos.get(i).getPais2().getNombre());
					System.out.println("Ingrese 3 para empate");
					aa = entrada.nextInt();

				} else if (ap==2) {
					System.out.println("-----------------------------------");
					System.out.println("No se realizo ninguna apuesta");
				} else {
					System.out.println("Opcion invalida");
				} 
				System.out.println("\n");
				System.out.println("-----------------------------------");
				System.out.println("Equipo: " + partidos.get(i).getPais().getNombre() ); 
				ga = (int)(Math.random()*5);
				System.out.println("Los goles marcados son: " + ga);
				
				
				System.out.println("Equipo: " + partidos.get(i).getPais2().getNombre() ); 
				gb = (int)(Math.random()*5);
				System.out.println("Los goles marcados son: " + gb);
				
				if (ga>gb) {
					System.out.println("El ganador es: " + partidos.get(i).getPais().getNombre());
					partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos()+3);
					partidos.get(i).getPais().setPg(partidos.get(i).getPais().getPg()+1);
					partidos.get(i).getPais2().setPp(partidos.get(i).getPais().getPp()+1);
					if (aa==1) {
						System.out.println("-----------------------------------");
						apf = apuesta.getMonto()*2;
						System.out.println("Felicitaciones! Ha ganado la apuesta");
						System.out.println("El monto ganado es: " + apf);
					} else if (ap==1) {
						System.out.println("-----------------------------------");
						apf = 0;
						System.out.println("Has perdido la apuesta");
					}
					
				} else if (gb>ga) {
					System.out.println("El ganador es: "+ partidos.get(i).getPais2().getNombre());
					partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos()+3);
					partidos.get(i).getPais2().setPg(partidos.get(i).getPais2().getPg()+1);
					partidos.get(i).getPais().setPp(partidos.get(i).getPais2().getPp()+1);
					if (aa==2) {
						System.out.println("-----------------------------------");
						apf = apuesta.getMonto()*2;
						System.out.println("Felicitaciones! Ha ganado la apuesta");
						System.out.println("El monto ganado es: " + apf);
					} else if (ap==1) {
						apf = 0;
						System.out.println("Has perdido la apuesta");
					}
					
				} else if (ga==gb) {
					System.out.println("El resultado es empate");
					partidos.get(i).getPais().setPe(partidos.get(i).getPais().getPe()+1);
					partidos.get(i).getPais2().setPe(partidos.get(i).getPais2().getPe()+1);
					partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos()+1);
					partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos()+1);
					if (aa==3) {
						System.out.println("-----------------------------------");
						apf = apuesta.getMonto()*2;
						System.out.println("Felicitaciones! Ha ganado la apuesta");
						System.out.println("El monto ganado es: " + apf);
					} else if (ap==1) {
						System.out.println("-----------------------------------");
						apf = 0;
						System.out.println("Has perdido la apuesta");
					}
				}
				
				apuesta.setFondos(apuesta.getFondos() + apf);
				// tot = tot + apf;
				System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
				
				partidos.get(i).getPais().setGc(partidos.get(i).getPais().getGc() + gb);
				partidos.get(i).getPais2().setGc(partidos.get(i).getPais2().getGc() + ga);
				
				ga = partidos.get(i).getPais().getGf() + ga;
				partidos.get(i).getPais().setGf(ga);
				gb = partidos.get(i).getPais2().getGf() + gb;
				partidos.get(i).getPais2().setGf(gb);

			}
			}
		
		// posiciones por grupo para ambos metodos
		public static void Posiciones(LinkedList<Pais> grupos, LinkedList<Pais> grupoA) {
			Scanner entrada = new Scanner(System.in);
			int max=-1, max2=-1, max3=-1, max4=-1;
			
			Pais pais1=null;
			Pais pais2=null;
			Pais pais3=null;
			Pais pais4=null;
			
			for (int i = 0; i <4; i++) {
				if (grupoA.get(i).getPuntos()>max) {
					max = grupoA.get(i).getPuntos();
					pais1 = grupoA.get(i); 
				} else if (grupoA.get(i).getPuntos() == max) {
					if (grupoA.get(i).getGf() > pais1.getGf()) {
						pais1 = grupoA.get(i);
					} else {
						pais1 = pais1;
					}
				}
			}
			for (int j = 0; j < 4; j++) {
				if (grupoA.get(j).getPuntos()>max2 && grupoA.get(j) != pais1 ) {
						max2 = grupoA.get(j).getPuntos();
						pais2= grupoA.get(j);
				} else if (grupoA.get(j).getPuntos() == max2 && grupoA.get(j) != pais1 ) {
					if (grupoA.get(j).getGf() > pais2.getGf()) {
						pais2 = grupoA.get(j);
					} else {
						pais2 = pais2;
					}
				}
			}
			for (int j2 = 0; j2 < 4; j2++) {
					if (grupoA.get(j2).getPuntos()>max3 && grupoA.get(j2) != pais1 && grupoA.get(j2) != pais2) {
							max3 = grupoA.get(j2).getPuntos();
							pais3= grupoA.get(j2);
					} else if (grupoA.get(j2).getPuntos() == max3 && grupoA.get(j2) != pais1 && grupoA.get(j2) != pais2) {
						if (grupoA.get(j2).getGf() > pais3.getGf()) {
							pais3 = grupoA.get(j2);
						} else {
							pais3 = pais3;
						}
					}
			}
			for (int x = 0; x < 4; x++) {
				if (grupoA.get(x) != pais1 && grupoA.get(x) != pais2 && grupoA.get(x) != pais3) {
					
					max4 = grupoA.get(x).getPuntos();
					pais4= grupoA.get(x);
				} 
				}

			grupoA.clear();
			grupoA.add(pais1);
			grupoA.add(pais2);
			grupoA.add(pais3);
			grupoA.add(pais4);
	
			System.out.println("PAIS \t PTS \t PG \t PE \t PP \t GF \t GC \n " );
		
					for (int i = 0; i < 4; i++) {
						System.out.println(grupoA.get(i).getAb() + "\t" + grupoA.get(i).getPuntos() + "\t" + grupoA.get(i).getPg() + "\t" + grupoA.get(i).getPe() + "\t" + grupoA.get(i).getPp() + "\t" + grupoA.get(i).getGf() + "\t" + grupoA.get(i).getGc() );	
					}
		
		}

		// octavos de final para la funcion manual
		public static void Octavos(LinkedList<Pais> paises, LinkedList<Pais> octavos,  LinkedList<Pais> cuartos, LinkedList<Pais> grupoA, LinkedList<Pais> grupoB, LinkedList<Pais> grupoC, LinkedList<Pais> grupoD, LinkedList<Pais> grupoE, LinkedList<Pais> grupoF, LinkedList<Pais> grupoG, LinkedList<Pais> grupoH ) {
			Scanner entrada = new Scanner(System.in);
			
			octavos.add(grupoA.get(0));
			octavos.add(grupoA.get(1));
			octavos.add(grupoB.get(0));
			octavos.add(grupoB.get(1));
			octavos.add(grupoC.get(0));
			octavos.add(grupoC.get(1));
			octavos.add(grupoD.get(0));
			octavos.add(grupoD.get(1));
			octavos.add(grupoE.get(0));
			octavos.add(grupoE.get(1));
			octavos.add(grupoF.get(0));
			octavos.add(grupoF.get(1));
			octavos.add(grupoG.get(0));
			octavos.add(grupoG.get(1));
			octavos.add(grupoH.get(0));
			octavos.add(grupoH.get(1));
			
			System.out.println("Los paises clasificados a Octavos de final son: ");
			System.out.println(octavos);
			
			int p;
			
			do {
			System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
			
			System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
			System.out.print(grupoA.get(0) + " - " + grupoB.get(1));
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoA.get(0));
			} else if (p==2) {
				cuartos.add(grupoB.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			} while (p!=1 && p!=2);
			
			do {
			System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
			System.out.println(grupoB.get(0) + " - " + grupoA.get(1));
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoB.get(0));
			} else if (p==2) {
				cuartos.add(grupoA.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			} while (p!=1 && p!=2);
			
			do {
			System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
			System.out.println(grupoC.get(0) + " - " + grupoD.get(1));
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoC.get(0));
			} else if (p==2) {
				cuartos.add(grupoD.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			} while (p!=1 && p!=2);
			
			do {
			System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
			System.out.println(grupoD.get(0) + " - " + grupoC.get(1));
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoD.get(0));
			} else if (p==2) {
				cuartos.add(grupoC.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			} while (p!=1 && p!=2);
			
			do {
			System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
			System.out.println(grupoE.get(0) + " - " + grupoF.get(1));
			entrada.nextInt();
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoE.get(0));
			} else if (p==2) {
				cuartos.add(grupoF.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			} while (p!=1 && p!=2);
			
			do {
			System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
			System.out.println(grupoF.get(0) + " - " + grupoE.get(1));
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoF.get(0));
			} else if (p==2) {
				cuartos.add(grupoE.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			} while (p!=1 && p!=2);
			
			do {
			System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
			System.out.println(grupoG.get(0) + " - " + grupoH.get(1));
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoG.get(0));
			} else if (p==2) {
				cuartos.add(grupoH.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			} while (p!=1 && p!=2);
			
			do {
			System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
			System.out.println(grupoH.get(0) + " - " + grupoG.get(1));
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoH.get(0));
			} else if (p==2) {
				cuartos.add(grupoG.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			} while (p!=1 && p!=2);
		}
		
		
		// octavos automatico con apuestas
		public static void OctavosRandom(LinkedList<Pais> paises, LinkedList<Pais> octavos,  LinkedList<Pais> cuartos, LinkedList<Pais> grupoA, LinkedList<Pais> grupoB, LinkedList<Pais> grupoC, LinkedList<Pais> grupoD, LinkedList<Pais> grupoE, LinkedList<Pais> grupoF, LinkedList<Pais> grupoG, LinkedList<Pais> grupoH, Apuesta apuesta ) {
			Scanner entrada = new Scanner(System.in);
			int ap=0;
			int aa=0, apf=0;
			
			octavos.add(grupoA.get(0));
			octavos.add(grupoA.get(1));
			octavos.add(grupoB.get(0));
			octavos.add(grupoB.get(1));
			octavos.add(grupoC.get(0));
			octavos.add(grupoC.get(1));
			octavos.add(grupoD.get(0));
			octavos.add(grupoD.get(1));
			octavos.add(grupoE.get(0));
			octavos.add(grupoE.get(1));
			octavos.add(grupoF.get(0));
			octavos.add(grupoF.get(1));
			octavos.add(grupoG.get(0));
			octavos.add(grupoG.get(1));
			octavos.add(grupoH.get(0));
			octavos.add(grupoH.get(1));
			
			System.out.println("Los paises clasificados a Octavos de final son: ");
			System.out.println(octavos);
			int p;
			System.out.println("A continuacion se mostraran los ganadores de cada cruce: ");
	
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.print(grupoA.get(0) + " - " + grupoB.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt()); 
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos()-apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + grupoA.get(0).getNombre());
				System.out.println("Ingrese 2 para " + grupoB.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + grupoA.get(0));
				cuartos.add(grupoA.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + grupoB.get(1));
				cuartos.add(grupoB.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
	
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(grupoB.get(0) + " - " + grupoA.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				// monto = entrada.nextInt();
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos()-apuesta.getMonto());
				//	tot= tot - monto;
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + grupoB.get(0).getNombre());
				System.out.println("Ingrese 2 para " + grupoA.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + grupoB.get(0));
				cuartos.add(grupoB.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + grupoA.get(1));
				cuartos.add(grupoA.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(grupoC.get(0) + " - " + grupoD.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + grupoC.get(0).getNombre());
				System.out.println("Ingrese 2 para " + grupoD.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + grupoC.get(0));
				cuartos.add(grupoC.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + grupoD.get(1));
				cuartos.add(grupoD.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(grupoD.get(0) + " - " + grupoC.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + grupoD.get(0).getNombre());
				System.out.println("Ingrese 2 para " + grupoC.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + grupoD.get(0));
				cuartos.add(grupoD.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + grupoC.get(1));
				cuartos.add(grupoC.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(grupoE.get(0) + " - " + grupoF.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + grupoE.get(0).getNombre());
				System.out.println("Ingrese 2 para " + grupoF.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + grupoE.get(0));
				cuartos.add(grupoE.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + grupoF.get(1));
				cuartos.add(grupoF.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(grupoF.get(0) + " - " + grupoE.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + grupoF.get(0).getNombre());
				System.out.println("Ingrese 2 para " + grupoE.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + grupoF.get(0));
				cuartos.add(grupoF.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + grupoE.get(1));
				cuartos.add(grupoE.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(grupoG.get(0) + " - " + grupoH.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + grupoG.get(0).getNombre());
				System.out.println("Ingrese 2 para " + grupoH.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + grupoG.get(0));
				cuartos.add(grupoG.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + grupoH.get(1));
				cuartos.add(grupoH.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(grupoH.get(0) + " - " + grupoG.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + grupoH.get(0).getNombre());
				System.out.println("Ingrese 2 para " + grupoG.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + grupoH.get(0));
				cuartos.add(grupoH.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + grupoG.get(1));
				cuartos.add(grupoG.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
		}
		
		// cuartos funcion manual 
		public static void Cuartos(LinkedList<Pais> paises, LinkedList<Pais> cuartos, LinkedList<Pais> semi ) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Los paises clasificados a Cuartos de final son: ");
		System.out.println(cuartos);
		
		int p;
		
		System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
		
		do {
		System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
		System.out.println(cuartos.get(0) + " - " + cuartos.get(1));
		p = entrada.nextInt();
		if (p==1) {
			semi.add(cuartos.get(0));
		} else if (p==2) {
			semi.add(cuartos.get(1));
		} else {
			System.out.println("opcion invalida");
		}  
		} while (p!=1 && p!=2);
		
		do {
		System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
		System.out.println(cuartos.get(2) + " - " + cuartos.get(3));
		p = entrada.nextInt();
		if (p==1) {
			semi.add(cuartos.get(2));
		} else if (p==2) {
			semi.add(cuartos.get(3));
		} else {
			System.out.println("opcion invalida");
		}
		} while (p!=1 && p!=2);
		
		do {
		System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
		System.out.println(cuartos.get(4) + " - " + cuartos.get(5));
		p = entrada.nextInt();
		if (p==1) {
			semi.add(cuartos.get(4));
		} else if (p==2) {
			semi.add(cuartos.get(5));
		} else {
			System.out.println("opcion invalida");
		}
		} while (p!=1 && p!=2);
		
		do {
		System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
		System.out.println(cuartos.get(6) + " - " + cuartos.get(7));
		p = entrada.nextInt();
		if (p==1) {
			semi.add(cuartos.get(6));
		} else if (p==2) {
			semi.add(cuartos.get(7));
		} else {
			System.out.println("opcion invalida");
		}
		 } while (p!=1 && p!=2);

		}
		
		// cuartos automatico con apuestas
		public static void CuartosRandom(LinkedList<Pais> paises, LinkedList<Pais> cuartos, LinkedList<Pais> semi, Apuesta apuesta ) {
			Scanner entrada = new Scanner(System.in);
			int ap=0;
			int aa=0, apf=0;
			
			System.out.println("Los paises clasificados a Cuartos de final son: ");
			System.out.println(cuartos);
			
			int p;
			
			System.out.println("A continuacion se muestran los ganadores de cada cruce: ");
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(cuartos.get(0) + " - " + cuartos.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + cuartos.get(0).getNombre());
				System.out.println("Ingrese 2 para " + cuartos.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + cuartos.get(0));
				semi.add(cuartos.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + cuartos.get(1));
				semi.add(cuartos.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(cuartos.get(2) + " - " + cuartos.get(3));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + cuartos.get(2).getNombre());
				System.out.println("Ingrese 2 para " + cuartos.get(3).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + cuartos.get(2));
				semi.add(cuartos.get(2));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + cuartos.get(3));
				semi.add(cuartos.get(3));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(cuartos.get(4) + " - " + cuartos.get(5));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + cuartos.get(4).getNombre());
				System.out.println("Ingrese 2 para " + cuartos.get(5).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + cuartos.get(4));
				semi.add(cuartos.get(4));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + cuartos.get(5));
				semi.add(cuartos.get(5));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(cuartos.get(6) + " - " + cuartos.get(7));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + cuartos.get(6).getNombre());
				System.out.println("Ingrese 2 para " + cuartos.get(7).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + cuartos.get(6));
				semi.add(cuartos.get(6));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + cuartos.get(7));
				semi.add(cuartos.get(7));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);

			}
		
		//semifinal funcion manual
		public static void Semifinal(LinkedList<Pais> paises, LinkedList<Pais> semi, LinkedList<Pais> finall) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Los paises clasificados a la Semifinal del Mudnial son: ");
		System.out.println(semi);
		int p;
		
		System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
		
		do {
		System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
		System.out.println(semi.get(0) + " - " + semi.get(1));
		p = entrada.nextInt();
		if (p==1) {
			finall.add(semi.get(0));
		} else if (p==2) {
			finall.add(semi.get(1));
		} else {
			System.out.println("opcion invalida");
		} 
		} while (p!=1 && p!=2);
		
		do {
		System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
		System.out.println(semi.get(2) + " - " + semi.get(3));
		p = entrada.nextInt();
		if (p==1) {
			finall.add(semi.get(2));
		} else if (p==2) {
			finall.add(semi.get(3));
		} else {
			System.out.println("opcion invalida");
		}
		} while (p!=1 && p!=2);
		}
		
		
		// semifinal automatica con apuestas
		public static void SemifinalRandom(LinkedList<Pais> paises, LinkedList<Pais> semi, LinkedList<Pais> finall, Apuesta apuesta) {
			Scanner entrada = new Scanner(System.in);
			int ap=0;
			int aa=0, apf=0;
			
			System.out.println("Los paises clasificados a la Semifinal del Mudnial son: ");
			System.out.println(semi);
			
			int p;
			
			System.out.println("A continuacion se mostraran los ganadores de cada cruce: ");
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(semi.get(0) + " - " + semi.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + semi.get(0).getNombre());
				System.out.println("Ingrese 2 para " + semi.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + semi.get(0));
				finall.add(semi.get(0));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + semi.get(1));
				finall.add(semi.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			
			do {
			System.out.println("-------------------------------------------------");
			System.out.println("Cruce: ");
			System.out.println(semi.get(2) + " - " + semi.get(3));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + semi.get(2).getNombre());
				System.out.println("Ingrese 2 para " + semi.get(3).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + semi.get(2));
				finall.add(semi.get(2));
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + semi.get(3));
				finall.add(semi.get(3));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			}
		
		// final funcion manual sin apuestas
		public static void Final(LinkedList<Pais> paises, LinkedList<Pais> finall) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Los paises clasificados a la final del Mudnial son: ");
		System.out.println(finall);
		int p;
		
		System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
		
		do {
		System.out.println("Indique el ganador del cruce. \n 1-Equipo A \n 2-Equipo B");
		System.out.println(finall.get(0) + " - " + finall.get(1));
		p = entrada.nextInt();
		if (p==1) {
			System.out.println("El ganador del Mundial es: " + finall.get(0));
		} else if (p==2) {
			System.out.println("El ganador del Mundial es: " + finall.get(1));
		} else {
			System.out.println("opcion invalida");
		}
		} while (p!=1 && p!=2);
		}
		
		// final automatica con apuesta
		public static void FinalRandom(LinkedList<Pais> paises, LinkedList<Pais> finall, Apuesta apuesta) {
			Scanner entrada = new Scanner(System.in);
			int ap=0;
			int aa=0, apf=0;
			
			System.out.println("Los paises clasificados a la final del Mudnial son: ");
			System.out.println(finall);
			
			int p;
			
			do {
			System.out.println("Se muestra el ganador de la final");
			System.out.println(finall.get(0) + " - " + finall.get(1));
			p = (int)(Math.random()*2+1);
			
			System.out.println("Desea apostar por este partido?");
			System.out.println("Digite 1 para si, 2 para no");
			ap = entrada.nextInt();
			if (ap==1) {
				do {
				System.out.println("Debera acertar quien pasa para duplicar el monto apostado");
				System.out.println("Ingrese monto a apostar (debe ser un numero entero)");
				apuesta.setMonto(entrada.nextInt());
				if (apuesta.getFondos()>=apuesta.getMonto()) {
					System.out.println("Monto apostado correctamente");
					apuesta.setFondos(apuesta.getFondos() - apuesta.getMonto());
				} else {
					System.out.println("Fondos insuficientes para realizar la apuesta. Ingrese un monto valido");
					System.out.println("Desea realizar un nuevo deposito");
					entrada.nextLine();
					String deposito = entrada.nextLine();
					if (deposito.equalsIgnoreCase("si")) {
						apuesta.setNuevodeposito(0);
						System.out.println("Ingrese el deposito");
						apuesta.setNuevodeposito(entrada.nextInt());
						apuesta.setFondos(apuesta.getFondos() + apuesta.getNuevodeposito());
						System.out.println("Deposito realizado correctamente!");
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					} else {
						System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
					}
				} 
				} while (apuesta.getMonto()>apuesta.getFondos());
				
				System.out.println("-------------------------------");
				System.out.println("Ingrese el equipo que clasificara a la siguiente ronda");
				System.out.println("Ingrese 1 para " + finall.get(0).getNombre());
				System.out.println("Ingrese 2 para " + finall.get(1).getNombre());
				aa = entrada.nextInt();

			} else if (ap==2) {
				System.out.println("-----------------------------------");
				System.out.println("No se realizo ninguna apuesta");
			} else {
				System.out.println("Opcion invalida");
			} 
			
			if (p==1) {
				System.out.println("El clasificado a la proxima fase es: " + finall.get(0));
				
				if (aa==1) {
					System.out.println("-----------------------------------");
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (p==2) {
				System.out.println("El clasificado a la proxima fase es: " + finall.get(1));
				if (aa==2) {
					apf = apuesta.getMonto()*2;
					System.out.println("Felicitaciones! Ha ganado la apuesta");
					System.out.println("El monto a recibir es: " + apf);
				}  else if (ap==1) {
					System.out.println("-----------------------------------");
					apf = 0;
					System.out.println("Has perdido la apuesta");
				}
			} else if (ap==1){
				System.out.println("Opcion invalida");
			}
			
			apuesta.setFondos(apuesta.getFondos() + apf);
			System.out.println("Los fondos disponibles son: " + apuesta.getFondos());
			
			} while (p!=1 && p!=2);
			
			}
		
		
}