package org.example.homework2;

import java.util.Objects;

public class MusicTrack {
    private String title;
    private String artist;
    private String genre;

    public MusicTrack(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getGenre() { return genre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicTrack)) return false;
        MusicTrack track = (MusicTrack) o;
        return Objects.equals(title, track.title) &&
                Objects.equals(artist, track.artist) &&
                Objects.equals(genre, track.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, genre);
    }

    @Override
    public String toString() {
        return "MusicTrack{title='" + title + "', artist='" + artist + "', genre='" + genre + "'}";
    }
}
