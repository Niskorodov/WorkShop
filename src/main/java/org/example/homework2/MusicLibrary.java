package org.example.homework2;

import java.util.*;

public class MusicLibrary {
    private Map<String, Set<MusicTrack>> tracksByGenre = new HashMap<>();

    public void addTrack(MusicTrack track) {
        tracksByGenre
                .computeIfAbsent(track.getGenre(), k -> new HashSet<>())
                .add(track);
    }

    public boolean removeTrack(MusicTrack track) {
        Set<MusicTrack> tracks = tracksByGenre.get(track.getGenre());
        if (tracks != null) {
            boolean removed = tracks.remove(track);
            if (tracks.isEmpty()) {
                tracksByGenre.remove(track.getGenre());
            }
            return removed;
        }
        return false;
    }

    public Set<MusicTrack> getTracksByGenre(String genre) {
        return tracksByGenre.getOrDefault(genre, Collections.emptySet());
    }
}
