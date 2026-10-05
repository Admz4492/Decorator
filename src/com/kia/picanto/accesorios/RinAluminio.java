package com.kia.picanto.accesorios;

import com.kia.picanto.decorator.VehiculoDecorator;
import com.kia.picanto.modelo.Vehiculo;

public class RinAluminio extends VehiculoDecorator {

    public RinAluminio(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + Rines de aluminio";
    }

    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 350000;
    }
}