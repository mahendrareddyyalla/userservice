package com.example.demo.model;

import java.util.Date;

public class BookingDetailsDto {
	
private long id;
	
	private long bookid;
	
	private String source;
	
	private String destination;
	
	private Date journeydate;
	
	private String username;
	
	private String status;
	
	private String busid;

    private Date createdAt;
    
    private Date updatedAt;
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getBookid() {
		return bookid;
	}

	public void setBookid(long bookid) {
		this.bookid = bookid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getJourneydate() {
		return journeydate;
	}

	public void setJourneydate(Date journeydate) {
		this.journeydate = journeydate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getBusid() {
		return busid;
	}

	public void setBusid(String busid) {
		this.busid = busid;
	}

	

	

}
