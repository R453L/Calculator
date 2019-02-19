package com.example.rasel.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.dialog_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });



    }
    public void showDialog(){
        AlertDialog.Builder adb = new AlertDialog.Builder(getApplicationContext());
        adb.setTitle("Dialog Box");
        adb.setMessage("Are you sure?");
        adb.setCancelable(false);
        adb.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Clicked on yes.",Toast.LENGTH_SHORT).show();
            }
        });
        adb.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Clicked on no.",Toast.LENGTH_SHORT).show();
            }
        });
        adb.setNeutralButton("WHATEV", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Clicked on whatever!",Toast.LENGTH_SHORT).show();
            }
        });
        android.support.v7.app.AlertDialog dialog = adb.create();
        dialog.show();
    }
    public void showToast(View v){
        Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT).show();
    }
}
