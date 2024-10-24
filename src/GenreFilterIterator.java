import java.util.ArrayList;
import java.util.List;

public class GenreFilterIterator implements Iterator{
    private List<Song> filteredSongs;
    private int position = 0;
    public GenreFilterIterator(List<Song> songs, String genre) {
        filteredSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getGenre().equalsIgnoreCase(genre)) {
                filteredSongs.add(song);
            }
        }
    }
    @Override
    public boolean hasNext() {
        return position < filteredSongs.size();
    }
    @Override
    public Song next() {
        return filteredSongs.get(position++);
    }
}
