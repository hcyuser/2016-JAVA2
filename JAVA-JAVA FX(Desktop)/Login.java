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
					System.out.println("�n�J���\");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println("�n�J���� ArrayIndexOutOfBoundsException");
				//e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				System.out.println("�n�J���� JSONException");
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("�n�J���� IOException");
				//e.printStackTrace();
			}
		
	}
	
}
