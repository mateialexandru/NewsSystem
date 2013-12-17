package newsApp;

import eventBus.EventService;
import java.util.Date;
public class Application {

	public static void main(String[] args) {
		MovieEventSubscriber x=new MovieEventSubscriber("Cinema City");
		MusicEventSubscriber y=new MusicEventSubscriber("D'arc Club");
		MusicEventSubscriber z=new MusicEventSubscriber("Cina Restaurant",new MusicFilter1("Timisoara"));
		
		EventService.instance().Publish(new MusicEvent("Zona zero","Creator",new Date(),"Timisoara","usoara",12));

		EventService.instance().Publish(new MusicEvent("Zona zero","Creator",new Date(),"Craiova","usoara",12));

		EventService.instance().Publish(new MusicEvent("Zona zero","Creator",new Date(),"Iasi","usoara",12));

		EventService.instance().Publish(new MusicEvent("Zona zero","Creator",new Date(),"Cluj","usoara",12));
	}

}
