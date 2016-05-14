import java.io.IOException;
import org.json.JSONException;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class WebView7 extends WebViewSample {
	WebView7(String UID, String UPW) {
		super(UID, UPW);

	}

	@Override public void start(Stage stage) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        // create scene
        stage.setTitle("½u¤W²á¤Ñ«Ç");
        Scene scene = new Scene(new Browser7(UID, UPW),1500,1000);
        stage.setScene(scene);
        stage.show();
    }
}
class Browser7 extends Browser {
    public Browser7(String UID, String UPW) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        super(UID, UPW);
        loadweb("http://hcy.idv.tw/2016java2/chat");
    }
    
}