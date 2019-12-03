//Faith Jolley
//CSC 309
//Project

package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //send to list of downloadables
        Button dldBtn = findViewById(R.id.btn_downloadable);
        dldBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, DownloadableBooks.class));
            }
        });

        //send to downloaded library
        Button libBtn = findViewById(R.id.btn_lib);
        libBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, UserLibrary.class));
            }
        });

        //send to reading page
        Button conBtn = findViewById(R.id.btn_continue);
        conBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, ReadActivity.class));
            }
        });
    }
}
