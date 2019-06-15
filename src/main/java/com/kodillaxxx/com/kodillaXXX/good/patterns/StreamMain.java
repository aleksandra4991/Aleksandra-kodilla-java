package com.kodillaxxx.com.kodillaXXX.good.patterns;

import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String args[]) {

        String movies = MovieStore.getMovies().entrySet()
                .stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movies);
    }

}
