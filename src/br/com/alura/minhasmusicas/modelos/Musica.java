package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {

    private String album;
    private String artista;
    private String genero;

    // Getters e Setters
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Lógica de classificação personalizada
    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

    // Exibição formatada da ficha técnica
    public void exibirFicha() {
        System.out.println("\n--- Ficha Técnica ---");
        System.out.println("Música: " + getTitulo());
        System.out.println("Artista: " + artista);
        if(album != null) System.out.println("Álbum: " + album);
        if(genero != null) System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + getDuracaoFormatada());
    }
}
