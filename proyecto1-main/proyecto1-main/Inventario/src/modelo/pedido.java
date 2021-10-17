package modelo;

import java.util.ArrayList;

public class pedido {
	private ArrayList<producto> Productos;
	
	public void agregarProducto(producto Producto)
	{
		Productos.add(Producto);
	}
	public void eliminarProducto(producto Producto)
	{
		Productos.remove(Producto);
	}
	public double costoTotalPedido()
	{
		double total =0 ;
		for(int i=0; i <= ((Productos. )-1); i++1)
		{
			total= total + Productos[i].getPrecio();
		}
		return total;
	}
}
