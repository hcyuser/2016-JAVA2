
import java.io.IOException;
import org.json.JSONException;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class WebView5 extends WebViewSample {
	WebView5(String UID, String UPW) {
		super(UID, UPW);

	}

	@Override public void start(Stage stage) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        // create scene
        stage.setTitle("遠距會議系統");
        Scene scene = new Scene(new Browser5(UID, UPW),1500,1000);
        stage.setScene(scene);
        stage.show();
    }
}
class Browser5 extends Browser {
    public Browser5(String UID, String UPW) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        super(UID, UPW);
        loadweb("http://vmeeting.utaipei.edu.tw/");
    }
    
}