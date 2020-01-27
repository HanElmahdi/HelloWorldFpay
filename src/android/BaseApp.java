package cordova.plugin.helloworldfpay;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Application;
import ma.fpay.sunmilibrary.printerhelper.utils.AidlUtil;

public class PrintFpay extends CordovaPlugin {


    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if(action.equals("printText")) {
            this.printText(callbackContext);
            return true;
        }
        return false;
    }

	public void printText(JSONArray args, CallbackContext callback) {
        BaseApp baseApp = (BaseApp) getApplication();
		String text = Integer.parseInt(args.getJSONObject(0).getString("text"));
        baseApp.printText(text, false);
    }
}

/*package cordova.plugin.helloworldfpay;
import android.app.Application;
import ma.fpay.sunmilibrary.printerhelper.utils.AidlUtil;

public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AidlUtil.getInstance().connectPrinterService(this);
    }

    public void printText(String content, boolean  isBluTooth){
        if (isBluTooth) {
            Printerhelper.getInstance().printByBluTooth(content);
        } else {
            Printerhelper.getInstance().printText(content);
        }
    }
}*/
