package com.kia.picanto;

import com.kia.picanto.modelo.*;
import com.kia.picanto.accesorios.*;

public class Main {

    public static void main(String[] args) {

        // Vehículo base
        Vehiculo picanto = new VibrantMT();

        // Agregamos accesorios dinámicamente
        picanto = new RinAluminio(picanto);
        picanto = new SensorParqueo(picanto);
        picanto = new Tapetes(picanto);

        System.out.println("VEHÍCULO CONFIGURADO");
        System.out.println("--------------------");
        System.out.println("Descripción: " + picanto.getDescripcion());
        System.out.println("Precio: $" + picanto.getPrecio());


        // Segundo vehículo
        Vehiculo picanto2 = new ZenithAT();

        picanto2 = new Alarma(picanto2);
        picanto2 = new Portabicicletas(picanto2);

        System.out.println();
        System.out.println("SEGUNDO VEHÍCULO");
        System.out.println("--------------------");
        System.out.println("Descripción: " + picanto2.getDescripcion());
        System.out.println("Precio: $" + picanto2.getPrecio());


        // Tercer vehículo
        Vehiculo picanto3 = new GTLineAT();

        picanto3 = new RinAluminio(picanto3);
        picanto3 = new Alarma(picanto3);
        picanto3 = new SensorParqueo(picanto3);
        picanto3 = new Tapetes(picanto3);

        System.out.println();
        System.out.println("TERCER VEHÍCULO");
        System.out.println("--------------------");
        System.out.println("Descripción: " + picanto3.getDescripcion());
        System.out.println("Precio: $" + picanto3.getPrecio());
    }
}