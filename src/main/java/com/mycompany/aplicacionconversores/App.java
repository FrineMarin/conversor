//Escalable con clase de la que puedo instanciar diferentes conversores, la cual recibe 3 arrays como parametros
package com.mycompany.aplicacionconversores;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage window) {
        window.setTitle("Conversor");
        
        
        Scene scene = new Scene(menuInicio.getLayout(),310,200);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }

}