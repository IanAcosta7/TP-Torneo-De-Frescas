package ar.edu.utn.mdp.humano;

public class Vikingo extends Humano {
    private Integer bebedorProfesional;

    public Vikingo(Integer bebedorProfesional, String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber){
        super(nombre, edad, peso, orinar, beber);
        this.bebedorProfesional = bebedorProfesional;
    }

     @Override
    public Integer competir() {
         Integer puntuacion = 0;

         return puntuacion;
    }
}
