package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
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
    public void shouldSumGenreIfTwoGame() {

        Player player = new Player("Петя");
        player.installGame(two);
        player.installGame(five);
        player.play(two, 25);
        player.play(five, 15);

        int expected = 40;
        int actual = player.sumGenre(game.getGenre());
        assertEquals(expected, actual);

    }


    @Test
    public void shouldSumGenreIfGameReplay() {
        Player player = new Player("Миша");
        player.installGame(one);
        player.installGame(six);
        player.installGame(five);

        player.play(six, 5);
        player.play(six, 4);

        int expected = 9;
        int actual = player.sumGenre("Гонки");
        assertEquals(expected, actual);


    }

    @Test
    void takGenreReturnsMostPlayedGameOfGenre() {
        Player player = new Player("Петя");
        player.installGame(two);
        player.installGame(four);
        player.installGame(five);

        player.play(two, 5);
        player.play(four, 2);
        player.play(five, 1);
        Game expected = two;
        Game actual = player.mostPlayerByGenre("Аркады");
        assertEquals(expected, actual);

    }

    @Test
    public void shouldGameNotInstall() {

        Player player = new Player("Саша");

        assertThrows(RuntimeException.class, () -> {
            player.play(two, 5);
        });
    }

    @Test
    void returnsNullIfNotIrraly() {
        Player player = new Player("Маша");
        player.installGame(one);
        player.installGame(two);
        player.installGame(four);

        player.play(one, 5);
        player.play(two, 2);

        Game actual = player.mostPlayerByGenre(four.getGenre());
        assertEquals(null, actual);

    }

    @Test
    void appropriationNamePlayer() {
        Player player = new Player("Леша");
        String expected = "Леша";
        assertEquals(expected, player.getName());


    }
    @Test
    void takGenreReturnsMostPlayedGameGenre() {
        Player player = new Player("Петя");
        player.installGame(two);
        player.installGame(four);
        player.installGame(five);

        player.play(two, 1);
        player.play(four, 2);
        player.play(five, 5);
        Game expected = five;
        Game actual = player.mostPlayerByGenre(two.getGenre());
        assertEquals(expected, actual);

    }


}






   
}*/

