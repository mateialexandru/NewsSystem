package newsApp;
import eventBus.Event;
import eventBus.Filter;


public class MovieFilter1 implements Filter{
	@Override
	public boolean Apply(Event event) {
		MovieEvent movieEvent=(MovieEvent) event;
		if(movieEvent.getPret()>30)
			return false;
		return true;// doar filme mai ieftine de 30 ron
	}
}
