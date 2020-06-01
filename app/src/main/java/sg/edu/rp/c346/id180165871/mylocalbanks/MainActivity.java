package sg.edu.rp.c346.id180165871.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnDbs;
    Button btnocbc;
    Button btnuob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDbs=findViewById(R.id.buttonDbs);
        btnocbc=findViewById(R.id.buttonOcbc);
        btnuob=findViewById(R.id.buttonUob);

        registerForContextMenu(btnDbs);
        registerForContextMenu(btnocbc);
        registerForContextMenu(btnuob);


    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo, MenuItem item) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add(0,100,0,"UrlWebsite");
        menu.add(0,101,1,"contactBank");

        if(v==btnDbs) {
            // Code for the action

            if (item.getItemId() == 101) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 1 + 800 + 111 +
                        1111));
                startActivity(intentCall);

            } else if (item.getItemId() == 100) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://internet-banking.dbs" +
                        ".com.sg/IB/Welcome"));
                startActivity(intent);


            }
        }
        if(v==btnuob) {
            // Code for the action

            if (item.getItemId() == 101) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 1 + 800 + 222 +
                        2121));
                startActivity(intentCall);

            } else if (item.getItemId() == 100) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pib.uob.com.sg/" +
                        "PIBLogin/Public/processPreCapture.do?keyId=lpc"));
                startActivity(intent);


            }
        }
        if(v==btnocbc) {
            // Code for the action

            if (item.getItemId() == 101) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 1 + 800 + 363 +
                        3333));
                startActivity(intentCall);

            } else if (item.getItemId() == 100) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ocbc.com/" +
                        "group/group-home.html"));
                startActivity(intent);


            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        getMenuInflater().inflate(R.menu.language, menu);
        menu.add(0,100,0,"engtran");
        menu.add(0,101,1,"chtran");
        if (item.getItemId() == 101) {
            btnDbs.setText("星展银行");
            btnocbc.setText("华侨银行");
            btnuob.setText("大华银行");
        }
        return true;
    }
}

