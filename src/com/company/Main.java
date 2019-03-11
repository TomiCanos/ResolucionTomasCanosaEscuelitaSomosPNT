package com.company;


import com.company.producto.Fruta;
import com.company.producto.Gaseosa;
import com.company.producto.Producto;
import com.company.producto.Shampoo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Producto> productos = getProductos();

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        Collections.sort(productos);
        String productoMasBarato = productos.get(0).getNombre();
        String productoMasCaro = productos.get(productos.size() - 1).getNombre();

        System.out.println("=============================" + "\n" + "Producto más caro: " + productoMasCaro +
                "\n" + "Producto más barato: " + productoMasBarato);
    }


    private static List<Producto> getProductos(){
        List<Producto> productos = new ArrayList<>();
        Gaseosa cocaColaZero = new Gaseosa("Coca-Cola Zero", 20, 1.5);
        Gaseosa cocaCola = new Gaseosa("Coca-Cola", 18, 1.5);
        Shampoo shampooSedal = new Shampoo("Shampoo Sedal", 19, 500);
        Fruta frutilla = new Fruta("Frutillas", 64, "kilo");

        productos.add(cocaColaZero);
        productos.add(cocaCola);
        productos.add(shampooSedal);
        productos.add(frutilla);

        return productos;
    }

}