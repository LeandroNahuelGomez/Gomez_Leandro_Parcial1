/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author leand
 */
public abstract class Servicio {
    protected String codServicio;
    protected double porcentajeDescuento;
    protected boolean enPromocion;
    protected LocalDate fechaReserva;
    
    //Agregamos el constructor
    public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion, LocalDate fechaReserva) throws Exception{
         if(codServicio.length() != 6){
            throw new Exception("El codigo debe tener exactamente 6 caracteres. ");
        }
        
        //Si pasa la validacion se van a asignar los siguientes atributos
        this.codServicio = codServicio;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
        this.fechaReserva = fechaReserva;
    }
  
 
    //Metodo abstracto
    public abstract double calcularPrecioFinal(LocalDate dia);
    
    
    //Getters y setters
    public String getCodServicio() {
        return codServicio;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    
    @Override
    public String toString() {
        return "Servicio{" + "codServicio=" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + '}';
    }
    

}
