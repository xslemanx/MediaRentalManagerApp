import java.util.*;

public class MediaRental implements MediaRentalInt {// the class who show the renting system

	String customerID;// customer name to add to interested and rented lists
	String mediaCode;// media title to add to interested and rented lists
	int Limited = 2;// the default value of the limited

	static ArrayList<MediaRental> customerInterestedIn = new ArrayList<MediaRental>();// an ArrayList of the media that
																						// the customer interested in
	static ArrayList<MediaRental> customerRentedIt = new ArrayList<MediaRental>();// an ArrayList of the media that the
																					// customer rented it
	static ArrayList<Customer> customersList = new ArrayList<Customer>();// a list of customers
	static ArrayList<Media> mediaList = new ArrayList<Media>();// a list of Media

	public MediaRental() {// no arg constructor
		super();
	}

	public MediaRental(String customerID, String mediaCode) {// arg constructor
		super();// calling object class no arg constructor
		this.customerID = customerID;
		this.mediaCode = mediaCode;
	}

	@Override
	public String toString() {// overriding toString method
		return customerID + " " + mediaCode;
	}

//implements the methods in the MediaRentalInt interface
	@Override
	public void addCustomer(String ID,String mobileNumber,String name, String address, String plan) {// an method to add an customer on the data base

		customersList.add(new Customer(ID,mobileNumber,name, address, plan));// add customer to the ArrayList

	}

	@Override
	public void addMovie(String code,String title, int copiesAvailable, String rating) {// add a new movie to the data base

		mediaList.add(new Movie( code,title, copiesAvailable, rating));

	}

	@Override
	public void addGame(String code,String title, int copiesAvailable, double weight) {// add a new game to the data base

		mediaList.add(new Game( code,title, copiesAvailable, weight));

	}

	@Override
	public void addAlbum(String code,String title, int copiesAvailable, String artist, String songs) {// add a new album to the data
																							// base

		mediaList.add(new Album( code,title, copiesAvailable, artist, songs));

	}

	@Override
	public void setLimitedPlanLimit(int value) {// limit setter
		this.Limited = value;
	}

	@Override
	public String getAllCustomersInfo() {// an method that print all Customers sorted info
		String result = "Customers list:\n";
		Collections.sort(customersList);// sorting the customers list by names
		for (int i = 0; i < customersList.size(); i++) {// for loop to add the customers data to the string
			result = result + " customer number " + (i + 1) + ": ID: "+customersList.get(i).ID+" mobile number: "+customersList.get(i).mobileNumber+" name:" + customersList.get(i).name + " address is: "
					+ customersList.get(i).address + "plan: " + customersList.get(i).plan + "\n";
		}
		return result;

	}

	@Override
	public String getAllMediaInfo() {// an method that print all media sorted info
		String result = "Media list:\n\n";
		Collections.sort(mediaList);// sorting media list by title
		for (int i = 0; i < mediaList.size(); i++) {// an for loop to add the media data to the string
			if (mediaList.get(i) instanceof Game) {// add the games just
				result = result + "Game: " +" code: "+ mediaList.get(i).code+ " ,title: " + mediaList.get(i).title
						+ " ,number of copies: " + mediaList.get(i).numberOfCopies + " ,weight: "
						+ ((Game) mediaList.get(i)).weight + "\n\n";
			}
			if (mediaList.get(i) instanceof Movie) {// add the movies just
				result = result + "Movie: " +" code: "+ mediaList.get(i).code+ " ,title: " + mediaList.get(i).title
						+ " ,number of copies: " + mediaList.get(i).numberOfCopies + " ,weight: "
						+ ((Movie) mediaList.get(i)).rating + "\n\n";
			}
			if (mediaList.get(i) instanceof Album) {// add the albums just
				result = result + "Album: " +" code: "+ mediaList.get(i).code+ " ,title: " + mediaList.get(i).title
						+ " ,number of copies: " + mediaList.get(i).numberOfCopies + " ,artist: "
						+ ((Album) mediaList.get(i)).artist + " ,songs: " + ((Album) mediaList.get(i)).songs + "\n\n";
			}
		}
		return result;

	}

	@Override
	public boolean addToCart(String customerID, String mediaCode) {// an method to add a media to customer ,but if
																		// the media is already added it will return
																		// false
		boolean a1 = false;
		boolean a2 = false;
		for (int i = 0; i < customersList.size(); i++) {// an for loop check all customers
			if (customersList.get(i).ID.equals(customerID)) {// if statement to check if the customer is in the data
																	// base
				a1 = true;

			}
		}
		for (int i = 0; i < mediaList.size(); i++) {// an for loop check all media
			if (mediaList.get(i).code.equals(mediaCode)) {// if statement to check if the media is in the data base
				a2 = true;

			}
		}
		if (a1 == false || a2 == false) {// if statement that return error if the customer or the media is not found in
											// the data base
			return false;
		}
		for (int i = 0; i < customerInterestedIn.size(); i++) {// loop to check all media for all customer

			if (customerInterestedIn.get(i).customerID.equals(customerID)
					&& customerInterestedIn.get(i).mediaCode.equals(mediaCode)) {// an if statement will check if the
																					// data is exists will return false
				return false;

			}
		}

		customerInterestedIn.add(new MediaRental(customerID, mediaCode));// add the media if it added yet
		return true;

	}

