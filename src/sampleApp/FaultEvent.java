package sampleApp;

public class FaultEvent implements ManagementEvent { 
	  public static final int CRITICAL = 1; 
	  public static final int MODERATE = 2; 
	  public static final int LOW = 3;

	  public int severity;

	  FaultEvent() { 
	    severity = LOW; 
	  }

	  FaultEvent(int aSeverity) { 
	    severity = aSeverity; 
	  } 
	}

