package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        // Criação e configuração da música
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Quando o tempo fechar");
        minhaMusica.setArtista("Filipe Ret");
        minhaMusica.setDuracao(3, 45);  // 3 minutos e 45 segundos

        // Simula reproduções e curtidas
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        // Criação e configuração do podcast
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Os sócios");
        meuPodcast.setHost("Bruno Perini e Malu Perini");
        meuPodcast.setDuracao(45, 30); // 45 minutos e 30 segundos

        // Simula reproduções e curtidas
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        // Resumo rápido no console
        System.out.println("\n---- Resumo das estatísticas ----");
        System.out.println(minhaMusica.getTitulo()
            + " foi reproduzida " + minhaMusica.getTotalReproducoes() + " vezes");
        System.out.println(meuPodcast.getTitulo()
            + " teve " + meuPodcast.getTotalCurtidas() + " curtidas");

        // Exibe fichas completas antes de incluir nas preferidas
        System.out.println("\n---- Fichas de mídia ----\n");
        minhaMusica.exibirFicha();
        meuPodcast.exibirFicha();

        // Inclui em preferidas
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
