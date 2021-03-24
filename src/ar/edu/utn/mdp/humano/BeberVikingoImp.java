package ar.edu.utn.mdp.humano;

import java.util.Random;

public class BeberVikingoImp implements Beber {
    @Override
    public Integer beber() {
        Random rand = new Random();
        return rand.nextInt(3);
    }
}
