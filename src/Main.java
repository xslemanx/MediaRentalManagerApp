
	




import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {//crate app using java fx
	@Override
	public  void start(Stage primaryStage) {//start method
		Driver.custmersInfo();//call method
		Driver.mediaInfo();//call method
		Driver.interstedInfo();//call method
		Driver.rentedInfo();//call method

		funJavafx.mainMenu();//show the main interface
		
	}
	
	
	public static void main(String[] args) {
		launch(args);//open the app
	}
}
