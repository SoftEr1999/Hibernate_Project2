package com.example.teacheronetomany;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity (name="Cources_Offered")
public class Cource {
	@Id
	private int cid;
	private String cname;

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

	
	
	
	
	
	

}