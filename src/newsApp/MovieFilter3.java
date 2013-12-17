package newsApp;
import eventBus.Event;
import eventBus.Filter;

import java.util.Date;

public class MovieFilter3 implements Filter{
	public boolean Apply(Event event) {
		MovieEvent movieEvent=(MovieEvent) event;
		Date today=new Date();
		if(movieEvent.getDataLansare().getTime()<=today.getTime())
			return false;
		return true; //doar filmele lansate dupa data de azi
	}
}
