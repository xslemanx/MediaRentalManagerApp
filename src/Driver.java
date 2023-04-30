
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

import org.w3c.dom.stylesheets.MediaList;

public class Driver {
	public static MediaRental medRen = new MediaRental();// creating an global object


	
	public static boolean isCustomerExist(String id) {//method that will check if the customer is in database
		boolean a = false;
		for (int i = 0; i < MediaRental.customersList.size(); i++) {
			if (MediaRental.customersList.get(i).ID.equals(id) == true) {// will check if the customer is added													// before
				a = true;
			}
		}
		return a;
	}
	
	public static boolean isMediaExistAnyType(String code) {//method that will check if the media is in database for any type
		boolean a=false;
		for(int i=0;i<MediaRental.mediaList.size();i++) {
			if(MediaRental.mediaList.get(i).code.equals(code)) {
				a=true;
			}
		}
		return a;
	}
	
	public static boolean isAdded(String id,String code) {//method that will check if this media is added to interested to this customer
		boolean a=false;
		for(int i=0;i<MediaRental.customerInterestedIn.size();i++) {
			if(MediaRental.customerInterestedIn.get(i).customerID.equals(id)&&MediaRental.customerInterestedIn.get(i).mediaCode.equals(code)) {
				a=true;
			}
		}
		return a;
	}

	public static boolean isRented(String id,String code) {//method that will check if this media is added to rented to this customer
		boolean a=false;
		for(int i=0;i<MediaRental.customerRentedIt.size();i++) {
			if(MediaRental.customerRentedIt.get(i).customerID.equals(id)&&MediaRental.customerRentedIt.get(i).mediaCode.equals(code)) {
				a=true;
			}
		}
		return a;
	}
	
	public static boolean isMediaExist(int type,String code) {//method that will check if the media is in database
		boolean a = false;
		if (type==2) {
		for (int i = 0; i < MediaRental.mediaList.size(); i++) {
			if( MediaRental.mediaList.get(i) instanceof Movie) {
			if (MediaRental.mediaList.get(i).code.equals(code) == true) {// will check if the media is added													// before
				a = true;
			}
			}
		}
		}
		if (type==3) {
			for (int i = 0; i < MediaRental.mediaList.size(); i++) {
				if( MediaRental.mediaList.get(i) instanceof Game) {
					if (MediaRental.mediaList.get(i).code.equals(code) == true) {// will check if the media is added													// before
						a = true;
					}
				}
			}
		}
			if (type==4) {
				for (int i = 0; i < MediaRental.mediaList.size(); i++) {
					if( MediaRental.mediaList.get(i) instanceof Album) {
						if (MediaRental.mediaList.get(i).code.equals(code) == true) {// will check if the media is added													// before
							a = true;
						}
					}
				}
		
		
		}
		return a;
	}

	public static String interstedPrint(String id) {//method that will return a string of all interested media for an customer
		String result="";
		for(int i=0;i<MediaRental.customerInterestedIn.size();i++) {
			if(MediaRental.customerInterestedIn.get(i).customerID.equals(id)) {
				for(int j=0;j<MediaRental.mediaList.size();j++) {
					if(MediaRental.customerInterestedIn.get(i).mediaCode.equals(MediaRental.mediaList.get(j).code)) {
						result=result+MediaRental.mediaList.get(j).title+"\n";
					}
				}
			}
		}
		
		if(result.equals("")) {
			result="no intersted media";
		}
		return result;
	}
	
	public static String RentedPrint(String id) {//method that will return a string of all rented media for an customer
		String result="";
		for(int i=0;i<MediaRental.customerRentedIt.size();i++) {
			if(MediaRental.customerRentedIt.get(i).customerID.equals(id)) {
				for(int j=0;j<MediaRental.mediaList.size();j++) {
					if(MediaRental.customerRentedIt.get(i).mediaCode.equals(MediaRental.mediaList.get(j).code)) {
						result=result+MediaRental.mediaList.get(j).title+"\n";
					}
				}
			}
		}
		
		
		
		if(result.equals("")) {
			result="no rented media";
		}
		return result;
	}
	
