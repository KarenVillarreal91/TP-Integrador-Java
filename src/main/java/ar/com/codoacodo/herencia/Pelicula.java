package ar.com.codoacodo.herencia;

public class Pelicula extends Articulo {

	private String productora;
	private String formato;
	
	public Pelicula(String titulo, Float precio, String img) {
		super(titulo, precio, img);
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return super.toString() + ", Pelicula [productora=" + productora + ", formato=" + formato + "]";
	}
	
}
