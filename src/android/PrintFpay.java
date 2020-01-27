package cordova.plugin.helloworldfpay;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Application;
import ma.fpay.sunmilibrary.printerhelper.utils.AidlUtil;
import ma.fpay.sunmilibrary.printerhelper.utils.AidlUil;

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
        BaseApp baseApp = (BaseApp) getApplication();
		String text = args.getJSONObject(0).getString("text");
        baseApp.printText(text, false);
    }
}