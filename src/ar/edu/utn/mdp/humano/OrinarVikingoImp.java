package ar.edu.utn.mdp.humano;

import java.util.Random;

public class OrinarVikingoImp implements Orinar {
    @Override
    public Integer orinar() {
        Random rand = new Random();
        return rand.nextInt(4);
    }
}
