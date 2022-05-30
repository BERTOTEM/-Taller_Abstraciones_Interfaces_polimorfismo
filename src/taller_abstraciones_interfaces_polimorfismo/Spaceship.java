/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_abstraciones_interfaces_polimorfismo;

/**
 *Representa una navce espacial con algunos atributos y comportamientos 
 * @author julian mazo
 */
public abstract class Spaceship implements Importantships {

 
    /**
     * Representa el nombre de la nave espacial
     */
    public String Name;
    /**
     * Representa el Peso de la nave espacial
     */
    public String Weight;/**
     /**
     *Representa el  combustible  de la nave espacial 
     */
    public String Fuel;
    /**
     * Rpresenta el pais o organizacion de origen de la nave espacial
     */
    public String CountryorOrganization;
    
    /**
     * Crea una instancia de la clase Spaceship.
     * @param Name nombre de la nave    
     * @param Weight peso de la nave
     * @param Fuel combstible de la nave
     * @param CountryorOrganization pais o organizacion de la nava
     */
    public Spaceship(String Name,String Weight, String Fuel, String CountryorOrganization) {
        this.Weight = Weight;
        this.Name=Name;
        this.Fuel = Fuel;
        this.CountryorOrganization = CountryorOrganization;
    }
    
    /**
     * obtiene el nombre de la nave
     * @return el nombre de la nave
     */
    public String getName() {
        return Name;
    }
    /**
     * coloca el nombre de la nave
     * @param Name nombre de la nave
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    /**
     * obtiene el peso de la nave
     * @return el peso de la nave
     */
    public String getWeight() {
        return Weight;
    }
    /**
     * coloca el peso de la nave
     * @param Weight peso de la nave
     */
    public void setWeight(String Weight) {
        this.Weight = Weight;
    }
    /**
     * obtiene el combstible de la nave
     * @return 
     */
    public String getFuel() {
        return Fuel;
    }
    /**
     * coloca el combustible de la nave
     * @param Fuel combustible de la nave
     */
    public void setFuel(String Fuel) {
        this.Fuel = Fuel;
    }
    /**
     * obtiene el pais o organizacion de la nave
     * @return 
     */
    public String getCountryorOrganization() {
        return CountryorOrganization;
    }
    /**
     * coloca el pais de la nave
     * @param CountryorOrganization pais o organizaciond e la nave
     */
    public void setCountryorOrganization(String CountryorOrganization) {
        this.CountryorOrganization = CountryorOrganization;
    }
    /**
     * implementa el metodo abtracto de la interfaz
     * @return debe de retornan las naves mas importantes del tipo selecionado
     */
    @Override
    public abstract String HisorialOfImportantShips();
    
    
    
    /**
     * crea un metodo abstracto 
     * @return la mision o razon de la nave
     */
    public abstract String SpacecraftReason();
    
        
 
   
    
}
