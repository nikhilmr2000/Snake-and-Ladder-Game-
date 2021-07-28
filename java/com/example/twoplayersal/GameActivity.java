package com.example.twoplayersal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    int num;
    TextView tv;
    ImageButton img;
    int gameC=0;
    int valE;
    int val=0;
    int val1=0;
    boolean touch=false;
    Context context;
    MediaPlayer media;
    MediaPlayer media1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        tv=(TextView) findViewById(R.id.display);
        img=(ImageButton) findViewById(R.id.dice);
        ArrayList<Integer> gh=new ArrayList<Integer>();
        ArrayList<Integer> hg=new ArrayList<Integer>();
        ArrayList<Integer> hjA=new ArrayList<Integer>();
        TextView editText=(TextView) findViewById(R.id.editText);
        Bundle extras = getIntent().getExtras();
        String value3 = extras.getString("name");
        String value4 = extras.getString("name2");
        media=MediaPlayer.create(this,R.raw.coinsound);
        media1= MediaPlayer.create(this,R.raw.click);
        context=this;


        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                media1.start();
                int num = rand.nextInt(6) + 1;
                tv.setText(String.valueOf(num));
                int j = num;
                int pc=0;
                int gc=0;
                androidx.gridlayout.widget.GridLayout gd = (androidx.gridlayout.widget.GridLayout) findViewById(R.id.gridLayout);

                if (touch == false) {
                    editText.setVisibility(View.VISIBLE);
                    editText.setText(value4+"'s Turn");
                    media.start();
                    int b=0;
                    int k;
                    if(val==0){
                        k=j;
                    }
                    else{
                        k=j+val;
                    }

                    //Algorithm of ladder climbing and snake biting
                    if(k==1){
                        k=38;
                        j=k;
                        gh.clear();
                    }
                    else if(k==4){
                        k=14;
                        j=k;
                        gh.clear();
                    }
                    else if(k==9){
                        k=31;
                        j=k;
                        gh.clear();
                    }
                    else if(k==21){
                        k=42;
                        j=k;
                        gh.clear();
                    }
                    else if(k==28){
                        k=84;
                        j=k;
                        gh.clear();
                    }
                    else if(k==51){
                        k=67;
                        j=k;
                        gh.clear();
                    }
                    else if(k==71){
                        k=91;
                        j=k;
                        gh.clear();
                    }
                    else if(k==80){
                        k=100;
                        j=k;
                        gh.clear();
                    }
                    else if(k==17){
                        k=7;
                        j=k;
                        gh.clear();
                    }
                    else if(k==54){
                        k=34;
                        j=k;
                        gh.clear();
                    }
                    else if(k==62){
                        k=19;
                        j=k;
                        gh.clear();
                    }
                    else if(k==64){
                        k=60;
                        j=k;
                        gh.clear();
                    }
                    else if(k==87){
                        k=24;
                        j=k;
                        gh.clear();
                    }
                    else if(k==93){
                        k=73;
                        j=k;
                        gh.clear();
                    }
                    else if(k==95){
                        k=75;
                        j=k;
                        gh.clear();
                    }
                    else if(k==98){
                        k=79;
                        j=k;
                        gh.clear();
                    }

                    for(int f=101;f<107;f++){
                        if(k==f){
                            b=k-j;
                        }
                    }

                    for (int i = 0; i < gd.getChildCount(); i++) {
                        ImageView count = (ImageView) gd.getChildAt(i);
                        int hj = Integer.parseInt(count.getTag().toString());
                        if (k == hj && k<=100) {

                            gh.add(j);
                            val=0;
                            for(int m : gh){
                                val=val+m;
                            }
                            if(k==100){
                                if (extras != null) {
                                    String value = extras.getString("name");
                                    Intent intent1=new Intent(context,EndPoint.class);
                                    intent1.putExtra("names",value);
                                    startActivity(intent1);
                                }
                                else{
                                    Intent intent1=new Intent(context,EndPoint.class);
                                    intent1.putExtra("names","You");
                                    startActivity(intent1);
                                }

                            }
                            count.setImageResource(R.drawable.pink);
                            count.animate().rotation(350).setDuration(500);
                        }
                        else if(k>100){
                            if(b==hj){
                                Log.i("BVAL","V"+b);
                                Log.i("HJVAL","V"+hj);
                                count.setImageResource(R.drawable.pink);
                            }
                            else{
                                count.setImageDrawable(null);
                            }
                        }
                        else if(hj!=pc){
                            count.setImageDrawable(null);
                        }


                    }
                    touch = true;
                }
                else if (touch == true) {
                    int k2;
                    int b=0;
                    editText.setVisibility(View.VISIBLE);
                    editText.setText(value3+"'s Turn");
                    media.start();
                    if(val1==0){
                        k2=j;
                    }
                    else{
                        k2=j+val1;
                    }
                    //Algorithm of snake climbing and snake biting
                    if(k2==1){
                        k2=38;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==4){
                        k2=14;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==9){
                        k2=31;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==21){
                        k2=42;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==28){
                        k2=84;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==51){
                        k2=67;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==71){
                        k2=91;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==80){
                        k2=100;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==17){
                        k2=7;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==54){
                        k2=34;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==62){
                        k2=19;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==64){
                        k2=60;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==87){
                        k2=24;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==93){
                        k2=73;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==95){
                        k2=75;
                        j=k2;
                        hg.clear();
                    }
                    else if(k2==98){
                        k2=79;
                        j=k2;
                        hg.clear();
                    }


                    for(int f=101;f<107;f++){
                        if(k2==f){
                            b=k2-j;
                        }
                    }


                    pc=k2;
                    for (int i = 0; i < gd.getChildCount(); i++) {
                        ImageView count = (ImageView) gd.getChildAt(i);
                        int hj = Integer.parseInt(count.getTag().toString());

                        if (k2 == hj && k2<=100) {
                            hg.add(j);
                            val1=0;
                            for(int m : hg){
                                val1=val1+m;
                            }
                            if(k2==100){
                                Bundle extras = getIntent().getExtras();
                                if (extras != null) {
                                    String value = extras.getString("name2");
                                    Intent intent1=new Intent(context,EndPoint.class);
                                    intent1.putExtra("names",value);
                                    startActivity(intent1);
                                }
                                else{
                                    Intent intent1=new Intent(context,EndPoint.class);
                                    intent1.putExtra("names","Your Partner");
                                    startActivity(intent1);
                                }
                            }

                            count.setImageResource(R.drawable.white);
                            count.animate().rotation(350).setDuration(500);
                        }
                        else if(k2>100){
                            if(b==hj){
                                Log.i("BVAL","V"+b);
                                Log.i("HJVAL","V"+hj);
                                count.setImageResource(R.drawable.white);
                            }
                        }
                    }

                    touch = false;
                }

            }

        });

    }
}
