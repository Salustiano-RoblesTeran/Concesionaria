package com.mycompany.concesionario;
import com.mycompany.concesionario.igu.Principal;

public class Concesionario {

    public static void main(String[] args) {
        
        // Llamamos y hacemos visible a nuestro IGU
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
