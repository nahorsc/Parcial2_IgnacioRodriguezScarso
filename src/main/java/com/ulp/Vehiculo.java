/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Vehiculo {

    private String patente;
    private String modelo;
    private ArrayList<Pedido> pedidos;

    public Vehiculo() {
        pedidos = new ArrayList<>();
    }

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        pedidos = new ArrayList<>();
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void cargarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void descargarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public void seguirVehiculo() {
        System.out.println("Patente: " + patente);
        System.out.println("Modelo: " + modelo);
    }
}
