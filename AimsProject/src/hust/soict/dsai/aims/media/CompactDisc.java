package hust.soict.dsai.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements PlayAble {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String toString() {
        // Create a string to hold the list of tracks (if any)
        StringBuilder trackList = new StringBuilder();
        if (tracks.size() > 0) {
            for (Track track : tracks) {
                trackList.append(track.toString()).append(", ");
            }
            // Remove the last comma and space
            trackList.setLength(trackList.length() - 2);
        } else {
            trackList.append("No tracks available");
        }

        // Build and return the string for the CompactDisc
        return "CompactDisc [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost +
                ", length=" + length + " minutes, director=" + director + ", artist=" + artist +
                ", tracks=[" + trackList.toString() + "]]";
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void play() {
        for (Track t : tracks) {
            t.play();
        }
    }

    public void addTrack(Track t) {
        if (tracks.contains(t) == false) {
            tracks.add(t);
            System.out.println("added");
        } else {
            System.out.println("Track exist");
        }
    }

    public void removeTrack(Track t) {
        if (tracks.contains(t) == true) {
            tracks.add(t);
            System.out.println("removed");
        } else {
            System.out.println("Track not exist");
        }
    }

    public int getLength() {
        int result = 0;
        for (Track t : tracks) {
            result += t.getLength();
        }
        return result;
    }
}
