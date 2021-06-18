package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page);
        Intent intent = getIntent();
        int id = intent.getIntExtra("img",R.drawable.item1);
        String name = intent.getStringExtra("name");
        String author = intent.getStringExtra("author");

        ImageView img = (ImageView) findViewById(R.id.info_pic);
        TextView nameText = (TextView) findViewById(R.id.info_name);
        TextView authorText = (TextView) findViewById(R.id.info_author);

        img.setImageResource(id);
        nameText.setText(name);
        authorText.setText(author);

    }
}