package com.example.omnitrix.serviceutil;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="service_utilization")
public class Serviceutildata {
	@Id
    @Column(name = "sno") 
	Integer sno;
	@Column(name = "date")
	String date;
	@Column(name = "timeofday")
	String timeofday;
	@Column(name = "callsmade")
	Integer callsmade;
	@Column(name = "sms")
	Integer sms;
	@Column(name = "datausage")
	Double datausage;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer Sno) {
		sno = Sno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String Date) {
		date = Date;
	}
	public String getTimeofDay() {
		return timeofday;
	}
	public void setTimeofDay(String timeofDay) {
		timeofday = timeofDay;
	}
	public Integer getCallsMade() {
		return callsmade;
	}
	public void setCallsMade(Integer callsMade) {
		callsmade = callsMade;
	}
	public Integer getSMS() {
		return sms;
	}
	public void setSMS(Integer sMS) {
		sms = sMS;
	}
	public Double getDataUsage() {
		return datausage;
	}
	public void setDataUsage(Double dataUsage) {
		datausage = dataUsage;
	}
	public Serviceutildata(Integer Sno, String Date, String timeofDay, Integer callsMade, Integer sMS,
			Double dataUsage) {
		super();
		sno = Sno;
		date = Date;
		timeofday = timeofDay;
		callsmade = callsMade;
		sms = sMS;
		datausage = dataUsage;
	}
	public Serviceutildata() {
		super();
	}
	
	
	
	

}
