package android.dev.safesend;

/**
 * Created by matthewgoodbred on 2/17/18.
 */

public class Contact {
    private String name;
    private String number;
    public Contact(String na, String nu){
        name=na;number=nu;
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
    public String getNumber(){
        return number;
    }
}
