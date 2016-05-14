import java.io.IOException;
import org.json.JSONException;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class WebView6 extends WebViewSample {
	WebView6(String UID, String UPW) {
		super(UID, UPW);

	}

	@Override public void start(Stage stage) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        // create scene
        stage.setTitle("校外美食地圖");
        Scene scene = new Scene(new Browser6(UID, UPW),1500,1000);
        stage.setScene(scene);
        stage.show();
    }
}
class Browser6 extends Browser {
    public Browser6(String UID, String UPW) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        super(UID, UPW);
        loadweb("http://hcy.idv.tw/2016java2/googlemap/");
    }
    
}