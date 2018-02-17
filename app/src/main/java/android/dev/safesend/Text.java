package android.dev.safesend;

/**
 * Created by matthewgoodbred on 2/17/18.
 */
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
public class SMS extends Activity {
    Button btnSendSMS;
    EditText txtPhoneNo;
    EditText txtMessage;
    private String number;
    private String message;
    android.telephony.SmsManager sms = new SmsManager();
    public SMS(){

    }
    public void sendSMS(){
        sms.sendTextMessage (number,null, message, null, null);

    }

}
