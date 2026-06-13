/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author nacho
 */
public class Producto {

    private int codigo;
    private String nombre;
    private String uso;
    private double tamanioCm3;
    private double precioVentaPublico;
    private double precioCosto;

    public Producto() {
    }

    public Producto(int codigo, String nombre, String uso, double tamanioCm3, double precioVentaPublico, double precioCosto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.uso = uso;
        this.tamanioCm3 = tamanioCm3;
        this.precioVentaPublico = precioVentaPublico;
        this.precioCosto = precioCosto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public double getTamanioCm3() {
        return tamanioCm3;
    }

    public void setTamanioCm3(double tamanioCm3) {
        this.tamanioCm3 = tamanioCm3;
    }

    public double getPrecioVentaPublico() {
        return precioVentaPublico;
    }

    public void setPrecioVentaPublico(double precioVentaPublico) {
        this.precioVentaPublico = precioVentaPublico;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precioVentaPublico;
    }
}