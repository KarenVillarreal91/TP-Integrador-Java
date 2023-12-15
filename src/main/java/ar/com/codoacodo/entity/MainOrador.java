package ar.com.codoacodo.entity;

import ar.com.codoacodo.repository.MySqlOradorRepository;
import ar.com.codoacodo.repository.OradorRepository;

public class MainOrador {

	public static void main(String[] args) {

		//crear un objeto de la clase orador, que luego se enviara a la db
		Orador nuevoOrador = new Orador("carlos", "lopez", "email@email.com", "JAVA"); 
		
		OradorRepository repository = new MySqlOradorRepository();

		repository.save(nuevoOrador);
		 
		System.out.println(repository.findAll());

	}

}
