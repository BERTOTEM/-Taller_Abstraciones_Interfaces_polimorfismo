/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_abstraciones_interfaces_polimorfismo;

/**
 * Representa una nave MannedSpaceship con algunos atributos y comportamientos
 * @author julian mazo
 */
public class MannedSpaceship extends Spaceship {
    /**
     * Representa el numero de pajeros de la neve
     */
    String NumberOfPassengers;
    
    /**
     * Crea una instancia de la clase MannedSpaceship.
     * @param NumberOfPassengers numeor de tripulanes de MannedSpaceship
     * @param Name nombre de la nave MannedSpaceship
     * @param Weight peso de la nave MannedSpaceship
     * @param Fuel combustible de la nave MannedSpaceship
     * @param CountryorOrganization pais o organizacion de la nave MannedSpaceship
     */
    public MannedSpaceship(String NumberOfPassengers, String Name, String Weight, String Fuel, String CountryorOrganization) {
        super(Name, Weight, Fuel, CountryorOrganization);
        this.NumberOfPassengers = NumberOfPassengers;
    }
    /**
     * obtiene el numero de tripulantes de la nave
     * @return el numero de tripulantes de la nave
     */
    public String getNumberOfPassengers() {
        return NumberOfPassengers;
    }
    /**
     * coloca el numero de pasajeros de la nave
     * @param NumberOfPassengers numero de pasajeros de la nave
     */
    public void setNumberOfPassengers(String NumberOfPassengers) {
        this.NumberOfPassengers = NumberOfPassengers;
    }

    

   
    
    /**
    * Sobre escribe y muestra las naves mas importantes de este tipo
    * @return un mensaje que contiene algunas naves importantes de este tipo 
    */
    @Override
    public String HisorialOfImportantShips() {
    return "Algunas de las mas importantes Naves Tripuladas son: Dragon V2,Modulo Lunar,Vostok,EEI\n";    }
    
    //overload
    /**
     * 
     * @param X opcion de la mision
     * @return SpacecraftReason
     */
    public  String  SpacecraftReason(int X) {
        switch (X) {
            case 0 -> System.out.println("misiones lunares");
            case 1 -> System.out.println("Experimentación y estudio del comportamiento humano en condiciones ingrávidas y en el exterior de la cápsula ");
            case 2 -> System.out.println("mantenimiento de satélites, probar acoplamientos con otras naves y equipos electrónicos");
            default -> System.out.println("Mision secreta");}
        return null;
        
    }
    /**
     * Sobre escribe y muestra la razon o mision de este tipo de naves
     * @return la razon o mision que tiene la nave
     */
    @Override
    public String SpacecraftReason() {
       return "tipos de misisones que puede realizar esta nave lunares,Experimentacion y estudio del comportamiento\nHumano en condiciones ingravidas y en el exterior de la capsula mantenimiento de satelites, probar acoplamientos con\nOtras naves y equipos electronicos.\n";

        }
    /** 
     * Sobre escribe el metodo toString para que en lugar de obtener nombre completo de la clase, arroba  y hashcode(), 
     * @return se obtiene un apartado de informacion de la nave.
     */
    @Override
    public String toString()
    {
    return  "MannedSpaceship "+Name+" de "+Weight+" con fuente de energia tipo " +Fuel+" \ndel pais o organizacion llamada "+CountryorOrganization+" con un total de "+NumberOfPassengers+" Tripulantes\n\n\n";
    }
    
}
