package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Hunter x Hunter", "TV", 148);
        anime.init("Hunter x Hunter", "TV", 148, "Luta");

        anime.imprime();
    }
}
