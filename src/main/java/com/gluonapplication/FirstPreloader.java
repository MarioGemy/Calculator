package com.gluonapplication;

import javafx.application.Preloader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class FirstPreloader extends Preloader {
    Stage stage;
    
    	private Scene createPreloaderScene() {
    		ImageView img = new ImageView ( new Image (FirstPreloader.class.getResource("/l.png").toExternalForm()));
            BorderPane p = new BorderPane();
            p.setCenter(img);
            Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
            return new Scene(p, visualBounds.getWidth(), visualBounds.getHeight());        
        }
        
        @Override
    	public void start(Stage stage) throws Exception {
            this.stage = stage;
            stage.setScene(createPreloaderScene());        
            stage.show();
        }
        
    public void handleStateChangeNotification(StateChangeNotification evt) {
        if (evt.getType() == StateChangeNotification.Type.BEFORE_START) {
            stage.hide();
            
        }
    }    
}