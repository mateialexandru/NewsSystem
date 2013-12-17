package newsApp;

import java.util.Date;

import eventBus.Event;

public class MovieEvent implements Event { 
	  
	private String nume;
	private String gen;
	private Date dataLansare;
	private String cinema;
	private int pret;
	
	public MovieEvent(String nume, String gen, Date dataLansare, String cinema, int pret)
	{
		this.nume=nume;
		this.gen=gen;
		this.dataLansare=dataLansare;
		this.cinema=cinema;
		this.pret=pret;
	}
	
	public String getNume()
	{
		return nume;
	}
	
	public String getGen()
	{
		return gen;
	}
	
	public Date getDataLansare()
	{
		return dataLansare;
	}
	
	public String getCinema()
	{
		return cinema;
	}
	
	public int getPret()
	{
		return pret;
	}
	
	public String toString()
	{
		return "Filmul "+nume+" apartinand genului: "+gen+" va fi lansat din data "+dataLansare.toString()+" in cinema "+cinema+" .Pretul unui bilet va fi de "+pret+" RON.";
	}
	
}
