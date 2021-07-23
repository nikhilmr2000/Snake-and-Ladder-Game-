package com.example.twoplayersal;

import  androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;
    TextView tv;
    ImageButton img;
    int gameC=0;
    int valE;
    int val=0;
    int val1=0;
    boolean touch=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.display);
        img=(ImageButton) findViewById(R.id.dice);
        ArrayList<Integer> gh=new ArrayList<Integer>();
        ArrayList<Integer> hg=new ArrayList<Integer>();
        ArrayList<Integer> hjA=new ArrayList<Integer>();
        TextView editText=(TextView) findViewById(R.id.editText);


        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                int num = rand.nextInt(6) + 1;
                tv.setText(String.valueOf(num));
                int j = num;
                int pc=0;
                int gc=0;
                androidx.gridlayout.widget.GridLayout gd = (androidx.gridlayout.widget.GridLayout) findViewById(R.id.gridLayout);

                    if (touch == false) {

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
                        Log.i("PinkO","V"+val);
                        for (int i = 0; i < gd.getChildCount(); i++) {
                            ImageView count = (ImageView) gd.getChildAt(i);
                            int hj = Integer.parseInt(count.getTag().toString());
                            if (k == hj) {
                                gh.add(j);
                                val=0;
                                for(int m : gh){
                                    val=val+m;
                                }
                                Log.i("Val","V"+gh);
                                if(val==100){
                                    Log.i("Result:","Pink Won");
                                    editText.setVisibility(View.VISIBLE);
                                    editText.setText("Pink Won");
                                }
                                else{
                                    editText.setVisibility(View.INVISIBLE);
                                }
                                count.setImageResource(R.drawable.pink);
                                count.animate().rotation(350).setDuration(500);
                                Log.i("Pink","V"+k);
                            }
                            else if(hj!=pc){
                                count.setImageDrawable(null);
                            }

                        }
                        touch = true;
                    }
                    else if (touch == true) {
                        int k2;
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

                        pc=k2;
                        Log.i("WhiteO","V"+val1);
                        for (int i = 0; i < gd.getChildCount(); i++) {
                            ImageView count = (ImageView) gd.getChildAt(i);
                            int hj = Integer.parseInt(count.getTag().toString());

                            if (k2 == hj) {
                                hg.add(j);
                                val1=0;
                                for(int m : hg){
                                    val1=val1+m;
                                    Log.i("Val","V"+hg);
                                }
                                if(val1==100){
                                    Log.i("Result:","White Won");
                                    editText.setVisibility(View.VISIBLE);
                                    editText.setText("White Won");
                                }
                                else{
                                    editText.setVisibility(View.INVISIBLE);
                                }
                                count.setImageResource(R.drawable.white);
                                count.animate().rotation(350).setDuration(500);
                                Log.i("White","V"+k2);
                            }

                        }

                        touch = false;
                    }

            }

        });

        }
}
