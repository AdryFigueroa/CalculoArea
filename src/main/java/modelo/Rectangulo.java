package modelo;

public class Rectangulo {
	 private double altura;
	 private double base;

	
	public Rectangulo() {
		
	}
	public Rectangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	public double calcularArea() {
		return base * altura;
	}
	public double calcularPerimetro() {
		return (base*2)+(altura*2);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	


}
