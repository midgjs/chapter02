package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song goodday = new Song();
		goodday.setTitle("좋은날");
		goodday.setArtist("아이유");
		goodday.setAlbum("Real");
		goodday.setComposer("이민수");
		goodday.setYear(2010);
		goodday.setTrack(3);
		
		Song lie = new Song();
		lie.setTitle("거짓말");
		lie.setArtist("BIGBANG");
		lie.setAlbum("Always");
		lie.setComposer("G-DRAGON");
		lie.setYear(2007);
		lie.setTrack(2);
		
		Song cherryblossomending = new Song();
		cherryblossomending.setTitle("벚꽃엔딩");
		cherryblossomending.setArtist("버스커버스커");
		cherryblossomending.setAlbum("버스커버스커1집");
		cherryblossomending.setComposer("장범준");
		cherryblossomending.setYear(2012);
		cherryblossomending.setTrack(4);
		
		goodday.showInfo();
		lie.showInfo();
		cherryblossomending.showInfo();
	}

}
//단축해서 쓰는방법