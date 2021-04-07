package ar.edu.utn.mdp.humano;

import ar.edu.utn.mdp.humano.beber.Beber;
import ar.edu.utn.mdp.humano.orinar.Orinar;

public class Humano implements Comparable {
    private String nombre;
    private Integer edad;
    private Integer peso;
    private Integer aguante;
    private Integer bebido;
    private Orinar orinar;
    private Beber beber;

    public Humano(String nombre, Integer edad, Integer peso, Integer aguante, Orinar orinar, Beber beber) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.aguante = aguante;
        this.bebido = 0;
        this.orinar = orinar;
        this.beber = beber;
    }

    public Integer orinar() {
        aguante = aguante - orinar.orinar();

        return aguante;
    }

    public  Integer beber() {
        bebido = bebido + beber.beber();

        return bebido;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPeso() {
        return peso;
    }

    protected Integer getAguante() { return aguante; }

    protected void setAguante(Integer val) { aguante = val; }

    protected Integer getBebido() { return bebido; }

    protected void setBebido(Integer val) { bebido = val; }

    protected Orinar getOrinar() { return orinar; }

    protected Beber getBeber() { return beber; }

    public void competir() {
        System.out.println("\nCompetidor: " + nombre);
        System.out.println("========================");
        while (aguante > 0) {
            System.out.println("Bebe " + beber() + " frescas.");

            if (orinar() <= 0) {
                System.out.println("No aguanta más y va a orinar.");
            }
        }
        System.out.println("========================");
    }

    @Override
    public int compareTo(Object o) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        Humano h = (Humano)o;

        if (this.peso == h.peso) return EQUAL;

        if (this.peso < h.peso) return BEFORE;
        if (this.peso > h.peso) return AFTER;

        return EQUAL;
    }
}
