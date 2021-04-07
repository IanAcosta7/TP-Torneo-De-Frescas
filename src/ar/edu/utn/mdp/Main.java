package ar.edu.utn.mdp;

import ar.edu.utn.mdp.enfrentamiento.Enfrentamiento;

public class Main {

    public static void main(String[] args) {
        Enfrentamiento enfrentamiento = new Enfrentamiento(10, 10);

        enfrentamiento.preparaEnfrentamiento();

        enfrentamiento.enfrentar();
    }
}
