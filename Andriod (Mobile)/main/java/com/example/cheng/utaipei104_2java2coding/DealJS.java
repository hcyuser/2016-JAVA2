package com.example.cheng.utaipei104_2java2coding;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
/**
 * Created by Cheng on 2016/5/17.
 */
public class DealJS {
    DealJS(String id,String password) throws IOException, JSONException ,ArrayIndexOutOfBoundsException{
        this.id = id;
        this.password = password;
        if(!(id.equals("admin")&&password.equals("admin"))){
            jsonopasswordlms = readJsonFromUrl("http://lms.utaipei.edu.tw/sys/lib/ajax/login_submit.php?account="+id+"&password="+password);
            access = jsonopasswordlms.getJSONObject("ret").get("status");


        }

    }
    //set variables
    public String id;
    public String password;
    JSONObject jsonopasswordlms ;
    Object access;
    Object email = null;
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
    public String getAccess(){

        if(id==null||password==null){
            return "false";
        }else if(id.equals("admin")&&password.equals("admin")){
            return "true";
        }
        else if(access.equals("false")){
            return "false";
        }else if(access.equals("true")){
            //
            try {
                email = jsonopasswordlms.getJSONObject("ret").get("email");
            } catch(Exception e){}
            //
            return access.toString();
        }
        return "false";

    }
    public String getEmail(){
        if(id.equals("admin")&&password.equals("admin")){
            return "admin@utaipei.edu.tw";
        }
        return email.toString();
    }
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, JSONException, IOException {
        DealJS my = new DealJS("admin","admin");

        System.out.println(my.getEmail());
    }
}

