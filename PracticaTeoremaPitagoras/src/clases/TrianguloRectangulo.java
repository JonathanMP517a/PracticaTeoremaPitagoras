package clases;

public class TrianguloRectangulo {
	double a;
	double b;
	double c = this.hipotenusa();

	/**
	 * Recibe los valores de los catetos
	 * 
	 * @param Recibe el valor de el cateto a
	 * @param Recibe el valor de el cateto b
	 * @throws IllegalArgumentException Que ontrola que los catetos no tengan
	 *                                  valores menores o iguales a 0
	 */

	public TrianguloRectangulo(int a, int b) throws IllegalArgumentException {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Los catetos no pueden tener valores negativos");
		}
		this.a = a;
		this.b = b;
		this.c = hipotenusa();
	}

	/**
	 * Crea un Triangulo asignando los valores 1 y 1 a los catetos a y b
	 */

	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c = hipotenusa();
	}

	/**
	 * Funcion que calcula y devuelve el area del Triangulo
	 * 
	 * @return El area del triangulo
	 */

	public double area() {
		double area = (a * b) / 2.0;
		return area;
	}

	/**
	 * Funcion que calcula la hipotenusa del Triangulo
	 * 
	 * @return La hipotenusa del Triangulo
	 */

	public double hipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return hipotenusa;
	}

	/**
	 * Funcion que calcula el perimetro del Triangulo
	 * 
	 * @return El perimetro del Triangulo
	 */

	public double perimetro() {
		double perimetro = a + b + hipotenusa();
		return perimetro;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public String toString() {
		return "El cateto a es: " + this.a + ", el cateto b es: " + this.b + " y la hipotenusa vale: " + this.c;
	}
}
