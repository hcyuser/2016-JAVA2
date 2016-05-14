
import java.io.IOException;
import org.json.JSONException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
public class WebViewSample extends Application {
	String UID,UPW,URL;
	WebViewSample(String UID,String UPW){
		this.UID = UID;
		this.UPW = UPW;
	}
	WebViewSample(){

	}
	WebViewSample(String UID,String UPW,String URL){
		this.UID = UID;
		this.UPW = UPW;
		this.URL = URL;
	}
    @Override public void start(Stage stage) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        // create scene
        stage.setTitle("歡迎使用");
        Scene scene = new Scene(new Browser(UID,UPW,URL),1500,1000);
        stage.setScene(scene);
        stage.show();
    }
    
}
class Browser extends Region {
	public static String UID;
	public static String UPW;
   public HBox toolBar;
 
    private static String[] captions = new String[]{
        "個人儲存雲",
        "LMS",
        "二手拍賣中心",
        "校務系統",
        "計畫專頁",
        "遠距會議系統",
        "資科系系網",
        "線上聊天室"
    };
    
    private static String[] urls = new String[]{
    		"https://tl.utaipei.edu.tw/",
            "http://lms.utaipei.edu.tw/",
            "http://www.hcy.idv.tw/utcsshop/",
            "http://my.utaipei.edu.tw/",
            "http://www.hcy.idv.tw/2016java2/",
            "http://vmeeting.utaipei.edu.tw/",
            "http://www.hcy.idv.tw/2016java2/utcs/",
            "http://hcy.idv.tw/2016java2/chat"
    };
    private static String[] imageFiles = new String[]{
            "home.jpg",
            "lms.jpg",
            "cash.jpg",
            "system.jpg",
            "project.jpg",
            "meeting.jpg",
            "net.jpg",
            "chat.jpg"
        };
    final ImageView selectedImage = new ImageView();
    final Hyperlink[] hpls = new Hyperlink[captions.length];
    final Image[] images = new Image[imageFiles.length];
    final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();
 

    public Browser(String UID,String UPW,String URL) throws ArrayIndexOutOfBoundsException, JSONException, IOException {

    	InternetReachable ie = new InternetReachable();
    	Text Em = new Text("您的email是: ");
    	try{
    	DealJS DJ = new DealJS(UID,UPW);
    	if(DJ.getAccess().equals("true")){
    		Em.setText(DJ.getEmail());
		}else{
			Em.setText("");
		}
    	} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	Text t;
        if(ie.isInternetReachable()){
        	t = new Text("已連線            ");
        }else{
        	t = new Text("未連線             ");
        }
        //apply the styles
        getStyleClass().add("browser");
        
        for (int i = 0; i < captions.length ; i++) {
            final Hyperlink hpl = hpls[i] = new Hyperlink(captions[i]);
            Image image = images[i] = new Image(getClass().getResourceAsStream(imageFiles[i]));
            ImageView IV = new ImageView (image);
            hpl.setGraphic(IV);
            final String url = urls[i];
 
            hpl.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    loadweb(url);   
                }
            });
        }
        
 
// load the home page   
        loadweb(URL);
        
// create the toolbar
        toolBar = new HBox();
        toolBar.getStyleClass().add("browser-toolbar");
        toolBar.getChildren().addAll(hpls);
        toolBar.getChildren().addAll(t);
        toolBar.getChildren().addAll(Em);
        //add components
        getChildren().add(toolBar);
        getChildren().add(browser); 
    }
    public void loadweb(String s){
    	webEngine.load(s);
    }
    @Override protected void layoutChildren() {
        double w = getWidth();
        double h = getHeight();
        double tbHeight = toolBar.prefHeight(w);
        layoutInArea(browser,0,0,w,h-tbHeight,0, HPos.CENTER, VPos.CENTER);
        layoutInArea(toolBar,0,h-tbHeight,w,tbHeight,0,HPos.CENTER,VPos.CENTER);
    }
    
}