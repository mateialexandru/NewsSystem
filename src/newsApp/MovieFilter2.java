package newsApp;
import eventBus.Event;
import eventBus.Filter;

public class MovieFilter2 implements Filter{
	@Override
	public boolean Apply(Event event) {
		MovieEvent movieEvent=(MovieEvent) event;
		if(movieEvent.getGen()=="Comedie" || movieEvent.getGen()=="Drama")
			return true;
		return false; // vrem sa vedem doar comedii sau drame
	}
}