package proyectoFinal.absClasses;

import proyectoFinal.Helper;
/**
 * Proyecto Final Programación II
 * hola
 * @author Axel David Colop Swaanncheneger - 160402008
 * @author Billy Stuart Alessandro Samayoa Higueros - 160404006
 * @author Abraham Isaac Ordoñez Martinez- 160402002
 * @author Pablo Andrés Lutín Gomez - 160402009
 * @version 1.0.0
 */
public abstract class Persona
{
   protected String nombre;
   protected String apellido;
   protected String id;
   
   public Persona(){}
   
   public Persona(String nombre, String apellido, String id){
       this.nombre = nombre;
       this.apellido = apellido;
       this.id = apellido;
   }
   public String getNombre(){
       nombre = Helper.input("Ingrese el Nombre: ");
       return nombre;
   }
   public void setNombre(){
       this.nombre = nombre;
   }
      public String getApellido(){
       apellido = Helper.input("Ingrese el apellido: ");
       return apellido;
   }
   public void setApellido(){
       this.apellido = apellido;
   }
      public String getId(){
       id = Helper.input("Ingrese el Id: ");
       return id;
   }
   public void setId(){
       this.id = id;
   }
}
