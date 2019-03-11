package com.company.producto;

public class Shampoo extends Producto{
    private Integer contenido;


    public Shampoo(String nombre, Integer precio, Integer contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// Contenido: " + contenido.toString() +
                "ml /// Precio: $" + super.getPrecio().toString();
    }
}