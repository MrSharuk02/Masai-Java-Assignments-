package com.Day11;

import java.util.Objects;
import java.util.*;

class Song{
	private String movieName;
	private String songName;
	
	public Song(String movieName,String songName) {
		this.movieName = movieName;
		this.songName = songName;
	}
	
	@Override
	public boolean equals(Object o) {
		Song s = (Song) o;
		return Objects.equals(movieName, s.movieName) && Objects.equals(songName, s.songName);
	}
	
	public int hashCode() {
		return Objects.hash(movieName,songName);
	}
	
	public void play() {
		System.out.println(movieName+" of "+songName+" is playing...!");
	}
}

class PlayList{
	
	public List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		if(songs.contains(song)) {
			System.out.println("Song is already added in the playlist");
		}
		else {
			songs.add(song);
			System.out.println("Song added to the playlist successfully.");
		}
		
	}
//	List<Song> getSongs(){
//		return songs;
//	}
}
class Q1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlayList p = new PlayList();
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Enter the movie name "+""+(i+1)+": ");
			String movie = sc.nextLine();
			System.out.println("Enter the song name "+""+(i+1)+": ");
			String song = sc.nextLine();
			Song s = new Song(movie,song);
			p.addSong(s);
		}
		
//		List<Song> ss = p.getSongs();
		
		for(Song i: p.songs) {
			i.play();
		}
		
		sc.close();
		
	}
	
}