package com.collection.list.music.model.vo;

public class Music {
	private String title;
	private String singer;
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	public String getTitle() {
		return title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public Music() {
		super();
	}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
}
