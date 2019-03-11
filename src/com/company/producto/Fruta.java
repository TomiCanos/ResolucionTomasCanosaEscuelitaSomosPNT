package com.company.producto;

public class Fruta extends Producto {
    private String unidadDeVenta;


    public Fruta(String nombre, Integer precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// Precio: $" + super.getPrecio().toString() +
                " /// Unidad de venta: " + unidadDeVenta;
    }
}