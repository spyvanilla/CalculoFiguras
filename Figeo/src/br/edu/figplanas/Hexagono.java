package br.edu.figplanas;

public class Hexagono {
	
	public double apotema;
	public double lado;
	public double area;
	
	public void calcArea() {
		area = ((3*Math.pow(lado,2))*Math.sqrt(3))/2;
	System.out.println(area);
	}
}
