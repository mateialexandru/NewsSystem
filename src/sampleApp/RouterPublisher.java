package sampleApp;

import eventBus.Event;
import eventBus.EventService;

public class RouterPublisher { 
	  public static void triggerPublication() { 
	    Event event = new FaultEvent(FaultEvent.CRITICAL); 
	    EventService.instance().Publish(event); 
	  } 
	}
