package com.gluonapplication;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class GluonApplication extends Application {

	//-------------- Variables -------------------

		String num1 ="";
		String num2 ="";
		String op ;
		double result= 0;
		boolean oldop =false ,
				n1dot=false , 
				n2dot=false ,
				sqrtp=false;
	//---------------------------------------------
		
		
	    @Override
	    public void start(Stage stage) {
	    	
	    	
	    	//--------------------------- Creating Buttons -------------------		
	    	BorderPane pane = new BorderPane();
	    	
	    	Button one = new Button("1");
			one.prefWidthProperty().bind(pane.widthProperty().divide(4));
			one.prefHeightProperty().bind(pane.heightProperty().divide(5));
			one.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button two = new Button("2");
			two.prefWidthProperty().bind(pane.widthProperty().divide(4));
			two.prefHeightProperty().bind(pane.heightProperty().divide(5));
			two.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button three = new Button("3");
			three.prefWidthProperty().bind(pane.widthProperty().divide(4));
			three.prefHeightProperty().bind(pane.heightProperty().divide(5));
			three.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button four = new Button("4");
			four.prefWidthProperty().bind(pane.widthProperty().divide(4));
			four.prefHeightProperty().bind(pane.heightProperty().divide(5));
			four.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button five = new Button("5");
			five.prefWidthProperty().bind(pane.widthProperty().divide(4));
			five.prefHeightProperty().bind(pane.heightProperty().divide(5));
			five.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button six = new Button("6");
			six.prefWidthProperty().bind(pane.widthProperty().divide(4));
			six.prefHeightProperty().bind(pane.heightProperty().divide(5));
			six.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button seven = new Button("7");
			seven.prefWidthProperty().bind(pane.widthProperty().divide(4));
			seven.prefHeightProperty().bind(pane.heightProperty().divide(5));
			seven.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button eight = new Button("8");
			eight.prefWidthProperty().bind(pane.widthProperty().divide(4));
			eight.prefHeightProperty().bind(pane.heightProperty().divide(5));
			eight.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button nine = new Button("9");
			nine.prefWidthProperty().bind(pane.widthProperty().divide(4));
			nine.prefHeightProperty().bind(pane.heightProperty().divide(5));
			nine.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button zero = new Button("0");
			zero.prefWidthProperty().bind(pane.widthProperty().divide(4));
			zero.prefHeightProperty().bind(pane.heightProperty().divide(5));
			zero.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button pls = new Button("+");
			pls.prefWidthProperty().bind(pane.widthProperty().divide(4));
			pls.prefHeightProperty().bind(pane.heightProperty().divide(5));
			pls.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button mns = new Button("-");
			mns.prefWidthProperty().bind(pane.widthProperty().divide(4));
			mns.prefHeightProperty().bind(pane.heightProperty().divide(5));
			mns.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button eql = new Button("=");
			eql.prefWidthProperty().bind(pane.widthProperty().divide(4));
			eql.prefHeightProperty().bind(pane.heightProperty().divide(5));
			eql.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button mlt = new Button("*");
			mlt.prefWidthProperty().bind(pane.widthProperty().divide(4));
			mlt.prefHeightProperty().bind(pane.heightProperty().divide(5));
			mlt.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button div = new Button("/");
			div.prefWidthProperty().bind(pane.widthProperty().divide(4));
			div.prefHeightProperty().bind(pane.heightProperty().divide(5));
			div.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button dot = new Button(".");
			dot.prefWidthProperty().bind(pane.widthProperty().divide(4));
			dot.prefHeightProperty().bind(pane.heightProperty().divide(5));
			dot.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button sqrt= new Button("\u221A");
			sqrt.prefWidthProperty().bind(pane.widthProperty().divide(4));
			sqrt.prefHeightProperty().bind(pane.heightProperty().divide(5));
			sqrt.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button po2 = new Button("x\u00B2");
			po2.prefWidthProperty().bind(pane.widthProperty().divide(4));
			po2.prefHeightProperty().bind(pane.heightProperty().divide(5));
			po2.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");

			Button ac = new Button("AC");
			ac.prefWidthProperty().bind(pane.widthProperty().divide(4));
			ac.prefHeightProperty().bind(pane.heightProperty().divide(5));
			ac.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:25;");

			Button del = new Button("\u21B2");
			del.prefWidthProperty().bind(pane.widthProperty().divide(4));
			del.prefHeightProperty().bind(pane.heightProperty().divide(5));
			del.setStyle("-fx-font-weight: bold; -fx-color:white; -fx-font-style: italic; -fx-font-size:30;");
	    			
	    		
	    	//---------------- Setting the Buttons in a Pannel -----------------------
	    			GridPane buttons = new GridPane();

	    			buttons.add(sqrt ,0,0);
	    			buttons.add(seven ,0,1);
	    			buttons.add(four ,0,2);
	    			buttons.add(one ,0,3);
	    			buttons.add(dot ,0,4);
	    			buttons.add(po2 ,1,0);
	    			buttons.add(eight ,1,1);
	    			buttons.add(five ,1,2);
	    			buttons.add(two ,1,3);
	    			buttons.add(zero ,1,4);
	    			buttons.add(del ,2,0);
	    			buttons.add(nine ,2,1);
	    			buttons.add(six ,2,2);
	    			buttons.add(three ,2,3);
	    			buttons.add(ac ,2,4);
	    			buttons.add(mlt ,3,0);
	    			buttons.add(div ,3,1);
	    			buttons.add(mns ,3,2);
	    			buttons.add(pls ,3,3);
	    			buttons.add(eql ,3,4);
	    			buttons.setVgap(5);
	    			buttons.setHgap(5);
	    			buttons.setStyle("-fx-font-size:15; -fx-padding:5; ");
	    			
	    			TextArea lbl = new TextArea("");
	    			lbl.setStyle("-fx-font-size:30; -fx-background-color: #faffac ; -fx-padding:5; -fx-border-color:white; ");
	    			lbl.setMaxWidth(Double.MAX_VALUE);
	    			lbl.setPrefColumnCount(0);
	    			lbl.setPrefRowCount(0);
	    			lbl.setWrapText(false);
	    			lbl.setEditable(false);
	    			
	    			Button exit = new Button("Exit");
	    			exit.setMaxWidth(Double.MAX_VALUE);
	    			exit.setStyle("-fx-background-color: #faffac; -fx-padding:5;  -fx-text-fill: red; -fx-font-size:15");

	    			
	    			pane.setTop(lbl);
	    			pane.setCenter(buttons);
	    			pane.setBottom(exit);
	    			pane.setStyle("-fx-background-color:black; -fx-padding:5;");
	    			
	    	//-------------------------------------------------------------------------		

	        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
	        Scene scene = new Scene(pane, visualBounds.getWidth(), visualBounds.getHeight());

	        stage.getIcons().add(new Image(GluonApplication.class.getResourceAsStream("/icon.png")));
	        stage.setScene(scene);

	    	//---------------------- Welcoming Stage -----------------------		
			Stage welcome = new Stage();
			welcome.setWidth(visualBounds.getWidth());
			welcome.setHeight(visualBounds.getHeight());
			Button abtus = new Button("About Us");
			Button strtclc = new Button ("Start Calculator");
			VBox border= new VBox(50);
			border.getChildren().addAll(abtus,strtclc);
			border.setAlignment(Pos.CENTER);
			
			BackgroundImage myBI= new BackgroundImage(new Image(GluonApplication.class.getResource("/0.jpg").toExternalForm()),
					BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, 
					BackgroundPosition.CENTER ,BackgroundSize.DEFAULT);
			
			border.setBackground(new Background(myBI));
			Scene nwscene = new Scene(border, visualBounds.getWidth(), visualBounds.getHeight());
			
			welcome.setScene(nwscene);
			welcome.show();
			
			strtclc.setOnAction(e->{
				stage.show();
				welcome.hide();
			}); 
		
			
			//---------------------- About Us Stage ------------------------		
			Stage about = new Stage();
			
			Image img = new Image (GluonApplication.class.getResource("/3.jpg").toExternalForm());
			Image img1 = new Image (GluonApplication.class.getResource("/12.jpg").toExternalForm());
			Image img2 = new Image (GluonApplication.class.getResource("/13.jpg").toExternalForm());
			Image img3 = new Image (GluonApplication.class.getResource("/5.jpg").toExternalForm());
			Image img4 = new Image (GluonApplication.class.getResource("/4.jpg").toExternalForm());
			Image img5 = new Image (GluonApplication.class.getResource("/6.jpg").toExternalForm());
			
			ImageView mario = new ImageView (img);
			mario.setFitHeight(200);
			mario.setFitWidth(150);
			ImageView kerolos = new ImageView (img1);
			kerolos.setFitHeight(200);
			kerolos.setFitWidth(150);
			ImageView kyrolos = new ImageView (img2);
			kyrolos.setFitHeight(200);
			kyrolos.setFitWidth(150);
			ImageView sylvia = new ImageView (img3);
			sylvia.setFitHeight(200);
			sylvia.setFitWidth(150);
			ImageView selvia = new ImageView (img4);
			selvia.setFitHeight(200);
			selvia.setFitWidth(150);
			ImageView blank = new ImageView (img5);
			blank.setFitHeight(200);
			blank.setFitWidth(150);
			
			FlowPane abtpane = new FlowPane();
			

			ToggleGroup team = new ToggleGroup();
			RadioButton r1 = new RadioButton("Mario");
			RadioButton r2 = new RadioButton("kerolos");
			RadioButton r3 = new RadioButton("Kyrolos");
			RadioButton r4 = new RadioButton("Sylvia");
			RadioButton r5 = new RadioButton("Selvia");
			
			r1.setToggleGroup(team);
			r2.setToggleGroup(team);
			r3.setToggleGroup(team);
			r4.setToggleGroup(team);
			r5.setToggleGroup(team);
			
			Label lbll = new Label("Choose the name\n\tto view his role\n");
			lbll.setStyle("-fx-background-color: #faffac; -fx-padding:5;  -fx-text-fill: red; -fx-font-size:30; -fx-border-color:black ;");
			
			BorderPane bpp = new BorderPane();
			Button backk = new Button ("Back");
			backk.setMaxWidth(Double.MAX_VALUE);
			backk.setPadding(new Insets(20,30,20,30));
			backk.setStyle("-fx-text-fill: black; -fx-font-size:20");
			backk.setOnAction(e->{
				about.close();
				welcome.show();
			});
		
			
			VBox radio = new VBox(20);
			radio.getChildren().addAll(r1,r2,r3,r4,r5);
			radio.setPadding(new Insets(15,15,15,15));
			abtpane.getChildren().addAll(radio,blank);
			bpp.setTop(abtpane);
			bpp.setCenter(lbll);
			bpp.setBottom(backk);
			Scene abtscene = new Scene(bpp, visualBounds.getWidth(), visualBounds.getHeight());
			about.setScene(abtscene);
			
			r1.setOnAction(e->{
				if (r1.isSelected())
				{
					FlowPane abtpane1 = new FlowPane();
					BorderPane bp1 = new BorderPane();
					Button back = new Button ("Back");
					back.setMaxWidth(Double.MAX_VALUE);
					back.setPadding(new Insets(20,30,20,30));
					back.setStyle("-fx-text-fill: black; -fx-font-size:20");
					Label lbl1 = new Label("Mario Gamal\nSection(5)\nBack-End Developer\n");
					lbl1.setStyle("-fx-background-color: #faffac; -fx-padding:5;  -fx-text-fill: red; -fx-font-size:30; -fx-border-color:black ;");
					abtpane1.getChildren().addAll(radio,mario);	
					bp1.setTop(abtpane1);
					bp1.setCenter(lbl1);
					bp1.setBottom(back);
					Scene abtscene1 = new Scene(bp1, visualBounds.getWidth(), visualBounds.getHeight());
					about.setScene(abtscene1);	
					back.setOnAction(r->{
						about.close();
						welcome.show();
					});
					
				}
			});
			r2.setOnAction(e->{
				if (r2.isSelected())
				{
					FlowPane abtpane1 = new FlowPane();
					BorderPane bp1 = new BorderPane();
					Button back = new Button ("Back");
					back.setMaxWidth(Double.MAX_VALUE);
					back.setPadding(new Insets(20,30,20,30));
					back.setStyle("-fx-text-fill: black; -fx-font-size:20");
					Label lbl1 = new Label("Kerolos Saber\nSection(5)\nQuality Assurance\n");
					lbl1.setStyle("-fx-background-color: #faffac; -fx-padding:5;  -fx-text-fill: red; -fx-font-size:30; -fx-border-color:black ;");
					abtpane1.getChildren().addAll(radio,kerolos);	
					bp1.setTop(abtpane1);
					bp1.setCenter(lbl1);
					bp1.setBottom(back);
					Scene abtscene1 = new Scene(bp1, visualBounds.getWidth(), visualBounds.getHeight());
					about.setScene(abtscene1);	
					back.setOnAction(r->{
						about.close();
						welcome.show();
					});	
				}
			});
			r3.setOnAction(e->{
				if (r3.isSelected())
				{
					FlowPane abtpane1 = new FlowPane();
					BorderPane bp1 = new BorderPane();
					Button back = new Button ("Back");
					back.setMaxWidth(Double.MAX_VALUE);
					back.setPadding(new Insets(20,30,20,30));
					back.setStyle("-fx-text-fill: black; -fx-font-size:20");
					Label lbl1 = new Label("kyrolos Monir\nSection(4)\nFront-End Developer\n");
					lbl1.setStyle("-fx-background-color: #faffac; -fx-padding:5;  -fx-text-fill: red; -fx-font-size:30; -fx-border-color:black ;");
					abtpane1.getChildren().addAll(radio,kyrolos);	
					bp1.setTop(abtpane1);
					bp1.setCenter(lbl1);
					bp1.setBottom(back);
					Scene abtscene1 = new Scene(bp1, visualBounds.getWidth(), visualBounds.getHeight());
					about.setScene(abtscene1);	
					back.setOnAction(r->{
						about.close();
						welcome.show();
					});		
				}
			});
			r4.setOnAction(e->{
				if (r4.isSelected())
				{
					FlowPane abtpane1 = new FlowPane();
					BorderPane bp1 = new BorderPane();
					Button back = new Button ("Back");
					back.setMaxWidth(Double.MAX_VALUE);
					back.setPadding(new Insets(20,30,20,30));
					back.setStyle("-fx-text-fill: black; -fx-font-size:20");
					Label lbl1 = new Label("Sylvia Essam\nSection(3)\nDocumentation\n");
					lbl1.setStyle("-fx-background-color: #faffac; -fx-padding:5;  -fx-text-fill: red; -fx-font-size:30; -fx-border-color:black ;");
					abtpane1.getChildren().addAll(radio,sylvia);	
					bp1.setTop(abtpane1);
					bp1.setCenter(lbl1);
					bp1.setBottom(back);
					Scene abtscene1 = new Scene(bp1, visualBounds.getWidth(), visualBounds.getHeight());
					about.setScene(abtscene1);	
					back.setOnAction(r->{
						about.close();
						welcome.show();
					});	
				}
			});
			r5.setOnAction(e->{
				if (r5.isSelected())
				{
					FlowPane abtpane1 = new FlowPane();
					BorderPane bp1 = new BorderPane();
					Button back = new Button ("Back");
					back.setMaxWidth(Double.MAX_VALUE);
					back.setPadding(new Insets(20,30,20,30));
					back.setStyle("-fx-text-fill: black; -fx-font-size:20");
					Label lbl1 = new Label("Selvia Saeed\nSection(3)\nAlgorithm & Idea\n");
					lbl1.setStyle("-fx-background-color: #faffac; -fx-padding:5;  -fx-text-fill: red; -fx-font-size:30; -fx-border-color:black ;");
					abtpane1.getChildren().addAll(radio,selvia);	
					bp1.setTop(abtpane1);
					bp1.setCenter(lbl1);
					bp1.setBottom(back);
					Scene abtscene1 = new Scene(bp1, visualBounds.getWidth(), visualBounds.getHeight());
					about.setScene(abtscene1);	
					back.setOnAction(r->{
						about.close();
						welcome.show();
					});	
				}
			});
			
			
			abtus.setOnAction(e->{
				welcome.close();
				about.show();
				
			});
	      //------------------------------ Numbers Actions --------------------------
			
			
			one.setOnAction(e ->
		    {
			if(!oldop && !sqrtp){
				num1+='1';
			lbl.setText(num1);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
			else if(!oldop && sqrtp){
				num1+='1';
			lbl.setText("\u221A"+" "+num1);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
			else if(oldop &&!sqrtp){
				num2+='1';
				lbl.setText(num1+" "+op+" "+num2);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();}
			else if(oldop &&sqrtp){
				num2+='1';
				lbl.setText(num1+" "+op+"\u221A"+" "+num2);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();}});
			
		
		two.setOnAction(e ->
	    {
	    	if(!oldop &&  !sqrtp){
				num1+='2';
			lbl.setText(num1);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
			else if(!oldop &&sqrtp){
				num1+='2';
			lbl.setText("\u221A"+" "+num1);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
			else if(oldop &&!sqrtp){
				num2+='2';
				lbl.setText(num1+" "+op+" "+num2);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();}
			else if(oldop &&sqrtp){
				num2+='2';
				lbl.setText(num1+" "+op+"\u221A"+" "+num2);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();}});
			
		
		three.setOnAction(e ->
	    {
	    	if(!oldop &&  !sqrtp){
				num1+='3';
			lbl.setText(num1);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
			else if(!oldop &&sqrtp){
				num1+='3';
			lbl.setText("\u221A"+" "+num1);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
			else if(oldop &&!sqrtp){
				num2+='3';
				lbl.setText(num1+" "+op+" "+num2);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();}
			else if(oldop &&sqrtp){
				num2+='3';
				lbl.setText(num1+" "+op+"\u221A"+" "+num2);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();}});
			
		
		four.setOnAction(e ->
	    {
		if(!oldop &&  !sqrtp){
			num1+='4';
		lbl.setText(num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(!oldop &&sqrtp){
			num1+='4';
		lbl.setText("\u221A"+" "+num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(oldop &&!sqrtp){
			num2+='4';
			lbl.setText(num1+" "+op+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
		else if(oldop &&sqrtp){
			num2+='4';
			lbl.setText(num1+" "+op+"\u221A"+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}});
		
		
		five.setOnAction(e ->
	    {
		if(!oldop &&  !sqrtp){
			num1+='5';
		lbl.setText(num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(!oldop &&sqrtp){
			num1+='5';
		lbl.setText("\u221A"+" "+num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(oldop &&!sqrtp){
			num2+='5';
			lbl.setText(num1+" "+op+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
		else if(oldop &&sqrtp){
			num2+='5';
			lbl.setText(num1+" "+op+"\u221A"+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}});
		
		
		six.setOnAction(e ->
	    {
		if(!oldop &&  !sqrtp){
			num1+='6';
		lbl.setText(num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(!oldop &&sqrtp){
			num1+='6';
		lbl.setText("\u221A"+" "+num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(oldop &&!sqrtp){
			num2+='6';
			lbl.setText(num1+" "+op+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
		else if(oldop &&sqrtp){
			num2+='6';
			lbl.setText(num1+" "+op+"\u221A"+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}});
		
		
		seven.setOnAction(e ->
	    {
		if(!oldop &&  !sqrtp){
			num1+='7';
		lbl.setText(num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(!oldop &&sqrtp){
			num1+='7';
		lbl.setText("\u221A"+" "+num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(oldop &&!sqrtp){
			num2+='7';
			lbl.setText(num1+" "+op+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
		else if(oldop &&sqrtp){
			num2+='7';
			lbl.setText(num1+" "+op+"\u221A"+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}});
		
		
		eight.setOnAction(e ->
	    {
		if(!oldop &&  !sqrtp){
			num1+='8';
		lbl.setText(num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(!oldop &&sqrtp){
			num1+='8';
		lbl.setText("\u221A"+" "+num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(oldop &&!sqrtp){
			num2+='8';
			lbl.setText(num1+" "+op+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
		else if(oldop &&sqrtp){
			num2+='8';
			lbl.setText(num1+" "+op+"\u221A"+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}});
		
		
		nine.setOnAction(e ->
	    {
		if(!oldop &&  !sqrtp){
			num1+='9';
		lbl.setText(num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(!oldop &&sqrtp){
			num1+='9';
		lbl.setText("\u221A"+" "+num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(oldop &&!sqrtp){
			num2+='9';
			lbl.setText(num1+" "+op+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
		else if(oldop &&sqrtp){
			num2+='9';
			lbl.setText(num1+" "+op+"\u221A"+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}});
		
		zero.setOnAction(e ->
	    {
		if(!oldop &&  !sqrtp){
			num1+='0';
		lbl.setText(num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(!oldop &&sqrtp){
			num1+='0';
		lbl.setText("\u221A"+" "+num1);
		lbl.selectPositionCaret(lbl.getLength());
		lbl.deselect();}
		else if(oldop &&!sqrtp){
			num2+='0';
			lbl.setText(num1+" "+op+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}
		else if(oldop &&sqrtp){
			num2+='0';
			lbl.setText(num1+" "+op+"\u221A"+" "+num2);
			lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();}});
		
		
//-------------------------------------------------------------------------
//------------------------- Operators & Other Actions ---------------------		
		
		dot.setOnAction(e ->
	    {
			if(!oldop && !n1dot && !sqrtp){
				num1+='.';
			    lbl.setText(num1);
			    lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();
			    n1dot=true;
			    }
			else if(!oldop && !n1dot &&sqrtp){
				num1+='.';
				lbl.setText("\u221A"+" "+num1);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();
				n1dot=true;
				}
			else if(oldop &&!n2dot && sqrtp){
				num2+='.';
				lbl.setText(num1+" "+op+"\u221A"+" "+num2);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();
				n2dot=true;
				}
			else if (!n2dot && oldop){
				num2+='.';
				lbl.setText(num1+" "+op+" "+num2);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();
				n2dot=true;}
		    else{
		    	return;}});
		
		pls.setOnAction(e -> {
			if(!oldop&& !sqrtp){
				if (! num1.isEmpty()&& num1 !="-"){
					oldop = true;
				    op="+";
				    lbl.setText(num1+" "+op);
				    lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();}
				else 
					return;}
			else if(!oldop&&sqrtp){
  				if (! num1.isEmpty()){
					result=Math.round(Math.sqrt(Double.parseDouble(num1))*10000)/10000.0;
					num1=String.valueOf(result);
					op="+";
					lbl.setText(String.valueOf(result)+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					sqrtp=false;
					oldop=true;}
				else return;}
			else if(oldop&&!sqrtp){
				if (! num2.isEmpty()&& num2 !=" -"){
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					num1=String.valueOf(result);
					num2="";
					op="+";
					lbl.setText(num1+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					oldop = true;
					n2dot=false;}
				else 
					return;}
			else if(oldop&&sqrtp){
				if (! num2.isEmpty()){
					num2=String.valueOf(Math.round(Math.sqrt(Double.parseDouble(num2))*10000)/10000.0);
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					num1=String.valueOf(result);
					num2="";
					op="+";
					lbl.setText(num1+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					oldop = true;
					sqrtp=false;
					n2dot=false;}
				else 
					return;}
			});
		
		mns.setOnAction(e -> {
			if(!oldop&&!sqrtp){
				if (! num1.isEmpty()&&  num1!="-"){
				    oldop = true;
			        op="-";
			        lbl.setText(num1+" "+op );
			        lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();}
			    else { 
				    num1="-";
				    lbl.setText(num1);
				    lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();}}
			else if(!oldop&&sqrtp){
  				if (! num1.isEmpty()){
					result=Math.round(Math.sqrt(Double.parseDouble(num1))*10000)/10000.0;
					num1=String.valueOf(result);
					op="-";
					lbl.setText(String.valueOf(result)+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					sqrtp=false;
					oldop=true;}
				else return;}
			else if(oldop && !sqrtp){
				if (! num2.isEmpty() && num2!=" -"){
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					num1=String.valueOf(result);
					num2="";
					op="-";
					lbl.setText(num1+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					oldop = true;
					n2dot=false;}
			    else {
			    	num2=" -";
			        lbl.setText(num1+" "+op+" "+num2);
			        lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();}}
			else if(oldop &&sqrtp){
				if (! num2.isEmpty() && num2!=" -"){
					num2=String.valueOf(Math.round(Math.sqrt(Double.parseDouble(num2))*10000)/10000.0);
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					num1=String.valueOf(result);
					num2="";
					op="-";
					lbl.setText(num1+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					oldop = true;
					sqrtp=false;
					n2dot=false;}
			    else {
			    	return;}}
			});
		
		mlt.setOnAction(e -> {
			if(!oldop&&!sqrtp){
				if (! num1.isEmpty()&& num1 !="-"){
					oldop = true;
				    op="*";
				    lbl.setText(num1+" "+op);
				    lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();}
				else 
					return;}
			else if(!oldop&&sqrtp){
  				if (! num1.isEmpty()){
					result=Math.round(Math.sqrt(Double.parseDouble(num1))*10000)/10000.0;
					num1=String.valueOf(result);
					op="*";
					lbl.setText(String.valueOf(result)+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					sqrtp=false;
					oldop=true;}
				else return;}
			else if(oldop&&!sqrtp){
				if (! num2.isEmpty()&& num2 !=" -"){
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					num1=String.valueOf(result);
					num2="";
					op="*";
					lbl.setText(num1+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					oldop = true;
					n2dot=false;}
				else 
					return;}
			else if(oldop&&sqrtp){
				if (! num2.isEmpty()){
					num2=String.valueOf(Math.round(Math.sqrt(Double.parseDouble(num2))*10000)/10000.0);
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					num1=String.valueOf(result);
					num2="";
					op="*";
					lbl.setText(num1+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					oldop = true;
					sqrtp=false;
					n2dot=false;}
				else 
					return;}
			});
		
		div.setOnAction(e -> {
			if(!oldop&&!sqrtp){
				if (! num1.isEmpty()&& num1 !="-"){
					oldop = true;
				    op="/";
				    lbl.setText(num1+" "+op);
				    lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();}
				else 
					return;}
			else if(!oldop&&sqrtp){
  				if (! num1.isEmpty()){
					result=Math.round(Math.sqrt(Double.parseDouble(num1))*10000)/10000.0;
					num1=String.valueOf(result);
					op="/";
					lbl.setText(String.valueOf(result)+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					sqrtp=false;
					oldop=true;}
				else return;}
			else if(oldop&&!sqrtp){
				if (! num2.isEmpty()&& num2 !=" -"){
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					num1=String.valueOf(result);
					num2="";
					op="/";
					lbl.setText(num1+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					oldop = true;
					n2dot=false;}
				else 
					return;}
			else if(oldop&&sqrtp){
				if (! num2.isEmpty()){
					num2=String.valueOf(Math.round(Math.sqrt(Double.parseDouble(num2))*10000)/10000.0);
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					num1=String.valueOf(result);
					num2="";
					op="/";
					lbl.setText(num1+" "+op);
					lbl.selectPositionCaret(lbl.getLength());
					lbl.deselect();
					oldop = true;
					sqrtp=false;
					n2dot=false;}
				else 
					return;}
		});
		
		eql.setOnAction(e ->{
			new Thread (()->{
				if(oldop && !sqrtp){
					if(! num2.isEmpty()){
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					Platform.runLater(() ->lbl.setText(String.valueOf(result)));
				    oldop=false;
				    num1=String.valueOf(result);
				    num2="";
				    n2dot=false;}
					else return;}
				else if(oldop && sqrtp){
					if(! num2.isEmpty()){
					num2=String.valueOf(Math.round(Math.sqrt(Double.parseDouble(num2))*10000)/10000.0);
					result=Math.round(calc(num1 , num2 ,op)*10000)/10000.0;
					Platform.runLater(() ->lbl.setText(String.valueOf(result)));
				    oldop=false;
				    sqrtp=false;
				    num1=String.valueOf(result);
				    num2="";
				    n2dot=false;}
					else return;}
				
				else if(sqrtp&&!oldop){
					if (! num1.isEmpty()){
						result=Math.round(Math.sqrt(Double.parseDouble(num1))*10000)/10000.0;
						Platform.runLater(() ->lbl.setText(String.valueOf(result)));
						num1=String.valueOf(result);
						sqrtp=false;
						n2dot=false;}
					else return;
				}
				else return;
				
			}).start();
		});
		
		sqrt.setOnAction(e ->{
			if (!oldop && num1.isEmpty()){
				lbl.setText("\u221A"+" ");
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();
				sqrtp=true;
				}
			else if(oldop && num2.isEmpty()&& num2!="\\s"){
				lbl.setText(num1+" "+op+"\u221A");
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();
				sqrtp=true;
				}
			else return;
		});
		

		po2.setOnAction(e ->{
			if(oldop&& !sqrtp){
				if(num2.isEmpty() && num2!=" -"&& num2!="\\s"){
					num2=String.valueOf(Double.parseDouble(num2)*Double.parseDouble(num2));
					 lbl.setText(num1+" "+op+" "+num2);
					 lbl.selectPositionCaret(lbl.getLength());
						lbl.deselect();
				}
				else return;
			}
			else{
				if (! num1.isEmpty()&& num1 !="-"&&!sqrtp){
			
						result=Double.parseDouble(num1)*Double.parseDouble(num1);
						lbl.setText(String.valueOf(result));
						lbl.selectPositionCaret(lbl.getLength());
						lbl.deselect();
						num1=String.valueOf(result);}
				else 
					return;}
			});
		
		ac.setOnAction(e -> {
			lbl.setText("");
			num1="";
			num2="";
			result=0;
			oldop=false;
			n1dot=false;
			n2dot=false;
			sqrtp=false;
		});
		
		del.setOnAction(e ->
	    {
		if(!oldop&&!sqrtp){
			if(! num1.isEmpty()){
			num1=num1.substring(0, num1.length()-1);
		    lbl.setText(num1);
		    lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();
		    if(!num1.matches(".*[.].*")) 
				n1dot = false;
		    }
			else{
				lbl.setText("");
				sqrtp = false;}}
		else if(!oldop&&sqrtp){
			if(! num1.isEmpty()){
			num1=num1.substring(0, num1.length()-1);
		    lbl.setText("\u221A"+" "+num1);
		    lbl.selectPositionCaret(lbl.getLength());
			lbl.deselect();
		    if(!num1.matches(".*[.].*")) 
				n1dot = false;
		    }
			else{
				lbl.setText("");
				sqrtp = false;}}
		else if(oldop&&!sqrtp){
			if(! num2.isEmpty()){
			    num2=num2.substring(0, num2.length()-1);
			    lbl.setText(num1+" "+op+" "+num2);
			    lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();
			    if(!num2.matches(".*[.].*")) 
					n2dot = false;}
			else
				{op="";
				oldop=false;
				lbl.setText(num1);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();
				n2dot=false;}}
		
		else if(oldop&&sqrtp){
			if(! num2.isEmpty()){
			    num2=num2.substring(0, num2.length()-1);
			    lbl.setText(num1+" "+op+"\u221A"+" "+num2);
			    lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();
			    if(!num2.matches(".*[.].*")) 
					n2dot = false;}
			else if(num2.isEmpty()&&sqrtp){
		 		sqrtp=false;
				lbl.setText(num1+" "+op);
				lbl.selectPositionCaret(lbl.getLength());
				lbl.deselect();}
			}
		});
		
		
	      		exit.setOnAction(e -> {
	      			stage.close();});}
	  //--------------------------------- End Of Start --------------------------
	  //-------------------------------------------------------------------------
	  	
	  	public double calc (String n1 , String n2 , String op){
	  	    
	  		switch (op) {
	  		case "+" :
	  			return Double.parseDouble(n1) + Double.parseDouble(n2) ;
	  		case "-" :
	  			return Double.parseDouble(n1) - Double.parseDouble(n2) ;
	  		case "*" :
	  			return Double.parseDouble(n1) * Double.parseDouble(n2) ;
	  		case "/" :
	  			if (Double.parseDouble(n2)!=0)
	  				return Double.parseDouble(n1) / Double.parseDouble(n2) ;
	  			else 
	  				return 0;
	  		default :
	  			return 0;
	  	   }
	    }
	}
