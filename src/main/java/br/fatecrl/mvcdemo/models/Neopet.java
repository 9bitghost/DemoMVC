package br.fatecrl.mvcdemo.models;

public class Neopet {
    private String speciesday;
    private String nome;

    public Neopet(String speciesday, String nome) {
        this.speciesday = speciesday;
        this.nome = nome;
    }

    public String getSpeciesday() {
        return speciesday;
    }

    public void setSpeciesday(String speciesday) {
        this.speciesday = speciesday;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
