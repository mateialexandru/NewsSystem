package newsApp;
import eventBus.Event;
import eventBus.Filter;

public class MusicFilter1 implements Filter{
	private String oras;
	public MusicFilter1(String oras)
	{
		this.oras=oras;
	}

	public boolean Apply(Event event) {
		MusicEvent musicEvent=(MusicEvent) event;
		if(musicEvent.getOras()!=this.oras)
			return false;
		return true;// doar concertele din timisoara ne intereseaza
	}
}
