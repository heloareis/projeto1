package domain;

import java.util.List;

public class Tratamento {
    
    private String descricao;

    private Animal animal;

    private List<Consulta> consultas;

    public Tratamento(String descricao, Animal animal) {
        this.descricao = descricao;
        this.animal = animal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Tratamento [descricao=" + descricao + ", animal=" + animal + ", consultas=" + consultas + "]";
    }

    
    

    
    


}
