package com.royalsoftsolutions.option_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "Hiren";
    String str = "javatpoint.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"charAt(4) : "+str.charAt(4));
        Log.d(TAG,"isEmpty() : "+str.isEmpty());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.OurProduct1:
                Toast.makeText(this,"New group",Toast.LENGTH_SHORT).show();
                return true ;

            case R.id.OurProduct2:
                Toast.makeText(this,"New broadcast",Toast.LENGTH_SHORT).show();
                return true ;
            case R.id.OurProduct3:
                Toast.makeText(this,"WhatsApp Web",Toast.LENGTH_SHORT).show();
                return true ;
            case R.id.OurProduct4:
                Toast.makeText(this,"Starred messages",Toast.LENGTH_SHORT).show();
                return true ;
            case R.id.OurProduct5:
                Toast.makeText(this,"Payments",Toast.LENGTH_SHORT).show();
                return true ;
            case R.id.OurProduct6:
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
                return true ;
            default: return super.onOptionsItemSelected(item);

        }

    }
}