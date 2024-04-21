package com.mycompany.autovilescrud.logica;

import com.mycompany.autovilescrud.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardarAuto(String modelo, String marca, String motor, String color, String patente, int puertas) {
        Auto auto = new Auto();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCanPuertas(puertas);
        
        controlPersis.guardarAuto(auto);
    }

    public List<Auto> traerVehiculos() {
        return controlPersis.traerVehiculos();
    }

    public void borrarVehiculo(int id_auto) {
        controlPersis.borrarVehiculo(id_auto);
    }

    public void modificarAuto(int id, String modelo, String marca, String motor, String color, String patente, int puertas) {
        Auto auto = new Auto();
        
        auto.setId(id);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCanPuertas(puertas);
        
        controlPersis.modificarAuto(auto);
    }
    
}
