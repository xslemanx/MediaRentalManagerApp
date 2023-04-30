
public class tester {
	static MediaRental m1=new MediaRental ();
	static Customer m2=new Customer ();
	public static void main(String[] args) {
		
		//MediaRental m1=new MediaRental ();
		m1.addCustomer("1211", "03613", "sleman", "sm", "LIMITED");
		m1.addCustomer("121121", "033", "leman", "sm", "LIMITED");
		m1.addGame("sadasqw", "BGTA", 132, 12);
		m1.addMovie("da121", "Asd", 1, "HD");
		m1.addAlbum("123dsa5", "COB", 12, "ADS", "SDA");
		System.out.println(m1.customersList);;
		System.out.println(m1.mediaList);
		//System.out.println(m1.getAllMediaInfo());
		m1.addToCart("1211", "da121");
		m1.addToCart("121121", "da121");
		
		
		System.out.println(m1.customerInterestedIn);
		System.out.println(m1.customerRentedIt);
		System.out.println(m1.processRequests());
		System.out.println(m1.customerRentedIt);
		System.out.println(m1.returnMedia("1211", "da121"));
		System.out.println(m1.customerRentedIt);
		System.out.println(m1.searchMedia(null, null, null, null));
	}

}
