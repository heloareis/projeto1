package domain;

import java.util.List;

public class Animal {

    private String nomeAnimal;

    private String sexoAnimal;

    private String idadeAnimal;

    private Especie especie;

    private Cliente cliente;

    List<Tratamento> tratamentos;

    public Animal(String nomeAnimal, String sexoAnimal, String idadeAnimal, Especie especie, Cliente cliente) {
        this.nomeAnimal = nomeAnimal;
        this.sexoAnimal = sexoAnimal;
        this.idadeAnimal = idadeAnimal;
        this.especie = especie;
        this.cliente = cliente;
    }

    public String getnomeAnimal() {
        return nomeAnimal;
    }

    public void setnomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getsexoAnimal() {
        return sexoAnimal;
    }

    public void setsexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public String getidadeAnimal() {
        return idadeAnimal;
    }

    public void setidadeAnimal(String idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nomeAnimal + ", sexo=" + sexoAnimal + ", idade=" + idadeAnimal + ", especie=" + especie
                + ", cliente="
                + cliente + ", tratamentos=" + tratamentos + "]";
    }

}
