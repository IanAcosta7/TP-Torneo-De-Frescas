package ar.edu.utn.mdp.humano;

import java.util.Random;

public class Espartano extends Humano {
    private Integer toleranciaExtra;
    private Random random;

    public Espartano(Integer toleranciaExtra, String nombre, Integer edad, Integer peso, Integer aguante) {
        super(nombre, edad, peso, aguante, new OrinarEspartanoImp(), new BeberEspartanoImp());
        this.random = new Random();
        this.toleranciaExtra = toleranciaExtra;
    }

    @Override
    public Integer orinar() {
        super.setAguante(super.getAguante() - super.getOrinar().orinar() - toleranciaExtra);

        return getAguante();
    }

    @Override
    public Integer beber() {
        super.setBebido(super.getBebido() + super.getBeber().beber());

        return super.getBebido();
    }
}
