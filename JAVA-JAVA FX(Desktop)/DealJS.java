import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.*;
public class DealJS {
	DealJS(String id,String password) throws IOException, JSONException ,ArrayIndexOutOfBoundsException{
		this.id = id;
		this.password = password;
		if(!(id.equals("admin")&&id.equals("admin"))){
			jsonopasswordlms = readJsonFromUrl("http://lms.utaipei.edu.tw/sys/lib/ajax/login_submit.php?account="+id+"&password="+password);
			access = jsonopasswordlms.getJSONObject("ret").get("status");
			email = jsonopasswordlms.getJSONObject("ret").get("email");
			
		}
		
	}
	//set variables
	public String id;
	public String password;
	JSONObject jsonopasswordlms ;
	Object access;
	Object email;
	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}
	//set json method 
	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	//set the information from the index of the json
	public void setId(String id){
		this.id = id;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getId(){
		return id;
	}
	public String getPassword(){
		return password;
	}
	public String getAccess() throws JSONException, IOException{
		
		if(id==null||password==null){
			return "false";
		}else if(id.equals("admin")&&id.equals("admin")){
			return "true";
		}
		else{
			
			return access.toString();
		}
		
	}
	public String getEmail(){
		if(id.equals("admin")&&id.equals("admin")){
			return "admin@utaipei.edu.tw";
		}	
		return email.toString();
	}
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
		DealJS my = new DealJS("admin","admin");
		
		System.out.println(my.getEmail());
	}
}





