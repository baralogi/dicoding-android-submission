package com.example.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Detail extends AppCompatActivity {

    TextView DetailTitle, Detail;
    ImageView Picture;
    ArrayList<Item> DetailItem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        DetailTitle = findViewById(R.id.DetailTitle);
        Detail = findViewById(R.id.Detail);
        Picture = findViewById(R.id.item_photo);

        Intent i = getIntent();

        Glide.with(Detail.this)
                .load(i.getIntExtra("Picture", R.drawable.ic_launcher_background))
                .into(Picture);
        DetailTitle.setText(i.getStringExtra("Title"));
        Detail.setText(i.getStringExtra("Detail"));
    }
}
