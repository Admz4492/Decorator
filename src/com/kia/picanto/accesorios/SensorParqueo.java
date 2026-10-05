package com.kia.picanto.accesorios;

import com.kia.picanto.decorator.VehiculoDecorator;
import com.kia.picanto.modelo.Vehiculo;

public class SensorParqueo extends VehiculoDecorator {

    public SensorParqueo(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + Sensor de parqueo";
    }

    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 150000;
    }
}