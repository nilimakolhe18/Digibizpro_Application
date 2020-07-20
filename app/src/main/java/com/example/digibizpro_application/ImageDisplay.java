package com.example.digibizpro_application;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageDisplay extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_display);

        imageView = findViewById(R.id.imageView);

        String imgFile = getIntent().getStringExtra("FILE");

        Bitmap bitmap = BitmapFactory.decodeFile(imgFile);
        imageView.setImageBitmap(bitmap);
    }
}
