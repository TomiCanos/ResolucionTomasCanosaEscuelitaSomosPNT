package com.company.producto;

public abstract class Producto implements Comparable<Producto> {
    private String nombre;
    private Integer precio;


    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
        if (precio < o.precio) {
            return -1;
        } else if (precio > o.precio){
            return 1;
        }
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }
}
