package com.tutorialacademy.rest.post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties( ignoreUnknown = false )
public class PostIgnorePropertiesFalse {
	
	@JsonIgnore
	private long id = 0;
	private String title = null;
	private List<String> categories = null;
	private Date postedAt = null;	
	
	public PostIgnorePropertiesFalse() {
		id = (int) ( Math.random() * 1000 );
		this.categories = new ArrayList<String>();
		this.postedAt = new Date();
	}
	
	@JsonProperty
	public long getId() {
		return id;
	}
	
	@JsonIgnore
	public void setId( long id ) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle( String title ) {
		this.title = title;
	}
	
	@JsonProperty
	public Date getPostedAt() {
		return postedAt;
	}
	
	@JsonIgnore
	public void setPostedAt( Date postedAt ) {
		this.postedAt = postedAt;
	}
	
	public List<String> getCategories() {
		return categories;
	}
	
	public void setCategories( List<String> categories ) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", categories=" + categories + ", postedAt=" + postedAt + "]";
	}
}