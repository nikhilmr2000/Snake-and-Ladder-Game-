package com.example.twoplayersal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlayerName extends AppCompatActivity {

    Button btn1;
    Context context;
    EditText name;
    EditText name2;
    String message;
    String message1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);


        context=this;
        name=(EditText) findViewById(R.id.name);
        name2=(EditText) findViewById(R.id.name2);
        btn1=(Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(name.getText().toString())){
                    Toast.makeText(PlayerName.this,"Enter your name",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(name2.getText().toString())){
                    Toast.makeText(PlayerName.this,"Enter your Partner Name",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent1 = new Intent(context, GameActivity.class);
                    intent1.putExtra("name", name.getText().toString());
                    intent1.putExtra("name2", name2.getText().toString());
                    startActivity(intent1);
                }
            }
        });
    }
}