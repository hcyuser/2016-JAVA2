import java.io.IOException;
import org.json.JSONException;

public class Login {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, JSONException, IOException{
		String UID = "�հȱb���r��";
		String UPD = "�հȱb���K�X�r��";
		DealJS DJ = new DealJS(UID,UPD);
		if(DJ.getAccess().equals("true")){
			System.out.println("�n�J���\");
		}
		else{
			System.out.println("�n�J����");
		}


	}
}
