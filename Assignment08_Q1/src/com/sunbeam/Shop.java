package com.sunbeam;

public class Shop {
	
	private Book bookRef;
	private MusicAlbum  musicRef;
	private Toy toyRef;
	
	
	public Shop(Book bookRef, MusicAlbum musicRef, Toy toyRef) {
		this.bookRef = bookRef;
		this.musicRef = musicRef;
		this.toyRef = toyRef;
	}
	
	public Shop() {
		this.bookRef = null;
		this.musicRef = null;
		this.toyRef = null;
	}
	
	public  void addBook(Book bookRef) {
		this.bookRef=bookRef;
	}
	
	public void addMusic(MusicAlbum musicRef) {
		this.musicRef=musicRef;
	}
	
	public void addToy(Toy toyRef) {
		this.toyRef= toyRef;
	}

	public Book getBookRef() {
		return bookRef;
	}

	public MusicAlbum getMusicRef() {
		return musicRef;
	}

	public Toy getToyRef() {
		return toyRef;
	}
	
	

}
