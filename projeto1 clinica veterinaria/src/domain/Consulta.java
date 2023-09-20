package domain;

import java.util.List;

public class Consulta {
    
    private String date;

    private String  resumo;

    private Tratamento tratamento;

    private Veterinario veterinario;

    private List<Exame> exames;

    public Consulta(String date, String resumo, Tratamento tratamento, Veterinario veterinario) {
        this.date = date;
        this.resumo = resumo;
        this.tratamento = tratamento;
        this.veterinario = veterinario;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    @Override
    public String toString() {
        return "Consulta [date=" + date + ", resumo=" + resumo + ", tratamento=" + tratamento + ", veterinario="
                + veterinario + ", exames=" + exames + "]";
    }

    

}
