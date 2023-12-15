package ar.com.codoacodo.herencia;

public class Libro extends Articulo {

	private String isbn;
	
	public Libro(
			String titulo, 
			Float precio, 
			String img
			) {
		//libro no puede nacer, si primero no nace el 
		// articulo
		//super hace referencia de Padre
		super(titulo, precio, img);//nace Articulo
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String toString() {
		return super.toString() + 
				", Libro [isbn=" + isbn + "]";
	}

	
}
