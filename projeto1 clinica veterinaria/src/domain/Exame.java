package domain;

import java.util.List;

public class Exame {

    private String nome;

    private String resultado;

    private List<Consulta> consultas;

    public Exame(String nome, String resultado) {
        this.nome = nome;
        this.resultado = resultado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Exame [nome=" + nome + ", resultado=" + resultado + ", consultas=" + consultas + "]";
    }

    


}
