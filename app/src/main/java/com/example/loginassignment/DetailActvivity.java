package com.example.loginassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class DetailActvivity extends AppCompatActivity {
   private  ImageView imageView;
   private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_actvivity);
        imageView = findViewById(R.id.detailImage);
        textView = findViewById(R.id.detailText);

        Intent i = getIntent();
       Model model = (Model) i.getSerializableExtra("sampleObject");
        assert model != null;

       Objects.requireNonNull(getSupportActionBar()).setTitle(model.getTitle().toString());

        // using glide to load image faster and to ensure the image fit to size of the image box

        Glide.with(DetailActvivity.this).load(model.getImage()).fitCenter().into(imageView);
        textView.setText(model.getDetails());
    }
}