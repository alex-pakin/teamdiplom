package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    @Test
    void shouldAddManyGames() {
        GameStore store = new GameStore();

        Game game1 = store.publishGame("Игра 1", "Спорт");
        Game game2 = store.publishGame("Игра 2", "Файтинг");
        Game game3 = store.publishGame("Игра 3", "Гонки");

        assertTrue(store.containsGame(game3));
    }

    // Баг - игра в каталоге, при этом считает,что ее нет//
    @Test
    void shouldNotContainGame() {
        GameStore store1 = new GameStore();
        GameStore store2 = new GameStore();

        Game game = store1.publishGame("Игра 1", "Аркады");
        assertFalse(store1.containsGame(game));

    }

    @Test
    void shouldAddPlayTimeOfOnePlayer() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Игра 1", "Файтинг");
        store.addPlayTime("Леша", 33);

        int actual = store.getSumPlayedTime();
        int expected = 33;

        assertEquals(expected,actual);
    }

    @Test
    void shouldAddPlayTimeOfOnePlayerInTimePeriod() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Игра 1", "Файтинг");
        store.addPlayTime("Леша", 3);
        store.addPlayTime("Леша", 2);
        store.addPlayTime("Леша", 9);
        store.addPlayTime("Леша", 10);
        store.addPlayTime("Леша", 1);

        int actual = store.getSumPlayedTime();
        int expected = 25;

        assertEquals(expected,actual);
    }

    @Test
    void shouldAddPlayTimeOfManyPlayers() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Игра 1", "Файтинг");
        store.addPlayTime("Леша", 18);
        store.addPlayTime("Саша", 5);
        store.addPlayTime("Аля", 44);
        store.addPlayTime("Надя", 10);
        store.addPlayTime("Света", 1);

        int actual = store.getSumPlayedTime();
        int expected = 78;

        assertEquals(expected,actual);
    }

    @Test
    void shouldGetMostPlayedAmongPlayers() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Игра 1", "Файтинг");

        store.addPlayTime("Леша", 18);
        store.addPlayTime("Саша", 5);
        store.addPlayTime("Аля", 44);
        store.addPlayTime("Надя", 10);
        store.addPlayTime("Света", 1);

        String actual = store.getMostPlayer();
        String expected = "Аля";
        assertEquals(expected,actual);
    }
    @Test
    void shouldGetMostPlayedIfNobodyPlayed() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Игра 1", "Файтинг");

        String actual = store.getMostPlayer();
        String expected = null;
        assertEquals(null,actual);
    }

    @Test
    void shouldGetMostPlayedIfPlayersHaveZeroCount() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Игра 1", "Файтинг");

        store.addPlayTime("Леша", 0);
        store.addPlayTime("Саша", 0);
        store.addPlayTime("Аля", 0);

        String actual = store.getMostPlayer();
        String expected = null;
        assertEquals(null,actual);
    }

    @Test
    void shouldGetMostPlayedIfPlayersHaveEqualCount() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Игра 1", "Файтинг");

        store.addPlayTime("Леша", 2);
        store.addPlayTime("Саша", 2);
        store.addPlayTime("Аля", 2);

        String actual = store.getMostPlayer();
        String expected = "Аля";
        assertEquals(expected,actual);
    }

}
