package bibliotecaPOO;

public class Libro {
	private String titulo;
	private String autor;
	private String editorial;
	private String anioPublicacion;
	private String isbn;

	
	//constructor
	public Libro(String titulo, String autor, String editorial) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
	}
	
	
	public Libro(String titulo, String autor, String editorial, String anioPublicacion, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.anioPublicacion = anioPublicacion;
		this.isbn = isbn;
	}



	// g and s
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String detalleLibro() {
		String texto="";
		
		texto="Título: "+this.titulo+"\n Autor: "+this.autor+"\n Editorial: "+this.editorial;
		
		return texto;
	}
	
}
