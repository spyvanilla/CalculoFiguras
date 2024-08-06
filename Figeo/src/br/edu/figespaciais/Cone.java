package br.edu.figespaciais;

public class Cone {
	public double raio;
	public double arealateral;
	public double areatotal;
	public double volume;
	public double altura;
	public double area;

	
	public void calcAreaLateral() {
		arealateral = altura*(2*(Math.PI*raio));
	System.out.println(arealateral);
	}
	public void calcAreaTotal() {
		areatotal = (2*(Math.PI*raio))*(altura+raio);
	System.out.println(areatotal);
	}
	public void calcVolume() {
		volume = (Math.PI*Math.pow(raio,2))*altura;
	System.out.println(volume);
	}
	public void listAtributos() {
	System.out.println("O raio é: " + raio);
	System.out.println("A altura é: " + altura);
	}
}
