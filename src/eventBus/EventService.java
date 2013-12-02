package eventBus;

import java.util.List;
import java.util.Vector;


@SuppressWarnings("rawtypes")
public class EventService {
	
	//singleton
	private static EventService _instance;
	//type of Event
	private Class eventClass;
	//keeps subscriptions
	protected List<Subscriber> subscriptions;
	
	//private constructor for singleton
	private EventService()
	{
		eventClass=Event.class;
		subscriptions=new Vector();
	}
	
	//singleton implementation
	public static EventService instance()
	{
		if(_instance==null)
			_instance=new EventService();
		return _instance;
	}
	
	//publish an event
	public void Publish(Event e)
	{
		
	}
	public void subscribe(Class eventType,Filter filter, Subscriber subscriber )
	{
		
	}
}
