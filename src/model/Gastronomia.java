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
public class Gastronomia extends Servicio {

    private String gastronomia;
    private double precio;
    private int diaSemDec;

    //Agregamos el constructor
    public Gastronomia(String gastronomia, double precio, int diaSemDec, String codServicio, double porcentajeDescuento, boolean enPromocion, LocalDate fechaReserva) throws Exception {
        super(codServicio, porcentajeDescuento, enPromocion, fechaReserva);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDec = diaSemDec;
    }
    
    
    //Metodo abstracto
    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        double precioFinal = this.precio;

        //Hacemos la validaciion si esta en promocion
        if (this.enPromocion) {
            //Mediante el DayOfWeek vamos a obtener los dias de la semana. 
            DayOfWeek diaDeLaSemana = dia.getDayOfWeek();
            
            //Si el dia de la semana es distinto de sabado y domingo se aplica descuento, en caso contrario no
            if (diaDeLaSemana.getValue() == this.diaSemDec) {
                //Si el dia es distino de SABADO y de DOMINGO vamos a aplicar el descuento
                precioFinal = precioFinal - (precioFinal * (this.porcentajeDescuento / 100));
            }
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Servicio -->" + " Gastronomia: " + gastronomia + ", codServicio=" + codServicio + ", enPromocion=" + enPromocion + ", precio=" + precio + ", fechaReserva=" + fechaReserva;
    }
    


}
