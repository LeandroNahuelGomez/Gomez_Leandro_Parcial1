/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author leand
 */
public class Hospedaje extends Servicio {
    private String hospedaje;
    private double precioPorNoche;
    
    //Agregamos el constructor
    public Hospedaje(String hospedaje, double precioPorNoche, String codServicio, double porcentajeDescuento, boolean enPromocion, LocalDate fechaReserva) throws Exception {
        super(codServicio, porcentajeDescuento, enPromocion, fechaReserva);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
    }
    
    
    //Metodo abstracto
    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        double precioFinal = this.precioPorNoche;
        
        //Hacemos la validaciion si esta en promocion
        if(this.enPromocion){
            //Mediante el DayOfWeek vamos a obtener los dias de la semana. 
            //El DayOfWeek es un enum
            DayOfWeek diaDeLaSemana = dia.getDayOfWeek();
            
            //Si el dia de la semana es distinto de sabado y domingo se aplica descuento, en caso contrario no
            if(diaDeLaSemana != DayOfWeek.SATURDAY && diaDeLaSemana != DayOfWeek.SUNDAY){
                //Si el dia es distino de SABADO y de DOMINGO vamos a aplicar el descuento
                precioFinal = precioFinal - (precioFinal * (this.porcentajeDescuento / 100));
            }
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Servicio -->" + " Hospedaje: " + hospedaje + ", codServicio=" + codServicio + ", enPromocion=" + enPromocion + ", precio=" + precioPorNoche + ", fechaReserva=" + fechaReserva;
    }
    
    
    
    
}
