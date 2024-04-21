package com.mycompany.autovilescrud.persistencia;

import com.mycompany.autovilescrud.logica.Auto;
import com.mycompany.autovilescrud.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutoJpaController autoJpa = new AutoJpaController();

    public void guardarAuto(Auto auto) {
        autoJpa.create(auto);
    }

    public List<Auto> traerVehiculos() {
        return autoJpa.findAutoEntities();
    }

    public void borrarVehiculo(int id_auto) {
        try {
            autoJpa.destroy(id_auto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarAuto(Auto auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
