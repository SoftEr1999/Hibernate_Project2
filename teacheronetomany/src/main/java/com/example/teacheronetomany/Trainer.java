package com.example.teacheronetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity (name="Cource_Trainer")
public class Trainer {
	
	@Id
	@PrimaryKeyJoinColumn
	private int tid;
	private String tname;
	
	@OneToMany(cascade=CascadeType.ALL) 
	private List<Cource> cources = new ArrayList<>();

	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public List<Cource> getCources() {
		return cources;
	}

	public void setCources(List<Cource> cources) {
		this.cources = cources;
	}
	
	
	
	
	

}