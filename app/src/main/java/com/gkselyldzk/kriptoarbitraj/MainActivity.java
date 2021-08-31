package com.gkselyldzk.kriptoarbitraj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.kripto_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.kripto_login){
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.kripto_arbitraj){
            Intent intent = new Intent(this,ArbitrajActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.kripto_liquadation){
            Intent intent = new Intent(this,LiquadationActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.kripto_whale_alert){
            Intent intent = new Intent(this,WhaleAlertActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.kripto_average){
            Intent intent = new Intent(this,AverageActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.kripto_guide){
            Intent intent = new Intent(this,GuideActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}