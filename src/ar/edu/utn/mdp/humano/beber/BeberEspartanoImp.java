package ar.edu.utn.mdp.humano.beber;

import java.util.Random;

public class BeberEspartanoImp implements Beber {
    @Override
    public Integer beber() {
        Random rand = new Random();
        return rand.nextInt(3);
    }
}
