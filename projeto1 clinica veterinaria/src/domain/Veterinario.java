package domain;

import java.util.List;

public class Veterinario {

    private String nome;

    private String especialidade;

    private List<Consulta> consultas;

    public Veterinario(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Veterinario [nome=" + nome + ", especialidade=" + especialidade + ", consultas=" + consultas + "]";
    }

    

}
