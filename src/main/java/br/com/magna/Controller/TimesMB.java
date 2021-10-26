package br.com.magna.Controller;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

@Named("ligaBBVA")
public class TimesMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<String> timesEspanhois;
	
	public void selecionar() {
		for (String times : timesEspanhois) {
			System.out.println(times);
		}
	}
	
	public List<String> getTimesEspanhois(){
		return timesEspanhois;
	}
	
	public void setTimesEspanhois(List<String> timesEspanhois) {
		this.timesEspanhois = timesEspanhois;
	}
	
	

}
