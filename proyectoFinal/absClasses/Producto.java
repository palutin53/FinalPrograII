package proyectoFinal.absClasses;


/**
 * Proyecto Final Programación II
 * 
 * @author Axel David Colop Swaanncheneger - 160402008
 * @author Billy Stuart Alessandro Samayoa Higueros - 160404006
 * @author Abraham Isaac Ordoñez Martinez- 160402002
 * @author Pablo Andrés Lutín Gomez - 160402009
 * @version 1.0.0
 */

import proyectoFinal.Helper;

public abstract class Producto
{
    private static StringBuilder  sb = new StringBuilder();
    
    protected String categoria;
    protected double precio;
    protected String nombre;
    protected String marca;
    protected int cantidad;
    protected int codigo;
    
    public Producto(){}
    
    public Producto(String categoria, double precio, String nombre, String marca, int cantidad)
    {
        this.categoria = categoria;
        this.precio = precio;
        this.nombre = nombre;
        this.marca = marca;
    }
    
    public String getCategoria()
    {
        return categoria;
    }
    
    public void setCategoria(String categoria)
    {
        categoria = Helper.input("Ingrese Categoría: ");
        this.categoria = categoria;
    }
    
    public double getPrecio()
    {
        return precio;
    }
    
    public void setPrecio(double precio)
    {
        precio = Helper.inputDouble("Ingrese Precio: ");
        this.precio = precio;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        nombre = Helper.input("Ingrese Nombre: ");
        this.nombre = nombre;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public void setMarca(String marca)
    {
        marca = Helper.input("Ingrese Marca: ");
        this.marca = marca;
    }
    
    public int getCantidad()
    {
        return cantidad;
    }
    
    public void setCantidad(int cantidad)
    {
        cantidad = Helper.inputInt("Ingrese Cantidad: ");
        this.cantidad = cantidad;
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    
    public void setCodigo(int cantidad)
    {
        cantidad = Helper.inputInt("Ingrese Codigo: ");
        this.cantidad = cantidad;
    }
}
