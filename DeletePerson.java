
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DeletePerson implements Initializable{
	//Editted by Chit Hang Kwok
	//This program is to delete the peoples information from the txt file.

	@FXML private Label name;
	@FXML private Label status;
	@FXML private Label gender;
	@FXML private Label Age;
	@FXML private Label State;
	
	@FXML private TextField NameList;
	@FXML private TextField StatusList;
	@FXML private TextField GenderList;
	@FXML private TextField AgeList;
	@FXML private TextField StateList;
	
	@FXML Text text;
	@FXML private Button bt1;
	@FXML private Button bt2;
	
	Connection con = null;
	
	//private Desktop desktop = Desktop.getDesktop();
	
	public void Delete(ActionEvent event) throws Exception {
		
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("SubMenu.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		 FileWriter writer = null;
	 		
	 		try {
	 			writer = new FileWriter("C:\\Users\\PC\\Desktop\\AllPersonFile\\peoples.txt");
	 			BufferedWriter bwriter = new BufferedWriter(writer);
	 			//writer = new PrintWriter(new FileOutputStream("output.txt", true));
	 			//appending the file
	 			
	 		} catch (FileNotFoundException e) {
	 			System.err.println("File cannot be created, or cannot be opened");
	 			System.exit(0);
	 		}
	 		
	 		writer.write(NameList.getText() + "  ");
	 		writer.write(StatusList.getText() + "  ");
	 		writer.write(GenderList.getText()+ "  ");
	 		writer.write(AgeList.getText() + "  ");
	 		writer.write(StateList.getText() + "  ");
	 		
	 		
	 		writer.close();	
	 		if (con != null) {
		        text.setText("Database connection successful");
		        text.setVisible(true);
		        }else  {
			    text.setText("Database connection successful");
			    text.setVisible(true);
		        }
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	 public void BackToPreviousMenu(ActionEvent event) throws Exception{
     	
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("SubMenu.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
	
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
       
   		
   	}