package com.kia.picanto.accesorios;

import com.kia.picanto.decorator.VehiculoDecorator;
import com.kia.picanto.modelo.Vehiculo;

public class Alarma extends VehiculoDecorator {

    public Alarma(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + Alarma";
    }

    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 205000;
    }
}