package com.example.juyoung.animalolympic;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_olympic extends AppCompatActivity {

    ImageView ImageView1, ImageView2;
    BitmapDrawable bitmap1, bitmap2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olympic);



        ImageView1 = (ImageView) findViewById(R.id.imageview1);
        ImageView2 = (ImageView) findViewById(R.id.imageview2);

        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.bear);
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.cat);

        ImageView1.setImageDrawable(bitmap1);
        ImageView2.setImageDrawable(bitmap2);

        ImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage1();
                changeImage2();
            }
        });

        ImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage1();
                changeImage2();
            }
        });
    }

    private void changeImage1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.deer);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changeImage2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.dog);
        ImageView2.setImageDrawable(bitmap2);
    }
}
