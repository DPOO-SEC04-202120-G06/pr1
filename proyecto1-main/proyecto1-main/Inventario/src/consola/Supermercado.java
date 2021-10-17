package consola;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.lote;
import modelo.producto;
import procesamiento.loader;



public class Supermercado{
	/**
	 * Leer el archivo de Productos Menu y obtener su informacion en una lista de objetos ProductoMenu
	 * @param rutaArchivo
	 * @return Lista de objetos ProductoMenu
	 */
	private ArrayList<producto> ejecutarCargarProductos(String rutaArchivo)
	{
		ArrayList<producto> productos = new ArrayList<producto>();
		try
		{
			productos = loader.leerInfoArchivoProducto(rutaArchivo);
			System.out.println("OK Se cargó el archivo " + rutaArchivo + " con información de los productos.");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo " + rutaArchivo + " no se encontró.");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaArchivo);
			System.out.println(e.getMessage());
		}

		return productos;
	}
	
	private ArrayList<lote> ejecutarCargarLotes(String rutaArchivo)
	{
		ArrayList<lote> lotes = new ArrayList<lote>();
		try
		{
			lotes = loader.leerInfoArchivoLotes(rutaArchivo);
			System.out.println("OK Se cargó el archivo " + rutaArchivo + " con información de los productos.");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo " + rutaArchivo + " no se encontró.");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaArchivo);
			System.out.println(e.getMessage());
		}

		return lotes;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio de ejecución de la aplicación");
		
		Supermercado consola = new Supermercado();
		ArrayList<producto> productos = consola.ejecutarCargarProductos("./data/productos.txt");  // el parametro es la ruta del archivo productos.txt dentro del proyecto Eclipse
		for (producto prod : productos)
			System.out.println(prod);
		

		ArrayList<lote> lotes = consola.ejecutarCargarLotes("./data/lotes.txt");  // parametros: ruta del archivo lotes.txt 
			System.out.println(lotes);

	}
}