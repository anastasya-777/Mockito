package ru.topacademy.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieManager manager1 = new MovieManager(10);


    MovieManager manager = new MovieManager();
    PosterMovies movie1 = new PosterMovies(1,"Бладшот","Боевик");
    PosterMovies movie2 = new PosterMovies(2,"Вперед","Мультфильм");
    PosterMovies movie3 = new PosterMovies(3,"Отель Белград","Комедия");
    PosterMovies movie4 = new PosterMovies(4,"Джентельмены","Боевик");
    PosterMovies movie5 = new PosterMovies(5,"Человек-невидимка","Ужасы");
    PosterMovies movie6 = new PosterMovies(6,"Тролли","Мультфильм");
    PosterMovies movie7 = new PosterMovies(7,"Номер один","Комедия");
    PosterMovies movie8 = new PosterMovies(8,"Один дома","Комедия");
    PosterMovies movie9 = new PosterMovies(9,"Птицы","Ужасы");
    PosterMovies movie10 = new PosterMovies(10,"Гонка","Боевик");


    @BeforeEach
    public  void setup() {                   //метод добавления фильмов


        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);
        manager.save(movie8);
        manager.save(movie9);
        manager.save(movie10);
    }

    @Test

    public void testAddMovies() {
        PosterMovies movies11 = new PosterMovies(11,"Артур","Комедия");
        manager.save(movies11);


        PosterMovies[] expected = {movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10,movies11};
        PosterMovies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test

    public void testReverseMovies() {

        PosterMovies[] expected = {movie10,movie9,movie8,movie7,movie6,movie5,movie4,movie3,movie2,movie1};
        PosterMovies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldSaveMoviesCorrectly() {
        MovieManager manager = new MovieManager();
        PosterMovies movie = new PosterMovies(1, "Бладшот", "Боевик");
        manager.save(movie);
        PosterMovies[] returned = manager.findAll();

        Assertions.assertArrayEquals(new PosterMovies[]{movie}, returned);
    }




}
