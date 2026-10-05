package com.kia.picanto.accesorios;

import com.kia.picanto.decorator.VehiculoDecorator;
import com.kia.picanto.modelo.Vehiculo;

public class Tapetes extends VehiculoDecorator {

    public Tapetes(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + Tapetes";
    }

    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 92000;
    }
}