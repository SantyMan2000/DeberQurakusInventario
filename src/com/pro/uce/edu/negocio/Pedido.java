package com.pro.uce.edu.negocio;

public class Pedido {

    private String producto;
    private int cantidad;
    private double total;
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Pedido(String producto, int cantidad, double total) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



}
