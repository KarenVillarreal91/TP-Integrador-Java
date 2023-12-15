package ar.com.codoacodo.interfaces;

public class FSLogger implements ILogger {

	//implementar el metodo log
	//polimorfismo: sobreescritura 
	public void log() {
		System.out.println("Grabando en c:/bla");
	}
}
