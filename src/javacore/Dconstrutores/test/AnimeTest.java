package javacore.Dconstrutores.test;

import javacore.Dconstrutores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 85, "Esporte", "Production IG");

        anime.imprime();
    }
}
