package newsApp;
import eventBus.Event;

import java.util.Date;

public class MusicEvent implements Event { 
	private String titluConcert;
	private String artist;
	private Date dataConcert;
	private String oras;
	private String gen;
	private int pret;
	
public MusicEvent(String titluConcert, String artist, Date dataConcert, String oras, String gen, int pret)
{
	this.titluConcert=titluConcert;
	this.artist=artist;
	this.dataConcert=dataConcert;
	this.gen=gen;
	this.oras=oras;
	this.pret=pret;
}

public String getTitlu()
{
	return titluConcert;
}

public String getArtist()
{
	return artist;
}

public Date getData()
{
	return dataConcert;
}

public String getGen()
{
	return gen;
}

public String getOras()
{
	return oras;
}

public int getPret()
{
	return pret;
}

public String toString()
{
	return "Artistul "+artist+" va concerta in orasul "+oras+" in data de "+dataConcert.toString()+". Concertul se numeste "+titluConcert+" si genul muzical interpretat este "+gen+".Pretul unui bilet este "+pret+" RON. ";
}

}