
import java.io.IOException;
import org.json.JSONException;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class WebView4 extends WebViewSample {
	WebView4(String UID, String UPW) {
		super(UID, UPW);

	}

	@Override public void start(Stage stage) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        // create scene
        stage.setTitle("­pµe±M­¶");
        Scene scene = new Scene(new Browser4(UID, UPW),1500,1000);
        stage.setScene(scene);
        stage.show();
    }
}
class Browser4 extends Browser {
    public Browser4(String UID, String UPW) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        super(UID, UPW);
        loadweb("http://www.hcy.idv.tw/2016java2/");
    }
    
}