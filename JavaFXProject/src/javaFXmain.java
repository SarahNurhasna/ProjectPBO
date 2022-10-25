/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author Asus
 */
public class javaFXmain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sarah Nurhasna Khairunnisa");
        
        Button btn = new Button();
        btn.setText("Click me!");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("You are special and you're doing great!");
            }
        });
        
        Button btn2 = new Button("Hey");
        Button btn3 = new Button("Hello");
        Button btn4 = new Button("Hi");
        
        VBox buttons = new VBox();
        buttons.getChildren().addAll(btn,btn2, btn3, btn4);
        StackPane root = new StackPane();
        root.getChildren().addAll(buttons);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     *         
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
