/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author nacho
 */import java.util.ArrayList;

public class CajaPedido {

    private int numeroCaja;
    private ArrayList<DetalleCaja> detalles;

    public CajaPedido() {
        detalles = new ArrayList<>();
    }

    public CajaPedido(int numeroCaja) {
        this.numeroCaja = numeroCaja;
        detalles = new ArrayList<>();
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public ArrayList<DetalleCaja> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleCaja> detalles) {
        this.detalles = detalles;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        DetalleCaja detalle = new DetalleCaja(producto, cantidad);
        detalles.add(detalle);
    }

    public double calcularTotalCaja() {
        double total = 0;

        for (DetalleCaja detalle : detalles) {
            total = total + detalle.getSubtotal();
        }

        return total;
    }

    public void listarDetalles() {
        System.out.println("Caja numero: " + numeroCaja);

        for (DetalleCaja detalle : detalles) {
            System.out.println(detalle);
        }

        System.out.println("Total caja: $" + calcularTotalCaja());
    }

    @Override
    public String toString() {
        return "Caja " + numeroCaja + " Total: $" + calcularTotalCaja();
    }
}

