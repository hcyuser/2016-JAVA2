
import java.io.IOException;
import org.json.JSONException;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class WebView2 extends WebViewSample {
	WebView2(String UID, String UPW) {
		super(UID, UPW);

	}

	@Override public void start(Stage stage) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        // create scene
        stage.setTitle("二手拍賣中心");
        Scene scene = new Scene(new Browser2(UID, UPW),800,800);
        stage.setScene(scene);
        stage.show();
    }
}
class Browser2 extends Browser {
    public Browser2(String UID,String UPW) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
    	
        super(UID, UPW); 
        loadweb("http://www.hcy.idv.tw/utcsshop/");
    }
    
}
    
