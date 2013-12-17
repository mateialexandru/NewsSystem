package newsApp;
import eventBus.Event;
import eventBus.EventService;
import eventBus.Filter;
import eventBus.Subscriber;

public class MusicEventSubscriber extends Subscriber {
	
	private String name;
	
	public MusicEventSubscriber(String subscriberName)
	{
		this.name=subscriberName;
		EventService.instance().subscribe(MusicEvent.class,null, this);
	}
	
	public MusicEventSubscriber(String subscriberName,Filter filter)
	{
		this.name=subscriberName;
		EventService.instance().subscribe(MusicEvent.class,filter, this);
	}
	@Override
	public void inform(Event event) {
		MusicEvent musicEvent=(MusicEvent) event;

		System.out.println(this.name+": musical event notification: " + musicEvent); 

	}

}
