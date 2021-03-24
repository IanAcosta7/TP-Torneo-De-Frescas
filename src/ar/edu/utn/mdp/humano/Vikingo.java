package ar.edu.utn.mdp.humano;

public class Vikingo extends Humano {
    private Integer bebedorProfesional;

    public Vikingo(Integer bebedorProfesional, String nombre, Integer edad, Integer peso, Integer aguante){
        super(nombre, edad, peso, aguante, new OrinarVikingoImp(), new BeberVikingoImp());
        this.bebedorProfesional = bebedorProfesional;
    }

    @Override
    public Integer orinar() {
        super.setAguante(super.getAguante() - super.getOrinar().orinar());

        return getAguante();
    }

    @Override
    public Integer beber() {
        super.setBebido(super.getBebido() + super.getBeber().beber() + bebedorProfesional);

        return super.getBebido();
    }
}
