package newsApp;
import eventBus.Filter;
import eventBus.Event;

public class MusicFilter2 implements Filter{
	private String artist;
	public MusicFilter2(String artist)
	{
		this.artist=artist;
	}

	@Override
	public boolean Apply(Event event) {
		MusicEvent musicEvent=(MusicEvent) event;
		if(musicEvent.getArtist()!=artist)
			return false;
		return true;
	}
}
