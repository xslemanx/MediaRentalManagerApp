
public class Movie extends Media {// the class who show the movies info

	String rating;// the rating of the movie ,must be DR,HR or AC

	public Movie() {// no arg constructor

		super();

	}

	public Movie(String code,String title, int numberOfCopies, String rating) {// arg constructor

		super(code,title, numberOfCopies);
		this.rating = rating;

	}

//setters and getters

	public String getRating() {

		return rating;

	}

	public void setRating(String rating) {

		this.rating = rating;

	}

//***********************************************

	@Override
	public String toString() {// to string method

		return code+" "+title + " " + numberOfCopies + " " + rating;

	}

	@Override
	public boolean equals(Media m) {// implement the abstract method

		if (this.title == ((Movie) m).title)

			return true;
		return false;

	}

}
