/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolcasanovas;

/**
 *
 * @author usu21
 */
public class Entrenador extends SeleccionFutbol  {
    
    
     private int idFederacion;
     
     
     public Entrenador(int id, String nombre, String apellidos, int edad, int federacion ) {
         super( id,  nombre,  apellidos,  edad);
         this.idFederacion = federacion;
         
     }

   // constructor, getter y setter
	
   public void entrenamiento() {
      System.out.println("Dirige un entrenamiento (Clase Entrenador)");
   }

   public void partidoFutbol() {
      System.out.println("Dirige un Partido (Clase Entrenador)");
   }

   public void planificarEntrenamiento() {
      System.out.println("Planificar un Entrenamiento");
   }
    
}
