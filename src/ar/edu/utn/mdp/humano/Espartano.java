package ar.edu.utn.mdp.humano;

public class Espartano extends Humano {
    private Integer toleranciaExtra;

    public Espartano(Integer toleranciaExtra, String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        super(nombre, edad, peso, orinar, beber);
        this.toleranciaExtra = toleranciaExtra;
    }
}
