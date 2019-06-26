package com.example.xoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int [][]matrix ;
Button btn ;
TextView txt;
boolean player_x = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        matrix = new int[3][3];
        txt = findViewById(R.id.playertag);
        inti(btn);

    }
    public  void  onclick_H(View view){
        switch (view.getId()) {
            case R.id.btn_1:
                btn = findViewById(R.id.btn_1);
                puts(0,0);
                break;
            case R.id.btn_2:
                btn = findViewById(R.id.btn_2);
               puts(0,1);
                break;

            case R.id.btn_3:
                btn = findViewById(R.id.btn_3);
                puts(0,2);
                break;
            case R.id.btn_4:
                btn = findViewById(R.id.btn_4);
                puts(1,0);
                break;
            case R.id.btn_5:
                btn = findViewById(R.id.btn_5);
               puts(1,1);
                break;
            case R.id.btn_6:
                btn = findViewById(R.id.btn_6);
               puts(1,2);
                break;
            case R.id.btn_7:
                btn = findViewById(R.id.btn_7);
                puts(2,0);
                break;
            case R.id.btn_8:
                btn = findViewById(R.id.btn_8);
                puts(2,1);
                break;
            case R.id.btn_9:
                btn = findViewById(R.id.btn_9);
             puts(2,2);
                break;
        }
    }
    public void  cheacwinner(){
boolean found  = false,vart = false;
int c =0;
for (int i = 0 ; i<3;i++) {
    for (int j = 0; j < 3; j++) {

        c = c + matrix[i][j];
    }
    if (c == 3) {
        txt.setText("player 1 win ");
        found = true;
        break;
    } else if (c == 12) {
        txt.setText("player 2 win");
        found = true;
        break;
    }
    c = 0;
}
if(!found){
    for (int i = 0 ; i<3;i++){
        for (int j = 0 ; j<3;j++){

            c= c+matrix[j][i];
        }
        if (c == 3){
            txt.setText("player 1 win");
            found = true;
            break ;
        }
        else if(c==12){
            txt.setText("player 2 win ");
            found = true;
            break ;
        }
        c=0;
    }}

    if(!found&&!vart){
            c = matrix[0][0]+matrix[1][1]+matrix[2][2];
            if (c == 3){
                txt.setText("player 1 win");
                found = true;

            }
            else if(c==12){
                txt.setText("player 2 win");
                found = true;

            }
            c=0;
        c = matrix[0][2]+matrix[1][1]+matrix[2][0];
        if (c == 3){
            txt.setText("player 1 win");
            found = true;

        }
        else if(c==12){
            txt.setText("player 2 win ");
            found = true;

        }
         c=0;
    }

}


public void puts (int n1 ,int n2){
    if (player_x) {
        txt.setText("player 2 turn");
        matrix[n1][n2] = 1;
        player_x = false;
        btn.setText("x");

    } else {
        txt.setText("player 1 turn");
        matrix[n1][n2] = 4;
        player_x = true;
        btn.setText("o");
    }
    cheacwinner();
}
public void inti(View view) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matrix[i][j] = 0;
        }
    }


    btn = findViewById(R.id.btn_1);
    btn.setText("");

    btn = findViewById(R.id.btn_2);
    btn.setText("");
    btn = findViewById(R.id.btn_3);
    btn.setText("");
    btn = findViewById(R.id.btn_4);
    btn.setText("");
    btn = findViewById(R.id.btn_5);
    btn.setText("");
    btn = findViewById(R.id.btn_6);
    btn.setText("");
    btn = findViewById(R.id.btn_7);
    btn.setText("");

    btn = findViewById(R.id.btn_8);
    btn.setText("");

    btn = findViewById(R.id.btn_9);
    btn.setText("");
    txt.setText("player 1 turn");
}
}


