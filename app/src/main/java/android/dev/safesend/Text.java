package android.dev.safesend;

/**
 * Created by matthewgoodbred on 2/17/18.
 */
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
public class Text extends Activity {
    Button btnSendSMS;
    EditText txtPhoneNo;
    EditText txtMessage;
    private String number;
    private String message;

    public Text(Contact c){
        number = c.getNumber();
        message = "I am OK";
        Log.d("constructor","constructor");
    //    sms = new SmsManager();
    }
    public Text(Contact c, String mes){
        number = c.getNumber();
        message = mes;
 //       sms= new SmsManager();
    }
    public void setNumber(String num){
        number = num;
    }
    public void setMessage(String mes){
        message = mes;
    }
    public void sendSMS() {
        Log.d("textalmostsent","textalmostsent");
        android.telephony.SmsManager sms = android.telephony.SmsManager.getDefault();
        Log.d("textnearlysent","textnearlysent");
        sms.sendTextMessage(number, null, message, null, null);
        Log.d("textsent","textsent");
    }

}
