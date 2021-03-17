package ar.edu.utn.mdp.enfrentamiento;
import ar.edu.utn.mdp.humano.*;

import java.util.ArrayList;
import java.util.Random;

public class Enfrentamiento {
    private ArrayList<Vikingo> equipoVikingo;
    private ArrayList<Espartano> equipoEspartano;

    public Enfrentamiento(Integer participantes) {
        super();

        equipoVikingo = new ArrayList<>();
        equipoEspartano = new ArrayList<>();

        inicializaEquipos(participantes);
    }

    public void inicializaEquipos(Integer participantes) {
        Random rand = new Random();

        for (int i = 0; i < participantes / 2; i++) {
            equipoVikingo.add(new Vikingo(rand.nextInt(), "Vikingo" + (i + 1), rand.nextInt(), rand.nextInt(), new OrinarVikingoImp(), new BeberVikingoImp()));
            equipoEspartano.add(new Espartano(rand.nextInt(), "Espartano" + (i + 1), rand.nextInt(), rand.nextInt(), new OrinarEspartanoImp(), new BeberEspartanoImp()));
        }
    }

    public void preparaEnfrentamiento() {
        // Mi dni es impar
        System.out.println("Presentacion");
        presentaEquipos();

        equipoVikingo.sort(Humano::compareTo);
        equipoEspartano.sort(Humano::compareTo);

        equipoVikingo.remove(equipoVikingo.size() -1 );
        equipoEspartano.remove(equipoEspartano.size() - 1);

        System.out.println("\nPresentacion despues de la preparacion");
        presentaEquipos();
    }

    public void presentaEquipos() {
        for (Vikingo vik:
             equipoVikingo) {
            System.out.println(vik.getNombre() + " peso:" + vik.getPeso());
        }

        for (Espartano esp:
             equipoEspartano) {
            System.out.println(esp.getNombre() + " peso:" + esp.getPeso());
        }
    }
}
