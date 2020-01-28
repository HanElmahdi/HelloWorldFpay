package cordova.plugin.helloworldfpay;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Application;
import ma.fpay.sunmilibrary.ionic.BaseApp;

public class HelloWorldFpay extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(action.equals("add")) {
            this.add(args, callbackContext);
            return true;
        } else if(action.equals("substract")) {
            this.substract(args, callbackContext);
            return true;
        } else if(action.equals("test")) {
            this.test(callbackContext);
            return true;
        }
        return false;
    }

    private void test1(CallbackContext callback) {
        try {
            Test t1 = new Test();
            callback.success(t1.test());
        } catch(Exception ex) {
            callback.error("Someting went wrong " + ex);
        }
    }


    private void test(CallbackContext callback) {
        try {
            Test t1 = new Test();
            callback.success(t1.test());
        } catch(Exception ex) {
            callback.error("Someting went wrong " + ex);
        }
    }

	public void printText(JSONArray args, CallbackContext callback) {
        BaseApp baseApp = (BaseApp) this.cordova.getActivity().getApplicationContext();
        //BaseApp baseApp = (BaseApp) this.cordova.getActivity();

        if(args != null) {
            try {
                String text = args.getJSONObject(0).getString("text");
                //baseApp.printText(text, false);
                callback.success("Text : " + (text));
            } catch(Exception ex) {
                callback.error("printText : Someting went wrong " + ex);
            }
        } else {
            callback.error("printText : Please do not pass null value");
        }

        
    }

    private void add(JSONArray args, CallbackContext callback) {
        if(args != null) {
            try {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                callback.success("" + (p1+p2));
            } catch(Exception ex) {
                callback.error("Someting went wrong " + ex);
            }
        } else {
            callback.error("Please do not pass null value");
        }
    }

    private void substract(JSONArray args, CallbackContext callback) {
        if(args != null) {
            try {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                callback.success("" + (p1-p2));
                
            } catch(Exception ex) {
                callback.error("Someting went wrong " + ex);
            }
        } else {
            callback.error("Please do not pass null value");
        }
    }

    /*private void generateJSON(JSONArray client, CallbackContext callback) {
        if(client != null) {
            try {
                int id = Integer.parseInt(client.getJSONObject(0).getString("id"));
                String firstName = client.getJSONObject(0).getString("firstName");
                String lastName = client.getJSONObject(0).getString("lastName");
                String phone = client.getJSONObject(0).getString("phone");
                String email = client.getJSONObject(0).getString("mail");

                JsonObject json_client = new JsonObject();
                json_client.addProperty("id", id);
                json_client.addProperty("firstName", firstName);
                json_client.addProperty("lastName", lastName);
                json_client.addProperty("phone", phone);
                json_client.addProperty("email", email);

                callback.success(json_client.toString());
            } catch(Exception ex) {
                callback.error("Someting went wrong " + ex);
            }
        } else {
            callback.error("Client Object NULL");
        }
    }*/
}