	public static void testAddingCustomers(String id,String mobile,String name,String address,String plan) {//method that will add a customer to database and to the file

		boolean a = false;
		for (int i = 0; i < MediaRental.customersList.size(); i++) {
			if (MediaRental.customersList.get(i).ID.equals(id) == true) {// will check if the customer is added
																				// before
				a = true;
			}
		}
		if (a == false) {// if the customer isn't added will add him to the array list
			MediaRental.customersList.add(new Customer(id,mobile,name, address, plan));// add customer to the ArrayList
		} else {
		}
		if (a == false) {// change the data in the file
			try {// exception handling

				FileWriter customers1 = new FileWriter(new File("customerData.txt"), true);
				PrintWriter customers = new PrintWriter(customers1);
				customers.println(id+" "+mobile+" "+name + " " + address + " " + plan);// add the customer to the file
				customers.close();

			} catch (Exception ex) {
				System.out.println(ex);
			}
		}

	}
	
	public static void testRemovingCustomers(String ID) {//method that will remove a customer form database and from the file

		ArrayList<Customer> removal=new ArrayList<Customer>();//to add all customers expect the customer i need to remove
		for(int i=0;i<MediaRental.customersList.size();i++) {//check all customers
			if(ID.equals(MediaRental.customersList.get(i).ID)) {//if equal
				MediaRental.customersList.remove(i);//remove it
				try {//exception handling
					File customerInfo = new File("customerData.txt");
					Scanner customerScan = new Scanner(customerInfo);
					while (customerScan.hasNext()) {//read all data from the file
						String id=customerScan.next();
						String mobile=customerScan.next();
						String name = customerScan.next();
						String address = customerScan.next();
						String plan = customerScan.next();
						if(id.equals(ID)==false) {//add all customers if ID not equal
							removal.add(new Customer(id,mobile,name, address, plan));
						}
						File file = new File("customerData.txt");
						PrintWriter printWrite = new PrintWriter(file);
						printWrite.print("");//to remove all data from the file
					}

				} catch (Exception ex) {
					System.out.println(ex);//print the exception
				}
				try {//handle exception
					for(int j=0;j<removal.size();j++) {//to add the new data to the file
						FileWriter customer1 = new FileWriter(new File("customerData.txt"), true);
						PrintWriter customer2 = new PrintWriter(customer1);
						customer2.println(removal.get(j).ID+" "+ removal.get(j).mobileNumber + " " + removal.get(j).name + " " + removal.get(j).address + " " + removal.get(j).plan);
						customer2.close();
					}
					removal.clear();
				}
				catch(Exception ex) {
					System.out.println(ex);//print exception
				}
			}
		}
	}
	
