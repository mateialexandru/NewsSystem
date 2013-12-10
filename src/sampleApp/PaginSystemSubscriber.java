package sampleApp;
import eventBus.Subscriber;
import eventBus.EventService;
import eventBus.Event;

public class PaginSystemSubscriber extends Subscriber { 
	  public PaginSystemSubscriber() { 
	    FaultEvent event = new FaultEvent(); 
	    CriticalFaultFilter filter = new CriticalFaultFilter(); 
	    EventService.instance().subscribe(filter.getClass(), filter, this); 
	  }

	  public void inform(Event event) { 
	    // Assumes that this subscriber has only subscribed to FaultEvent 
	    FaultEvent faultEvent = (FaultEvent) event;

	    // Respond to the event 
	    System.out.println("Critical Fault Event occurred:" + faultEvent); 
	  } 
	}

