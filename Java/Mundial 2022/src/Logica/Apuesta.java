package Logica;


public class Apuesta {
	private int fondos, monto, nuevodeposito;

	public Apuesta(int fondos, int monto) {
		super();
		this.fondos = fondos;
		this.monto = monto;
		this.nuevodeposito = nuevodeposito;
	}

	public int getFondos() {
		return fondos;
	}

	public void setFondos(int fondos) {
		this.fondos = fondos;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getNuevodeposito() {
		return nuevodeposito;
	}

	public void setNuevodeposito(int nuevodeposito) {
		this.nuevodeposito = nuevodeposito;
	}

	@Override
	public String toString() {
		return "Apuesta [fondos=" + fondos + ", monto=" + monto + ", nuevodeposito=" + nuevodeposito + "]";
	}

}
	
	