	@Override
	public boolean removeFromCart(String customerID, String mediaCode) {// an method to remove a media to customer
																			// ,return false if its failed

		for (int i = 0; i < customerInterestedIn.size(); i++) {// loop to check all media for all customer

			if (customerInterestedIn.get(i).customerID.equals(customerID)
					&& customerInterestedIn.get(i).mediaCode.equals(mediaCode)) {// an if statement will check if the
																					// data is exists will return false

				customerInterestedIn.remove(i);// remove the customer and media form intersting
				return true;

			}

		}
		return false;

	}

	@Override
	public String processRequests() {// a process request that will move the data form intersting to renting
		String result = "";

		Collections.sort(mediaList);//sort
		Collections.sort(customersList);//sort
		
		for (int i = 0; i < customerInterestedIn.size(); i++) {// an for loop that will check all interested data
			for (int a = 0; a < mediaList.size(); a++) {

				for (int j = 0; j < customersList.size(); j++) {// an for loop that will check all customers
					int limit = 0;
					for (int s = 0; s < customerRentedIt.size(); s++) {// an for loop that will check all rented data
						if (customerInterestedIn.get(i).customerID.equals(customerRentedIt.get(s).customerID)) {// an
																													// if
																													// statement
																													// that
																													// will
																													// rise
																													// the
																													// limit
																													// by
		                    																						// one
							limit++;
						}

					}
					if (customerInterestedIn.get(i).customerID.equals(customersList.get(j).ID)
							&& customerInterestedIn.get(i).mediaCode.equals(mediaList.get(a).code)) {// if that will
																										// check if the
																										// name and
																										// media title
																										// is equal
						
						if (mediaList.get(a).numberOfCopies <= 0) {// an if that will return the problem of no copies
																	// available
						}
						if (customersList.get(j).plan.equals("UNLIMITED") && mediaList.get(a).numberOfCopies > 0
								&& customerRentedIt.contains(customerInterestedIn.get(i)) == false) {// an if statement
																										// that will
																										// check if the
																										// plan is
																										// UNLIMITED and
																										// if there is
																										// copies
																										// available and
																										// if the
																										// customer
																										// isn't rent
																										// the media
																										// before
							mediaList.get(a).numberOfCopies--;// remove the copy that rented
							customerRentedIt.add(customerInterestedIn.get(i));// add the data from intersting to renting

						}
						if (customersList.get(j).plan.equals("LIMITED") && limit >= Limited) {// an if statement that
																								// will check if the
																								// plan i LIMITED and if
																								// the customer are
																								// below the limit

							continue;
						} else if (customersList.get(j).plan.equals("LIMITED") && mediaList.get(a).numberOfCopies > 0
								&& limit < Limited && customerRentedIt.contains(customerInterestedIn.get(i)) == false) {// an
																														// if
																														// statement
																														// that
																														// will
																														// check
																														// if
																														// the
																														// plan
																														// is
																														// LIMITED
																														// and
																														// if
																														// there
																														// is
																														// copies
																														// available
																														// and
																														// if
																														// the
																														// customer
																														// is
																														// below
																														// the
																														// limit
																														// and
																														// the
																														// customer
																														// isn't
																														// rented
																														// this
																														// media
																														// before
							customerRentedIt.add(customerInterestedIn.get(i));// adding from interesting to renting
							mediaList.get(a).numberOfCopies--;// remove the copy that rent
							limit++;// rise the limit by one


						}

					}

				}
			}
		}
		for (int i = 0; i < customerInterestedIn.size(); i++) {// an for loop that will remove the data from interesting
																// to renting
			if (customerRentedIt.contains(customerInterestedIn.get(i))) {
				customerInterestedIn.remove(i);
			}

		}
		for (int i = 0; i < customerInterestedIn.size(); i++) {// an for loop that will remove the data from interesting
																// to renting
			if (customerRentedIt.contains(customerInterestedIn.get(i))) {
				customerInterestedIn.remove(i);
			}

		}
		for (int i = 0; i < customerInterestedIn.size(); i++) {// an for loop that will remove the data from interesting
																// to renting
			if (customerRentedIt.contains(customerInterestedIn.get(i))) {
				customerInterestedIn.remove(i);
			}

		}
		for (int i = 0; i < customerInterestedIn.size(); i++) {// an for loop that will remove the data from interesting
																// to renting
			if (customerRentedIt.contains(customerInterestedIn.get(i))) {
				customerInterestedIn.remove(i);
			}

		}

		for (int x = 0; x < customerRentedIt.size(); x++) {// adding the media that rented to the string
			String temp1="",temp2="";

			for(int i=0;i<customersList.size();i++) {
				for(int j=0;j<customerRentedIt.size();j++) {
					if(customersList.get(i).ID.equals(customerRentedIt.get(j).customerID)) {
						temp1=customersList.get(i).name;
				}
				
			}
			}
			for(int i=0;i<mediaList.size();i++) {
				for(int j=0;j<customerRentedIt.size();j++) {
				if(mediaList.get(i).code.equals(customerRentedIt.get(j).mediaCode)) {
					 temp2=mediaList.get(i).title;
				}
			}
			}
			result = result + ("Sending [" + temp2 + "]  to  ["
					+ temp1 + "]\n");
		}

		return result;
	}

