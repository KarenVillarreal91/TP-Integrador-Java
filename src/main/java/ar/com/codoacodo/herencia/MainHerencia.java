package ar.com.codoacodo.herencia;

public class MainHerencia {

	public static void main(String[] args) {
		//crear un Articulo
		Articulo a1 = new Articulo("titulo1", 150.5f, "http://url.com/bla1.jpg");
		//llamo al seter
		a1.setAutor("autor a1");
		//metodos disponibles
		//System.out.println(a1);
		
		//Hijo h = new Hijo()
		Musica m1 = new Musica("m1", 250.7f, "http://url.com/m1.jpg");
		m1.setAutor("autor m1");//esto es de Articulo
		String[] temas = new String[] {"t1","t2","t3"};
		m1.setTemas(temas);//esto de Musica
		
		//?? que tiene dispobile m1?
		//todo lo suyo + lo del padre
		//System.out.println(m1);
		
		Articulo p1 = new Pelicula("peli1",858f,"bla.jpg");
		//System.out.println(p1);
		
		Pelicula peli = (Pelicula)p1;//down casting
		peli.setFormato("BLUE RAY 3D");
		peli.setProductora("WARNER");
		p1.setAutor("autor pelicula1");
		//GC: Garbage Collector
		//System.out.println(p1);
		
		//vector par guardar las instacias
		Articulo[] resultados = new Articulo[3];
		resultados[0] = a1;
		resultados[1] = m1;
		resultados[2] = p1;
		
		for(Articulo aux : resultados) {
			System.out.println(aux);
		}
		
	}

}
