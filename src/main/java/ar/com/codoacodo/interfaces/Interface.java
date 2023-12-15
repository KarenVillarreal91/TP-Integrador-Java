package ar.com.codoacodo.interfaces;

public interface Interface {
	final String hola = "";
	
	public void metodo1();//definicion del metodo no tiene cuerpo
	
	public default void metodo2() {
		System.out.println("Metodo2");
	}
}
