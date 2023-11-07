package com.mycompany.concesionario.persistencia;

import com.mycompany.concesionario.logica.Automovil;
import java.util.List;

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new  AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }
    
}
