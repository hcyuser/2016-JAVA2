
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
	FirstView(String UID, String UPW,String URL) {
		super(UID, UPW, URL);
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
		
		Image netB = new Image(getClass().getResourceAsStream("netB.jpg"));
		Button btnetB = new Button("資科系系網", new ImageView(netB));
		btnetB.setLayoutX(1042);
		btnetB.setLayoutY(0);
		pane.getChildren().add(btnetB);
		
		Image chatB = new Image(getClass().getResourceAsStream("chatB.jpg"));
		Button btchatB = new Button("線上聊天室", new ImageView(chatB));
		btchatB.setLayoutX(1225);
		btchatB.setLayoutY(0);
		pane.getChildren().add(btchatB);
		
		bthomeB.setOnAction(e ->{
			WebViewSample wv = new WebViewSample(UID, UPW, "https://tl.utaipei.edu.tw/");
			try {
				wv.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btlmsB.setOnAction(e ->{
			WebViewSample wv = new WebViewSample(UID, UPW, "http://lms.utaipei.edu.tw/");
			try {
				wv.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btcashB.setOnAction(e ->{
			WebViewSample wv = new WebViewSample(UID, UPW, "http://www.hcy.idv.tw/utcsshop/");
			try {
				wv.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btsystemB.setOnAction(e ->{
			WebViewSample wv = new WebViewSample(UID, UPW, "http://my.utaipei.edu.tw/");
			try {
				wv.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btprojectB.setOnAction(e ->{
			WebViewSample wv = new WebViewSample(UID, UPW, "http://www.hcy.idv.tw/2016java2/");
			try {
				wv.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btmeetingB.setOnAction(e ->{
			WebViewSample wv = new WebViewSample(UID, UPW, "http://vmeeting.utaipei.edu.tw/");
			try {
				wv.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btnetB.setOnAction(e ->{
			WebViewSample wv = new WebViewSample(UID, UPW, "http://www.hcy.idv.tw/2016java2/utcs/");
			try {
				wv.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		btchatB.setOnAction(e ->{
			WebViewSample wv = new WebViewSample(UID, UPW, "http://hcy.idv.tw/2016java2/chat");
			try {
				wv.start(stage);
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

