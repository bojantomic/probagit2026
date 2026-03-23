package biblioteka;

import java.util.List;

public class Knjiga {
	
	private String naslov;
	private long isbn;
	private List<Autor> autori;
	private String izdavac;
	private int izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	
	public void setNaslov(String naslov) {
		if (naslov == null)
			throw new NullPointerException();
		
		if (naslov.isEmpty())
			throw new IllegalArgumentException();
		
		this.naslov = naslov;
	}
	
	public long getIsbn() {
		return isbn;
	}
	
	public void setIsbn(long isbn) {
		if (isbn <= 0)
			throw new IllegalArgumentException();
		
		this.isbn = isbn;
	}
	
	public List<Autor> getAutori() {
		return autori;
	}
	
	public void setAutori(List<Autor> autori) {
		if (autori == null)
			throw new NullPointerException();
		
		this.autori = autori;
	}
	
	public String getIzdavac() {
		return izdavac;
	}
	
	public void setIzdavac(String izdavac) {
		if (naslov == null)
			throw new NullPointerException();
		
		if (naslov.isEmpty())
			throw new IllegalArgumentException();
		
		this.izdavac = izdavac;
	}
	
	public int getIzdanje() {
		return izdanje;
	}
	
	public void setIzdanje(int izdanje) {
		if (izdanje <= 0)
			throw new IllegalArgumentException();
		
		this.izdanje = izdanje;
	}

}
