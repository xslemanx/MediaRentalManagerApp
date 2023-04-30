
public class Game extends Media{// the class who show the games info

	double weight;// the game weight in grams

	public Game() {// no arg constructor

		super();

	}

	public Game(String code,String title, int numberOfCopies, double weight) {// arg constructor

		super(code,title, numberOfCopies);
		this.weight = weight;
		

	}

//setters and getters

	public double getWeight() {

		return weight;

	}

	public void setWeight(double weight) {

		this.weight = weight;

	}

//***********************************************

	@Override
	public String toString() {// to string method

		return code+" "+title + " " + numberOfCopies + " " + weight;

	}

	@Override
	public boolean equals(Media m) {// implement the abstract method

		if (this.title == ((Game) m).title)

			return true;
		return false;

	}

}
