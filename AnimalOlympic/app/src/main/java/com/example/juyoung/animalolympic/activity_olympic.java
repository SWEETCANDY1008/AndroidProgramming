package com.example.juyoung.animalolympic;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activity_olympic extends AppCompatActivity {

    TextView TextView1;
    ImageView ImageView1, ImageView2;
    BitmapDrawable bitmap1, bitmap2;

    String[] animal8 = new String[8];
    String[] animal4 = new String[4];
    String[] animal2 = new String[2];

    boolean sixteenth=true, eight=false, fourth=false, second=false;
    int i = 0;
    int j = 0;

    //bear cat deer desertfox dog hamster hedgehog owl panda parrot penguin pigle rabbit raccoon shark sheep

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olympic);

        TextView1 = (TextView) findViewById(R.id.textView1);
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
                if (sixteenth == true && eight == false && fourth == false && second == false) {
                    switch (i) {
                        case 0: { animal8[0] = "bear"; changedeer1(); changedesertfox2(); break; }
                        case 1: { animal8[1] = "deer"; changedog1(); changehamster2(); break; }
                        case 2: { animal8[2] = "dog"; changehedgehog1(); changeowl2(); break; }
                        case 3: { animal8[3] = "hedgehog"; changepanda1(); changeparrot2(); break; }
                        case 4: { animal8[4] = "panda"; changepenguin1(); changepigle2();break; }
                        case 5: { animal8[5] = "penguin"; changerabbit1(); changeraccoon2(); break; }
                        case 6: { animal8[6] = "rabbit"; changeshark1(); changesheep2(); break; }
                        case 7: { animal8[7] = "shark"; sixteenth = false; eight = true; i = 0; j = 0; break; }
                        }
                    i++;
                    j++;
                }

                else if(sixteenth == false && eight == true && fourth == false && second == false) {
                    TextView1.setText("8강");

                    if(animal8[0] == "bear") {
                        switch(animal8[1]) {
                            case "deer": changebear1(); changedeer2(); break;
                            case "desertfox": changebear1(); changedesertfox2(); break;
                        }
                    }
                    else if(animal8[0] == "cat") {
                        switch(animal8[1]) {
                            case "deer": changecat1(); changedeer2(); break;
                            case "desertfox": changecat1(); changedesertfox2(); break;
                        }
                    }
                }
            }
        });

        ImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixteenth == true && eight == false && fourth == false && second == false) {
                    switch (j) {
                        case 0: { animal8[0] = "cat"; changedeer1(); changedesertfox2(); break; }
                        case 1: { animal8[1] = "desertfox"; changedog1(); changehamster2(); break; }
                        case 2: { animal8[2] = "hamster"; changehedgehog1(); changeowl2(); break; }
                        case 3: { animal8[3] = "owl"; changepanda1(); changeparrot2(); break; }
                        case 4: { animal8[4] = "parrot"; changepenguin1(); changepigle2(); break; }
                        case 5: { animal8[5] = "pigle"; changerabbit1(); changeraccoon2(); break; }
                        case 6: { animal8[6] = "raccoon"; changeshark1(); changesheep2(); break; }
                        case 7: { animal8[7] = "sheep"; eight = false; fourth = true; i = 0; j = 0; break; }
                    }
                    i++;
                    j++;
                }

                else if(sixteenth == false && eight == true && fourth == false && second == false) {
                    TextView1.setText("8강");

                    if (animal8[1] == "deer") {

                    } else if (animal8[1] == "desertfox") {

                    }
                }
            }
        });
    }












    private void changebear1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.bear);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changebear2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.bear);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changecat1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.cat);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changecat2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.cat);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changedeer1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.deer);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changedeer2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.deer);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changedesertfox1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.desertfox);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changedesertfox2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.desertfox);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changedog1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.dog);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changedog2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.dog);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changehamster1() {
            Resources res = getResources();
            bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.hamster);
            ImageView1.setImageDrawable(bitmap1);
    }
    private void changehamster2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.hamster);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changehedgehog1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.hedgehog);
        ImageView1.setImageDrawable(bitmap1);
    }
    private void changehedgehog2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.hedgehog);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changeowl1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.owl);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changeowl2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.owl);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changepanda1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.panda);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changepanda2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.panda);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changeparrot1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.parrot);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changeparrot2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.parrot);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changepenguin1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.penguin);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changepenguin2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.penguin);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changepigle1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.pigle);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changepigle2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.pigle);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changerabbit1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.rabbit);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changerabbit2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.rabbit);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changeraccoon1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.raccoon);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changeraccoon2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.raccoon);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changeshark1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.shark);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changeshark2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.shark);
        ImageView2.setImageDrawable(bitmap2);
    }

    private void changesheep1() {
        Resources res = getResources();
        bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.sheep);
        ImageView1.setImageDrawable(bitmap1);
    }

    private void changesheep2() {
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.sheep);
        ImageView2.setImageDrawable(bitmap2);
    }
}
