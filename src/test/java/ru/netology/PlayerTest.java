package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    GameStore store = new GameStore();
    Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
    private Game one = store.publishGame("Игра 1", "Приключения");
    private Game two = store.publishGame("Игра 2", "Аркады");
    private Game three = store.publishGame("Игра 3", "Головоломки");
    private Game four = store.publishGame("Игра 4", "Стратегия");
    private Game five = store.publishGame("Игра 5", "Аркады");
    private Game six = store.publishGame("Игра 6", "Гонки");




    @Test
    public void shouldSumGenreIfOneGame() {

        Player player = new Player("Петя");
        player.installGame(game);
        player.play(game, 555);

        int expected = 555;
        int actual = player.sumGenre(game.getGenre());
        assertEquals(expected, actual);

    }



    @Test
    public void shouldSumGenreIfGameReplay() {
        Player player = new Player("Миша");
        player.installGame(one);
        player.installGame(six);
        player.installGame(five);

        player.play(six,5);
        player.play(six,4);

        int expected = 9;
        int actual = player.sumGenre("Гонки");
        assertEquals(expected,actual);

        //не суммирует общее время игр в одном жанре



    }
    @Test
    void takGenreReturnsMostPlayedGameOfGenre(){
        Player player = new Player("Петя");
        player.installGame (one);
        player.installGame (two);
        player.installGame (three);

        player.play(one,5);
        player.play(two,2);
        player.play(three,11);
        Game expected = three;
        Game actual = player.mostPlayerByGenre(three.getGenre());
        assertEquals(expected,actual);



    }
    @Test
    public void shouldGameNotInstall() {

        Player player = new Player("Саша");

        assertThrows(RuntimeException.class, () -> {
            player.play(two, 5);
        });
    }



    }



