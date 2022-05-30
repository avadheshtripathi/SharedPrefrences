package com.example.sharedprefrences201b075;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    SharedPreferences sharedPreferences;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.eng:
                textView.setText("English");
                sharedPreferences.edit().putString("title", "English").apply();
                return true;
            case R.id.hin:
                textView.setText("Hindi");
                sharedPreferences.edit().putString("title", "Hindi").apply();
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.botton);
        sharedPreferences= this.getSharedPreferences("com.example.a201b323_my_application",0);
        String pref=sharedPreferences.getString("title","default");
        textView.setText(pref);
    }
}