/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author nacho
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private int nro;
    private LocalDate fechaIngreso;
    private LocalDate fechaEntrega;
    private LocalDate fechaPago;
    private int cantCajas;
    private String domicilio;
    private String qr;
    private double importe;
    private Campania campania;
    private revendedora revendedora;
    private ArrayList<CajaPedido> cajas;

    public Pedido() {
        cajas = new ArrayList<>();
    }

    public Pedido(int nro, LocalDate fechaIngreso, String domicilio, String qr, Campania campania, revendedora revendedora) {
        this.nro = nro;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
        this.qr = qr;
        this.campania = campania;
        this.revendedora = revendedora;
        this.cajas = new ArrayList<>();
        this.cantCajas = 0;
        this.importe = 0;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public double getImporte() {
        return importe;
    }

    public Campania getCampania() {
        return campania;
    }

    public void setCampania(Campania campania) {
        this.campania = campania;
    }

    public revendedora getRevendedora() {
        return revendedora;
    }

    public void setRevendedora(revendedora revendedora) {
        this.revendedora = revendedora;
    }

    public ArrayList<CajaPedido> getCajas() {
        return cajas;
    }

    public void agregarCaja(CajaPedido caja) {
        cajas.add(caja);
        cantCajas = cajas.size();
        importe = calcularImporte();
    }

    public double calcularImporte() {
        double total = 0;

        for (CajaPedido caja : cajas) {
            total = total + caja.calcularTotalCaja();
        }

        return total;
    }

    public boolean estaPago() {
        return fechaPago != null;
    }

    public boolean hayPedido(Campania campania) {
        if (this.campania == null || campania == null) {
            return false;
        }

        return this.campania.getNumero() == campania.getNumero();
    }

    public void mostrarDestinoCajas() {
        System.out.println("Pedido nro: " + nro);
        System.out.println("QR: " + qr);
        System.out.println("Destino: " + domicilio);
        System.out.println("Cantidad de cajas: " + cantCajas);
    }

    @Override
    public String toString() {
        return "Pedido nro " + nro + " - Importe: $" + importe;
    }
}
