package domain;

import java.util.List;

public class Especie {
    
    private String nome;

    private List<Animal> animais;

    public Especie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        return "Especie [nome=" + nome + ", animais=" + animais + "]";
    }

    


}
