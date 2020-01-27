package cordova.plugin.helloworldfpay;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Application;
import ma.fpay.sunmilibrary.ionic.BaseApp;
//import ma.fpay.sunmilibrary.printerhelper.utils.AidlUtil;

public class PrintFpay extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if(action.equals("printText")) {
            this.printText(args, callbackContext);
            return true;
        }
        return false;
    }

	public void printText(JSONArray args, CallbackContext callback) {
        BaseApp baseApp = (BaseApp) this.cordova.getActivity().getApplicationContext();
        //BaseApp baseApp = (BaseApp) this.cordova.getActivity();

        if(args != null) {
            try {
                String text = args.getJSONObject(0).getString("text");
                callback.success("" + (text));
                
            } catch(Exception ex) {
                callback.error("Someting went wrong " + ex);
            }
        } else {
            callback.error("Please do not pass null value");
        }

        
        baseApp.printText(text, false);
    }
}