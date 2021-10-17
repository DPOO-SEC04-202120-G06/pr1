package modelo;

public class cliente {
	private String nombre;
	private String ciudad;
	private char sexo;
	private String E_civil;
	private int puntos;
	cliente(String thenombre, String theciudad, char thesexo,String theE_civil, int thepuntos)
	{
		this.nombre = thenombre;
		this.ciudad = theciudad;
		this.sexo = thesexo;
		this.E_civil = theE_civil;
		this.puntos = thepuntos;
	}
	public String getnombre()
	{
		return nombre;
		
	}
	public String getciudad()
	{
		return ciudad;
		
	}
	public char getsexo()
	{
		return sexo;
		
	}
	public String getE_civil()
	{
		return E_civil;
		
	}
	public int getpuntos()
	{
		return puntos;
		
	}
	public void setpuntos(int npuntos)
	{
		this.puntos= npuntos;
	}
	
}
