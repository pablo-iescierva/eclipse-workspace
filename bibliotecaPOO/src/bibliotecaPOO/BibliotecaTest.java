package bibliotecaPOO;

public class BibliotecaTest {
	public static void main(String [] args) {
		
		Biblioteca biblioteca = new Biblioteca("Biblioteca P.A");
		
		Libro libro1 = new Libro("Jose Ramon descubre Algezares", "Jose Luis","tus muertos","2001","999-222-333-444");
		
		Libro libro2 = new Libro("El quijote", "miguel de cervances", "SINTESIS","1998", "222-333-444-555");
		
		Libro libro3 = new Libro("El simbolo perdido", "Dan Brown", "totus","2012", "522-633-744-855");
		
		biblioteca.altaLibro(libro1);
		biblioteca.altaLibro(libro2);
		biblioteca.altaLibro(libro3);
		
		System.out.println("Libros en biblioteca:");
		System.out.println(biblioteca.mostrarLibros());
		
		//System.out.println(biblioteca.mostrarLibros("Jose Luis"));
		//numero de libros
		System.out.println("Numero de libros: ");
		System.out.println(Biblioteca.numLibros());
		
		//eliminar un libros por isbn
		System.out.println("borrando 522-633-744-855");
		biblioteca.eliminarLibro("522-633-744-855");
		
		
		//numero de libros
		System.out.println("Numero de libros: ");
		System.out.println(Biblioteca.numLibros());
		
	}
}
