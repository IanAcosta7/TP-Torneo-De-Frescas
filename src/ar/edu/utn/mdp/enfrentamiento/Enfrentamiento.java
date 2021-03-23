package ar.edu.utn.mdp.enfrentamiento;
import ar.edu.utn.mdp.humano.*;

import java.util.ArrayList;
import java.util.Random;

public class Enfrentamiento {
    private ArrayList<Vikingo> equipoVikingo;
    private ArrayList<Espartano> equipoEspartano;

    public Enfrentamiento(Integer vikingos, Integer espartanos) {
        super();

        equipoVikingo = new ArrayList<>();
        equipoEspartano = new ArrayList<>();

        inicializaEquipos(vikingos, espartanos);
    }

    public void inicializaEquipos(Integer vikingos, Integer espartanos) {
        Random rand = new Random();

        for (int i = 0; i < vikingos; i++) {
            equipoVikingo.add(new Vikingo(rand.nextInt(), "Vikingo" + (i + 1), rand.nextInt(), rand.nextInt(), new OrinarVikingoImp(), new BeberVikingoImp()));
        }

        for (int i = 0; i < espartanos; i++) {
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
        for (Vikingo vik : equipoVikingo) {
            System.out.println(vik.getNombre() + " peso:" + vik.getPeso());
        }

        for (Espartano esp : equipoEspartano) {
            System.out.println(esp.getNombre() + " peso:" + esp.getPeso());
        }
    }

    public void enfrentar() {
        for (Vikingo vik : equipoVikingo) {
            vik.competir();
        }

        for (Espartano esp : equipoEspartano) {
            esp.competir();
        }
    }
}
