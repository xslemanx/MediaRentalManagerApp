import java.io.FileInputStream;
import java.util.Date;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class funJavafx {
	public static MediaRental medRen = new MediaRental();//global object


	public static void mainMenu() {
		try {
			Stage primaryStage=new Stage();
			Pane root=new Pane ();//crate pane
			Scene scene = new Scene(root,600,440);//crate scene
			primaryStage.setTitle("the main menu");//set stage title
			root.setStyle("-fx-background-color: #dcffff;\r\n");//set the pane color using css
			
			
			Image myimage = new Image(new FileInputStream("customer.png"));//add the image
			ImageView myview = new ImageView(myimage);//show
			//set the size
			myview.setFitHeight(40);
			myview.setFitWidth(40);
			Button Customer=new Button("Customers",myview);//create a button and add the image
			//set size and position
			Customer.setTranslateX(10);
			Customer.setTranslateY(30);
			Customer.setMinWidth (200) ;
			Customer.setMinHeight(50);
			Customer.setTextFill(Color.DARKBLUE);//set text color
			//set the button color and radius using css
			Customer.setStyle("-fx-background-color: #31cdff;\r\n"
					+ "        -fx-background-radius:100;\r\n");
			Customer.setFont(new Font("Arial", 20));//set font type
			Customer.setOnAction(e->{//event handling
				funJavafx.customer();//show customer menu
				primaryStage.close();//close main menu
			});
			
			Image myimage1 = new Image(new FileInputStream("media.png"));//add image
			ImageView myview1 = new ImageView(myimage1);//show
			//set size
			myview1.setFitHeight(40);
			myview1.setFitWidth(40);
			Button Media=new Button("Media",myview1);//create an button and add the image
			//set size and position
			Media.setTranslateX(10);
			Media.setTranslateY(130);
			Media.setMinWidth (200) ;
			Media.setMinHeight(50);
			Media.setTextFill(Color.DARKBLUE);//set text colot
			//set color and radius using css
			Media.setStyle("-fx-background-color: #31cdff;\r\n"
					+ "        -fx-background-radius:100;\r\n"
					+ "");
			Media.setFont(new Font("Arial", 20));//change font
			Media.setOnAction(e->{//event handling
				funJavafx.media();//show media menu
				primaryStage.close();//close main menu
			});
			
			Image myimage2 = new Image(new FileInputStream("rent.png"));//add image
			ImageView myview2 = new ImageView(myimage2);//show
			//set size
			myview2.setFitHeight(40);
			myview2.setFitWidth(40);
			Button Rent=new Button("Rent",myview2);//create button and add the image
			//set the size and position
			Rent.setTranslateX(10);
			Rent.setTranslateY(230);
			Rent.setMinWidth (200) ;
			Rent.setMinHeight(50);
			Rent.setTextFill(Color.DARKBLUE);//set text color
			//set the color and radius using css
			Rent.setStyle("-fx-background-color: #31cdff;\r\n"
					+ "        -fx-background-radius:100;\r\n"
					+ "");
			Rent.setFont(new Font("Arial", 20));//set font
			Rent.setOnAction(e->{//event handling
				funJavafx.rent();//show renting menu
				primaryStage.close();//close main menu
			});
			
			Image myimage3 = new Image(new FileInputStream("exit.png"));//add image
			ImageView myview3 = new ImageView(myimage3);//show
			//set position
			myview3.setFitHeight(40);
			myview3.setFitWidth(40);
			Button end=new Button("Exit",myview3);//create button and add the image
			//set size and position
			end.setTranslateX(10);
			end.setTranslateY(385);
			end.setMinWidth (200) ;
			end.setMinHeight(50);
			end.setTextFill(Color.BLACK);//set text color
			//set color and radius using css
			end.setStyle("-fx-background-color: #ff3e2d;\r\n"
					+ "        -fx-background-radius:100;\r\n");
			end.setFont(new Font("Arial", 20));//set font
			end.setOnAction(e->{//event handling
				primaryStage.close();//close main menu
			});
			
			Label lab=new Label("Rental Media System");//create label
			//set position
			lab.setTranslateX(290);
			lab.setTranslateY(380);
			lab.setTextFill(Color.BLACK);//set text color
			lab.setFont(new Font("Arial", 30));//set font 

			Image myimage4 = new Image(new FileInputStream("game.png"));//add image
			ImageView myview4 = new ImageView(myimage4);//show
			//set size and position
			myview4.setFitHeight(100);
			myview4.setFitWidth(100);
			myview4.setTranslateX(400);
			myview4.setTranslateY(50);
			
			
			Image myimage5 = new Image(new FileInputStream("movie.png"));//add image
			ImageView myview5 = new ImageView(myimage5);//show
			//set size and position
			myview5.setFitHeight(80);
			myview5.setFitWidth(80);
			myview5.setTranslateX(350);
			myview5.setTranslateY(150);
			
			Image myimage6 = new Image(new FileInputStream("album.png"));//add image
			ImageView myview6 = new ImageView(myimage6);//show
			//set size and position
			myview6.setFitHeight(100);
			myview6.setFitWidth(100);
			myview6.setTranslateX(440);
			myview6.setTranslateY(140);
			
			Image myimage7 = new Image(new FileInputStream("shop.png"));//add image
			ImageView myview7 = new ImageView(myimage7);//show
			//set size and position
			myview7.setFitHeight(200);
			myview7.setFitWidth(300);
			myview7.setTranslateX(250);
			myview7.setTranslateY(200);
			
			
			root.getChildren().addAll(Customer,Media,Rent,end,lab,myview4,myview5,myview6,myview7);//add the controls to the pane
			primaryStage.setScene(scene);//set the scene
			primaryStage.show();//show
		} catch(Exception ex) {//handle exception
			ex.printStackTrace();
		}
	}
	
	public static void customer() {//customer menu interface
		try {
		Stage primaryStage=new Stage();
		BorderPane root=new BorderPane();
		Scene scene = new Scene(root,840,340);
		primaryStage.setTitle("Customer menu");
		root.setStyle("-fx-background-color: #877cbe;\r\n");//change pane color using css

		Image myimage = new Image(new FileInputStream("addCustomer.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button add=new Button("Add new customer ",myview);//new button
		add.setTranslateX(280);
		add.setTranslateY(10);
		add.setMinWidth(260);
		add.setMinHeight(100);
		add.setTextFill(Color.DARKBLUE);
		add.setFont(new Font("Arial", 22));
		//set button colo and radius using css
		add.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		root.setTop(add);//set on top
		add.setOnAction(e->{
			funJavafx.addNewCustomer();//go to add customer menu
			primaryStage.close();
		});

		Image myimage1 = new Image(new FileInputStream("DeleteCustomer.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button delete=new Button("Delete a customer",myview1);//new button
		delete.setTranslateX(10);
		delete.setTranslateY(20);
		delete.setMinWidth(260);
		delete.setMinHeight(100);
		delete.setTextFill(Color.DARKBLUE);
		delete.setFont(new Font("Arial", 22));
		//set button color and radius using css
		delete.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n"
				+ "");
		root.setLeft(delete);//set position
		delete.setOnAction(e->{
			funJavafx.removeCustomer();//go to remove customer menu
			primaryStage.close();
		});
		
		Image myimage2 = new Image(new FileInputStream("updateCustomer.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button update=new Button("Update  customer",myview2);//new button
		update.setMinWidth(270);
		update.setMinHeight(100);
		update.setTextFill(Color.DARKBLUE);
		update.setFont(new Font("Arial", 22));
		//set button color and radius using css
		update.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n"
				+ "");
		root.setCenter(update);//set position
		update.setOnAction(e->{
			funJavafx.updateCustomer();//go to update customer menu
			primaryStage.close();
		});
		
		Image myimage3 = new Image(new FileInputStream("searchCustomer.png"));
		ImageView myview3 = new ImageView(myimage3);
		myview3.setFitHeight(40);
		myview3.setFitWidth(40);
		Button search=new Button("search for customer",myview3);//new button
		search.setTranslateX(-10);
		search.setTranslateY(20);
		search.setMinWidth(260);
		search.setMinHeight(100);
		search.setTextFill(Color.DARKBLUE);
		search.setFont(new Font("Arial", 22));
		//set button color and radius using css
		search.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		root.setRight(search);//set position
		search.setOnAction(e->{
			funJavafx.searchCustomer();//go to search customer menu
			primaryStage.close();
		});
		
		Image myimage4 = new Image(new FileInputStream("back.png"));
		ImageView myview4 = new ImageView(myimage4);
		myview4.setFitHeight(40);
		myview4.setFitWidth(40);
		Button returnPage=new Button("back to main page",myview4);//new button
		returnPage.setTranslateX(280);
		returnPage.setTranslateY(-10);
		returnPage.setMinWidth(270);
		returnPage.setMinHeight(100);
		returnPage.setTextFill(Color.BLACK);
		returnPage.setFont(new Font("Arial", 22));
		//set button color and radius using css
		returnPage.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		root.setBottom(returnPage);//set position
		returnPage.setOnAction(e->{
			mainMenu();//go back to main menu
			primaryStage.close();
		});
		
		

		
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void addNewCustomer() {
		try {
		Driver.custmersInfo();//read all customers info
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		Scene scene = new Scene(root,600,500);
		primaryStage.setTitle("add new customer menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");//
		
		//label
		Label lb1=new Label("Customer ID:");
		lb1.setTranslateX(20);
		lb1.setTranslateY(20);
		lb1.setFont(new Font("Arial", 25));
		lb1.setTextFill(Color.NAVY);
		
		//label
		Label lb2=new Label("Customer Name:");
		lb2.setTranslateX(20);
		lb2.setTranslateY(120);
		lb2.setFont(new Font("Arial", 25));
		lb2.setTextFill(Color.NAVY);
		
		//label
		Label lb3=new Label("Customer Address:");
		lb3.setTranslateX(20);
		lb3.setTranslateY(220);
		lb3.setFont(new Font("Arial", 25));
		lb3.setTextFill(Color.NAVY);
		
		//label
		Label lb4=new Label("Customer Mobile:");
		lb4.setTranslateX(20);
		lb4.setTranslateY(320);
		lb4.setFont(new Font("Arial", 25));
		lb4.setTextFill(Color.NAVY);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(450);
		
		
		
		//text field
		TextField t1=new TextField();
		t1.setTranslateX(250);
		t1.setTranslateY(10);
		t1.setFont(new Font("Arial", 25));
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setTranslateX(250);
		t2.setTranslateY(110);
		t2.setFont(new Font("Arial", 25));
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setTranslateX(250);
		t3.setTranslateY(210);
		t3.setFont(new Font("Arial", 25));
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setTranslateX(250);
		t4.setTranslateY(310);
		t4.setFont(new Font("Arial", 25));
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		

				//disable text fields
				t2.setEditable(false);
				t3.setEditable(false);
				t4.setEditable(false);
				
				t1.setOnKeyTyped(e->{
					if(t1.getText().equals("")==false) {;
					t2.setEditable(true);//enable if id not null
					}
				}) ;
				
				t2.setOnKeyTyped(e->{
					if(t1.getText().equals("")==false&&t2.getText().equals("")==false) {
						t3.setEditable(true);//enable if id and mobile number not null
					}
				}) ;
				
				t3.setOnKeyTyped(e->{
					if(t1.getText().equals("")==false&&t2.getText().equals("")==false&&t3.getText().equals("")==false) {
						t4.setEditable(true);//enable if id and mobile number and name not null
					}
				}) ;
			
				
		Image myimage = new Image(new FileInputStream("addCustomer.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);		
		Button add=new Button("add",myview);//new button
		add.setTranslateX(100);
		add.setTranslateY(380);
		add.setMinWidth(150);
		add.setMinHeight(50);
		add.setFont(new Font("Arial", 25));
		add.setTextFill(Color.DARKBLUE);
		add.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		add.setOnAction(e->{
			if (t1.getText().equals("") == false && t2.getText().equals("") == false && t3.getText().equals("") == false
					&& t4.getText().equals("") == false) {
				if (Driver.isCustomerExist(t1.getText()) == true) {//if customer is added before print error massege
					lb5.setTextFill(Color.RED);
					lb5.setText("this customer is added before");
					lb5.setTranslateX(100);
				}
			}
			if (Driver.isCustomerExist(t1.getText()) == false) {
				lb5.setTextFill(Color.BLUE);
				lb5.setTranslateX(160);

				if (t1.getText().equals("") == false && t2.getText().equals("") == false
						&& t3.getText().equals("") == false && t4.getText().equals("") == false) {//if all text feilds not null and customer isn't added before add him
					lb5.setText("added successfully");
					Driver.testAddingCustomers(t1.getText(), t4.getText(), t2.getText(), t3.getText(), "UNLIMITED");
				}
			}
			if (t1.getText().equals("") == true || t2.getText().equals("") == true || t3.getText().equals("") == true
					|| t4.getText().equals("") == true) {//if any box is null show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("there is empty boxes");
				lb5.setTranslateX(160);

			}

			
		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);	
		Button back=new Button("back",myview1);//new button
		back.setTranslateX(350);
		back.setTranslateY(380);
		back.setMinWidth(150);
		back.setMinHeight(50);
		back.setFont(new Font("Arial", 25));
	
		back.setTextFill(Color.BLACK);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n"
				+ "");
		back.setOnAction(e->{
			customer();//go back to customer menu
			primaryStage.close();
		});
		
		
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,t1,t2,t3,t4,add,back);//add the controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void removeCustomer() {
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		Scene scene = new Scene(root,600,500);
		primaryStage.setTitle("remove customer menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Customer ID:");
		lb1.setTranslateX(20);
		lb1.setTranslateY(20);
		lb1.setFont(new Font("Arial", 25));
		lb1.setTextFill(Color.NAVY);
		
		//label
		Label lb2=new Label("Customer Name:");
		lb2.setTranslateX(20);
		lb2.setTranslateY(120);
		lb2.setFont(new Font("Arial", 25));
		lb2.setTextFill(Color.NAVY);
		
		//label
		Label lb3=new Label("Customer Address:");
		lb3.setTranslateX(20);
		lb3.setTranslateY(220);
		lb3.setFont(new Font("Arial", 25));
		lb3.setTextFill(Color.NAVY);
		
		//label
		Label lb4=new Label("Customer Mobile:");
		lb4.setTranslateX(20);
		lb4.setTranslateY(320);
		lb4.setFont(new Font("Arial", 25));
		lb4.setTextFill(Color.NAVY);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(450);
		
		//text field
		TextField t1=new TextField();
		t1.setTranslateX(250);
		t1.setTranslateY(10);
		t1.setFont(new Font("Arial", 25));
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setTranslateX(250);
		t2.setTranslateY(110);
		t2.setFont(new Font("Arial", 25));
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setTranslateX(250);
		t3.setTranslateY(210);
		t3.setFont(new Font("Arial", 25));
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setTranslateX(250);
		t4.setTranslateY(310);
		t4.setFont(new Font("Arial", 25));
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		Image myimage = new Image(new FileInputStream("DeleteCustomer.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);	
		Button delete=new Button("delete",myview);
		delete.setTranslateX(235);
		delete.setTranslateY(380);
		delete.setMinWidth(150);
		delete.setMinHeight(50);
		delete.setFont(new Font("Arial", 25));
		delete.setTextFill(Color.DARKBLUE);
		delete.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		delete.setOnAction(e->{
			
			if(Driver.isCustomerExist(t1.getText())==false) {//if customer not in data base show error message
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(160);
				lb5.setText("Customer not found"); 
			}
			
			if(Driver.isCustomerExist(t1.getText())==true) {//if the customer is added before delete him
				Driver.testRemovingCustomers(t1.getText());
				lb5.setTextFill(Color.BLUE);
				lb5.setText("customer deleted successfully");
				lb5.setTranslateX(100);
			}
			
			if(t1.getText().equals("")==true) {//if id is box is null show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("ID box is Empty");
				lb5.setTranslateX(200);
				
				}

			
		});
		
		Image myimage1 = new Image(new FileInputStream("searchCustomer.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);	
		Button find=new Button("find",myview1);
		find.setTranslateX(70);
		find.setTranslateY(380);
		find.setMinWidth(150);
		find.setMinHeight(50);
		find.setFont(new Font("Arial", 25));
		find.setTextFill(Color.DARKBLUE);
		find.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		find.setOnAction(e->{
			if(Driver.isCustomerExist(t1.getText())==false) {//if customer not found show error message
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(160);
				lb5.setText("Customer not found"); 
			}
			
			if(Driver.isCustomerExist(t1.getText())==true) {//if customer is found show his info
				lb5.setTextFill(Color.BLUE);
				lb5.setText("search done successfully");
				lb5.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {//if id box is null show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("ID box is Empty");
				lb5.setTranslateX(200);
				
				}
			
		String a[]=new String [3];
		a=Driver.testFindCustomer(t1.getText());
		t2.setText(a[1]);
		t3.setText(a[2]);
		t4.setText(a[0]);
		});
		
		Image myimage2 = new Image(new FileInputStream("back.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);	
		Button back=new Button("back",myview2);
		back.setTranslateX(400);
		back.setTranslateY(380);
		back.setMinWidth(150);
		back.setMinHeight(50);
		back.setFont(new Font("Arial", 25));
		back.setTextFill(Color.BLACK);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			customer();//go back to customer menu
			primaryStage.close();
		});
		
		
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,t1,t2,t3,t4,delete,find,back);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void updateCustomer() {//update customer info interface
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		Scene scene = new Scene(root,600,500);
		primaryStage.setTitle("update customer data menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		
		//label
		Label lb1=new Label("Customer ID:");
		lb1.setTranslateX(20);
		lb1.setTranslateY(20);
		lb1.setFont(new Font("Arial", 25));
		lb1.setTextFill(Color.NAVY);
		
		//label
		Label lb2=new Label("Customer Name:");
		lb2.setTranslateX(20);
		lb2.setTranslateY(120);
		lb2.setFont(new Font("Arial", 25));
		lb2.setTextFill(Color.NAVY);
		
		//label
		Label lb3=new Label("Customer Address:");
		lb3.setTranslateX(20);
		lb3.setTranslateY(220);
		lb3.setFont(new Font("Arial", 25));
		lb3.setTextFill(Color.NAVY);
		
		//label
		Label lb4=new Label("Customer Mobile:");
		lb4.setTranslateX(20);
		lb4.setTranslateY(320);
		lb4.setFont(new Font("Arial", 25));
		lb4.setTextFill(Color.NAVY);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(450);
		
		//text field
		TextField t1=new TextField();
		t1.setTranslateX(250);
		t1.setTranslateY(10);
		t1.setFont(new Font("Arial", 25));
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setTranslateX(250);
		t2.setTranslateY(110);
		t2.setFont(new Font("Arial", 25));
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setTranslateX(250);
		t3.setTranslateY(210);
		t3.setFont(new Font("Arial", 25));
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setTranslateX(250);
		t4.setTranslateY(310);
		t4.setFont(new Font("Arial", 25));
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		Image myimage = new Image(new FileInputStream("updateCustomer.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);	
		Button update=new Button("update",myview);
		update.setTranslateX(235);
		update.setTranslateY(380);
		update.setMinWidth(150);
		update.setMinHeight(50);
		update.setFont(new Font("Arial", 25));
		update.setTextFill(Color.DARKBLUE);
		update.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		update.setOnAction(e->{
			if(Driver.isCustomerExist(t1.getText())==false) {//if costumer not found show error message
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(160);
				lb5.setText("Customer not found"); 
			}
			
			if(Driver.isCustomerExist(t1.getText())==true) {//if customer found update his info
				Driver.testUpdateCustomers(t1.getText(), t4.getText(), t2.getText(), t3.getText(), "UNLIMITED");
				lb5.setTextFill(Color.BLUE);
				lb5.setText("updating done successfully");
				lb5.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {//if id box is null show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("ID box is Empty");
				lb5.setTranslateX(200);
				
				}
			
		});
		
		Image myimage1 = new Image(new FileInputStream("searchCustomer.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);	
		Button find=new Button("find",myview1);
		find.setTranslateX(70);
		find.setTranslateY(380);
		find.setMinWidth(150);
		find.setMinHeight(50);
		find.setFont(new Font("Arial", 25));
		find.setTextFill(Color.DARKBLUE);
		find.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		find.setOnAction(e->{
			if(Driver.isCustomerExist(t1.getText())==false) {//if customer not found show error message
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(160);
				lb5.setText("Customer not found"); 
			}
			
			if(Driver.isCustomerExist(t1.getText())==true) {//if customer is found show his info
				lb5.setTextFill(Color.BLUE);
				lb5.setText("search done successfully");
				lb5.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {//if id box is null show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("ID box is Empty");
				lb5.setTranslateX(200);
				
				}
			
		String a[]=new String [3];
		a=Driver.testFindCustomer(t1.getText());
		t2.setText(a[1]);
		t3.setText(a[2]);
		t4.setText(a[0]);
		});
		
		Image myimage2 = new Image(new FileInputStream("back.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button back=new Button("back",myview2);
		back.setTranslateX(400);
		back.setTranslateY(380);
		back.setMinWidth(150);
		back.setMinHeight(50);
		back.setFont(new Font("Arial", 25));
		back.setTextFill(Color.BLACK);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			customer();//go back to customer menu
			primaryStage.close();
		});
		
		
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,t1,t2,t3,t4,find,update,back);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}
	
	public static void searchCustomer() {//interface to search for customer by his id
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		Scene scene = new Scene(root,600,500);
		primaryStage.setTitle("search for a custmer");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Customer ID:");
		lb1.setTranslateX(20);
		lb1.setTranslateY(20);
		lb1.setFont(new Font("Arial", 25));
		lb1.setTextFill(Color.NAVY);
		
		//label
		Label lb2=new Label("Customer Name:");
		lb2.setTranslateX(20);
		lb2.setTranslateY(120);
		lb2.setFont(new Font("Arial", 25));
		lb2.setTextFill(Color.NAVY);
		
		//label
		Label lb3=new Label("Customer Address:");
		lb3.setTranslateX(20);
		lb3.setTranslateY(220);
		lb3.setFont(new Font("Arial", 25));
		lb3.setTextFill(Color.NAVY);
		
		//label
		Label lb4=new Label("Customer Mobile:");
		lb4.setTranslateX(20);
		lb4.setTranslateY(320);
		lb4.setFont(new Font("Arial", 25));
		lb4.setTextFill(Color.NAVY);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(450);
		
		//text field
		TextField t1=new TextField();
		t1.setTranslateX(250);
		t1.setTranslateY(10);
		t1.setFont(new Font("Arial", 25));
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setTranslateX(250);
		t2.setTranslateY(110);
		t2.setFont(new Font("Arial", 25));
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setTranslateX(250);
		t3.setTranslateY(210);
		t3.setFont(new Font("Arial", 25));
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setTranslateX(250);
		t4.setTranslateY(310);
		t4.setFont(new Font("Arial", 25));
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
		Image myimage = new Image(new FileInputStream("searchCustomer.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button find=new Button("find",myview);
		find.setTranslateX(100);
		find.setTranslateY(380);
		find.setMinWidth(150);
		find.setMinHeight(50);
		find.setTextFill(Color.DARKBLUE);
		find.setFont(new Font("Arial", 25));
		find.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		find.setOnAction(e->{
			if(Driver.isCustomerExist(t1.getText())==false) {//if customer not found show error message
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(160);
				lb5.setText("Customer not found"); 
			}
			
			if(Driver.isCustomerExist(t1.getText())==true) {//if customer is found show his info
				lb5.setTextFill(Color.BLUE);
				lb5.setText("search done successfully");
				lb5.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {//if id box is null show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("ID box is Empty");
				lb5.setTranslateX(200);
				
				}
			
		String a[]=new String [3];
		a=Driver.testFindCustomer(t1.getText());
		t2.setText(a[1]);
		t3.setText(a[2]);
		t4.setText(a[0]);
		});
			
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setTranslateX(350);
		back.setTranslateY(380);
		back.setMinWidth(150);
		back.setMinHeight(50);
		back.setFont(new Font("Arial", 25));
		back.setTextFill(Color.BLACK);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			customer();//go back to customer menu
			primaryStage.close();
		});
		
		
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,t1,t2,t3,t4,find,back);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
					
	}
	
	public static void media() {
		try {
		Stage primaryStage=new Stage();
		primaryStage.setTitle("Media menu");
		GridPane root=new GridPane();
		root.setStyle("-fx-background-color: #877cbe;\r\n");
		Scene scene = new Scene(root,600,400);
		//set the distance between buttons
		root.setHgap(20);
		root.setVgap(20);
		root.setPadding(new Insets(30));//set the distance between buttons and the stage borders
		
		Image myimage = new Image(new FileInputStream("addMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button add=new Button("Add new media ",myview);
		add.setMinWidth(260);
		add.setMinHeight(100);
		root.add(add, 0, 0);//set position
		add.setTextFill(Color.DARKBLUE);
		add.setFont(new Font("Arial", 22));
		add.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		add.setOnAction(e->{
			addMedia();//go to add media menu
			primaryStage.close();
		});
		
		Image myimage1 = new Image(new FileInputStream("deleteMedia.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button delete=new Button("delete a media",myview1);
		delete.setMinWidth(260);
		delete.setMinHeight(100);
		root.add(delete, 1, 0);//set position
		delete.setTextFill(Color.DARKBLUE);
		delete.setFont(new Font("Arial", 22));
		delete.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		delete.setOnAction(e->{
			deleteMedia();//go to delete media menu
			primaryStage.close();
		});
		
		Image myimage2 = new Image(new FileInputStream("updateMedia.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button update=new Button("update media info",myview2);
		update.setMinWidth(260);
		update.setMinHeight(100);
		root.add(update, 0, 1);//set position
		update.setTextFill(Color.DARKBLUE);
		update.setFont(new Font("Arial", 22));
		update.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		update.setOnAction(e->{
			updateMedia();//go to update media menu
			primaryStage.close();
		});
		
		Image myimage3 = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview3 = new ImageView(myimage3);
		myview3.setFitHeight(40);
		myview3.setFitWidth(40);
		Button search=new Button("search media",myview3);
		search.setMinWidth(260);
		search.setMinHeight(100);
		root.add(search, 1, 1);//set position
		search.setTextFill(Color.DARKBLUE);
		search.setFont(new Font("Arial", 22));
		search.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		search.setOnAction(e->{
			searchMedia();//go to search media menu
			primaryStage.close();
		});
		
		Image myimage4 = new Image(new FileInputStream("print.png"));
		ImageView myview4 = new ImageView(myimage4);
		myview4.setFitHeight(40);
		myview4.setFitWidth(40);
		Button print=new Button("print media info",myview4);
		print.setMinWidth(260);
		print.setMinHeight(100);
		root.add(print, 0, 2);//set position
		print.setTextFill(Color.DARKBLUE);
		print.setFont(new Font("Arial", 22));
		print.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		print.setOnAction(e->{
			printMedia();//go to print all media info menu
			primaryStage.close();
		});
		
		Image myimage5 = new Image(new FileInputStream("back.png"));
		ImageView myview5 = new ImageView(myimage5);
		myview5.setFitHeight(40);
		myview5.setFitWidth(40);
		Button returnPage=new Button("back to main page",myview5);
		returnPage.setMinWidth(260);
		returnPage.setMinHeight(100);
		root.add(returnPage, 1, 2);//set position
		returnPage.setTextFill(Color.BLACK);
		returnPage.setFont(new Font("Arial", 22));
		returnPage.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		returnPage.setOnAction(e->{
			mainMenu();//go back to main menu
			primaryStage.close();
		});
		

		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void addMedia() {//add media menu
		try {
		Stage primaryStage=new Stage();
		HBox root=new HBox();
		Scene scene1=new Scene(root,300,200);
		primaryStage.setTitle("add media");
		root.setStyle("-fx-background-color: #d5cbfa;\r\n");
		
		Image myimage = new Image(new FileInputStream("movie.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Label lb1=new Label("Movie",myview);
		lb1.setTextFill(Color.DARKBLUE);
		lb1.setFont(new Font("Arial", 50));

		Image myimage1 = new Image(new FileInputStream("game.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Label lb2=new Label("Game",myview1);
		lb2.setTextFill(Color.DARKGREEN);
		lb2.setFont(new Font("Arial", 50));
		
		Image myimage2 = new Image(new FileInputStream("album.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Label lb3=new Label("Album",myview2);
		lb3.setTextFill(Color.DARKRED);
		lb3.setFont(new Font("Arial", 50));
		
		Label lb4=new Label("Media type");
		lb4.setTextFill(Color.DARKBLUE);
		lb4.setFont(new Font("Arial", 35));
		
		ComboBox<Label> combo=new ComboBox<Label>();//create combo box of labels 
		combo.setValue(lb4);//set combo box text to "Media type"
		combo.getItems().addAll(lb1,lb2,lb3);//add labels to combo box
		combo.setMinSize(200, 100);
		combo.setTranslateX(50);
		combo.setTranslateY(50);
		combo.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		combo.setOnAction(e->{
			if(combo.getValue()==lb1) {//if movie chosed
				addMovie();//go to add movie menu
			}
			if(combo.getValue()==lb2) {//if game chosed
				addGame();//go to add game menu
			}
			if(combo.getValue()==lb3) {//if album chosed
				addAlbum();//go to add album menu
			}
			primaryStage.close();
		});
		
		
		root.getChildren().addAll(combo);//add control
		primaryStage.setScene(scene1);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void addMovie() {//add new movie menu
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("add movie menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("Rating");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(470);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
		ToggleGroup group = new ToggleGroup();//to set one selected just
		//radio button
		RadioButton r1=new RadioButton("HR");
		r1.setFont(new Font("Arial", 30));
		r1.setTextFill(Color.NAVY);
		r1.setTranslateX(250);
		r1.setTranslateY(320);
		r1.setToggleGroup(group);

		//radio button
		RadioButton r2=new RadioButton("DR");
		r2.setFont(new Font("Arial", 30));
		r2.setTextFill(Color.NAVY);
		r2.setTranslateX(350);
		r2.setTranslateY(320);
		r2.setToggleGroup(group);

		//radio button
		RadioButton r3=new RadioButton("AC");
		r3.setFont(new Font("Arial", 30));
		r3.setTextFill(Color.NAVY);
		r3.setTranslateX(450);
		r3.setTranslateY(320);
		r3.setToggleGroup(group);
		
		Image myimage = new Image(new FileInputStream("addMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button add=new Button("add",myview);
		add.setFont(new Font("Arial", 30));
		add.setTextFill(Color.DARKBLUE);
		add.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		add.setTranslateX(150);
		add.setTranslateY(400);
		add.setMinWidth(150);
		add.setMinHeight(50);
		add.setOnAction(e->{
			
			if (t1.getText().equals("") == false && t2.getText().equals("") == false
					&& t3.getText().equals("") == false) {//check if all boxes not null
				if (r1.isSelected() == true || r2.isSelected() == true || r3.isSelected() == true) {//check if one of radio buttons is selected
					if (Driver.isMediaExistAnyType(t1.getText()) == true) {//if media is added before show error message
						lb5.setTextFill(Color.RED);
						lb5.setText("this Movie is added before");
						lb5.setTranslateX(150);
					}
				}
			}
			if (Driver.isMediaExistAnyType(t1.getText()) == false) {//if media not added before
				lb5.setTextFill(Color.BLUE);
				lb5.setTranslateX(200);

				if (t1.getText().equals("") == false && t2.getText().equals("") == false
						&& t3.getText().equals("") == false) {//check if all boxes not null
					if (r1.isSelected() == true || r2.isSelected() == true || r3.isSelected() == true) {//check if one of radio buttons is selected
					lb5.setText("added successfully");
					String rate="";
					if(r1.isSelected()) {//if r1 is selected
						rate=r1.getText();
					}
					
					if(r2.isSelected()) {//if r2 is selected
						rate=r2.getText();
					}
					if(r3.isSelected()) {//if r3 is selected
						rate=r3.getText();
					}
					Driver.testAddingMedia(2, t1.getText(), t2.getText(),  Integer.parseInt(t3.getText()), rate, 0, null, null);//add
					}
				}
			}
			
			if (t1.getText().equals("") == true || t2.getText().equals("") == true || t3.getText().equals("") == true) {//if there is null boxes
				if (r1.isSelected() == false || r2.isSelected() == false || r3.isSelected() == false) {//if all radio buttons not selected 
					//show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("there is empty boxes");
				lb5.setTranslateX(190);
				}

			}

			

		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(350);
		back.setTranslateY(400);
		back.setMinWidth(150);
		back.setMinHeight(50);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n"
				+ "");
		back.setOnAction(e->{
			media();//go back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,550);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,add,back,t1,t2,t3,r1,r2,r3);
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}
	
	
	public static void addGame() {//add new game menu
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("add Game menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("weight");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(470);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setFont(new Font("Arial", 30));
		t4.setTranslateX(250);
		t4.setTranslateY(320);
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
		
		Image myimage = new Image(new FileInputStream("addMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button add=new Button("add",myview);
		add.setFont(new Font("Arial", 30));
		add.setTextFill(Color.DARKBLUE);
		add.setTranslateX(150);
		add.setTranslateY(400);
		add.setMinWidth(150);
		add.setMinHeight(50);
		add.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		add.setOnAction(e -> {

			if (t1.getText().equals("") == false && t2.getText().equals("") == false && t3.getText().equals("") == false
					&& t4.getText().equals("") == false) {//if there is empty boxes
				if (Driver.isMediaExistAnyType(t1.getText()) == true) {//if this game is added before show error message
					lb5.setTextFill(Color.RED);
					lb5.setText("this Game is added before");
					lb5.setTranslateX(150);
				}

			}
			if (Driver.isMediaExistAnyType(t1.getText()) == false) {//if the game isn't added before
				lb5.setTextFill(Color.BLUE);
				lb5.setTranslateX(200);

				if (t1.getText().equals("") == false && t2.getText().equals("") == false
						&& t3.getText().equals("") == false && t4.getText().equals("") == false) {//if there is not null boxes

					lb5.setText("added successfully");

					Driver.testAddingMedia(3, t1.getText(), t2.getText(), Integer.parseInt(t3.getText()), null,
							Double.parseDouble(t3.getText()), null, null);//add game

				}
			}

			if (t1.getText().equals("") == true || t2.getText().equals("") == true || t3.getText().equals("") == true
					|| t4.getText().equals("") == true) {//if there is empty boxes show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("there is empty boxes");
				lb5.setTranslateX(190);

			}
		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(350);
		back.setTranslateY(400);
		back.setMinWidth(150);
		back.setMinHeight(50);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();//go back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,520);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,add,back,t1,t2,t3,t4);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}
	
	public static void addAlbum() {//add album menu
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("add Album menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.DARKBLUE);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.DARKBLUE);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.DARKBLUE);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("artist");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.DARKBLUE);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("songs");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTextFill(Color.DARKBLUE);
		lb5.setTranslateX(10);
		lb5.setTranslateY(420);
		
		//label
		Label lb6=new Label("");
		lb6.setFont(new Font("Arial", 30));
		lb6.setTranslateY(560);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setFont(new Font("Arial", 30));
		t4.setTranslateX(250);
		t4.setTranslateY(320);
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t5=new TextField();
		t5.setFont(new Font("Arial", 30));
		t5.setTranslateX(250);
		t5.setTranslateY(420);
		t5.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
		Image myimage = new Image(new FileInputStream("addMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button add=new Button("add",myview);
		add.setFont(new Font("Arial", 30));
		add.setTextFill(Color.DARKBLUE);
		add.setTranslateX(150);
		add.setTranslateY(500);
		add.setMinWidth(150);
		add.setMinHeight(50);
		add.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		add.setOnAction(e->{

			if (t1.getText().equals("") == false && t2.getText().equals("") == false && t3.getText().equals("") == false
					&& t4.getText().equals("") == false&& t5.getText().equals("") == false) {//if all boxes is not null
				if (Driver.isMediaExistAnyType(t1.getText()) == true) {//if this album is added before show error message
					lb6.setTextFill(Color.RED);
					lb6.setText("this Album is added before");
					lb6.setTranslateX(150);
				}

			}
			if (Driver.isMediaExistAnyType(t1.getText()) == false) {//check if media not added before
				lb6.setTextFill(Color.BLUE);
				lb6.setTranslateX(200);

				if (t1.getText().equals("") == false && t2.getText().equals("") == false
						&& t3.getText().equals("") == false && t4.getText().equals("") == false&& t5.getText().equals("") == false) {//check thst all boxes is not null

					lb6.setText("added successfully");

					Driver.testAddingMedia(4, t1.getText(), t2.getText(),  Integer.parseInt(t3.getText()), null, 0, t4.getText(), t5.getText());//add album

				}
			}

			if (t1.getText().equals("") == true || t2.getText().equals("") == true || t3.getText().equals("") == true
					|| t4.getText().equals("") == true|| t5.getText().equals("") == true) {//if there is null boxes show error message
				lb6.setTextFill(Color.RED);
				lb6.setText("there is empty boxes");
				lb6.setTranslateX(190);

			}
	
		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(350);
		back.setTranslateY(500);
		back.setMinWidth(150);
		back.setMinHeight(50);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();//go back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,610);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,lb6,add,back,t1,t2,t3,t4,t5);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}
	
	public static void deleteMedia() {
		try {
		Stage primaryStage=new Stage();
		HBox root=new HBox();
		Scene scene1=new Scene(root,300,200);
		primaryStage.setTitle("delete media");
		root.setStyle("-fx-background-color: #d5cbfa;\r\n");
		
		
		
		
		Image myimage = new Image(new FileInputStream("movie.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Label lb1=new Label("Movie",myview);
		lb1.setTextFill(Color.DARKBLUE);
		lb1.setFont(new Font("Arial", 50));

		Image myimage1 = new Image(new FileInputStream("game.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Label lb2=new Label("Game",myview1);
		lb2.setTextFill(Color.DARKGREEN);
		lb2.setFont(new Font("Arial", 50));
		
		Image myimage2 = new Image(new FileInputStream("album.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Label lb3=new Label("Album",myview2);
		lb3.setTextFill(Color.DARKRED);
		lb3.setFont(new Font("Arial", 50));
		
		Label lb4=new Label("Media type");
		lb4.setTextFill(Color.DARKBLUE);
		lb4.setFont(new Font("Arial", 35));
		
		ComboBox<Label> combo=new ComboBox<Label>();//crate a combo box of labels
		combo.setValue(lb4);//set combo box text to "Media type"
		combo.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		combo.getItems().addAll(lb1,lb2,lb3);//add all labels "Album","Game","Movie"
		combo.setMinSize(200, 100);
		combo.setTranslateX(50);
		combo.setTranslateY(50);
		combo.setOnAction(e->{
			if(combo.getValue()==lb1) {//if movie
				deleteMovie();//go to delete movie menu
			}
			if(combo.getValue()==lb2) {//if game
				deleteGame();//go to delete game menu
			}
			if(combo.getValue()==lb3) {//if album
				deleteAlbum();//go to delete album menu
			}
			primaryStage.close();
		});
		
		
		root.getChildren().addAll(combo);//add combo box control
		primaryStage.setScene(scene1);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void deleteMovie() {
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("delete movie menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("Rating");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(470);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
		ToggleGroup group = new ToggleGroup();//to set one selected just
		
		//radio button
		RadioButton r1=new RadioButton("HR");
		r1.setFont(new Font("Arial", 30));
		r1.setTextFill(Color.NAVY);
		r1.setTranslateX(250);
		r1.setTranslateY(320);
		r1.setToggleGroup(group);
		
		//radio button
		RadioButton r2=new RadioButton("DR");
		r2.setFont(new Font("Arial", 30));
		r2.setTextFill(Color.NAVY);
		r2.setTranslateX(350);
		r2.setTranslateY(320);
		r2.setToggleGroup(group);
		
		//radio button
		RadioButton r3=new RadioButton("AC");
		r3.setFont(new Font("Arial", 30));
		r3.setTextFill(Color.NAVY);
		r3.setTranslateX(450);
		r3.setTranslateY(320);
		r3.setToggleGroup(group);
		
		Image myimage = new Image(new FileInputStream("deleteMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button delete=new Button("delete ",myview);
		delete.setFont(new Font("Arial", 30));
		delete.setTextFill(Color.DARKBLUE);
		delete.setTranslateX(20);
		delete.setTranslateY(400);
		delete.setMinWidth(150);
		delete.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		delete.setOnAction(e->{
			
			if(Driver.isMediaExist(2,t1.getText())==false) {//if the movie not found show error message
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				lb5.setText("Movie not found"); 
				
			}
			
			if(Driver.isMediaExist(2,t1.getText())==true) {//if found delete it
				Driver.testDeleteMedia(2, t1.getText());
				lb5.setTextFill(Color.BLUE);
				lb5.setText("Movie deleted successfully");
				lb5.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {//if id is null show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("Code box is Empty");
				lb5.setTranslateX(200);
				
				}
	
		});
		
		Image myimage1 = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button find=new Button("find ",myview1);
		find.setFont(new Font("Arial", 30));
		find.setTextFill(Color.DARKBLUE);
		find.setTranslateX(250);
		find.setTranslateY(400);
		find.setMinWidth(150);
		find.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		find.setOnAction(e->{
			
			if(Driver.isMediaExist(2, t1.getText())==false) {//if media not found in data base show error message
				lb5.setText("movie not found");
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				t2.setText(null);
				t3.setText(null);
				r1.setSelected(false);
				r2.setSelected(false);
				r3.setSelected(false);
			}
			
			if(Driver.isMediaExist(2, t1.getText())==true) {//if media found show it's data
				String a[]=new String [4];
				a=Driver.testFindMedia(2,t1.getText());//call search method
				t2.setText(a[0]);
				t3.setText(a[1]);
				if(a[2]!=null&&a[2].equals(r1.getText())) {//if r1
					r1.setSelected(true);
				}
				if(a[2]!=null&&a[2].equals(r2.getText())) {//if r2
					r2.setSelected(true);
				}
				if(a[2]!=null&&a[2].equals(r3.getText())) {//if r3
					r3.setSelected(true);
				}
				lb5.setText("search done Successfully");
				lb5.setTextFill(Color.BLUE);
				lb5.setTranslateX(160);
			}
			
				if(t1.getText().equals("")==true) {// if code boc is empty show error message
					lb5.setText("Code box is Empty");
					lb5.setTextFill(Color.RED);
					lb5.setTranslateX(200);
				}

			
		});
		
		Image myimage2 = new Image(new FileInputStream("back.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button back=new Button("back",myview2);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(470);
		back.setTranslateY(400);
		back.setMinWidth(150);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();// back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,550);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,delete,back,t1,t2,t3,r1,r2,r3,find);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
		ex.printStackTrace();
		}
				
	}
	
	public static void deleteGame() {//deleating game interface
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("delete game menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("weight");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(470);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setFont(new Font("Arial", 30));
		t4.setTranslateX(250);
		t4.setTranslateY(320);
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
	
		Image myimage = new Image(new FileInputStream("deleteMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button delete=new Button("delete",myview);
		delete.setFont(new Font("Arial", 30));
		delete.setTextFill(Color.DARKBLUE);
		delete.setTranslateX(20);
		delete.setTranslateY(400);
		delete.setMinWidth(150);
		delete.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		delete.setOnAction(e->{
			if(Driver.isMediaExist(3,t1.getText())==false) {//if game is not found show error message
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				lb5.setText("Game not found"); 
				
			}
			
			if(Driver.isMediaExist(3,t1.getText())==true) {//if game found
				Driver.testDeleteMedia(3, t1.getText());//delete it
				lb5.setTextFill(Color.BLUE);
				lb5.setText("Game deleted successfully");
				lb5.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {// if code box is empty show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("Code box is Empty");
				lb5.setTranslateX(200);
				
				}
	
		});
		
		Image myimage1 = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button find=new Button("find ",myview1);
		find.setFont(new Font("Arial", 30));
		find.setTextFill(Color.DARKBLUE);
		find.setTranslateX(250);
		find.setTranslateY(400);
		find.setMinWidth(150);
		find.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		find.setOnAction(e -> {

			if (Driver.isMediaExist(3, t1.getText()) == false) {// if game not found show error message
				lb5.setText("Game not found");
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
			}

			if (Driver.isMediaExist(3, t1.getText()) == true) {//if found show it's data
				String a[] = new String[4];
				a = Driver.testFindMedia(3, t1.getText());
				t2.setText(a[0]);
				t3.setText(a[1]);
				t4.setText(a[2]);
				lb5.setText("search done Successfully");
				lb5.setTextFill(Color.BLUE);
				lb5.setTranslateX(160);
			}

			if (t1.getText().equals("") == true) {// if code box is empty show error message
				lb5.setText("Code box is Empty");
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(200);
			}

		});
		
		Image myimage2 = new Image(new FileInputStream("back.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button back = new Button("back",myview2);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(470);
		back.setTranslateY(400);
		back.setMinWidth(150);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e -> {
			media();//back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,550);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,delete,back,t1,t2,t3,t4,find);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
		ex.printStackTrace();
		}
				
	}
	
	public static void deleteAlbum() {//an interface to delete album from database
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("delete Album menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("artist");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("songs");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTextFill(Color.NAVY);
		lb5.setTranslateX(10);
		lb5.setTranslateY(420);
		
		//label
		Label lb6=new Label("");
		lb6.setFont(new Font("Arial", 30));
		lb6.setTranslateY(580);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setFont(new Font("Arial", 30));
		t4.setTranslateX(250);
		t4.setTranslateY(320);
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t5=new TextField();
		t5.setFont(new Font("Arial", 30));
		t5.setTranslateX(250);
		t5.setTranslateY(420);
		t5.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
		
		Image myimage = new Image(new FileInputStream("deleteMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button delete=new Button("delete ",myview);
		delete.setFont(new Font("Arial", 30));
		delete.setTextFill(Color.DARKBLUE);
		delete.setTranslateX(20);
		delete.setTranslateY(500);
		delete.setMinWidth(150);
		delete.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		delete.setOnAction(e->{
			if(Driver.isMediaExist(4,t1.getText())==false) {//if album not found show error message
				lb6.setTextFill(Color.RED);
				lb6.setTranslateX(220);
				lb6.setText("Album not found"); 
				
			}
			
			if(Driver.isMediaExist(4,t1.getText())==true) {//if found delete it
				Driver.testDeleteMedia(4, t1.getText());
				lb6.setTextFill(Color.BLUE);
				lb6.setText("Album deleted successfully");
				lb6.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {// if code box is empty show error message
				lb6.setTextFill(Color.RED);
				lb6.setText("Code box is Empty");
				lb6.setTranslateX(200);
				
				}
		});
		
		Image myimage1 = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button find=new Button("find ",myview1);
		find.setFont(new Font("Arial", 30));
		find.setTextFill(Color.DARKBLUE);
		find.setTranslateX(250);
		find.setTranslateY(500);
		find.setMinWidth(150);
		find.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		find.setOnAction(e->{
			if (Driver.isMediaExist(4, t1.getText()) == false) {//if album not found show error message
				lb6.setText("Album not found");
				lb6.setTextFill(Color.RED);
				lb6.setTranslateX(220);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
			}

			if (Driver.isMediaExist(4, t1.getText()) == true) {// if found show it's data
				String a[] = new String[4];
				a = Driver.testFindMedia(4, t1.getText());
				t2.setText(a[0]);
				t3.setText(a[1]);
				t4.setText(a[2]);
				t5.setText(a[3]);
				
				lb6.setText("search done Successfully");
				lb6.setTextFill(Color.BLUE);
				lb6.setTranslateX(160);
			}

			if (t1.getText().equals("") == true) {// if Code box is empty show error message
				lb6.setText("Code box is Empty");
				lb6.setTextFill(Color.RED);
				lb6.setTranslateX(200);
			}
		});
		
		
		Image myimage2 = new Image(new FileInputStream("back.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button back=new Button("back",myview2);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(470);
		back.setTranslateY(500);
		back.setMinWidth(150);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();//back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,650);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,lb6,find,delete,back,t1,t2,t3,t4,t5);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}
	
	public static void updateMedia() {//update media interface
		try {
		Stage primaryStage=new Stage();
		VBox root=new VBox();
		Scene scene1=new Scene(root,300,200);
		primaryStage.setTitle("update media");
		root.setStyle("-fx-background-color: #d5cbfa;\r\n");
		
		
		
		
		Image myimage = new Image(new FileInputStream("movie.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Label lb1=new Label("Movie",myview);
		lb1.setTextFill(Color.DARKBLUE);
		lb1.setFont(new Font("Arial", 50));

		Image myimage1 = new Image(new FileInputStream("game.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Label lb2=new Label("Game",myview1);
		lb2.setTextFill(Color.DARKGREEN);
		lb2.setFont(new Font("Arial", 50));
		
		Image myimage2 = new Image(new FileInputStream("album.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Label lb3=new Label("Album",myview2);
		lb3.setTextFill(Color.DARKRED);
		lb3.setFont(new Font("Arial", 50));
		
		Label lb4=new Label("Media type");
		lb4.setTextFill(Color.DARKBLUE);
		lb4.setFont(new Font("Arial", 35));
		
		ComboBox<Label> combo=new ComboBox<Label>();//create combo box of labels
		combo.setValue(lb4);//set combo box text to "Media type"
		combo.getItems().addAll(lb1,lb2,lb3);//add labels : "Media","Game","Album"
		combo.setMinSize(200, 100);
		combo.setTranslateX(50);
		combo.setTranslateY(50);
		combo.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		combo.setOnAction(e->{
			if(combo.getValue()==lb1) {//if movie 
				updateMovie();//go to update movie menu
			}
			if(combo.getValue()==lb2) {//if game
				updateGame();//go to update game menu
			}
			if(combo.getValue()==lb3) {//if album
				updateAlbum();//go to update album menu
			}
			primaryStage.close();
		});
		
		
		root.getChildren().addAll(combo);//add combo box control
		primaryStage.setScene(scene1);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void updateMovie() {//update movie interface
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("update movie menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("Rating");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(470);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
		ToggleGroup group = new ToggleGroup();//to set one selected just
		RadioButton r1=new RadioButton("HR");
		r1.setFont(new Font("Arial", 30));
		r1.setTextFill(Color.NAVY);
		r1.setTranslateX(250);
		r1.setTranslateY(320);
		r1.setToggleGroup(group);
		
		RadioButton r2=new RadioButton("DR");
		r2.setFont(new Font("Arial", 30));
		r2.setTextFill(Color.NAVY);
		r2.setTranslateX(350);
		r2.setTranslateY(320);
		r2.setToggleGroup(group);
		
		RadioButton r3=new RadioButton("AC");
		r3.setFont(new Font("Arial", 30));
		r3.setTextFill(Color.NAVY);
		r3.setTranslateX(450);
		r3.setTranslateY(320);
		r3.setToggleGroup(group);
		
		Image myimage = new Image(new FileInputStream("updateMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button update=new Button("update ",myview);
		update.setFont(new Font("Arial", 30));
		update.setTextFill(Color.DARKBLUE);
		update.setTranslateX(20);
		update.setTranslateY(400);
		update.setMinWidth(150);
		update.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		update.setOnAction(e->{
			if(Driver.isMediaExist(2,t1.getText())==false) {//if movie not found show error message
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				lb5.setText("Movie not found"); 
				
			}
			
			if(Driver.isMediaExist(2,t1.getText())==true) {//if found update its data
				String rate="";
				if(r1.isSelected()) {//if movie
					rate=r1.getText();
				}
				
				if(r2.isSelected()) {//if game
					rate=r2.getText();
				}
				if(r3.isSelected()) {// if album
					rate=r3.getText();
				}
				Driver.testUpdateMedia(2,t1.getText(),t2.getText(),Integer.parseInt(t3.getText()),rate,0,null,null);//update movie
				lb5.setTextFill(Color.BLUE);
				lb5.setText("Movie updated successfully");
				lb5.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {//if Code box is empty show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("Code box is Empty");
				lb5.setTranslateX(200);
				
				}

		});
		
		Image myimage1 = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button find=new Button("find ",myview1);
		find.setFont(new Font("Arial", 30));
		find.setTextFill(Color.DARKBLUE);
		find.setTranslateX(250);
		find.setTranslateY(400);
		find.setMinWidth(150);
		find.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		find.setOnAction(e->{
			
			if(Driver.isMediaExist(2, t1.getText())==false) {//if movie not found show error message
				lb5.setText("movie not found");
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				t2.setText(null);
				t3.setText(null);
				r1.setSelected(false);
				r2.setSelected(false);
				r3.setSelected(false);
			}
			
			if(Driver.isMediaExist(2, t1.getText())==true) {//if found show its data
				String a[]=new String [4];
				a=Driver.testFindMedia(2,t1.getText());
				t2.setText(a[0]);
				t3.setText(a[1]);
				if(a[2]!=null&&a[2].equals(r1.getText())) {//if movie
					r1.setSelected(true);
				}
				if(a[2]!=null&&a[2].equals(r2.getText())) {//if game
					r2.setSelected(true);
				}
				if(a[2]!=null&&a[2].equals(r3.getText())) {//if album
					r3.setSelected(true);
				}
				lb5.setText("search done Successfully");
				lb5.setTextFill(Color.BLUE);
				lb5.setTranslateX(160);
			}
			
				if(t1.getText().equals("")==true) {//if code box is null show error message
					lb5.setText("Code box is Empty");
					lb5.setTextFill(Color.RED);
					lb5.setTranslateX(200);
				}

			
		});
		
		Image myimage2 = new Image(new FileInputStream("back.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button back=new Button("back",myview2);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(470);
		back.setTranslateY(400);
		back.setMinWidth(150);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();//back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,550);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,find,update,back,t1,t2,t3,r1,r2,r3);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void updateGame() {
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("update game menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("weight");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(470);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		
		//text field
		TextField t4=new TextField();
		t4.setFont(new Font("Arial", 30));
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t4.setTranslateX(250);
		t4.setTranslateY(320);
		
		
		Image myimage = new Image(new FileInputStream("updateMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button update=new Button("update ",myview);
		update.setFont(new Font("Arial", 30));
		update.setTextFill(Color.DARKBLUE);
		update.setTranslateX(20);
		update.setTranslateY(400);
		update.setMinWidth(150);
		update.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		update.setOnAction(e->{
			if(Driver.isMediaExist(3,t1.getText())==false) {//if game not found show error message
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				lb5.setText("Game not found"); 
				
			}
			
			if(Driver.isMediaExist(3,t1.getText())==true) {//if found update it's data
				Driver.testUpdateMedia(3,t1.getText(),t2.getText(),Integer.parseInt(t3.getText()),null,Double.parseDouble(t4.getText()),null,null);//update game data
				lb5.setTextFill(Color.BLUE);
				lb5.setText("Game updated successfully");
				lb5.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {//if code box is null show error message
				lb5.setTextFill(Color.RED);
				lb5.setText("Code box is Empty");
				lb5.setTranslateX(200);
				
				}
					
				});
		
		Image myimage1 = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button find=new Button("find ",myview1);
		find.setFont(new Font("Arial", 30));
		find.setTextFill(Color.DARKBLUE);
		find.setTranslateX(250);
		find.setTranslateY(400);
		find.setMinWidth(150);
		find.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		find.setOnAction(e -> {

			if (Driver.isMediaExist(3, t1.getText()) == false) {//if game nt found show error message
				lb5.setText("Game not found");
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
			}

			if (Driver.isMediaExist(3, t1.getText()) == true) {//if found show it's data
				String a[] = new String[4];
				a = Driver.testFindMedia(3, t1.getText());
				t2.setText(a[0]);
				t3.setText(a[1]);
				t4.setText(a[2]);
				lb5.setText("search done Successfully");
				lb5.setTextFill(Color.BLUE);
				lb5.setTranslateX(160);
			}

			if (t1.getText().equals("") == true) {//if code box is null show error message
				lb5.setText("Code box is Empty");
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(200);
			}

		});
		
		Image myimage2 = new Image(new FileInputStream("back.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button back=new Button("back",myview2);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(470);
		back.setTranslateY(400);
		back.setMinWidth(150);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();//go back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,550);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,find,update,back,t1,t2,t3,t4);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}

	public static void updateAlbum() {
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("update album menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("weight");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("songs");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTextFill(Color.NAVY);
		lb5.setTranslateX(10);
		lb5.setTranslateY(420);
		
		//label
		Label lb6=new Label("");
		lb6.setFont(new Font("Arial", 30));
		lb6.setTranslateY(580);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		
		//text field
		TextField t4=new TextField();
		t4.setFont(new Font("Arial", 30));
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t4.setTranslateX(250);
		t4.setTranslateY(320);
		
		//text field
		TextField t5=new TextField();
		t5.setFont(new Font("Arial", 30));
		t5.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t5.setTranslateX(250);
		t5.setTranslateY(420);
		
		Image myimage = new Image(new FileInputStream("updateMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button update=new Button("update ",myview);
		update.setFont(new Font("Arial", 30));
		update.setTextFill(Color.DARKBLUE);
		update.setTranslateX(20);
		update.setTranslateY(500);
		update.setMinWidth(150);
		update.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		update.setOnAction(e->{
			if(Driver.isMediaExist(4,t1.getText())==false) {//if album not found show error message
				lb6.setTextFill(Color.RED);
				lb6.setTranslateX(220);
				lb6.setText("Album not found"); 
				
			}
			
			if(Driver.isMediaExist(4,t1.getText())==true) {//if found update it's data
				Driver.testUpdateMedia(4,t1.getText(),t2.getText(),Integer.parseInt(t3.getText()),null,0,t4.getText(),t5.getText());
				lb6.setTextFill(Color.BLUE);
				lb6.setText("Album updated successfully");
				lb6.setTranslateX(140);
			}
			
			if(t1.getText().equals("")==true) {//if code box null show error message
				lb6.setTextFill(Color.RED);
				lb6.setText("Code box is Empty");
				lb6.setTranslateX(200);
				
				}

		});
		
		Image myimage1 = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button find=new Button("find ",myview1);
		find.setFont(new Font("Arial", 30));
		find.setTextFill(Color.DARKBLUE);
		find.setTranslateX(250);
		find.setTranslateY(500);
		find.setMinWidth(150);
		find.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		find.setOnAction(e->{
			if (Driver.isMediaExist(4, t1.getText()) == false) {//if album not found show error message
				lb6.setText("Album not found");
				lb6.setTextFill(Color.RED);
				lb6.setTranslateX(220);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
			}

			if (Driver.isMediaExist(4, t1.getText()) == true) {//if found show it's data
				String a[] = new String[4];
				a = Driver.testFindMedia(4, t1.getText());
				t2.setText(a[0]);
				t3.setText(a[1]);
				t4.setText(a[2]);
				t5.setText(a[3]);
				
				lb6.setText("search done Successfully");
				lb6.setTextFill(Color.BLUE);
				lb6.setTranslateX(160);
			}

			if (t1.getText().equals("") == true) {//if code box is null show error message
				lb6.setText("Code box is Empty");
				lb6.setTextFill(Color.RED);
				lb6.setTranslateX(200);
			}
		});
		
		Image myimage2 = new Image(new FileInputStream("back.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button back=new Button("back",myview2);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(470);
		back.setTranslateY(500);
		back.setMinWidth(150);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();//go back tp media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,650);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,lb6,find,update,back,t1,t2,t3,t4,t5);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}
	
	public static void searchMedia() {//a method to search media interface
		try {
		Stage primaryStage=new Stage();
		StackPane root=new StackPane();
		Scene scene1=new Scene(root,300,200);
		primaryStage.setTitle("search media");
		root.setStyle("-fx-background-color: #d5cbfa;\r\n");
		
		
		
		
		Image myimage = new Image(new FileInputStream("movie.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Label lb1=new Label("Movie",myview);
		lb1.setTextFill(Color.DARKBLUE);
		lb1.setFont(new Font("Arial", 50));

		Image myimage1 = new Image(new FileInputStream("game.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Label lb2=new Label("Game",myview1);
		lb2.setTextFill(Color.DARKGREEN);
		lb2.setFont(new Font("Arial", 50));
		
		Image myimage2 = new Image(new FileInputStream("album.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Label lb3=new Label("Album",myview2);
		lb3.setTextFill(Color.DARKRED);
		lb3.setFont(new Font("Arial", 50));
		
		Label lb4=new Label("Media type");
		lb4.setTextFill(Color.DARKBLUE);
		lb4.setFont(new Font("Arial", 35));
		
		ComboBox<Label> combo=new ComboBox<Label>();//create combo box of labels
		combo.setValue(lb4);//set combo box value to "Media type"
		combo.getItems().addAll(lb1,lb2,lb3);//add labels :"Movie","Game","Album"
		combo.setMinSize(200, 100);
		combo.setTranslateX(0);
		combo.setTranslateY(0);
		combo.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		combo.setOnAction(e->{
			if(combo.getValue()==lb1) {//if movie
				searchMovie();//show search movie menu
			}
			if(combo.getValue()==lb2) {//if game
				searchGame();//show search game menu
			}
			if(combo.getValue()==lb3) {//if album
				searchAlbum();//show search album menu
			}
			primaryStage.close();
		});
		
		
		root.getChildren().addAll(combo);//add combo box control
		primaryStage.setScene(scene1);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void searchMovie() {//search movie interface
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("search movie menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("Rating");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(470);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
		ToggleGroup group = new ToggleGroup();//to set one selected just
		
		//radio button
		RadioButton r1=new RadioButton("HR");
		r1.setFont(new Font("Arial", 30));
		r1.setTextFill(Color.NAVY);
		r1.setTranslateX(250);
		r1.setTranslateY(320);
		r1.setToggleGroup(group);
		
		//radio button
		RadioButton r2=new RadioButton("DR");
		r2.setFont(new Font("Arial", 30));
		r2.setTextFill(Color.NAVY);
		r2.setTranslateX(350);
		r2.setTranslateY(320);
		r2.setToggleGroup(group);
		
		//radio button
		RadioButton r3=new RadioButton("AC");
		r3.setFont(new Font("Arial", 30));
		r3.setTextFill(Color.NAVY);
		r3.setTranslateX(450);
		r3.setTranslateY(320);
		r3.setToggleGroup(group);
		
		Image myimage = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button search=new Button("search ",myview);
		search.setFont(new Font("Arial", 30));
		search.setTextFill(Color.DARKBLUE);
		search.setTranslateX(150);
		search.setTranslateY(400);
		search.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		search.setOnAction(e->{
			
			if(Driver.isMediaExist(2, t1.getText())==false) {//if media nit found show error message
				lb5.setText("movie not found");
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				t2.setText(null);
				t3.setText(null);
				r1.setSelected(false);
				r2.setSelected(false);
				r3.setSelected(false);
			}
			
			if(Driver.isMediaExist(2, t1.getText())==true) {//if found show it's data
				String a[]=new String [4];
				a=Driver.testFindMedia(2,t1.getText());
				t2.setText(a[0]);
				t3.setText(a[1]);
				if(a[2]!=null&&a[2].equals(r1.getText())) {
					r1.setSelected(true);
				}
				if(a[2]!=null&&a[2].equals(r2.getText())) {
					r2.setSelected(true);
				}
				if(a[2]!=null&&a[2].equals(r2.getText())) {
					r2.setSelected(true);
				}
				lb5.setText("search done Successfully");
				lb5.setTextFill(Color.BLUE);
				lb5.setTranslateX(160);
			}
			
				if(t1.getText().equals("")==true) {//if code box is null show error message
					lb5.setText("Code box is Empty");
					lb5.setTextFill(Color.RED);
					lb5.setTranslateX(200);
				}

			
		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(350);
		back.setTranslateY(400);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();//go back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,550);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,search,back,t1,t2,t3,r1,r2,r3);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}
	
	
	public static void searchGame() {//search game interface
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("search Game menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("weight");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTranslateY(470);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setFont(new Font("Arial", 30));
		t4.setTranslateX(250);
		t4.setTranslateY(320);
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		Image myimage = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button search=new Button("search",myview);
		search.setFont(new Font("Arial", 30));
		search.setTextFill(Color.DARKBLUE);
		search.setTranslateX(150);
		search.setTranslateY(400);
		search.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		search.setOnAction(e -> {

			if (Driver.isMediaExist(3, t1.getText()) == false) {//if game not found show error message
				lb5.setText("Game not found");
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(220);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
			}

			if (Driver.isMediaExist(3, t1.getText()) == true) {//if found show it's data
				String a[] = new String[4];
				a = Driver.testFindMedia(3, t1.getText());
				t2.setText(a[0]);
				t3.setText(a[1]);
				t4.setText(a[2]);
				lb5.setText("search done Successfully");
				lb5.setTextFill(Color.BLUE);
				lb5.setTranslateX(160);
			}

			if (t1.getText().equals("") == true) {// if code box is null show error message
				lb5.setText("Code box is Empty");
				lb5.setTextFill(Color.RED);
				lb5.setTranslateX(200);
			}

		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(350);
		back.setTranslateY(400);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();//back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,550);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,search,back,t1,t2,t3,t4);//add all conntrols
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}
	
	public static void searchAlbum() {
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("search Album menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//label
		Label lb1=new Label("Code");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);

		//label
		Label lb2=new Label("Title");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(120);
		
		//label
		Label lb3=new Label("copies Number");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(220);
		
		//label
		Label lb4=new Label("artist");
		lb4.setFont(new Font("Arial", 30));
		lb4.setTextFill(Color.NAVY);
		lb4.setTranslateX(10);
		lb4.setTranslateY(320);
		
		//label
		Label lb5=new Label("songs");
		lb5.setFont(new Font("Arial", 30));
		lb5.setTextFill(Color.NAVY);
		lb5.setTranslateX(10);
		lb5.setTranslateY(420);
		
		//label
		Label lb6=new Label("");
		lb6.setFont(new Font("Arial", 30));
		lb6.setTranslateY(580);
		
		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setMinWidth(50);
		t1.setTranslateX(250);
		t1.setTranslateY(20);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(250);
		t2.setTranslateY(120);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 30));
		t3.setTranslateX(250);
		t3.setTranslateY(220);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t4=new TextField();
		t4.setFont(new Font("Arial", 30));
		t4.setTranslateX(250);
		t4.setTranslateY(320);
		t4.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		//text field
		TextField t5=new TextField();
		t5.setFont(new Font("Arial", 30));
		t5.setTranslateX(250);
		t5.setTranslateY(420);
		t5.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		
		Image myimage = new Image(new FileInputStream("searchMedia.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button search=new Button("search ",myview);
		search.setFont(new Font("Arial", 30));
		search.setTextFill(Color.DARKBLUE);
		search.setTranslateX(150);
		search.setTranslateY(500);
		search.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		search.setOnAction(e->{
			if (Driver.isMediaExist(4, t1.getText()) == false) {//if album not found show error message
				lb6.setText("Album not found");
				lb6.setTextFill(Color.RED);
				lb6.setTranslateX(220);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
			}

			if (Driver.isMediaExist(4, t1.getText()) == true) {//if found show it's data
				String a[] = new String[4];
				a = Driver.testFindMedia(4, t1.getText());
				t2.setText(a[0]);
				t3.setText(a[1]);
				t4.setText(a[2]);
				t5.setText(a[3]);
				
				lb6.setText("search done Successfully");
				lb6.setTextFill(Color.BLUE);
				lb6.setTranslateX(160);
			}

			if (t1.getText().equals("") == true) {//if code box is null show error message
				lb6.setText("Code box is Empty");
				lb6.setTextFill(Color.RED);
				lb6.setTranslateX(200);
			}
		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(350);
		back.setTranslateY(500);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			media();//bacl to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,650,650);
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,lb6,search,back,t1,t2,t3,t4,t5);// add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
	}
	
	public static void printMedia() {//interface to print all media info in the database
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("all media info");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//text area
		TextArea info=new TextArea();
		info.setFont(new Font("Arial", 20));
		info.setTranslateX(50);
		info.setTranslateY(10);
		info.setMinSize(900, 550);
		info.setMaxSize(900, 550);
		info.setEditable(false);


		
		
		Image myimage = new Image(new FileInputStream("print.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button show=new Button("show ",myview);
		show.setFont(new Font("Arial", 50));
		show.setStyle("-fx-background-color: #31cdff;\r\n"
				+ "        -fx-background-radius:10000;\r\n");
		show.setTextFill(Color.DARKBLUE);
		show.setTranslateX(200);
		show.setTranslateY(600);
		show.setOnAction(e->{
			info.setText(medRen.getAllMediaInfo());//print all media info into the text area
		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 50));
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:10000;\r\n");
		back.setTextFill(Color.BLACK);
		back.setTranslateX(500);
		back.setTranslateY(600);
		back.setOnAction(e->{
			media();//go back to media menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,1000,700);
		root.getChildren().addAll(info,show,back);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
				
		
	}
	
	public static void rent() {//rent media interface
		try {
		Stage primaryStage=new Stage();
		BorderPane root=new BorderPane();
		Scene scene = new Scene(root,820,340);
		primaryStage.setTitle("Renting menu");
		root.setStyle("-fx-background-color: #877cbe;\r\n");

		Image myimage = new Image(new FileInputStream("addToCart.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button rent=new Button("Add media to cart ",myview);
		rent.setTranslateX(280);
		rent.setTranslateY(10);
		rent.setMinWidth(260);
		rent.setMinHeight(100);
		rent.setTextFill(Color.DARKBLUE);
		rent.setFont(new Font("Arial", 22));
		root.setTop(rent);
		rent.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		rent.setOnAction(e->{
			funJavafx.reinting();//go to renting interface
			primaryStage.close();
		});
		
		Image myimage1 = new Image(new FileInputStream("print.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button print1=new Button("Print intersted ",myview1);
		print1.setTranslateX(10);
		print1.setTranslateY(20);
		print1.setMinWidth(260);
		print1.setMinHeight(100);
		print1.setTextFill(Color.DARKBLUE);
		print1.setFont(new Font("Arial", 22));
		root.setLeft(print1);
		print1.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		print1.setOnAction(e->{
			funJavafx.printIntersted();//go to interested print interface
			primaryStage.close();
		});
		
		Image myimage2 = new Image(new FileInputStream("print.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button print2=new Button("Print rented ",myview2);
		print2.setMinWidth(260);
		print2.setMinHeight(100);
		print2.setTextFill(Color.DARKBLUE);
		print2.setFont(new Font("Arial", 22));
		root.setCenter(print2);
		print2.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		print2.setOnAction(e->{
			funJavafx.printRented();//go to rented print interface
			primaryStage.close();
		});
		
		Image myimage3 = new Image(new FileInputStream("removeFromCart.png"));
		ImageView myview3 = new ImageView(myimage3);
		myview3.setFitHeight(40);
		myview3.setFitWidth(40);
		Button return1=new Button("return a media",myview3);
		return1.setTranslateX(-10);
		return1.setTranslateY(20);
		return1.setMinWidth(260);
		return1.setMinHeight(100);
		return1.setTextFill(Color.DARKBLUE);
		return1.setFont(new Font("Arial", 22));
		root.setRight(return1);
		return1.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		return1.setOnAction(e->{
			funJavafx.returnMedia();//go to return media interface
			primaryStage.close();
		});
		
		Image myimage4 = new Image(new FileInputStream("back.png"));
		ImageView myview4 = new ImageView(myimage4);
		myview4.setFitHeight(40);
		myview4.setFitWidth(40);
		Button returnPage=new Button("back to main page",myview4);
		returnPage.setTranslateX(280);
		returnPage.setTranslateY(-10);
		returnPage.setMinWidth(260);
		returnPage.setMinHeight(100);
		returnPage.setTextFill(Color.BLACK);
		returnPage.setFont(new Font("Arial", 22));
		root.setBottom(returnPage);
		returnPage.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		returnPage.setOnAction(e->{
			mainMenu();//back to main menu
			primaryStage.close();
		});
		
		Label text=new Label("Customers menu");
		text.setTranslateX(200);
		text.setTranslateY(20);
		text.setMinWidth(100);
		text.setFont(new Font("Arial", 22));
		
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void reinting() {
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("renting menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//text area 
		TextArea info1=new TextArea();
		info1.setFont(new Font("Arial", 20));
		info1.setTranslateX(200);
		info1.setTranslateY(100);
		info1.setMinSize(630, 150);
		info1.setMaxSize(630, 150);
		info1.setEditable(false);
		
		//text area
		TextArea info2=new TextArea();
		info2.setFont(new Font("Arial", 20));
		info2.setTranslateX(200);
		info2.setTranslateY(360);
		info2.setMinSize(630, 150);
		info2.setMaxSize(630, 150);
		info2.setEditable(false);

		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setTranslateX(200);
		t1.setTranslateY(10);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t1.setOnAction(e->{//if id entered show the customer data
			String data="";
			for(int i=0;i<MediaRental.customersList.size();i++) {
				if(t1.getText().equals(MediaRental.customersList.get(i).ID)) {
					 data = "ID: " + MediaRental.customersList.get(i).ID + "\n mobile number: "
							+ MediaRental.customersList.get(i).mobileNumber + "\n name: "
							+ MediaRental.customersList.get(i).name + "\n address: "
							+ MediaRental.customersList.get(i).address + "\n plan: "
							+ MediaRental.customersList.get(i).plan;
							break;
				}
			}
			info1.setText(data);
		});
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(200);
		t2.setTranslateY(270);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t2.setOnAction(e->{//if code entered show media data
			String data="";
			for(int i=0;i<MediaRental.mediaList.size();i++) {
				if(t2.getText().equals(MediaRental.mediaList.get(i).code)) {
					if(MediaRental.mediaList.get(i) instanceof Movie) {
						data = "code: " + MediaRental.mediaList.get(i).code + "\n title: "
								+ MediaRental.mediaList.get(i).title + "\n copies number: "
								+ MediaRental.mediaList.get(i).numberOfCopies + "\n rating: "
								+ ((Movie) MediaRental.mediaList.get(i)).rating;
					}
					if(MediaRental.mediaList.get(i) instanceof Game) {
						data = "code: " + MediaRental.mediaList.get(i).code + "\n title: "
								+ MediaRental.mediaList.get(i).title + "\n copies number: "
								+ MediaRental.mediaList.get(i).numberOfCopies + "\n weight: "
								+ ((Game) MediaRental.mediaList.get(i)).weight;
					}
					if(MediaRental.mediaList.get(i) instanceof Album) {
						data = "code: " + MediaRental.mediaList.get(i).code + "\n title: "
								+ MediaRental.mediaList.get(i).title + "\n copies number: "
								+ MediaRental.mediaList.get(i).numberOfCopies + "\n artist: "
								+ ((Album) MediaRental.mediaList.get(i)).artist	+"\n songs: "
								+ ((Album) MediaRental.mediaList.get(i)).songs;
					}
			}
			info2.setText(data);
			}
		});
		
		Date d1=new Date();//Create object of date 
		
		TextField t3=new TextField();
		t3.setFont(new Font("Arial", 20));
		t3.setMinSize(400, 50);
		t3.setTranslateX(200);
		t3.setTranslateY(530);
		t3.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t3.setText(d1.toString());//set date
		
		//label
		Label lb1=new Label("Customer ID");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);
		
		//label
		Label lb2=new Label("Media Code");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(280);
		
		//label
		Label lb3=new Label("Rented Date");
		lb3.setFont(new Font("Arial", 30));
		lb3.setTextFill(Color.NAVY);
		lb3.setTranslateX(10);
		lb3.setTranslateY(540);
		
		//label
		Label lb4=new Label("");
		lb4.setFont(new Font("Arial", 40));
		lb4.setTranslateY(680);
		
		Image myimage = new Image(new FileInputStream("back.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button back=new Button("back",myview);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(700);
		back.setTranslateY(600);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			rent();//go back to rent menu
			primaryStage.close();
		});
		
		Image myimage1 = new Image(new FileInputStream("addToCart.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button add=new Button("add to cart",myview1);
		add.setFont(new Font("Arial", 30));
		add.setTextFill(Color.DARKBLUE);
		add.setTranslateX(50);
		add.setTranslateY(600);
		add.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		add.setOnAction(e->{
			if(Driver.isCustomerExist(t1.getText())==false||Driver.isMediaExistAnyType(t2.getText())==false) {//if customer or media not on data base show error message
				lb4.setTextFill(Color.RED);
				lb4.setText("the customer or media not in database");
				lb4.setTranslateX(120);
			}
			if(Driver.isAdded(t1.getText(), t2.getText())) {//if this media added to the customer cart before show error message
				lb4.setTextFill(Color.RED);
				lb4.setText("this media added before");
				lb4.setTranslateX(230);
			}
			if(t1.getText().equals("")||t2.getText().equals("")) {//if there is null boxes show error message
				lb4.setTextFill(Color.RED);
				lb4.setText("please fill all boxis");
				lb4.setTranslateX(280);
			}
			if(Driver.isCustomerExist(t1.getText())==true&&Driver.isMediaExistAnyType(t2.getText())==true&&Driver.isAdded(t1.getText(), t2.getText())==false&&t1.getText().equals("")==false&&t2.getText().equals("")==false) {//if the customer and the media in the database and the media not added to the customer cart before and there is no null boxes then add the media to the customer cart
				Driver.testingAddingToCart(t1.getText(), t2.getText());
				lb4.setTextFill(Color.BLUE);
				lb4.setText("added Successfully");
				lb4.setTranslateX(280);
			}
		});
		
		Image myimage2 = new Image(new FileInputStream("addToCart.png"));
		ImageView myview2 = new ImageView(myimage2);
		myview2.setFitHeight(40);
		myview2.setFitWidth(40);
		Button process=new Button("Process Cart",myview2);
		process.setFont(new Font("Arial", 30));
		process.setTextFill(Color.DARKBLUE);
		process.setTranslateX(300);
		process.setTranslateY(600);
		process.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		process.setOnAction(e->{
			Driver.testProcessingRequestsTow();//call process requests method
		});
		
		
		Scene scene = new Scene(root,900,750);
		root.getChildren().addAll(t1,t2,t3,lb1,lb2,lb3,lb4,info1,info2,add,process,back);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void printIntersted() {
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("all intersted info");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//text area
		TextArea info=new TextArea();
		info.setFont(new Font("Arial", 20));
		info.setTranslateX(200);
		info.setTranslateY(100);
		info.setMinSize(310, 300);
		info.setMaxSize(310, 300);
		info.setEditable(false);
		
		//label
		Label lb1=new Label("Customer ID");
		lb1.setTranslateX(15);
		lb1.setTranslateY(20);
		lb1.setFont(new Font("Arial", 25));
		lb1.setTextFill(Color.NAVY);
		
		//label
		Label lb2=new Label("intersted media:");
		lb2.setTranslateX(15);
		lb2.setTranslateY(100);
		lb2.setFont(new Font("Arial", 25));
		lb2.setTextFill(Color.NAVY);
		
		//label
		Label lb3=new Label("");
		lb3.setTranslateY(500);
		lb3.setFont(new Font("Arial", 30));
		
		//text field
		TextField t=new TextField();
		t.setTranslateX(200);
		t.setTranslateY(10);
		t.setFont(new Font("Arial", 25));
		t.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		
		Image myimage = new Image(new FileInputStream("print.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button show=new Button("show ",myview);
		show.setFont(new Font("Arial", 30));
		show.setTextFill(Color.DARKBLUE);
		show.setMinWidth(150);
		show.setTranslateX(100);
		show.setTranslateY(420);
		show.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		show.setOnAction(e->{
			if(Driver.isCustomerExist(t.getText())==false) {//if customer not in database show error message
				lb3.setText("customer not found");
				lb3.setTextFill(Color.RED);
				lb3.setTranslateX(150);
				info.setText("");
			}
			
			if(t.getText().equals("")==true) {//if the id box is null show error message
				lb3.setText("fill the id box");
				lb3.setTextFill(Color.RED);
				lb3.setTranslateX(200);
				info.setText("");
			}
			
			if(Driver.isCustomerExist(t.getText())==true) {//if customer found print interested media
			info.setText(Driver.interstedPrint(t.getText()));
			lb3.setText("");
			}

		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(300);
		back.setTranslateY(420);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			rent();//go back to renting menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,600,550);
		root.getChildren().addAll(lb1,lb2,lb3,t,info,show,back);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void printRented() {// a method tp print rented media for a custoner interface
		try {
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("all Rented info");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//text area
		TextArea info=new TextArea();
		info.setFont(new Font("Arial", 20));
		info.setTranslateX(200);
		info.setTranslateY(100);
		info.setMinSize(310, 300);
		info.setMaxSize(310, 300);
		info.setEditable(false);
		
		//label
		Label lb1=new Label("Customer ID");
		lb1.setTranslateX(15);
		lb1.setTranslateY(20);
		lb1.setFont(new Font("Arial", 25));
		lb1.setTextFill(Color.NAVY);
		
		//label
		Label lb2=new Label("Rented media:");
		lb2.setTranslateX(15);
		lb2.setTranslateY(100);
		lb2.setFont(new Font("Arial", 25));
		lb2.setTextFill(Color.NAVY);
		
		//label
		Label lb3=new Label("");
		lb3.setTranslateY(500);
		lb3.setFont(new Font("Arial", 30));
		
		//text field
		TextField t=new TextField();
		t.setTranslateX(200);
		t.setTranslateY(10);
		t.setFont(new Font("Arial", 25));
		t.setFont(new Font("Arial", 25));
		
		Image myimage = new Image(new FileInputStream("print.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button show=new Button("show ",myview);
		show.setFont(new Font("Arial", 30));
		show.setTextFill(Color.DARKBLUE);
		show.setMinWidth(150);
		show.setTranslateX(100);
		show.setTranslateY(420);
		show.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		show.setOnAction(e->{
			if(Driver.isCustomerExist(t.getText())==false) {//if customer not in data base print error message
				lb3.setText("customer not found");
				lb3.setTextFill(Color.RED);
				lb3.setTranslateX(150);
				info.setText("");
			}
			
			if(t.getText().equals("")==true) {//if id box is null show error message
				lb3.setText("fill the id box");
				lb3.setTextFill(Color.RED);
				lb3.setTranslateX(200);
				info.setText("");
			}
			
			if(Driver.isCustomerExist(t.getText())==true) {//if customer found print rented media
			info.setText(Driver.RentedPrint(t.getText()));
			lb3.setText("");
			}
			
			
		
		});
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1 = new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 30));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(300);
		back.setTranslateY(420);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			rent();//back to renting menu
			primaryStage.close();
		});
		
		
		Scene scene = new Scene(root,600,550);
		root.getChildren().addAll(lb1,lb2,lb3,t,info,show,back);
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	public static void returnMedia() {//interface to return media from rented list
		try{
		Stage primaryStage=new Stage();
		Pane root=new Pane();
		primaryStage.setTitle("return media menu");
		root.setStyle("-fx-background-color: #af9b81;\r\n");
		
		//text area
		TextArea info1=new TextArea();
		info1.setFont(new Font("Arial", 20));
		info1.setTranslateX(200);
		info1.setTranslateY(100);
		info1.setMinSize(630, 150);
		info1.setMaxSize(630, 150);
		info1.setEditable(false);
		
		//text area
		TextArea info2=new TextArea();
		info2.setFont(new Font("Arial", 20));
		info2.setTranslateX(200);
		info2.setTranslateY(360);
		info2.setMinSize(630, 150);
		info2.setMaxSize(630, 150);
		info2.setEditable(false);

		//text field
		TextField t1=new TextField();
		t1.setFont(new Font("Arial", 30));
		t1.setTranslateX(200);
		t1.setTranslateY(10);
		t1.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t1.setOnAction(e->{
			String data="";
			for(int i=0;i<MediaRental.customersList.size();i++) {//tp print the custmer info
				if(t1.getText().equals(MediaRental.customersList.get(i).ID)) {
					 data = "ID: " + MediaRental.customersList.get(i).ID + "\n mobile number: "
							+ MediaRental.customersList.get(i).mobileNumber + "\n name: "
							+ MediaRental.customersList.get(i).name + "\n address: "
							+ MediaRental.customersList.get(i).address + "\n plan: "
							+ MediaRental.customersList.get(i).plan;
							break;
				}
			}
			info1.setText(data);
		});
		
		//text field
		TextField t2=new TextField();
		t2.setFont(new Font("Arial", 30));
		t2.setTranslateX(200);
		t2.setTranslateY(270);
		t2.setStyle("-fx-background-color: #eeffff;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		t2.setOnAction(e->{
			String data="";
			for(int i=0;i<MediaRental.mediaList.size();i++) {//to print the media info
				if(t2.getText().equals(MediaRental.mediaList.get(i).code)) {
					if(MediaRental.mediaList.get(i) instanceof Movie) {
						data = "code: " + MediaRental.mediaList.get(i).code + "\n title: "
								+ MediaRental.mediaList.get(i).title + "\n copies number: "
								+ MediaRental.mediaList.get(i).numberOfCopies + "\n rating: "
								+ ((Movie) MediaRental.mediaList.get(i)).rating;
					}
					if(MediaRental.mediaList.get(i) instanceof Game) {
						data = "code: " + MediaRental.mediaList.get(i).code + "\n title: "
								+ MediaRental.mediaList.get(i).title + "\n copies number: "
								+ MediaRental.mediaList.get(i).numberOfCopies + "\n weight: "
								+ ((Game) MediaRental.mediaList.get(i)).weight;
					}
					if(MediaRental.mediaList.get(i) instanceof Album) {
						data = "code: " + MediaRental.mediaList.get(i).code + "\n title: "
								+ MediaRental.mediaList.get(i).title + "\n copies number: "
								+ MediaRental.mediaList.get(i).numberOfCopies + "\n artist: "
								+ ((Album) MediaRental.mediaList.get(i)).artist	+"\n songs: "
								+ ((Album) MediaRental.mediaList.get(i)).songs;
					}
			}
			info2.setText(data);
			}
		});

		//label
		Label lb1=new Label("Customer ID");
		lb1.setFont(new Font("Arial", 30));
		lb1.setTextFill(Color.NAVY);
		lb1.setTranslateX(10);
		lb1.setTranslateY(20);
		
		//label
		Label lb2=new Label("Media Code");
		lb2.setFont(new Font("Arial", 30));
		lb2.setTextFill(Color.NAVY);
		lb2.setTranslateX(10);
		lb2.setTranslateY(280);
		
		//label
		Label lb4=new Label("");
		lb4.setFont(new Font("Arial", 40));
		lb4.setTranslateY(680);
		
		Image myimage1 = new Image(new FileInputStream("back.png"));
		ImageView myview1= new ImageView(myimage1);
		myview1.setFitHeight(40);
		myview1.setFitWidth(40);
		Button back=new Button("back",myview1);
		back.setFont(new Font("Arial", 40));
		back.setTextFill(Color.BLACK);
		back.setTranslateX(500);
		back.setTranslateY(600);
		back.setStyle("-fx-background-color: #ff3e2d;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		back.setOnAction(e->{
			rent();//go back to renting menu
			primaryStage.close();
		});
		
		Image myimage = new Image(new FileInputStream("removeFromCart.png"));
		ImageView myview = new ImageView(myimage);
		myview.setFitHeight(40);
		myview.setFitWidth(40);
		Button return1=new Button("return media",myview);
		return1.setFont(new Font("Arial", 40));
		return1.setTextFill(Color.DARKBLUE);
		return1.setTranslateX(150);
		return1.setTranslateY(600);
		return1.setStyle("-fx-background-color: #3cb371;\r\n"
				+ "        -fx-background-radius:100;\r\n");
		return1.setOnAction(e->{
			if(Driver.isCustomerExist(t1.getText())==false||Driver.isMediaExistAnyType(t2.getText())==false) {//if the customer or the media not found in the data base print error message
				lb4.setTextFill(Color.RED);
				lb4.setText("the customer or media not in database");
				lb4.setTranslateX(120);
			}
			if(Driver.isCustomerExist(t1.getText())==true&&Driver.isMediaExistAnyType(t2.getText())==true&&Driver.isRented(t1.getText(), t2.getText())==false) {//if the media not rented by the customer print error message
				lb4.setTextFill(Color.RED);
				lb4.setText("not found in rented");
				lb4.setTranslateX(280);
			}
			if(t1.getText().equals("")||t2.getText().equals("")) {//if id box or code box is null show error message
				lb4.setTextFill(Color.RED);
				lb4.setText("please fill all boxis");
				lb4.setTranslateX(280);
			}
			if(Driver.isCustomerExist(t1.getText())==true&&Driver.isMediaExistAnyType(t2.getText())==true&&Driver.isRented(t1.getText(), t2.getText())==true&&t1.getText().equals("")==false&&t2.getText().equals("")==false) {//if the customer and the media are in the data base and the customer is alredy rented the media and no empry boxes return the media
				Driver.testReturnMedia(t1.getText(),t2.getText());
				lb4.setTextFill(Color.BLUE);
				lb4.setText("returned Successfully");
				lb4.setTranslateX(280);
			}
		});
		
		
		Scene scene = new Scene(root,900,750);
		root.getChildren().addAll(t1,t2,lb1,lb2,lb4,info1,info2,return1,back);//add all controls
		primaryStage.setScene(scene);
		primaryStage.show();
		
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}
