/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import java.time.LocalDate;

/**
 *
 * @author nacho
 */

public class Campania {

    private int numero;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;
    private boolean activa;

    public Campania() {
    }

    public Campania(int numero, LocalDate fechaInicio, LocalDate fechaFin, double monto, boolean activa) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.activa = activa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public void activarCampania() {
        activa = true;
    }

    public void desactivarCampania() {
        activa = false;
    }

    @Override
    public String toString() {
        return "Campania " + numero;
    }
}
