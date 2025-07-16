package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    // Novo atributo
    private int duracaoSegundos;

    // Getters e setters existentes
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        if(totalCurtidas >= 0) this.totalCurtidas++;
    }

    public void reproduz() {
        if(totalReproducoes >= 0) this.totalReproducoes++;
    }

    // Novo método para definir a duração
    public void setDuracao(int minutos, int segundos) {
        // Impede valores inválidos como minutos negativos
        if(minutos < 0 || segundos < 0) {
            System.out.println("Erro: Duração não pode ser negativa!");
            return;
        }
        this.duracaoSegundos = minutos * 60 + segundos;
    }

    // Novo método para retornar a duração formatada
    public String getDuracaoFormatada() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        return minutos + "m " + segundos + "s";
    }
}
