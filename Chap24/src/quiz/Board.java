package quiz;

import java.io.Serializable;

public class Board implements Serializable {
	private int bno;
	private String title;
	private String singer;
	private String album;
	private String date;
	
	public Board(int bno, String title, String singer, String album, String date) {
		this.bno = bno;
		this.title = title;
		this.singer = singer;
		this.album = album;
		this.date = date;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}