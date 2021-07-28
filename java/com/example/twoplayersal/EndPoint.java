package com.example.twoplayersal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EndPoint extends AppCompatActivity {

    Button quit;
    Context context;
    Button btn;
    TextView txtview;
    MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_point);
        media=MediaPlayer.create(this,R.raw.win);
        media.start();
        context=this;

        txtview=(TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("names");
        Log.i("Val",message);
        txtview.setText(message + " Won");


        btn=(Button) findViewById(R.id.playagain);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(context,MainActivity.class);
                startActivity(intent1);
            }
        });

        quit=(Button) findViewById(R.id.quit);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }

        });



    }
    @Override
    public void onBackPressed(){
        Intent int1=new Intent(context,MainActivity.class);
        startActivity(int1);
    }
}