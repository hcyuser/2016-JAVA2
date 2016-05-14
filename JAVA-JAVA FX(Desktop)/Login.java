import java.io.IOException;
import org.json.JSONException;

public class Login {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, JSONException, IOException{
		String UID = "校務帳號字串";
		String UPD = "校務帳號密碼字串";
		DealJS DJ = new DealJS(UID,UPD);
		if(DJ.getAccess().equals("true")){
			System.out.println("登入成功");
		}
		else{
			System.out.println("登入失敗");
		}


	}
}
