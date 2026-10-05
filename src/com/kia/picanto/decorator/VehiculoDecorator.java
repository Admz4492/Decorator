package com.kia.picanto.decorator;

import com.kia.picanto.modelo.Vehiculo;

public abstract class VehiculoDecorator implements Vehiculo {

    protected Vehiculo vehiculo;

    public VehiculoDecorator(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return vehiculo.getPrecio();
    }
}