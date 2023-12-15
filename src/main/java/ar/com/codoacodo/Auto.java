package ar.com.codoacodo;

//esto viene en la jvm
import java.time.LocalDate;

public class Auto {

	/*atributos*/
	String marca;
	String modelo;
	String color;
	Integer anio;
	Float velocidad;
	Float velocidadMaxima;
	Boolean encendido;
	String dominio;
	LocalDate fechaCreacion;
	
	/*constructor/es*/
	Auto(
		String marca, 
		String modelo,
		String color,
		Integer anio,
		String dominio,
		Float velocidadMaxima
		) {
		velocidad = 0f;
		encendido = Boolean.FALSE;
		fechaCreacion = LocalDate.now();
		//this es un puntero que "apunta" a los atributos o metodos de un clase/objeto
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.dominio= dominio;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	/*metodos*/
	void encender() {
		if(!this.encendido) {
			this.encendido = Boolean.TRUE;
		}else {
			System.out.println("Ya esta encendido");
		}
	}
	void apagar() {
		if(this.encendido) {
			this.encendido = Boolean.FALSE;
			velocidad = 0f;
		}else {
			System.out.println("Ya estaba apagado");
		}
	}
	
	//asumimos que acelera de a 1
	void acelerar() {
		if(encendido) {
			if(velocidad < velocidadMaxima) {
				velocidad++;
			}else {
				System.out.println("Velocidad maxima:" + velocidad + " alcanzada");
			}
		}else {
			System.out.println("Primero debe encender el auto para acelerar");
		}
	}
	
	void frenar() {
		if(encendido) {
			if(velocidad > 0) {
				velocidad --;
			}else {
				System.out.println("La velocidad llego a 0");
			}
		}else {
			System.out.println("frenando con el auto apagado");
		}
	}
}
