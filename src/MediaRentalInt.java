import java.util.*;

public interface MediaRentalInt {// an interface to declare methods

	void addCustomer(String ID,String mobileNumber,String name, String address, String plan);

	void addMovie(String code,String title, int copiesAvailable, String rating);

	void addGame(String code,String title, int copiesAvailable, double weight);

	void addAlbum(String code,String title, int copiesAvailable, String artist, String songs);

	void setLimitedPlanLimit(int value);

	String getAllCustomersInfo();

	String getAllMediaInfo();

	boolean addToCart(String customerID, String mediaCode);

	boolean removeFromCart(String customerID, String mediaCode);

	String processRequests();

	boolean returnMedia(String customerID, String mediaCode);

	ArrayList<String> searchMedia(String title, String rating, String artist, String song);

}
