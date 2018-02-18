package android.dev.safesend;

/**
 * Created by matthewgoodbred on 2/17/18.
 */

public class Contact {
    private String name;
    private String number;
    private String message;
    public Contact(String na, String nu, String me){
        name=na;number=nu;message=me;
    }
    public void setName(String na){
        name = na;
    }
    public void setNumber(String nu){
        number = nu;
    }
    public String toString(){
        return name+ " "+ number;
    }
    public String getName(){
        return name;
    }
    public void sendSMS(){
        android.telephony.SmsManager sms = android.telephony.SmsManager.getDefault();
        sms.sendTextMessage(number, null, message, null, null);
    }
    public String getNumber(){
        return number;
    }
}
