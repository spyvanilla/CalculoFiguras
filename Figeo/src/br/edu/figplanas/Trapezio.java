package br.edu.figplanas;

public class Trapezio {
	
	public double bmaior;
	public double bmenor;
	public double area;
	public double altura;
	
	public void calcArea() {
		area = ((bmenor+bmaior)*altura)/2;
	System.out.println(area);
	}
	
}
