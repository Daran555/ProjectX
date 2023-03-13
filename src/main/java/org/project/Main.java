package org.project;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws JSONException {
        // TODO Auto-generated method stub

        String jsonStr = "{\"Employees\" : [{\"userId\":\"rirani\",\"jobTitleName\":\"Developer\",\"firstName\":\"Romin\",\"lastName\":\"Irani\",\"preferredFullName\":\"Romin Irani\",\"employeeCode\":\"E1\",\"region\":\"CA\",\"phoneNumber\":\"408-1234567\",\"emailAddress\":\"romin.k.irani@gmail.com\"}" +
                ",{\"userId\":\"nirani\",\"jobTitleName\":\"Developer\",\"firstName\":\"Neil\",\"lastName\":\"Irani\",\"preferredFullName\":\"Neil Irani\",\"employeeCode\":\"E2\",\"region\":\"CA\",\"phoneNumber\":\"408-1111111\",\"emailAddress\":\"neilrirani@gmail.com\"},{\"userId\":\"thanks\",\"jobTitleName\":\"Program Directory\",\"firstName\":\"Tom\",\"lastName\":\"Hanks\",\"preferredFullName\":\"Tom Hanks\",\"employeeCode\":\"E3\",\"region\":\"CA\",\"phoneNumber\":\"408-2222222\",\"emailAddress\":\"tomhanks@gmail.com\"}]}";
        JSONObject jsonObj = new JSONObject(jsonStr);
        JSONArray name = jsonObj.getJSONArray("Employees");
        for(int i=0;i<name.length();i++)
        {
            //String first = name.getJSONObject("userId").Integer.getString();
            System.out.println("Updated Git Commit and push");
        }




    }

}