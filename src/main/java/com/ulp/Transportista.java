/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author nacho
 */
public class Transportista {

    private int nroTransportista;
    private String nombreCompleto;
    private String whatsapp;
    private Vehiculo vehiculo;

    public Transportista() {
    }

    public Transportista(int nroTransportista, String nombreCompleto, String whatsapp, Vehiculo vehiculo) {
        this.nroTransportista = nroTransportista;
        this.nombreCompleto = nombreCompleto;
        this.whatsapp = whatsapp;
        this.vehiculo = vehiculo;
    }

    public int getNroTransportista() {
        return nroTransportista;
    }

    public void setNroTransportista(int nroTransportista) {
        this.nroTransportista = nroTransportista;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void escanearPedido(Pedido pedido) {
        System.out.println("Transportista: " + nombreCompleto);
        System.out.println("Nro transportista: " + nroTransportista);
        
        if (pedido != null) {
            pedido.mostrarDestinoCajas();
        } else {
            System.out.println("No se encontro el pedido");
        }
    }
}
