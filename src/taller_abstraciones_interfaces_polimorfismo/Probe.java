/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_abstraciones_interfaces_polimorfismo;

/**
 * Representa una nave MannedSpaceship(Probe) con algunos atributos y comportamientos
 * @author julian mazo
 */
public class Probe extends UnMannedSpaceship {
    /**
     * Representa el destino de la sonda
     */
    String  DutysStation;
    /**
     * obtiene el destino de la sonda
     * @return el destino de la sonda
     */
    public String getDutysStation() {
        return DutysStation;
    }
    /**
     * coloca el destino de la sonda
     * @param DutysStation destino de la sonda
     */
    public void setDutysStation(String DutysStation) {
        this.DutysStation = DutysStation;
    }
    
    /**
     * Crea una instancia de la clase UnMannedSpaceship(Probe).
     * @param DutysStation destino 
     * @param Name nombre   
     * @param Weight peso
     * @param Fuel combustible
     * @param CountryorOrganization pais o organizacion
     */
    public Probe(String DutysStation, String Name, String Weight, String Fuel, String CountryorOrganization) {
        super(Name, Weight, Fuel, CountryorOrganization);
        this.DutysStation = DutysStation;
    }
     /**
     * Sobre escribe y muestra la razon o mision de este tipo de naves
     * @return la razon o mision que tiene la nave
     */
    @Override
      public String SpacecraftReason() {
       return "llegar y explorar el cuerpo astronomico: "+DutysStation+"\n";
       
        
    }
     /** 
     * Sobre escribe el metodo toString para que en lugar de obtener nombre completo de la clase, arroba  y hashcode(), 
     * @return se obtiene un apartado de informacion de la nave.
     */
    @Override
    public String toString()
    {
    return  "Probe "+Name+" de "+Weight+" con fuente de energia tipo " +Fuel+" del pais o organizacion llamada "+CountryorOrganization+"\nComo destino de llegada "+DutysStation+"\n\n";
    }
    
}
