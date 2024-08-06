package br.edu.figplanas;

public class Circulo {
	
	public double raio;
	public double area;
	
	public void calcArea() {
		area = Math.PI*Math.pow(raio,2);
	System.out.println(area);
	}
	
}
