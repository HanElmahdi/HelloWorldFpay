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
        //BaseApp baseApp = (BaseApp) getApplication();
        BaseApp baseApp = (BaseApp) this.cordova.getActivity().getApplicationContext();
		
        
        //String text = args.getJSONObject(0).getString("text");
        
        
        //baseApp.printText(text, false);
    }
}