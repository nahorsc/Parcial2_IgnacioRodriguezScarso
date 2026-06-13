package com.ulp;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class revendedora {

    private int nroCuenta;
    private double saldo;
    private ArrayList<Pedido> pedidos;

    public revendedora() {
        pedidos = new ArrayList<>();
    }

    public revendedora(int nroCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        pedidos = new ArrayList<>();
    }

    public revendedora(int nroCuenta, double saldo, ArrayList<Pedido> pedidos) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.pedidos = pedidos;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean tieneSaldo(double monto) {
        return saldo >= monto;
    }

    public boolean cuentaDiferente(revendedora otraRevendedora) {
        if (otraRevendedora == null) {
            return false;
        }

        return this.nroCuenta != otraRevendedora.getNroCuenta();
    }

    public double convertirMoneda(String cotizacion) {
        double valorCotizacion = Double.parseDouble(cotizacion);
        return saldo / valorCotizacion;
    }

    public void pagoDemorado(int tiempo) throws InterruptedException {
        Thread.sleep(tiempo);
        System.out.println("El pago se produjo en el tiempo y forma");
    }

    public double retirarDinero(double monto) throws Exception {
        if (monto > saldo) {
            throw new Exception("Su cuenta no tiene saldo");
        }

        saldo = saldo - monto;
        return saldo;
    }

    public void depositarDinero(double monto) {
        saldo = saldo + monto;
    }

    public void transferirDinero(revendedora rev, double monto) throws Exception {
        if (rev == null) {
            throw new Exception("La cuenta destino no puede ser nul");
        }

        if (!cuentaDiferente(rev)) {
            throw new Exception("No puede transferir dinero a la misma cuenta");
        }

        this.retirarDinero(monto);
        rev.depositarDinero(monto);

        System.out.println("Transferencia exitosa");
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public boolean hayPedido(Campania campania) {
        for (Pedido pedido : pedidos) {
            if (pedido.hayPedido(campania)) {
                return true;
            }
        }

        return false;
    }

    public void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
