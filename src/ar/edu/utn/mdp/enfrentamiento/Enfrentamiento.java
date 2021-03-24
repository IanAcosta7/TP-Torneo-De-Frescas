package ar.edu.utn.mdp.enfrentamiento;
import ar.edu.utn.mdp.humano.*;

import java.util.ArrayList;
import java.util.Random;

public class Enfrentamiento {
    private ArrayList<Humano> equipoVikingo;
    private ArrayList<Humano> equipoEspartano;

    public Enfrentamiento(Integer vikingos, Integer espartanos) {
        equipoVikingo = new ArrayList<>();
        equipoEspartano = new ArrayList<>();

        inicializaEquipos(vikingos, espartanos);
    }

    public void inicializaEquipos(Integer vikingos, Integer espartanos) {
        Random rand = new Random();

        for (int i = 0; i < vikingos; i++) {
            equipoVikingo.add(new Vikingo(rand.nextInt(10), "Vikingo" + (i + 1), rand.nextInt(90), rand.nextInt(140), rand.nextInt(10)));
        }

        for (int i = 0; i < espartanos; i++) {
            equipoEspartano.add(new Espartano(rand.nextInt(10), "Espartano" + (i + 1), rand.nextInt(90), rand.nextInt(140), rand.nextInt(10)));
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
        for (Humano vik : equipoVikingo) {
            System.out.println(vik.getNombre() + " peso:" + vik.getPeso());
        }

        for (Humano esp : equipoEspartano) {
            System.out.println(esp.getNombre() + " peso:" + esp.getPeso());
        }
    }

    public void enfrentar() {
        for (Humano vik : equipoVikingo) {
            vik.competir();
        }

        for (Humano esp : equipoEspartano) {
            esp.competir();
        }
    }
}
