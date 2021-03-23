package ar.edu.utn.mdp.humano;

public abstract class Humano implements Comparable {
    private String nombre;
    private Integer edad;
    private Integer peso;
    private Orinar orinar;
    private Beber beber;

    public Humano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.orinar = orinar;
        this.beber = beber;
    }

    public void orinar() {
        orinar.orinar();
    }

    public void beber() {
        beber.beber();
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPeso() {
        return peso;
    }

    public abstract Integer competir();

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
