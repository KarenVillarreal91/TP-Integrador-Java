package ar.com.codoacodo.herencia;

/**
 * 
 */
public class Articulo {
	
	protected String titulo;
	protected Float precio;
	protected String autor;
	protected String img;
	
	public Articulo(
			String titulo, 
			Float precio, 
			String img
		) {
			this.titulo = titulo;
			this.precio = precio;
			this.img = img;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Articulo [titulo=" + titulo + ", precio=" + precio + ", autor=" + autor + ", img=" + img + "]";
	}
	
}
