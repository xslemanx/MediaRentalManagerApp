import java.util.*;

public abstract class Media extends MediaRental implements Comparable<Media> {// the class who show media info
	String code;
	String title;// the title of the media type
	int numberOfCopies;// number of copies available

	public Media() {// no arg constructor

		super();

	}

	public Media(String customerName, String mediaTitle) {

		super(customerName, mediaTitle);

	}

	public Media(String code,String title, int numberOfCopies) {// arg constructor

		super();
		this.code=code;
		this.title = title;
		this.numberOfCopies = numberOfCopies;

	}

//setters and getters

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getTitle() {

		return title;
	}


	public void setTitle(String title) {

		this.title = title;
	}

	public int getNumberOfCopies() {

		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {

		this.numberOfCopies = numberOfCopies;
	}

//***********************************************

	@Override
	public String toString() {
		return   code + " " + title + " " + numberOfCopies ;
	}


	@Override
	public int compareTo(Media m) {// overriding the compareTo method

		return (this.title.compareToIgnoreCase(m.getTitle()));
	}



	public abstract boolean equals(Media m);// declare an abstract equals method

}
