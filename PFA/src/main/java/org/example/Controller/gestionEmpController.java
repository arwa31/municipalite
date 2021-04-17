package org.example.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class gestionEmpController implements Initializable {

	   @FXML
	    public void HandleEvents1(MouseEvent event) {
		   try {
              //add you loading or delays - ;-)
              Node node = (Node) event.getSource();
              Stage stage = (Stage) node.getScene().getWindow();
              //stage.setMaximized(true);
              stage.close();

              Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/org/example/views/ajouterEmployé.fxml")));
              stage.setScene(scene);
              stage.show();

          } catch (IOException ex) {
              System.err.println(ex.getMessage());
          }

      }
	   @FXML
	    public void HandleEvents2(MouseEvent event) {
		   try {
             //add you loading or delays - ;-)
             Node node = (Node) event.getSource();
             Stage stage = (Stage) node.getScene().getWindow();
             //stage.setMaximized(true);
             stage.close();

             Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/org/example/views/modifierEmployé.fxml")));
             stage.setScene(scene);
             stage.show();

         } catch (IOException ex) {
             System.err.println(ex.getMessage());
         }

     }
	   @FXML
	    public void HandleEvents3(MouseEvent event) {
		   try {
             //add you loading or delays - ;-)
             Node node = (Node) event.getSource();
             Stage stage = (Stage) node.getScene().getWindow();
             //stage.setMaximized(true);
             stage.close();

             Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/org/example/views/consulterEmp.fxml")));
             stage.setScene(scene);
             stage.show();

         } catch (IOException ex) {
             System.err.println(ex.getMessage());
         }

     }
	   @FXML
	    public void HandleEvents4(MouseEvent event) {
		   try {
             //add you loading or delays - ;-)
             Node node = (Node) event.getSource();
             Stage stage = (Stage) node.getScene().getWindow();
             //stage.setMaximized(true);
             stage.close();

             Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/org/example/views/supprimerEmp.fxml")));
             stage.setScene(scene);
             stage.show();

         } catch (IOException ex) {
             System.err.println(ex.getMessage());
         }

     }
	   @FXML
	    public void HandleEvents5(MouseEvent event) {
		   try {
             //add you loading or delays - ;-)
             Node node = (Node) event.getSource();
             Stage stage = (Stage) node.getScene().getWindow();
             //stage.setMaximized(true);
             stage.close();

             Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/org/example/views/RessourcesHumaines.fxml")));
             stage.setScene(scene);
             stage.show();

         } catch (IOException ex) {
             System.err.println(ex.getMessage());}
         }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	

}
