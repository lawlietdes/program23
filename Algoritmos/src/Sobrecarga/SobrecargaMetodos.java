package Sobrecarga;

public class SobrecargaMetodos {
	public int numero;
	//Sobrecarga de constructores
	public SobrecargaMetodos() {
		
	}
	public SobrecargaMetodos(int numero) {
		this.numero = numero;
	}
	
	public SobrecargaMetodos(int o, String l) {
		
	}
	
	public SobrecargaMetodos(String l) {
		
	}
	
	//sobrecarga de metodos
	public int suma(int a) {
		return a+2;
	}
	
	public int suma(int a , int b) {
		return a+b;
	}

}
