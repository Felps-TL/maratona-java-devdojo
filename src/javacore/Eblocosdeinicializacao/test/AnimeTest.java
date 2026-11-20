package javacore.Eblocosdeinicializacao.test;

import javacore.Eblocosdeinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
