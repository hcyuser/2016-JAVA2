
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class LoginJavaFX extends Application {
	String UID;
	String UPW;
    @Override
    
    public void start(Stage primaryStage) {

    	GridPane grid = new GridPane();
    	
    	Image logoImage = new Image(
                getClass().getResourceAsStream("logo.jpg")
            );
    	final ImageView logo = new ImageView(logoImage);
        grid.setConstraints(logo, 1, 0);
        grid.getChildren().add(logo);
    	
    	
    	
    	 
    	grid.setAlignment(Pos.CENTER);
    	grid.setHgap(10); 
    	grid.setVgap(10); 
    	grid.setPadding(new Insets(25, 25, 25, 25)); 
    	
	
    	Scene scene = new Scene(grid, 400, 400);
    	primaryStage.setScene(scene);
 
	
    	Text scenetitle = new Text("�n�J");
    	scenetitle.setFont(Font.font("Serif", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 1, 1); 
 
    	Label userName = new Label("�b��:");
    	grid.add(userName, 0, 1);
 
    	TextField userID = new TextField();
    	grid.add(userID, 1, 1);
 
    	Label pw = new Label("�K�X:");
    	grid.add(pw, 0, 2);
 
    	PasswordField pwBox = new PasswordField();
    	grid.add(pwBox, 1, 2);
	
    	Button btn = new Button("�n�J");
    	HBox hbBtn = new HBox(btn); 
    	hbBtn.setAlignment(Pos.BOTTOM_CENTER);
    	grid.add(hbBtn, 1, 4);
 

    	final Text actiontarget = new Text(); 
    	grid.add(actiontarget, 1, 6);
    	btn.setOnAction(e -> { 
			try {
				DealJS DJ = new DealJS(userID.getText(),pwBox.getText());
				if(DJ.getAccess().equals("true")){					
					FirstView fv = new FirstView(userID.getText(),pwBox.getText());				
					fv.start(primaryStage);
					UID = userID.getText();
					UPW = pwBox.getText();
				}
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				actiontarget.setFill(Color.FIREBRICK);
				actiontarget.setText("�b���αK�X���~,�Э��s��J");
			}    
	});


	primaryStage.setTitle("�n�J");
	primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}