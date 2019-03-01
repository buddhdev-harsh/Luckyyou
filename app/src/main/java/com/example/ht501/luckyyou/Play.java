package com.example.ht501.luckyyou;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class Play extends AppCompatActivity {
    private Button btnsin;
    private Button btnmul;
    Button enter;
    SeekBar sb;
    int seek_progress = 0;
    TextView count_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);



        enter = (Button) findViewById(R.id.enter);
        sb = (SeekBar) findViewById(R.id.seekBar);
        count_num = (TextView) findViewById(R.id.count_num);

        enter.setVisibility(View.GONE);
        sb.setVisibility(View.GONE);
        count_num.setVisibility(View.GONE);

        btnsin=(Button) findViewById(R.id.btnsin);
        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSinglePlayer();



            }
        });

        btnmul=(Button)findViewById(R.id.btnmul);
        btnmul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sb.setVisibility(View.VISIBLE);
                enter.setVisibility(View.VISIBLE);
                count_num.setVisibility(View.VISIBLE);
                count_num.setText(String.valueOf(seek_progress+2));
            }
        });

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seek_progress = progress;
                count_num.setText(String.valueOf(seek_progress+2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openMultiPlayer(seek_progress);
            }
        });



    }

    public void openSinglePlayer(){
        Intent i=new Intent(this,SinglePlayer.class);
        startActivity(i);


    }
    public void openMultiPlayer(int progress){
        Intent in=new Intent(this,MultiPlayer.class);
        in.putExtra("num_players", progress+2);
        startActivity(in);

    }

}
