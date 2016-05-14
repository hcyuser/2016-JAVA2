
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
 
public class FirstView extends WebViewSample {

	FirstView(String UID, String UPW) {
		super(UID, UPW);
	}
	FirstView() {
	}

	@Override public void start(Stage stage) {
    	Pane pane = new Pane();
		
		Image homeB = new Image(getClass().getResourceAsStream("homeB.jpg"));
		Button bthomeB = new Button("個人儲存雲", new ImageView(homeB));
		bthomeB.setLayoutX(0);
		bthomeB.setLayoutY(0);
		pane.getChildren().add(bthomeB);
		
		Image lmsB = new Image(getClass().getResourceAsStream("lmsB.jpg"));
		Button btlmsB = new Button("LMS", new ImageView(lmsB));
		btlmsB.setLayoutX(180);
		btlmsB.setLayoutY(0);
		pane.getChildren().add(btlmsB);
		
		Image cashB = new Image(getClass().getResourceAsStream("cashB.jpg"));
		Button btcashB = new Button("二手拍賣中心", new ImageView(cashB));
		btcashB.setLayoutX(325);
		btcashB.setLayoutY(0);
		pane.getChildren().add(btcashB);
		
		Image systemB = new Image(getClass().getResourceAsStream("systemB.jpg"));
		Button btsystemB = new Button("校務系統", new ImageView(systemB));
		btsystemB.setLayoutX(518);
		btsystemB.setLayoutY(0);
		pane.getChildren().add(btsystemB);
		
		Image projectB = new Image(getClass().getResourceAsStream("projectB.jpg"));
		Button btprojectB = new Button("計畫專頁", new ImageView(projectB));
		btprojectB.setLayoutX(683);
		btprojectB.setLayoutY(0);
		pane.getChildren().add(btprojectB);
		
		Image meetingB = new Image(getClass().getResourceAsStream("meetingB.jpg"));
		Button btmeetingB = new Button("遠距會議系統", new ImageView(meetingB));
		btmeetingB.setLayoutX(850);
		btmeetingB.setLayoutY(0);
		pane.getChildren().add(btmeetingB);
		
		Image eatmapB = new Image(getClass().getResourceAsStream("eatmapB.jpg"));
		Button bteatmapB = new Button("校外美食地圖", new ImageView(eatmapB));
		bteatmapB.setLayoutX(1042);
		bteatmapB.setLayoutY(0);
		pane.getChildren().add(bteatmapB);
		
		Image chatB = new Image(getClass().getResourceAsStream("chatB.jpg"));
		Button btchatB = new Button("線上聊天室", new ImageView(chatB));
		btchatB.setLayoutX(1234);
		btchatB.setLayoutY(0);
		pane.getChildren().add(btchatB);
		
		bthomeB.setOnAction(e ->{
			WebViewSample wv = new WebViewSample(UID, UPW);
			try {
				wv.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btlmsB.setOnAction(e ->{
			WebView1 wv1 = new WebView1(UID, UPW);
			try {
				wv1.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btcashB.setOnAction(e ->{
			WebView2 wv2 = new WebView2(UID, UPW);
			try {
				wv2.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btsystemB.setOnAction(e ->{
			WebView3 wv3 = new WebView3(UID, UPW);
			try {
				wv3.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btprojectB.setOnAction(e ->{
			WebView4 wv4 = new WebView4(UID, UPW);
			try {
				wv4.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btmeetingB.setOnAction(e ->{
			WebView5 wv5 = new WebView5(UID, UPW);
			try {
				wv5.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		bteatmapB.setOnAction(e ->{
			WebView6 wv6 = new WebView6(UID, UPW);
			try {
				wv6.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btchatB.setOnAction(e ->{
			WebView7 wv7 = new WebView7(UID, UPW);
			try {
				wv7.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
        // create scene
        stage.setTitle("歡迎使用");
        Scene scene = new Scene(pane,1420,105);
    	stage.setScene(scene);
        stage.show();
    }
}

