import java.io.IOException;
import org.json.JSONException;

public class Login {

	public static void main(String[] args){
		String UID = "UID";
		String UPD = "PASSWORD";
		DealJS DJ;
		
			try {
				DJ = new DealJS(UID,UPD);
				if(DJ.getAccess().equals("true")){
					System.out.println("登入成功");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println("登入失敗 ArrayIndexOutOfBoundsException");
				//e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				System.out.println("登入失敗 JSONException");
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("登入失敗 IOException");
				//e.printStackTrace();
			}
		
	}
	
}