	public static void testUpdateCustomers(String id,String mobile,String name,String address,String plan) {//to update an customer data
		ArrayList<Customer> removal=new ArrayList<Customer>();//to add all the data excpect the one i need to update his data
		for(int i=0;i<MediaRental.customersList.size();i++) {//check all customers
			if(id.equals(MediaRental.customersList.get(i).ID)) {//if id is equal
				MediaRental.customersList.get(i).mobileNumber=mobile;
				MediaRental.customersList.get(i).name=name;
				MediaRental.customersList.get(i).address=address;
				MediaRental.customersList.get(i).plan=plan;
				
				try {//exception handling
					File customerInfo = new File("customerData.txt");
					Scanner customerScan = new Scanner(customerInfo);
					while (customerScan.hasNext()) {//read all data from the file
						String ID=customerScan.next();
						String Mobile=customerScan.next();
						String Name = customerScan.next();
						String Address = customerScan.next();
						String Plan = customerScan.next();
						if(id.equals(ID)==false) {//add if not equal
						removal.add(new Customer(ID,Mobile,Name, Address, Plan));
						}
						if(id.equals(ID)==true) {//of equal update the data
							removal.add(new Customer(id,mobile,name, address, plan));
							}
					}
					File file = new File("customerData.txt");
					PrintWriter printWrite = new PrintWriter(file);
					printWrite.print("");//remove all file data
					try {//exception handling
						for(int j=0;j<removal.size();j++) {//add all the new data
							FileWriter customer1 = new FileWriter(new File("customerData.txt"), true);
							PrintWriter customer2 = new PrintWriter(customer1);
							customer2.println(removal.get(j).ID+" "+ removal.get(j).mobileNumber + " " + removal.get(j).name + " " + removal.get(j).address + " " + removal.get(j).plan);
							customer2.close();
						}
					}
					catch(Exception ex) {
						System.out.println(ex);
					}
					
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		}
	}


	public static String [] testFindCustomer(String ID) {//to search for an customer data by his id
		String a []=new String [3];
		for(int i=0;i<MediaRental.customersList.size();i++) {
			if(ID.equals(MediaRental.customersList.get(i).ID)) {
				a[0]=MediaRental.customersList.get(i).mobileNumber;
				a[1]=MediaRental.customersList.get(i).name;
				a[2]=MediaRental.customersList.get(i).address;
				
				
			}
		}
		return a;
	}

	public static String[] testFindMedia(int operation, String Code) {//to find a media data by it's code
		String a[] = new String[4];
		for (int i = 0; i < MediaRental.mediaList.size(); i++) {
			if (operation == 2) {
				if (MediaRental.mediaList.get(i) instanceof Movie) {
					if (Code.equals(MediaRental.mediaList.get(i).code)) {
						a[0] = MediaRental.mediaList.get(i).title;
						a[1] = MediaRental.mediaList.get(i).numberOfCopies + "";
						a[2] = ((Movie) MediaRental.mediaList.get(i)).rating;
						a[3]="";

					}
				}
			}
			if (operation == 3) {
				if (MediaRental.mediaList.get(i) instanceof Game) {
					if (Code.equals(MediaRental.mediaList.get(i).code)) {
						a[0] = MediaRental.mediaList.get(i).title;
						a[1] = MediaRental.mediaList.get(i).numberOfCopies + "";
						a[2] = ((Game) MediaRental.mediaList.get(i)).weight+"";
						a[3]="";

					}
				}
			}
			if (operation == 4) {
				if (MediaRental.mediaList.get(i) instanceof Album) {
					if (Code.equals(MediaRental.mediaList.get(i).code)) {
						a[0] = MediaRental.mediaList.get(i).title;
						a[1] = MediaRental.mediaList.get(i).numberOfCopies + "";
						a[2] = ((Album) MediaRental.mediaList.get(i)).artist;
						a[3] = ((Album) MediaRental.mediaList.get(i)).songs;
						

					}
				}
			}
		}
		return a;
	}
	public static void testAddingMedia(int operation,String code,String title,int number,String rating,double weight,String artist,String songs) {//to add an media to customer intersted

		if (operation == 2) {// if movie

			boolean a = false;
			for (int i = 0; i < MediaRental.mediaList.size(); i++) {// check all media
				
				if (MediaRental.mediaList.get(i).code.equals(code) == true) {// check if the movie is added before
					a = true;
				}
			}
			if (a == false) {// if isn't added will add it
				MediaRental.mediaList.add(new Movie(code,title, number, rating));// add movie to the ArrayList
			} else {
			}
			if (a == false) {// add the movie to the file
				try {// exception handling
					FileWriter movie1 = new FileWriter(new File("mediaData.txt"), true);
					PrintWriter movie2 = new PrintWriter(movie1);
					movie2.println("Movie " +code+" "+ title + " " + number + " " + rating);
					movie2.close();
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		}
		if (operation == 3) {// if game

			boolean a = false;
			for (int i = 0; i < MediaRental.mediaList.size(); i++) {// check all media
				if (MediaRental.mediaList.get(i).code.equals(code) == true) {// check if the game is added before
					a = true;
				}
			}
			if (a == false) {// if isn't added will add it
				MediaRental.mediaList.add(new Game(code,title, number, weight));// add movie to the ArrayList
			} else {
			}
			if (a == false) {// add the game to the file
				try {// exception handling
					FileWriter game1 = new FileWriter(new File("mediaData.txt"), true);
					PrintWriter game2 = new PrintWriter(game1);
					game2.println("Game " +code+" "+ title + " " + number + " " + weight);
					game2.close();
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		}
		if (operation == 4) {// if album

			boolean a = false;
			for (int i = 0; i < MediaRental.mediaList.size(); i++) {// check all media
				if (MediaRental.mediaList.get(i).code.equals(code) == true) {// check if the album is added before
					a = true;
				}
			}
			if (a == false) {
				MediaRental.mediaList.add(new Album(code,title, number, artist, songs));// add album to the ArrayList
			} else {
			}
			if (a == false) {// add the album to the file

				try {// exception handling
					FileWriter album1 = new FileWriter(new File("mediaData.txt"), true);
					PrintWriter album2 = new PrintWriter(album1);
					album2.println("Album " +code+" "+ title + " " + number + " " + artist + " " + songs);
					album2.close();
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		}
	}

	public static void testDeleteMedia(int operation,String Code) {//to delete a media from database and from file
		ArrayList<Media> removal=new ArrayList<Media>();//to add all media excpect the one i need to delete
		if(operation==2||operation==3||operation==4) {//for all media
			
			for(int i=0;i<MediaRental.mediaList.size();i++) {//for all media
				if(Code.equals(MediaRental.mediaList.get(i).code)) {//if equal
					MediaRental.mediaList.remove(i);//delete
					try {//exception handle
						File mediaInfo = new File("mediaData.txt");
						Scanner mediaScan = new Scanner(mediaInfo);
						while (mediaScan.hasNext()) {//read all media data
							String mediaType = mediaScan.next();
							mediaType = mediaType.trim();
							if (mediaType.equals("Game")) {//if game
								String code=mediaScan.next();
								String title = mediaScan.next();
								int number = mediaScan.nextInt();
								double weight = mediaScan.nextDouble();
								if(code.equals(Code)==false) {//dont add if equal
								removal.add(new Game(code,title, number, weight));
								}
							}
							if (mediaType.equals("Album")) {//if album
								String code=mediaScan.next();
								String title = mediaScan.next();
								int number = mediaScan.nextInt();
								String artist = mediaScan.next();
								String songs = mediaScan.next();
								if(code.equals(Code)==false) {//don't add if equal
								removal.add(new Album(code,title, number, artist, songs));
								}
							}
							if (mediaType.equals("Movie")) {//if movie
								String code=mediaScan.next();
								String title = mediaScan.next();
								int number = mediaScan.nextInt();
								String rating = mediaScan.next();
								if(code.equals(Code)==false) {//don't add if equal
								removal.add(new Movie(code,title, number, rating));
								}
							}
						}
					} catch (Exception ex) {
						System.out.println(ex);
						
					}
					try {
						PrintWriter data2 = new PrintWriter(new File("mediaData.txt"));
						data2.println("");//remove all data
						data2.close();
					}
					catch (Exception e) {
						System.out.println(e);
					}

				}
			}
			try {// exception handling
				for(int k=0;k<removal.size();k++) {//to add the new data
					if(removal.get(k)instanceof Album) {//if album
				FileWriter album1 = new FileWriter(new File("mediaData.txt"), true);
				PrintWriter album2 = new PrintWriter(album1);
				album2.println("Album " +removal.get(k).code+" "+ removal.get(k).title + " " + removal.get(k).numberOfCopies + " " + ((Album)removal.get(k)).artist + " " + ((Album)removal.get(k)).songs);
				album2.close();
					}
					if(removal.get(k)instanceof Game) {//if game
				FileWriter game1 = new FileWriter(new File("mediaData.txt"), true);
				PrintWriter game2 = new PrintWriter(game1);
				game2.println("Game " +removal.get(k).code+" "+ removal.get(k).title + " " + removal.get(k).numberOfCopies + " " + ((Game)removal.get(k)).weight );
				game2.close();
					}
					if(removal.get(k)instanceof Movie) {//if movie
				FileWriter movie1 = new FileWriter(new File("mediaData.txt"), true);
				PrintWriter movie2 = new PrintWriter(movie1);
				movie2.println("Movie " +removal.get(k).code+" "+ removal.get(k).title + " " + removal.get(k).numberOfCopies + " " + ((Movie)removal.get(k)).rating);
				movie2.close();
					}
				}
				
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
		
		
		
	}

	public static void testUpdateMedia(int operation,String Code,String Title,int Number,String Rating,double Weight,String Artist,String Songs) {//to update an media data
		if(operation==2) {//if movie
			for(int j=0;j<MediaRental.mediaList.size();j++) {//all media
				if(MediaRental.mediaList.get(j).code.equals(Code)) {//if equal change to new data
					MediaRental.mediaList.get(j).title=Title;
					MediaRental.mediaList.get(j).numberOfCopies=Number;
					((Movie)MediaRental.mediaList.get(j)).rating=Rating;
				}
			}
		}
		
		if(operation==3) {//if game
			for(int j=0;j<MediaRental.mediaList.size();j++) {//all media
				if(MediaRental.mediaList.get(j).code.equals(Code)) {//if equal change to new data
					MediaRental.mediaList.get(j).title=Title;
					MediaRental.mediaList.get(j).numberOfCopies=Number;
					((Game)MediaRental.mediaList.get(j)).weight=Weight;
				}
			}
		}
		
		if(operation==4) {//if album
			for(int j=0;j<MediaRental.mediaList.size();j++) {//all media
				if(MediaRental.mediaList.get(j).code.equals(Code)) {//if equal change to the new data
					MediaRental.mediaList.get(j).title=Title;
					MediaRental.mediaList.get(j).numberOfCopies=Number;
					((Album)MediaRental.mediaList.get(j)).artist=Artist;
					((Album)MediaRental.mediaList.get(j)).songs=Songs;
				}
			}
		}
		
		if(operation==2||operation==3||operation==4) {
			
			for(int i=0;i<MediaRental.mediaList.size();i++) {//to add the new data
				if(Code.equals(MediaRental.mediaList.get(i).code)) {//if equal

					try {
						PrintWriter data2 = new PrintWriter(new File("mediaData.txt"));
						data2.println("");//remove all data
						data2.close();
					}
					catch (Exception e) {
						System.out.println(e);
					}

				}
			}
			try {// exception handling
				for(int k=0;k<MediaRental.mediaList.size();k++) {//to add new data to the file
					if(MediaRental.mediaList.get(k)instanceof Album) {//if album
				FileWriter album1 = new FileWriter(new File("mediaData.txt"), true);
				PrintWriter album2 = new PrintWriter(album1);
				album2.println("Album " +MediaRental.mediaList.get(k).code+" "+ MediaRental.mediaList.get(k).title + " " + MediaRental.mediaList.get(k).numberOfCopies + " " + ((Album)MediaRental.mediaList.get(k)).artist + " " + ((Album)MediaRental.mediaList.get(k)).songs);
				album2.close();
					}
					if(MediaRental.mediaList.get(k) instanceof Game) {//if game
				FileWriter game1 = new FileWriter(new File("mediaData.txt"), true);
				PrintWriter game2 = new PrintWriter(game1);
				game2.println("Game " +MediaRental.mediaList.get(k).code+" "+ MediaRental.mediaList.get(k).title + " " + MediaRental.mediaList.get(k).numberOfCopies + " " + ((Game)MediaRental.mediaList.get(k)).weight );
				game2.close();
					}
					if(MediaRental.mediaList.get(k) instanceof Movie) {//if movie
				FileWriter movie1 = new FileWriter(new File("mediaData.txt"), true);
				PrintWriter movie2 = new PrintWriter(movie1);
				movie2.println("Movie " +MediaRental.mediaList.get(k).code+" "+ MediaRental.mediaList.get(k).title + " " + MediaRental.mediaList.get(k).numberOfCopies + " " + ((Movie)MediaRental.mediaList.get(k)).rating);
				movie2.close();
					}
				}
				
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
		
		
		
	}
	
	public static void testingAddingToCart(String id,String code) {//to add media to customer interested

		if (medRen.addToCart(id, code) == true) {// check if it's able to add ,add if yes
			try {// exception handling
				FileWriter intrested1 = new FileWriter(new File("mediaIntersted.txt"), true);
				PrintWriter intrested2 = new PrintWriter(intrested1);
				intrested2.println(id + " " + code);//add the media to file
				intrested2.close();
			} catch (Exception ex) {
				System.out.println(ex);
			}

		}

	}

	public static void testingRemovingFromCart(String id,String code) {//to remove media from customer interested
		ArrayList<MediaRental> remove = new ArrayList<MediaRental>();//to add all intersted excpect the one i need to remove
		if (medRen.removeFromCart(id, code) == true) {// check if it's able to remove and remove it
			try {// exception handling
				File file = new File("mediaIntersted.txt");
				Scanner scan = new Scanner(file);
				while (scan.hasNext()) {// read all data
					String id1 = scan.next();
					String code1 = scan.next();
					remove.add(new MediaRental(id1, code1));// add the data to the array list
				}
			} catch (Exception ex) {

			}
			for (int i = 0; i < remove.size(); i++) {// check all data added from the file
				if (remove.get(i).customerID.equals(id) && remove.get(i).mediaCode.equals(code)) {// look for the
																										// media i need
																										// to remove
					remove.remove(i);// remove it
				}
			}
			try {// exception handling
					// this code to over write a new data in interesting after removing
				File file = new File("mediaIntersted.txt");
				PrintWriter printWrite = new PrintWriter(file);
				printWrite.print("");// remove all data in the file
				for (int i = 0; i < remove.size(); i++) {// to add the new data to the file
					FileWriter intrested1 = new FileWriter(new File("mediaIntersted.txt"), true);
					PrintWriter intrested2 = new PrintWriter(intrested1);
					intrested2.println(remove.get(i).customerID + " " + remove.get(i).mediaCode);
					intrested2.close();

				}
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
	}

	public static void testProcessingRequestsOne() {// print all data before processing
		System.out.println("intersted:");
		for (int i = 0; i < MediaRental.customerInterestedIn.size(); i++) {// print the interested data
			for(int j=0;j<MediaRental.mediaList.size();j++) {
				for(int k=0;k<MediaRental.customersList.size();k++) {
					if(MediaRental.customerInterestedIn.get(i).customerID.equals(MediaRental.customersList.get(k).ID)&&MediaRental.customerInterestedIn.get(i).mediaCode.equals(MediaRental.mediaList.get(j).code)) {
//						System.out.println(MediaRental.customersList.get(k).name+" "+MediaRental.mediaList.get(j).title);
						//no console in phase 2
					}
				}
			}
		}
		System.out.println("\nrented:");
		for (int i = 0; i < MediaRental.customerRentedIt.size(); i++) {// print the rented data
			for(int j=0;j<MediaRental.mediaList.size();j++) {
				for(int k=0;k<MediaRental.customersList.size();k++) {
					if(MediaRental.customerRentedIt.get(i).customerID.equals(MediaRental.customersList.get(k).ID)&&MediaRental.customerRentedIt.get(i).mediaCode.equals(MediaRental.mediaList.get(j).code)) {
//						System.out.println(MediaRental.customersList.get(k).name+" "+MediaRental.mediaList.get(j).title);
						//no console in phase 2
					}
				}
			}
		}
	}

	public static void testProcessingRequestsTow() {// will show data after processing
		medRen.processRequests();// call the method
		
		for (int i = 0; i < MediaRental.customerInterestedIn.size(); i++) {// print the interested data
			for(int j=0;j<MediaRental.mediaList.size();j++) {
				for(int k=0;k<MediaRental.customersList.size();k++) {
					if(MediaRental.customerInterestedIn.get(i).customerID.equals(MediaRental.customersList.get(k).ID)&&MediaRental.customerInterestedIn.get(i).mediaCode.equals(MediaRental.mediaList.get(j).code)) {
//						System.out.println(MediaRental.customersList.get(k).name+" "+MediaRental.mediaList.get(j).title);
						//no console in phase 2
					}
				}
			}
		}

		for (int i = 0; i < MediaRental.customerRentedIt.size(); i++) {// print the rented data
			for(int j=0;j<MediaRental.mediaList.size();j++) {
				for(int k=0;k<MediaRental.customersList.size();k++) {
					if(MediaRental.customerRentedIt.get(i).customerID.equals(MediaRental.customersList.get(k).ID)&&MediaRental.customerRentedIt.get(i).mediaCode.equals(MediaRental.mediaList.get(j).code)) {
//						System.out.println(MediaRental.customersList.get(k).name+" "+MediaRental.mediaList.get(j).title);
						//no console in phase 2
					}
				}
			}
		}
		try {// exception handling
			File file = new File("mediaIntersted.txt");
			PrintWriter printWrite = new PrintWriter(file);
			printWrite.print("");// remove all data
			for (int i = 0; i < MediaRental.customerInterestedIn.size(); i++) {// add the new data
				FileWriter intrested1 = new FileWriter(new File("mediaIntersted.txt"), true);
				PrintWriter intrested2 = new PrintWriter(intrested1);
				intrested2.println(MediaRental.customerInterestedIn.get(i).customerID + " "
						+ MediaRental.customerInterestedIn.get(i).mediaCode);
				intrested2.close();

			}
		} catch (Exception ex) {
			System.out.println("there is somthing error please make sure and try again");
		}
		try {// exception handling
			File file = new File("mediaRented.txt");
			PrintWriter printWrite = new PrintWriter(file);
			printWrite.print("");// remove all data
			for (int i = 0; i < MediaRental.customerRentedIt.size(); i++) {// add the new data
				FileWriter rented1 = new FileWriter(new File("mediaRented.txt"), true);
				PrintWriter rented2 = new PrintWriter(rented1);
				rented2.println(MediaRental.customerRentedIt.get(i).customerID + " "
						+ MediaRental.customerRentedIt.get(i).mediaCode);
				rented2.close();

			}
		} catch (Exception ex) {
			System.out.println("there is somthing error please make sure and try again");
		}
		try {// exception handling
			File file = new File("mediaData.txt");
			PrintWriter printWrite = new PrintWriter(file);
			printWrite.print("");// remove all data
			for (int i = 0; i < MediaRental.mediaList.size(); i++) {// add the new data
				FileWriter media1 = new FileWriter(new File("mediaData.txt"), true);
				PrintWriter media2 = new PrintWriter(media1);
				if (MediaRental.mediaList.get(i) instanceof Game)
					media2.println("Game " + MediaRental.mediaList.get(i).code + " "+ MediaRental.mediaList.get(i).title + " "
							+ MediaRental.mediaList.get(i).numberOfCopies + " "
							+ ((Game) MediaRental.mediaList.get(i)).weight);
				if (MediaRental.mediaList.get(i) instanceof Movie)
					media2.println("Movie "+ MediaRental.mediaList.get(i).code + " " + MediaRental.mediaList.get(i).title + " "
							+ MediaRental.mediaList.get(i).numberOfCopies + " "
							+ ((Movie) MediaRental.mediaList.get(i)).rating);
				if (MediaRental.mediaList.get(i) instanceof Album)
					media2.println("Album " + MediaRental.mediaList.get(i).code + " "+ MediaRental.mediaList.get(i).title + " "
							+ MediaRental.mediaList.get(i).numberOfCopies + " "
							+ ((Album) MediaRental.mediaList.get(i)).artist + " "
							+ ((Album) MediaRental.mediaList.get(i)).songs);
				media2.close();

			}
		} catch (Exception ex) {
			System.out.println("there is somthing error please make sure and try again");
		}
	}

	public static void testReturnMedia(String id,String code) {//to return a media from customer rented list
		ArrayList<MediaRental> remove = new ArrayList<MediaRental>();//to add all data excpect the one i need to remove
		if (medRen.returnMedia(id, code) == true) {// check if it's able to remove ,remove it fi yes
			try {// exception handling
				File file = new File("mediaRented.txt");
				Scanner scan = new Scanner(file);
				while (scan.hasNext()) {// add the data to the array list
					String id1 = scan.next();
					String code1 = scan.next();
					remove.add(new MediaRental(id1, code1));// add to the array list
				}
			} catch (Exception ex) {
				System.out.println(ex);
			}
			for (int i = 0; i < remove.size(); i++) {// check all data
				if (remove.get(i).customerID.equals(id) && remove.get(i).mediaCode.equals(code)) {// remove the
																										// returned
																										// media form
																										// rented file
					remove.remove(i);
				}
			}
			try {// exception handling
				File file = new File("mediaRented.txt");
				PrintWriter printWrite = new PrintWriter(file);
				printWrite.print("");// remove all data
				for (int i = 0; i < remove.size(); i++) {// add the new data to the file
					FileWriter intrested1 = new FileWriter(new File("mediaRented.txt"), true);
					PrintWriter intrested2 = new PrintWriter(intrested1);
					intrested2.println(remove.get(i).customerID + " " + remove.get(i).mediaCode);
					intrested2.close();

				}
			} catch (Exception ex) {
				System.out.println(ex);
			}
			try {// exception handling
				File file = new File("mediaData.txt");
				PrintWriter printWrite = new PrintWriter(file);
				printWrite.print("");// remove old data
				for (int i = 0; i < MediaRental.mediaList.size(); i++) {// add the new data to the file
					FileWriter media1 = new FileWriter(new File("mediaData.txt"), true);
					PrintWriter media2 = new PrintWriter(media1);
					if (MediaRental.mediaList.get(i) instanceof Game)
						media2.println("Game " + MediaRental.mediaList.get(i).code + " "+ MediaRental.mediaList.get(i).title + " "
								+ MediaRental.mediaList.get(i).numberOfCopies + " "
								+ ((Game) MediaRental.mediaList.get(i)).weight);
					if (MediaRental.mediaList.get(i) instanceof Movie)
						media2.println("Movie "+ MediaRental.mediaList.get(i).code + " " + MediaRental.mediaList.get(i).title + " "
								+ MediaRental.mediaList.get(i).numberOfCopies + " "
								+ ((Movie) MediaRental.mediaList.get(i)).rating);
					if (MediaRental.mediaList.get(i) instanceof Album)
						media2.println("Album " + MediaRental.mediaList.get(i).code + " "+ MediaRental.mediaList.get(i).title + " "
								+ MediaRental.mediaList.get(i).numberOfCopies + " "
								+ ((Album) MediaRental.mediaList.get(i)).artist + " "
								+ ((Album) MediaRental.mediaList.get(i)).songs);
					media2.close();

				}
			} catch (Exception ex) {
				System.out.println(ex);
			}

			MediaRental.customerRentedIt=remove;
		}

	}

	public static void testSearchMedia() {//to search for an media not used in phase 2
		Scanner in = new Scanner(System.in);
		String title = "", rating = "", artist = "", songs = "";
		int search = 0;
		System.out.println("if you want to show all media titles enter -1,if no enter 0");
		search = in.nextInt();
		if (search == 0) {
			System.out.println("enter the title,enter 1 if you want to ignore it in search");
			title = in.next();
			System.out.println("enter the rating ,enter 1 if you  want to ignore it in search");
			rating = in.next();
			System.out.println("enter the artist name,enter 1 if you want to ignore it in search");
			artist = in.next();
			System.out.println("enter the songs,enter 1 if you want to ignore it in search");
			songs = in.next();
		}
		if (search == -1) {
			System.out.println(medRen.searchMedia(null, null, null, null));
		}
		if (search == 0) {
			if (title == "1") {
				title = null;
			}
			if (rating == "1") {
				rating = null;
			}
			if (artist == "1") {
				artist = null;
			}
			if (songs == "1") {
				songs = null;
			}
			System.out.println(medRen.searchMedia(title, rating, artist, songs));
		}
	}

	public static void custmersInfo() {// sort the file data at the begnnig of the program in the array list
		try {
			File customerInfo = new File("customerData.txt");
			Scanner customerScan = new Scanner(customerInfo);
			while (customerScan.hasNext()) {
				String id=customerScan.next();
				String mobile=customerScan.next();
				String name = customerScan.next();
				String address = customerScan.next();
				String plan = customerScan.next();
				medRen.addCustomer(id,mobile,name, address, plan);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void mediaInfo() {// sort the file data at the begnnig of the program in the array list
		try {
			File mediaInfo = new File("mediaData.txt");
			Scanner mediaScan = new Scanner(mediaInfo);
			while (mediaScan.hasNext()) {
				String mediaType = mediaScan.next();
				mediaType = mediaType.trim();
				if (mediaType.equals("Game")) {
					String code=mediaScan.next();
					String title = mediaScan.next();
					int number = mediaScan.nextInt();
					double weight = mediaScan.nextDouble();
					medRen.addGame(code,title, number, weight);
				}
				if (mediaType.equals("Album")) {
					String code=mediaScan.next();
					String title = mediaScan.next();
					int number = mediaScan.nextInt();
					String artist = mediaScan.next();
					String songs = mediaScan.next();
					medRen.addAlbum(code,title, number, artist, songs);
				}
				if (mediaType.equals("Movie")) {
					String code=mediaScan.next();
					String title = mediaScan.next();
					int number = mediaScan.nextInt();
					String rating = mediaScan.next();
					medRen.addMovie(code,title, number, rating);
				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public static void interstedInfo() {// sort the file data at the begnnig of the program in the array list
		try {
			File mediaInterstedInfo = new File("mediaIntersted.txt");
			Scanner mediaInterstedScan = new Scanner(mediaInterstedInfo);
			while (mediaInterstedScan.hasNext()) {
				String id = mediaInterstedScan.next();
				String code = mediaInterstedScan.next();
				medRen.addToCart(id, code);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void rentedInfo() {// sort the file data at the begnnig of the program in the array list
		try {
			File mediaRentedInfo = new File("mediaRented.txt");
			Scanner mediaRentedScan = new Scanner(mediaRentedInfo);
			while (mediaRentedScan.hasNext()) {
				String id = mediaRentedScan.next();
				String code = mediaRentedScan.next();
				if (MediaRental.customerRentedIt.contains(new MediaRental(id, code)) == false)
					MediaRental.customerRentedIt.add(new MediaRental(id, code));

			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
