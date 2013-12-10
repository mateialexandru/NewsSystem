package sampleApp;

import eventBus.Filter;
import eventBus.Event;

public class CriticalFaultFilter implements Filter { 
	  public boolean Apply(Event event) { 
	    // Assumes that this filter is used only with subscriptions to FaultEvent 
	    FaultEvent faultEvent = (FaultEvent) event; 
	    return (faultEvent.severity == FaultEvent.CRITICAL); 
	  } 
}
