/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leand
 */
public class Sistema {
    List<Servicio> lstServicio;
    
    //Constructor
    public Sistema() {
        //Inicializamos una lista vacia
        this.lstServicio = new ArrayList<>();
    }
    
    //METODOS
    
    //Metodo para traer servicio
    public Servicio traerServicio(String codServicio) throws Exception{
        //Validacion de que el codigo ingresado no sea null
        if(codServicio == null || codServicio.isEmpty()){
            throw new Exception("El codigo ingresado no puede estar vacio");
        }
        
        //Luego validamos si la lista esta vacia
        if(this.lstServicio == null){
            throw new Exception("La lista de servicios no tiene ningun servicio dentro");
        }
        
        //Pasadas las dos validaciones anteriores recorrer la lista y verificar si existe ese servicio
        for(Servicio servicio : this.lstServicio){
            if(servicio.getCodServicio().equals(codServicio)){
                //En caso de que exista retornar el servicio
                return servicio;
            }
        }
        //En caso de que no, retornar una excepcion
        throw new Exception("No se encontro ese servicio");
    }
    
    //Se puede mejorar agregando validacion de lista
    public List<Servicio> traerServicio(boolean enPromocion){    
        List<Servicio> listaServicios = new ArrayList<>();
        for(Servicio servicio : this.lstServicio){
            if(servicio.isEnPromocion() == enPromocion){
                listaServicios.add(servicio);
            }
        }
        return listaServicios;
    }

    
    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia) {
    List<Servicio> listaServicios = new ArrayList<>();
    
    // Recorrer la lista de servicios
    for (Servicio servicio : this.lstServicio) {
        // Verificar si el servicio está en promoción
        if (servicio.isEnPromocion() == enPromocion) {
            // Comparar la fechaReserva del servicio con la fecha pasada como parámetro
            if (servicio.getFechaReserva().equals(dia)) {
                listaServicios.add(servicio);
            }
        }
    }
    
    return listaServicios;
}

   
    public boolean agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String gastronomia, double precio, int diaSemDesc, LocalDate fechaReserva) throws Exception{
        //Recorremos la lista para verificar si el servicio ya existe
        for(Servicio servicio : lstServicio){
            if(servicio.getCodServicio().equals(codServicio)){
                //En caso de que el servicio exista lanzamos una excepcion para que interrumpa el codigo
                throw new Exception("El servicio con el código " + codServicio + " ya existe.");
            }
        }
        //Si pasa correctamente la validacion continua con el siguiente codigo
        //Creamos el objeto gastronomia
        Gastronomia servicioGastronomia = new Gastronomia(codServicio, precio, diaSemDesc, codServicio, porcentajeDescuento, enPromocion, fechaReserva);
        //Lo agregamos a la lista
        this.lstServicio.add(servicioGastronomia);
        return true;
    }

    
    public boolean agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje,double precioPorNoche, LocalDate fechaReserva) throws Exception{
                //Recorremos la lista para verificar si el servicio ya existe
        for(Servicio servicio : lstServicio){
            if(servicio.getCodServicio().equals(codServicio)){
                //En caso de que el servicio exista lanzamos una excepcion para que interrumpa el codigo
                throw new Exception("El servicio con el código " + codServicio + " ya existe.");
            }
        }
        //Si pasa correctamente la validacion continua con el siguiente codigo
        //Creamos el objeto gastronomia
        Hospedaje servicioHospedaje = new Hospedaje(hospedaje, precioPorNoche, codServicio, porcentajeDescuento, enPromocion, fechaReserva);
        //Lo agregamos a la lista
        this.lstServicio.add(servicioHospedaje);
        return true;
    }

    public List<Servicio> getLstServicio() {
        return lstServicio;
    }

    public void setLstServicio(List<Servicio> lstServicio) {
        this.lstServicio = lstServicio;
    }

    @Override
    public String toString() {
        return "Sistema{" + "lstServicio=" + lstServicio + '}';
    }
    
    
}
