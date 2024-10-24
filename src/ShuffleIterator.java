import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleIterator implements Iterator{
    private List<Song> shuffledSongs;
    private int position = 0;
    public ShuffleIterator(List<Song> songs) {
        shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs);
    }

    @Override
    public boolean hasNext() {
        return position < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(position++);
    }
}
