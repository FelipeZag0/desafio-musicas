package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }

    }

    public void exibirFicha() {
        System.out.println("\n--- Ficha Técnica ---");
        System.out.println("Podcast: " + getTitulo());
        System.out.println("Host: " + host);
        System.out.println("Duração: " + getDuracaoFormatada());
    }
}
