package com.javaex.ex05;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void setTitle(String tit) {
		title = tit;
	}
	public void setArtist(String art) {
		artist = art;
	}
	public void setAlbum(String alb) {
		album = alb;
	}
	public void setComposer(String com) {
		composer = com;
	}
	public void setYear(int yea) {
		year = yea;
	}
	public void setTrack(int tra) {
		track = tra;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	public void showInfo() {
		System.out.println(artist+", "+title+" ( "+album+", "+year+", "+track+"번 track, "+composer+" 작곡");
	}
	
}
//단축해서 쓰는방법