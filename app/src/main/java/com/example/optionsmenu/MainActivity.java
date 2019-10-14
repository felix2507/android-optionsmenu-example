package com.example.optionsmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.show_snackbar: {
                Snackbar.make(findViewById(android.R.id.content), "MenuItem geklicked",
                        Snackbar.LENGTH_LONG)
                        .show();
                return true;
            }
            case R.id.show_Toast: {
                Toast.makeText(this, "Menuitem geklicken",
                        Toast.LENGTH_LONG)
                        .show();
            }
            case R.id.aendere_text:{
                TextView textView = findViewById(R.id.demo_text);
                textView.setText("MenuItem geclicked");
            }
        }
        return true;
    }
}
