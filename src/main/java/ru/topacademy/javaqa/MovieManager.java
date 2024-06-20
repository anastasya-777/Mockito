package ru.topacademy.javaqa;

public class MovieManager {
    private int limit = 10;

    private PosterMovies[] movies = new PosterMovies[0];

    public MovieManager() {

    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public PosterMovies[] findAll() {
        return movies;
    }

    public void save(PosterMovies movie) {
        PosterMovies[] tmp = new PosterMovies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public PosterMovies[] findLast() {
        // Вычисляем правильный размер результирующего массива
        int resultLength = Math.min(movies.length, limit);
        PosterMovies[] result = new PosterMovies[resultLength];

        // Заполняем массив последними фильмами в обратном порядке
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }

        for (int i = 0; i < resultLenght; i++) {
            result[i] = findAll()[resultLenght - 1 - i]; // инверсия массива

        }
        return result;
    }
}


