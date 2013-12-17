package newsApp;
import eventBus.Event;

import eventBus.EventService;
import eventBus.Filter;
import eventBus.Subscriber;

public class MovieEventSubscriber extends Subscriber {
	private String name;
	
	public MovieEventSubscriber(String subscriberName)
	{
		this.name=subscriberName;
		EventService.instance().subscribe(MovieEvent.class,null,this);
	}
	
	public MovieEventSubscriber(String subscriberName, Filter filter)
	{
		this.name=subscriberName;
		EventService.instance().subscribe(MovieEvent.class,filter,this);
	}
	
	@Override
	public void inform(Event event) {
		MovieEvent movieEvent=(MovieEvent) event;
		 System.out.println(this.name+": movie event notification : " + movieEvent); 
	}

}
