//Michael Skipper, N01162792
//code for a clock with cloaked capability
import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import javafx.animation.Timeline; 
import javafx.animation.KeyFrame; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.util.Duration;

import java.util.Calendar;

import javafx.scene.control.Label; 
import java.text.SimpleDateFormat; 
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

import javafx.scene.paint.Color; 
import javafx.scene.text.Font;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TimeButtonDemo extends Application { 

   protected BorderPane getPane() {
   
      BorderPane pane = new BorderPane(); // pane for containing buttons and clock 
   
      HBox paneForButtons = new HBox(50); // pane for containing buttons
   
      DigitalClock clock = new DigitalClock(); // clock to be added to pane
      
      pane.setCenter(clock);
      
      Button US = new Button("12 hr");// code for 12-hour clock button 
      
      ImageView im1 = new ImageView(new Image("file:usa.jpg", true));
      
      im1.setFitWidth(40);// setting sizes
      
      im1.setFitHeight(40);
      
      US.setGraphic(im1);//graphics
      
      Button EU = new Button("24 hr");// code for 24-hour clock button
      
      ImageView im2 = new ImageView(new Image("file:EU.jpg", true));
      
      im2.setFitWidth(40);// setting sizes
      
      im2.setFitHeight(40);
      
      EU.setGraphic(im2);
      
      paneForButtons.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;" + "-fx-border-color: green;");// turning borders green
      
      paneForButtons.getChildren().addAll(US, EU);
      
      paneForButtons.setAlignment(Pos.CENTER);//aligning panes
      
      pane.setBottom(paneForButtons);
      
      US.setOnAction(e -> {
      
         clock.changeFormat12();//part of changing to 12-hour clock
         
      });
      
      EU.setOnAction(e -> {
      
         clock.changeFormat24();//part of changing to 24-hour clock
      });
      
      pane.setOnKeyPressed(e -> {
      
         if (e.getCode() == KeyCode.UP) {
         
            clock.setTextFill(Color.RED);//making things red on the press of an up arrow
            
         } else if (e.getCode() == KeyCode.DOWN) {
         
            clock.setTextFill(Color.CYAN);//making things cyan on the press of a down arrow
            
         } else if(e.getCode() == KeyCode.ENTER) {
         
            clock.setTextFill(Color.BLACK);//making things black on the press of an enter key
            
         } else if (e.getCode() == KeyCode.P) { 
            try {
               play();//making things patriotic on the press of a P key
            } catch(URISyntaxException y) {}
         }
      });
      
      return pane;
   }
  
   public void start(Stage primaryStage) {

      Scene scene = new Scene(getPane(),250, 150); // Create a scene and place it in the stage
      primaryStage.setTitle("ClockApplication"); // Set the stage title 
      primaryStage.setScene(scene); // Place the scene in the stage 
      primaryStage.show(); // Display the stage
   }

   public static void main(String[] args) { 

      launch(args); //3...2...1...
   
   } 
   
   public static void play() throws URISyntaxException {//calling acts of nationalism
      URI uri = new URI("https://www.youtube.com/watch?v=M1wLtAXDgqg");
      play(uri);
   }
   
   public static void play(URI uri) {//a method of honoring our freedom
      if (Desktop.isDesktopSupported()) {
         try {
            Desktop.getDesktop().browse(uri);//the real secret
         } catch(IOException e) {}
      }
   }
}
   
   class DigitalClock extends Label {
      
      private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); 
      
      private Timeline animation;
   
      private Calendar time;
      
      public DigitalClock() {
      
         // get time and set text with lambda
         time = Calendar.getInstance();
         setText(dateFormat.format(time.getTime()));
                  
         // change text font here
         setFont(new Font("Arial", 30));
         
         // set animation here
         animation = new Timeline(new KeyFrame(Duration.seconds(0.1), e -> {
         
            time.setTime(Calendar.getInstance().getTime()); //update time
            
            setText(dateFormat.format(time.getTime())); //set new time
            
         }));
   
         animation.setCycleCount(Timeline.INDEFINITE);//perpetual repetition
         
         animation.play();//blurring the demarcation between reality and animation
         
      }
      
      public void changeFormat24(){
         dateFormat = new SimpleDateFormat("HH:mm:ss"); // write code here for changing to 24 hour clock
      }

      public void changeFormat12(){
         dateFormat = new SimpleDateFormat("hh:mm:ss a"); // write code here for changing to 12 hour clock
      } 
}