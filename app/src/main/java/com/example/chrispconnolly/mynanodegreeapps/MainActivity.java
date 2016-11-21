package com.example.chrispconnolly.mynanodegreeapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view) {
        String projectName = ((Button)view).getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(),
                "This button will launch my " + projectName + " project.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
