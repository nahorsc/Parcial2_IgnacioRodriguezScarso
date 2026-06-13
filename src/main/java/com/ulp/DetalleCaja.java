/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author nacho
 */

public class DetalleCaja {

    private Producto producto;
    private int cantidad;
    private double subtotal;

    public DetalleCaja() {
    }

    public DetalleCaja(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        this.subtotal = calcularSubtotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double calcularSubtotal() {
        if (producto == null) {
            return 0;
        }

        return producto.getPrecioVentaPublico() * cantidad;
    }

    @Override
    public String toString() {
        return producto.getNombre() + "-" + cantidad + " unidades $" + subtotal;
    }
}