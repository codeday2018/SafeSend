package android.dev.safesend;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button sendBtn;
    EditText txtphoneNo;
    EditText txtMessage;
    String phoneNo;
    String message;

  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ListView listView = (ListView) findViewById(R.id.sending_listview);
        ArrayList<Integer> groupsArrayList = new ArrayList<>();
        groupsArrayList.add("Family");
        groupsArrayList.add("Friends");
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, groupsArrayList);

        listView.setAdapter(adapter);
    }  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          sendBtn = (Button) findViewById(R.id.buttonSend);
     //  txtphoneNo = (EditText) findViewById(R.id.editText);
     //  txtMessage = (EditText) findViewById(R.id.editText2);
        System.out.print("gonna kms");
        Log.d("gonna kms","gonna kms");

       sendBtn.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
               Text sender = new Text(new Contact("Riya","6159727656"));
               try {
                   Log.d("kms2","kms2");
                   Toast.makeText(getApplicationContext(),"WIN",Toast.LENGTH_LONG).show();

                   sender.sendSMS();
               }catch(Exception e){
                   Log.d("kms3","kms3");
                   System.out.print("FAIL");
                   Toast.makeText(getApplicationContext(),"FAIL",Toast.LENGTH_LONG).show();
               }
          }
      });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
