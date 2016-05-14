
import java.io.IOException;
import org.json.JSONException;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class WebView1 extends WebViewSample {
	WebView1(String UID, String UPW) {
		super(UID, UPW);
	}

	@Override public void start(Stage stage) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        // create scene
        stage.setTitle("LMS");
        Scene scene = new Scene(new Browser1(UID, UPW),1500,1000);
        stage.setScene(scene);
        stage.show();
    }
}
class Browser1 extends Browser {
    public Browser1(String UID, String UPW) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        super(UID, UPW); 
        loadweb("http://lms.utaipei.edu.tw/");
    }
    
    
}