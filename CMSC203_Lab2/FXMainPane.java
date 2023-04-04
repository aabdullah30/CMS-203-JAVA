package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2: 
	//  declare five buttons, a label, and a textfield
	  private Button helloBtn, howdyBtn, chineseBtn, clearBtn, exitBtn;
	    private Label feedbackLbl;
	    private TextField feedbackTF;
	    
	//  declare two HBoxes
	    private HBox btnBox, feedbackBox;
	
	//student Task #4:
	//  declare an instance of DataManager
	    DataManager dataManager = new DataManager();
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		  helloBtn = new Button("Hello");
	        howdyBtn = new Button("Howdy");
	        chineseBtn = new Button("Chinese");
	        clearBtn = new Button("Clear");
	        exitBtn = new Button("Exit");
	        feedbackLbl = new Label("Feedback:");
	        feedbackTF = new TextField();
	        
		//  instantiate the HBoxes
	        btnBox = new HBox(10, helloBtn, howdyBtn, chineseBtn, clearBtn, exitBtn);
	        feedbackBox = new HBox(10, feedbackLbl, feedbackTF);
		
	      //student Task #3:
			//  add the label and textfield to one of the HBoxes
			//  add the buttons to the other HBox
			//  add the HBoxes to this FXMainPanel (a VBox)
	        // Add the components to the VBox
	        getChildren().addAll(feedbackBox, btnBox);

	        // Set margins and alignment of the components
	        setMargin(feedbackBox, new Insets(10));
	        setMargin(btnBox, new Insets(10));
	        feedbackBox.setAlignment(Pos.CENTER_LEFT);
	        btnBox.setAlignment(Pos.CENTER);
	        
	        
		//student Task #4:
		//  instantiate the DataManager instance
	        DataManager dataManager = new DataManager();
	      //add an instance of ButtonHandler as the handler for all the buttons
	        ButtonHandler buttonHandler = new ButtonHandler();
	        helloBtn.setOnAction(buttonHandler);
	        howdyBtn.setOnAction(buttonHandler);
	        chineseBtn.setOnAction(buttonHandler);
	        clearBtn.setOnAction(buttonHandler);
	        exitBtn.setOnAction(buttonHandler);
	        
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> {
	    @Override
	    public void handle(ActionEvent event) {
	        if (event.getSource() == helloBtn) {
	            feedbackTF.setText("Hello");
	        } else if (event.getSource() == howdyBtn) {
	            feedbackTF.setText("Howdy");
	        } else if (event.getSource() == chineseBtn) {
	            feedbackTF.setText("Ni hao");
	        } else if (event.getSource() == clearBtn) {
	            feedbackTF.setText("");
	        } else if (event.getSource() == exitBtn) {
	            Platform.exit();
	        }
	    }
	}
}
	