package cordova.plugin.helloworldfpay;
import android.app.Application;
import ma.fpay.sunmilibrary.printerhelper.utils.AidlUtil;

public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AidlUtil.getInstance().connectPrinterService(this);
    }

    public void printText(String content, boolean  isBluTooth){
        //if (isBluTooth) {
           // Printerhelper.getInstance().printByBluTooth(content);
        //} else {
            //Printerhelper.getInstance().printText(content);
        //}
    }
}
