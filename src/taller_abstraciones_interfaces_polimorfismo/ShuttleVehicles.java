/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_abstraciones_interfaces_polimorfismo;

/**
 * Representa una nave ShuttleVehicles con algunos atributos y comportamientos
 * @author julian mazo
 */
public class ShuttleVehicles extends Spaceship {
    /**
     * Representa la carga util de la lanzadora
     */
    String  Payload;  
    /**
     * Representa el peso de la carga util
     */
    String WeightCarried;
    
    /**
     * Crea una instancia de la clase ShuttleVehicles.
     * @param Payload carga util de la ShuttleVehicles
     * @param WeightCarried peso de la carga util
     * @param Name nombre de la ShuttleVehicles
     * @param Weight peso de la ShuttleVehicles
     * @param Fuel combustible de la ShuttleVehicles
     * @param CountryorOrganization pais o organizacion de la ShuttleVehicles
     */
    public ShuttleVehicles(String Payload, String  WeightCarried, String Name, String Weight, String Fuel, String CountryorOrganization) {
        super(Name, Weight, Fuel, CountryorOrganization);
        this.Payload = Payload;
        this.WeightCarried = WeightCarried;
    }

   
    /**
     * obtiene que es la carga util
     * @return la carga util
     */
    public String getPayload() {
        return Payload;
    }
    /**
     * coloca que es la carga util
     * @param Payload carga util
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }
    /**
     * obtiene el peso de la carga util
     * @return peso de la carga
     */
    public String getWeightCarried() {
        return WeightCarried;
    }
    /**
     * coloca el peso de la carga util
     * @param WeightCarried pesod e la carga util
     */
    public void setWeightCarried(String WeightCarried) {
        this.WeightCarried = WeightCarried;
    }

   
   
   /**
    * Sobre escribe y muestra las naves mas importantes de este tipo
    * @return un mensaje que contiene algunas naves imprates de este tipo 
    */
    @Override
    public String HisorialOfImportantShips() {
        return "Algunas de las mas importantes lanzadoras son: Saturno V,ZenitII,FalconIX,Larga marcha 3B\n";
        
    }
    /**
     * Sobre escribe y muestra la razon o mision de este tipo de naves
     * @return la razon o mision que tiene la nave
     */
    @Override
    public String SpacecraftReason() {
       return "Poner en orbia la carga util "+Payload+" con un peso de "+WeightCarried+" Kg\n";
        
        
    }
    /** 
     * Sobre escribe el metodo toString para que en lugar de obtener nombre completo de la clase, arroba  y hashcode(), 
     * se obtiene un aprado de informacion de la nave.
     * @return 
     */
    @Override
    public String toString()
    {
    return  "ShuttleVehicles "+Name+" de "+Weight+" con fuente de energia tipo " +Fuel+" del pais o organizacion llamada "+CountryorOrganization+" \nlleva como carga util el/la "+Payload+" que tiene un peso de "+WeightCarried+"Kg\n\n\n";
    }
    
    
}
