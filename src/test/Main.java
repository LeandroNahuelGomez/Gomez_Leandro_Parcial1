/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.time.LocalDate;
import model.Gastronomia;
import model.Hospedaje;
import model.Sistema;

/**
 *
 * @author leand
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1-1");
        try {
            Gastronomia servicioGastronomia = new Gastronomia("Hamburguesa Criolla", 180, 4, "4892", 15, true, LocalDate.of(2020, 10, 5));
            System.out.println(servicioGastronomia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n1-2");
        try {
            Gastronomia servicioGastronomia = new Gastronomia("Hamburguesa Criolla", 180, 4, "489235", 15, true, LocalDate.of(2024, 8, 12));
            System.out.println(servicioGastronomia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n1-3");
        try {
            Hospedaje servicioHospedaje = new Hospedaje("Cabaña 3 personas", 1500, "2872", 10, true, LocalDate.of(2019, 5, 15));
            System.out.println(servicioHospedaje);   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n1-4");
        try {
            Hospedaje servicioHospedaje = new Hospedaje("Cabaña 3 personas", 1500, "287282", 10, true, LocalDate.of(2021, 2, 27));
            System.out.println(servicioHospedaje);   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n2-1");
        try {
            Gastronomia servicioGastronomia = new Gastronomia("Hamburguesa Criolla", 180, 4, "489235", 15, true, LocalDate.of(2020, 10, 5));
            double precio = servicioGastronomia.calcularPrecioFinal(LocalDate.of(2020,10,28));
            System.out.println("El precio por el servicio de gastronia es: " + "$" + precio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n2-2");
        try {
             Hospedaje servicioHospedaje = new Hospedaje("Cabaña 3 personas", 1500, "287282", 10, true, LocalDate.of(2020, 10, 5));
             double precio = servicioHospedaje.calcularPrecioFinal(LocalDate.of(2020, 10, 27));
             System.out.println("El precio por el servicio de hospedaje es: " + "$" + precio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n3-1");
        try {
            Sistema sistemaGestion = new Sistema();
            sistemaGestion.agregarGastronomia("858927", 15, true, "Milanesa con pure", 350, 4, LocalDate.of(2020, 10, 5));
            sistemaGestion.agregarGastronomia("182835", 20, false, "Gaseosa", 120, 3, LocalDate.of(2020, 10, 5));
            sistemaGestion.agregarHospedaje("489259", 10, true, "Habitacion triple", 2200, LocalDate.of(2020, 12, 1));
            sistemaGestion.agregarHospedaje("758972", 15, false, "Habitacion simple", 1000, LocalDate.of(2020, 12, 1));
            System.out.println(sistemaGestion.getLstServicio());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n4-1");
        try {
             Sistema sistemaGestion = new Sistema();
            sistemaGestion.agregarGastronomia("858927", 15, true, "Milanesa con pure", 350, 4, LocalDate.of(2020, 10, 5));
            sistemaGestion.agregarGastronomia("182835", 20, false, "Gaseosa", 120, 3, LocalDate.of(2020, 10, 5));
            sistemaGestion.agregarHospedaje("489259", 10, true, "Habitacion triple", 2200, LocalDate.of(2020, 12, 1));
            sistemaGestion.agregarHospedaje("758972", 15, false, "Habitacion simple", 1000, LocalDate.of(2020, 12, 1));
            System.out.println(sistemaGestion.traerServicio(true));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n4-2");
        try {
             Sistema sistemaGestion = new Sistema();
            sistemaGestion.agregarGastronomia("858927", 15, true, "Milanesa con pure", 350, 4, LocalDate.of(2020, 10, 28));
            sistemaGestion.agregarGastronomia("182835", 20, false, "Gaseosa", 120, 3, LocalDate.of(2020, 10, 5));
            sistemaGestion.agregarHospedaje("489259", 10, true, "Habitacion triple", 2200, LocalDate.of(2020, 10, 28));
            sistemaGestion.agregarHospedaje("758972", 15, false, "Habitacion simple", 1000, LocalDate.of(2020, 12, 1));
            System.out.println(sistemaGestion.traerServicio(true, LocalDate.of(2020, 10, 28)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
