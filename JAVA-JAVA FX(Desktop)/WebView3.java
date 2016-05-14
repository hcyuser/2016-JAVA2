
import java.io.IOException;
import org.json.JSONException;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class WebView3 extends WebViewSample {
	WebView3(String UID, String UPW) {
		super(UID, UPW);

	}

	@Override public void start(Stage stage) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        // create scene
        stage.setTitle("校務系統");
        Scene scene = new Scene(new Browser3(UID, UPW),1500,1000);
        stage.setScene(scene);
        stage.show();
    }
}
class Browser3 extends Browser {
    public Browser3(String UID, String UPW) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        super(UID, UPW);
        loadweb("http://my.utaipei.edu.tw/");
    }
    
}