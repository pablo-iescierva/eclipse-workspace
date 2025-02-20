package bibliotecaPOO;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private ArrayList<Libro> libros;
	
	//atributo numero de libros
	private static int numLibros = 0;
	
	//CONSTRUCTOR
	
	public Biblioteca(String nombre){
		this.nombre = nombre;
		this.libros = new ArrayList<>();
	}
	
	//getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	//metodo dar de alta libro
	
	public void altaLibro(Libro libro) {
		libros.add(libro);
		numLibros++;
	}
	
	//metodo buscar libro por autor
	
	public String buscarLibroAutor(String autor) {
		String texto ="";
		
		for (Libro libroAux: libros) {
			if (libroAux.getAutor().equalsIgnoreCase(autor)){
				texto=libroAux.detalleLibro();
			}else {
				texto ="no ta";
			}
		}
		return texto;
	}
	
	//mostrar todos los libros
    public String mostrarLibros(){
        String texto = "";
        for(Libro libroAux: libros){
            texto = texto + "\n" + libroAux.detalleLibro();
        }
        return texto;
    }
	
	
	
	//metodo borrar libro por ISBN
	
	public void eliminarLibro(String isbn) {
		
		for (int i =0; i<libros.size(); i++) {
			if (libros.get(i).getIsbn()==isbn) {
				libros.remove(i);
				numLibros--;
				break;
			}
		}
	}
	//obtener numero de libros
	public static int numLibros(){
		return numLibros;
	}

}
