
public class Album extends Media {// the class who show the albums info

	String artist;// the artist who ons the album
	String songs;// the songs that are in the album

	public Album() {// no arg constructor

		super();

	}

	public Album(String code,String title, int numberOfCopies, String artist, String songs) {// arg constructor

		super(code,title, numberOfCopies);
		this.artist = artist;
		this.songs = songs;

	}

//setters and getters

	public String getArtist() {

		return artist;

	}

	public void setArtist(String artist) {

		this.artist = artist;

	}

	public String getSongs() {

		return songs;

	}

	public void setSongs(String songs) {

		this.songs = songs;

	}

//***********************************************

	@Override
	public String toString() {// to string method

		return code+" "+title + " " + numberOfCopies + " " + artist + " " + songs;

	}

	@Override
	public boolean equals(Media m) {// implement the abstract method

		if (this.title == ((Album) m).title)

			return true;
		return false;

	}

}
