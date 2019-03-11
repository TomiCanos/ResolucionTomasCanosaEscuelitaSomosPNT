package com.company.producto;

public class Gaseosa extends Producto {
    private Double litros;


    public Gaseosa(String nombre, Integer precio, Double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// Litros: " + litros +
                " /// Precio: $" + super.getPrecio().toString();
    }
}
