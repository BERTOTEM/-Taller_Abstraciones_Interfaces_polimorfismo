/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_abstraciones_interfaces_polimorfismo;

/**
 * Representa una nave MannedSpaceship(Satellite) con algunos atributos y comportamientos
 * @author julian mazo
 */
public class Satellite extends UnMannedSpaceship {
    /**
     * Representa las funciones del satelite
     */
    String SatelliteFunctions;
    
    /**
     * Crea una instancia de la clase UnMannedSpaceship(Satellite).
     * @param SatelliteFunctions funciones del satelite
     * @param Name nombre
     * @param Weight peso
     * @param Fuel combustible
     * @param CountryorOrganization pais o organizacion
     */
    public Satellite(String SatelliteFunctions, String Name, String Weight, String Fuel, String CountryorOrganization) {
        super(Name, Weight, Fuel, CountryorOrganization);
        this.SatelliteFunctions = SatelliteFunctions;
    }
    /**
     * obtiene las funciones del satelite
     * @return las funciones del satelite
     */
    public String getSatelliteFunctions() {
        return SatelliteFunctions;
    }
    
    /**
     * coloca las funciones del satelite
     * @param SatelliteFunctions funciones del satelite
     */
    public void setSatelliteFunctions(String SatelliteFunctions) {
        this.SatelliteFunctions = SatelliteFunctions;
    }

   

    
    
    
     /**
     * Sobre escribe y muestra la razon o mision de este tipo de naves
     * @return la razon o mision que tiene la nave
     */
    @Override
    public String SpacecraftReason() {
       return "Cumplir con las funciones "+SatelliteFunctions+"\n";
       
        
    }
    /** 
     * Sobre escribe el metodo toString para que en lugar de obtener nombre completo de la clase, arroba  y hashcode(), 
     * @return se obtiene un apartado de informacion de la nave.
     */
    @Override
    public String toString()
    {
    return  "Satellite "+Name+" de "+Weight+" con fuente de energia tipo " +Fuel+" del pais o organizacion llamada "+CountryorOrganization+"\nCon funciones"+SatelliteFunctions+" Tripulantes.\n\n";
    }
    
}
