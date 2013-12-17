package newsApp;
import eventBus.Event;
import eventBus.Filter;

public class MusicFilter3 implements Filter{
	private String gen;
	public MusicFilter3(String gen)
	{
		this.gen=gen;
	}
	public boolean Apply(Event event) {
		MusicEvent musicEvent=(MusicEvent) event;
		if(musicEvent.getGen()==this.gen)
			return false;
		return true; // fara manele!
	}
}
