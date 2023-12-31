package com.example.omnitrix.network;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="network_performance")
public class Netdata {
	@Id
	Integer sno;
	String timestamp;
	String region;
	Double bandwidth_usage;
	Double network_latency;
	Double packet_loss;
	Double jitter;
	Double bit_rate;
	Double call_setup_time;
	public Netdata() {
		super();
	}
	public Netdata(String timestamp, String region, Double bandwidth_usage, Double network_latency, Double packet_loss,
			Double jitter, Double bit_rate, Double call_setup_time) {
		super();
		this.timestamp = timestamp;
		this.region = region;
		this.bandwidth_usage = bandwidth_usage;
		this.network_latency = network_latency;
		this.packet_loss = packet_loss;
		this.jitter = jitter;
		this.bit_rate = bit_rate;
		this.call_setup_time = call_setup_time;
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Double getBandwidth_usage() {
		return bandwidth_usage;
	}
	public void setBandwidth_usage(Double bandwidth_usage) {
		this.bandwidth_usage = bandwidth_usage;
	}
	public Double getNetwork_latency() {
		return network_latency;
	}
	public void setNetwork_latency(Double network_latency) {
		this.network_latency = network_latency;
	}
	public Double getPacket_loss() {
		return packet_loss;
	}
	public void setPacket_loss(Double packet_loss) {
		this.packet_loss = packet_loss;
	}
	public Double getJitter() {
		return jitter;
	}
	public void setJitter(Double jitter) {
		this.jitter = jitter;
	}
	public Double getBit_rate() {
		return bit_rate;
	}
	public void setBit_rate(Double bit_rate) {
		this.bit_rate = bit_rate;
	}
	public Double getCall_setup_time() {
		return call_setup_time;
	}
	public void setCall_setup_time(Double call_setup_time) {
		this.call_setup_time = call_setup_time;
	}
	
	
	
	
	
	
}
