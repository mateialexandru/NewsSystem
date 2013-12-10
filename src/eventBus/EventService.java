package eventBus;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Triplet;



@SuppressWarnings("rawtypes")
public class EventService {
	
	//singleton
	private static EventService _instance;
	//keeps subscriptions
	protected List<Subscription> subscriptions;
	//protected List<Subscriber> subscriptions;
	
	//private constructor for singleton
	private EventService()
	{
		//eventClass=Event.class;
		subscriptions=new ArrayList<Subscription>();
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
		for(Subscription record : subscriptions)
			if(record.eventType.isAssignableFrom(e.getClass())&&(record.filter==null||record.filter.Apply(e)))
				record.subscriber.inform(e);
	}
	public void subscribe(Class eventType,Filter filter, Subscriber subscriber )
	{
		if(Event.class.isAssignableFrom(eventType))
		{
			Subscription _record=new Subscription(eventType,filter,subscriber);
			if(!subscriptions.contains(_record))
				subscriptions.add(_record);
		}
	}
	public void unsubscribe(Class eventType, Filter filter, Subscriber subscriber)
	{
		if(Event.class.isAssignableFrom(eventType))
			subscriptions.remove(new Subscription(eventType,filter,subscriber));
	}
}