	@Override
	public boolean returnMedia(String customerID, String mediaCode) {// an method that will
		for (int i = 0; i < customersList.size(); i++) {// an for loop that will check all customers
			for (int j = 0; j < mediaList.size(); j++) {// an for loop that will check all media
				if (customerID.equals(customersList.get(i).ID) && mediaCode.equals(mediaList.get(j).code)) {// if
																													// statement
																													// what
																													// will
																													// check
																													// the
																													// customer
																													// and
																													// the
																													// title
																													// and
																													// rise
																													// the
																													// number
																													// of
																													// copies
																													// by
																													// one

					mediaList.get(j).numberOfCopies++;

				}
			}
		}
		MediaRental m1 = new MediaRental(customerID, mediaCode);// not urgent but to make the statement shorter
		for (int i = 0; i < customerRentedIt.size(); i++) {// an for loop that will check all rented data

			if (m1.customerID.equals(customerRentedIt.get(i).customerID)
					&& m1.mediaCode.equals(customerRentedIt.get(i).mediaCode)) {// if statement will check if the
				customerRentedIt.remove(m1);// remove from renting
				customerInterestedIn.remove(m1);// remove from interesting
				
				return true;
			}
		}
		return false;
	}

	public ArrayList<String> searchMedia(String title, String rating, String artist, String song) {// method will search
																									// for some media
																									// and return it's
																									// title
		String[] a = { title, rating, artist, song };// array store the data
		ArrayList<String> mediaTitles = new ArrayList<String>();// array list to store data and return it
		for (int i = 0; i < a.length; i++) {// for loop will check all data added
			if (a[i] != null) {// if it's not null , it's will include in the search
				if (i == 0) {// title search
					for (int j = 0; j < mediaList.size(); j++) {// check all media
						if (title.equals(mediaList.get(j).title)) {// if statement will check if the title is equal
							if (mediaList.get(j) instanceof Game) {// check if it's game
								mediaTitles.add("game: " + mediaList.get(j).title);
							}
							if (mediaList.get(j) instanceof Movie) {// check if it's movie
								mediaTitles.add("movie: " + mediaList.get(j).title);
							}
							if (mediaList.get(j) instanceof Album) {// check if it's album
								mediaTitles.add("album: " + mediaList.get(j).title);
							}
						}
					}
				}
				if (i == 1) {// raring search
					for (int j = 0; j < mediaList.size(); j++) {// check all media
						if (mediaList.get(j) instanceof Movie)// check if it's a movie
							if (rating.equals(((Movie) mediaList.get(j)).rating)) {// if statement will check if the
																					// title is equal
								mediaTitles.add("movie: " + ((Movie) mediaList.get(j)).title);
							}
					}
				}
				if (i == 2) {
					for (int j = 0; j < mediaList.size(); j++) {// check all media
						if (mediaList.get(j) instanceof Album)// check if it's an album
							if (artist.equals(((Album) mediaList.get(j)).artist)) {// if statement will check if the
																					// title is equal
								mediaTitles.add("album: " + ((Album) mediaList.get(j)).title);
							}
					}
				}
				if (i == 3) {
					for (int j = 0; j < mediaList.size(); j++) {// check all media
						if (mediaList.get(j) instanceof Album)// check if it's an album
							if (((Album) mediaList.get(j)).songs.indexOf(song) != -1) {// if statement will check if the
																						// title is equal
								mediaTitles.add("album: " + ((Album) mediaList.get(j)).title);
							}
					}
				}
			}
		}
		if (a[0] == null && a[1] == null && a[2] == null && a[3] == null) {// check if it's all null
			for (int i = 0; i < mediaList.size(); i++) {// check all media
				mediaTitles.add(mediaList.get(i).title);
			}
		}

		return mediaTitles;
	}

//*******************************************************************

	@Override
	public boolean equals(Object obj) {// overriding the equals method

		if (this.customerID == ((MediaRental) obj).customerID && this.mediaCode == ((MediaRental) obj).mediaCode)

			return true;
		return false;

	}



}
