/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_abstraciones_interfaces_polimorfismo;

/**
 * Representa una nave MannedSpaceship con algunos  comportamientos
 * @author julian mazo
 */
public class UnMannedSpaceship  extends Spaceship{

    /**
     * Crea una instancia de la clase UnMannedSpaceship.
     * @param Name nombre
     * @param Weight peso
     * @param Fuel combusible
     * @param CountryorOrganization pais o organizacion
     */
    public UnMannedSpaceship(String Name, String Weight, String Fuel, String CountryorOrganization) {
        super(Name, Weight, Fuel, CountryorOrganization);
    }
  
    /**
    * Sobre escribe y muestra las naves mas importantes de este tipo
    * @return un mensaje que contiene algunas naves importantes de este tipo 
    */
    @Override
    public String HisorialOfImportantShips() {
        return "Algunas de las mas importantes Naves no Tripuladas son: Explorer,soho,pionero de Marte,Venara IV\n";  
        
    }
     /** 
     * Sobre escribe el metodo toString para que en lugar de obtener nombre completo de la clase, arroba  y hashcode(), 
     * @return se obtiene un apartado de informacion de la nave.
     */
    @Override
    public String SpacecraftReason() {
      return "mision no especificada";
       
        
    }
    

   
    
}
