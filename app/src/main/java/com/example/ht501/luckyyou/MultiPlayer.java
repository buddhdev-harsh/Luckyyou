package com.example.ht501.luckyyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MultiPlayer extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;
    Boolean aretheyright1=false;
    Boolean KeepPlaying1=true;
    Boolean aretheyright2=false;
    Boolean KeepPlaying2=true;
    Boolean aretheyright3=false;
    Boolean KeepPlaying3=true;
    Boolean aretheyright4=false;
    Boolean KeepPlaying4=true;
    Boolean aretheyright5=false;
    Boolean KeepPlaying5=true;
    Boolean aretheyright6=false;
    Boolean KeepPlaying6=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player);



        Intent i = getIntent();
        int num_players = i.getIntExtra("num_players", 2);
        //Toast.makeText(this,String.valueOf(num_players), Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"inputs are given", Toast.LENGTH_SHORT).show();


        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        b10 = (Button) findViewById(R.id.btn10);
        b11 = (Button) findViewById(R.id.btn11);
        b12= (Button) findViewById(R.id.btn12);
        b13= (Button) findViewById(R.id.btn13);
        b14= (Button) findViewById(R.id.btn14);
        b15 = (Button) findViewById(R.id.btn15);
        b16 = (Button) findViewById(R.id.btn16);
        b17 = (Button) findViewById(R.id.btn17);
        b18= (Button) findViewById(R.id.btn18);
        b19 = (Button) findViewById(R.id.btn19);
        b20 = (Button) findViewById(R.id.btn20);
        b21= (Button) findViewById(R.id.btn21);
        b22 = (Button) findViewById(R.id.btn22);
        b23 = (Button) findViewById(R.id.btn23);
        b24 = (Button) findViewById(R.id.btn24);

        switch (num_players) {
            case 1:
                onePlayer();
                break;
            case 2:
                twoPlayer();
                break;
            case 3:
                threePlayer();
                break;
            case 4:
                fourPlayer();
                break;
            case 5:
                fivePlayer();
                break;
            case 6:
                sixPlayer();
                break;
                default:
                    onePlayer();
                    break;
        }

    }

    public void onePlayer() {
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.GONE);
        b6.setVisibility(View.GONE);
        b7.setVisibility(View.GONE);
        b8.setVisibility(View.GONE);
        b9.setVisibility(View.GONE);
        b10.setVisibility(View.GONE);
        b11.setVisibility(View.GONE);
        b12.setVisibility(View.GONE);
        b13.setVisibility(View.GONE);
        b14.setVisibility(View.GONE);
        b15.setVisibility(View.GONE);
        b16.setVisibility(View.GONE);
        b17.setVisibility(View.GONE);
        b18.setVisibility(View.GONE);
        b19.setVisibility(View.GONE);
        b20.setVisibility(View.GONE);
        b21.setVisibility(View.GONE);
        b22.setVisibility(View.GONE);
        b23.setVisibility(View.GONE);
        b24.setVisibility(View.GONE);
        final int min=1;
        final int max=4;
        final int user1=new Random().nextInt((max-min)+1)+min;
        final int user2=new Random().nextInt((max-min)+1)+min;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setVisibility(View.GONE);
                if(Integer.valueOf(b1.getText().toString())==user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
                    KeepPlaying1=false;
                    if(Integer.valueOf(b1.getText().toString())==user2) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright2=true;
                        KeepPlaying2=false;
                    }
                    if(KeepPlaying1==false && KeepPlaying2==true)
                    {
                        Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                    if(KeepPlaying1==true && KeepPlaying2==false) {
                        Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setVisibility(View.GONE);
                if(Integer.valueOf(b2.getText().toString())==user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
                    KeepPlaying1=false;
                    if(Integer.valueOf(b2.getText().toString())==user2) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright2=true;
                        KeepPlaying2=false;
                    }
                    if(KeepPlaying1==false && KeepPlaying2==true)
                    {
                        Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setVisibility(View.GONE);
                if(Integer.valueOf(b3.getText().toString())==user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
                    KeepPlaying1=false;
                    if(Integer.valueOf(b3.getText().toString())==user2) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright2=true;
                        KeepPlaying2=false;
                    }
                    if(KeepPlaying1==false && KeepPlaying2==true)
                    {
                        Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                    if(KeepPlaying1==true && KeepPlaying2==false){
                        Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setVisibility(View.GONE);
                if(Integer.valueOf(b4.getText().toString())==user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
                    KeepPlaying1=false;
                }
                    if(Integer.valueOf(b4.getText().toString())==user2) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright1=true;
KeepPlaying1=false;
                    }
                if(KeepPlaying1==false && KeepPlaying2==true)
                {
                    Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==true && KeepPlaying2==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }


            }
        );

        }


    public void twoPlayer() {
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.GONE);
        b10.setVisibility(View.GONE);
        b11.setVisibility(View.GONE);
        b12.setVisibility(View.GONE);
        b13.setVisibility(View.GONE);
        b14.setVisibility(View.GONE);
        b15.setVisibility(View.GONE);
        b16.setVisibility(View.GONE);
        b17.setVisibility(View.GONE);
        b18.setVisibility(View.GONE);
        b19.setVisibility(View.GONE);
        b20.setVisibility(View.GONE);
        b21.setVisibility(View.GONE);
        b22.setVisibility(View.GONE);
        b23.setVisibility(View.GONE);
        b24.setVisibility(View.GONE);
        final int min=1;
        final int max=8;
        final int user1=new Random().nextInt((max-min)+1)+min;
        final int user2=new Random().nextInt((max-min)+1)+min;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setVisibility(View.GONE);
                if(Integer.valueOf(b1.getText().toString())==user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
                    KeepPlaying1=false;}
                if(Integer.valueOf(b1.getText().toString())==user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
                    KeepPlaying2=false;}
                if(KeepPlaying1==false && KeepPlaying2==true)
                {
                    Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==true && KeepPlaying2==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }

            }
            }
        );

        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      b2.setVisibility(View.GONE);
                                      if (Integer.valueOf(b2.getText().toString()) == user1) {
                                          Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                          aretheyright1=true;
                                          KeepPlaying1=false;
                                      }
                                      if (Integer.valueOf(b2.getText().toString()) == user2) {
                                          Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                          aretheyright2=true;
                                          KeepPlaying2=false; }
                                      if(KeepPlaying1==false && KeepPlaying2==true)
                                      {
                                          Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                                          finish();
                                      }
                                      if(KeepPlaying1==true && KeepPlaying2==false) {
                                          Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                          finish();
                                      }


                                  }}
        );

        b3.setOnClickListener(new View.OnClickListener(){


                @Override
                public void onClick (View view){
                b3.setVisibility(View.GONE);
                if (Integer.valueOf(b3.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
                    KeepPlaying1=false;
                }
                if (Integer.valueOf(b3.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
                    KeepPlaying2=false;
                }
                    if(KeepPlaying1==false && KeepPlaying2==true)
                    {
                        Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                    if(KeepPlaying1==true && KeepPlaying2==false){
                        Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                        finish();
                    }


            }
            });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setVisibility(View.GONE);
            if(Integer.valueOf(b4.getText().toString())==user1) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright1=true;
                KeepPlaying1=false;}
            if(Integer.valueOf(b4.getText().toString())==user2) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright2=true;
                KeepPlaying2=false;}
                if(KeepPlaying1==false && KeepPlaying2==true)
                {
                    Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==true && KeepPlaying2==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }

        }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setVisibility(View.GONE);
            if(Integer.valueOf(b5.getText().toString())==user1) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright1=true;
KeepPlaying1=false;}
            if(Integer.valueOf(b5.getText().toString())==user2) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright2=true;
KeepPlaying2=false;}
                if(KeepPlaying1==false && KeepPlaying2==true)
                {
                    Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==true && KeepPlaying2==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }

        }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setVisibility(View.GONE);
            if(Integer.valueOf(b6.getText().toString())==user1) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright1=true;
KeepPlaying1=false;}
            if(Integer.valueOf(b6.getText().toString())==user2) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright2=true;
KeepPlaying2=false;}
                if(KeepPlaying1==false && KeepPlaying2==true)
                {
                    Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==true && KeepPlaying2==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }

        }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setVisibility(View.GONE);
            if(Integer.valueOf(b7.getText().toString())==user1) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright1=true;
                KeepPlaying1=false;}
            if(Integer.valueOf(b7.getText().toString())==user2) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright2=true;
                KeepPlaying2=false;}
                if(KeepPlaying1==false && KeepPlaying2==true)
                {
                    Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==true && KeepPlaying2==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }

        }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setVisibility(View.GONE);
            if(Integer.valueOf(b8.getText().toString())==user1) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright1=true;
                KeepPlaying1=false;}
            if(Integer.valueOf(b8.getText().toString())==user2) {
                Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright2=true;
                KeepPlaying2=false;}
                if(KeepPlaying1==false && KeepPlaying2==true)
                {
                    Toast.makeText(getApplicationContext(),"user 2 wins",Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==true && KeepPlaying2==false) {
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }

        }
        });

    }

    public void threePlayer() {
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        b10.setVisibility(View.VISIBLE);
        b11.setVisibility(View.VISIBLE);
        b12.setVisibility(View.VISIBLE);
        b13.setVisibility(View.GONE);
        b14.setVisibility(View.GONE);
        b15.setVisibility(View.GONE);
        b16.setVisibility(View.GONE);
        b17.setVisibility(View.GONE);
        b18.setVisibility(View.GONE);
        b19.setVisibility(View.GONE);
        b20.setVisibility(View.GONE);
        b21.setVisibility(View.GONE);
        b22.setVisibility(View.GONE);
        b23.setVisibility(View.GONE);
        b24.setVisibility(View.GONE);
        final int min=1;
        final int max=12;
        final int user1=new Random().nextInt((max-min)+1)+min;
        final int user2=new Random().nextInt((max-min)+1)+min;
        final int user3=new Random().nextInt((max-min)+1)+min;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setVisibility(View.GONE);
                if (Integer.valueOf(b1.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,sorry user1", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
                    KeepPlaying1=false;
                }
                if (Integer.valueOf(b1.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,sorry user2", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
                    KeepPlaying2=false;

                }
                if (Integer.valueOf(b1.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,sorry user3", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
                    KeepPlaying3=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                } if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setVisibility(View.GONE);
        if (Integer.valueOf(b2.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b2.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b2.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setVisibility(View.GONE);
            if (Integer.valueOf(b3.getText().toString()) == user1) {
            Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                aretheyright1=true;
                KeepPlaying1=false;

            }
        if (Integer.valueOf(b3.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b3.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setVisibility(View.GONE);
        if (Integer.valueOf(b4.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b4.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b4.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setVisibility(View.GONE);
        if (Integer.valueOf(b5.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b5.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b5.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setVisibility(View.GONE);
        if (Integer.valueOf(b6.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b6.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b6.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setVisibility(View.GONE);
        if (Integer.valueOf(b7.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b7.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();

            aretheyright2=true;
            KeepPlaying2=false;
        }
        if (Integer.valueOf(b7.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setVisibility(View.GONE);
        if (Integer.valueOf(b8.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b8.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b8.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setVisibility(View.GONE);
        if (Integer.valueOf(b9.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b9.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b9.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b10.setVisibility(View.GONE);
        if (Integer.valueOf(b10.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b10.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b10.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b11.setVisibility(View.GONE);
        if (Integer.valueOf(b11.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b11.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b11.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b12.setVisibility(View.GONE);
        if (Integer.valueOf(b12.getText().toString()) == user1) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if (Integer.valueOf(b12.getText().toString()) == user2) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if (Integer.valueOf(b12.getText().toString()) == user3) {
        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

    }


    public void fourPlayer() {
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        b10.setVisibility(View.VISIBLE);
        b11.setVisibility(View.VISIBLE);
        b12.setVisibility(View.VISIBLE);
        b13.setVisibility(View.VISIBLE);
        b14.setVisibility(View.VISIBLE);
        b15.setVisibility(View.VISIBLE);
        b16.setVisibility(View.VISIBLE);
        b17.setVisibility(View.GONE);
        b18.setVisibility(View.GONE);
        b19.setVisibility(View.GONE);
        b20.setVisibility(View.GONE);
        b21.setVisibility(View.GONE);
        b22.setVisibility(View.GONE);
        b23.setVisibility(View.GONE);
        b24.setVisibility(View.GONE);
        final int min=1;
        final int max=16;
        final int user1=new Random().nextInt((max-min)+1)+min;
        final int user2=new Random().nextInt((max-min)+1)+min;
        final int user3=new Random().nextInt((max-min)+1)+min;
        final int user4=new Random().nextInt((max-min)+1)+min;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
        b1.setVisibility(View.GONE);
        if(Integer.valueOf(b1.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if(Integer.valueOf(b1.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;
        }
        if(Integer.valueOf(b1.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;

        }
        if(Integer.valueOf(b1.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;

        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if (KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
        b2.setVisibility(View.GONE);
        if(Integer.valueOf(b2.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if(Integer.valueOf(b2.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;
     }
        if(Integer.valueOf(b2.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
        if(Integer.valueOf(b2.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
        b3.setVisibility(View.GONE);
        if(Integer.valueOf(b3.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if(Integer.valueOf(b3.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if(Integer.valueOf(b3.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
        if(Integer.valueOf(b3.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;

        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
        b4.setVisibility(View.GONE);
        if(Integer.valueOf(b4.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if(Integer.valueOf(b4.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if(Integer.valueOf(b4.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
        if(Integer.valueOf(b4.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
        b5.setVisibility(View.GONE);
        if(Integer.valueOf(b5.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if(Integer.valueOf(b5.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if(Integer.valueOf(b5.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
        if(Integer.valueOf(b5.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setVisibility(View.GONE);
        if(Integer.valueOf(b6.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if(Integer.valueOf(b6.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if(Integer.valueOf(b6.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
        if(Integer.valueOf(b6.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;
        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true) {
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setVisibility(View.GONE);
        if(Integer.valueOf(b7.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;
        }
        if(Integer.valueOf(b7.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if(Integer.valueOf(b7.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
        if(Integer.valueOf(b7.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;

        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
            b8.setVisibility(View.GONE);
        if(Integer.valueOf(b8.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if(Integer.valueOf(b8.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if(Integer.valueOf(b8.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;

        }
        if(Integer.valueOf(b8.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;

        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setVisibility(View.GONE);
        if(Integer.valueOf(b9.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if(Integer.valueOf(b9.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if(Integer.valueOf(b9.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
        if(Integer.valueOf(b9.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;
        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
        b10.setVisibility(View.GONE);
        if(Integer.valueOf(b10.getText().toString())==user1){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright1=true;
            KeepPlaying1=false;

        }
        if(Integer.valueOf(b10.getText().toString())==user2){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright2=true;
            KeepPlaying2=false;

        }
        if(Integer.valueOf(b10.getText().toString())==user3){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright3=true;
            KeepPlaying3=false;


        }
        if(Integer.valueOf(b10.getText().toString())==user4){
        Toast.makeText(getApplicationContext(),"WRONG NUMBER",Toast.LENGTH_SHORT).show();
            aretheyright4=true;
            KeepPlaying4=false;


        }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b11.setVisibility(View.GONE);
                if (Integer.valueOf(b11.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
                    KeepPlaying1=false;

                }
                if (Integer.valueOf(b11.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
                    KeepPlaying2=false;

                }
                if (Integer.valueOf(b11.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
                    KeepPlaying3=false;


                }
                if (Integer.valueOf(b11.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
                    KeepPlaying4=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b12.setVisibility(View.GONE);
                    if (Integer.valueOf(b12.getText().toString()) == user1) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright1=true;
                        KeepPlaying1=false;

                    }
                    if (Integer.valueOf(b12.getText().toString()) == user2) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright2=true;
                        KeepPlaying2=false;
                    }
                    if (Integer.valueOf(b12.getText().toString()) == user3) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright3=true;
                        KeepPlaying3=false;

                    }
                    if (Integer.valueOf(b12.getText().toString()) == user4) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright4=true;
                        KeepPlaying4=false;


                    }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b13.setVisibility(View.GONE);
                    if (Integer.valueOf(b13.getText().toString()) == user1) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright1=true;
                        KeepPlaying1=false;
                  }
                    if (Integer.valueOf(b13.getText().toString()) == user2) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright2=true;
                        KeepPlaying2=false;
                    }
                    if (Integer.valueOf(b13.getText().toString()) == user3) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright3=true;
                        KeepPlaying3=false;

                    }
                    if (Integer.valueOf(b13.getText().toString()) == user4) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright4=true;
                        KeepPlaying4=false;

                    }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b14.setVisibility(View.GONE);
                    if (Integer.valueOf(b14.getText().toString()) == user1) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright1=true;
KeepPlaying1=false;
                    }
                    if (Integer.valueOf(b14.getText().toString()) == user2) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright2=true;
KeepPlaying2=false;
                    }
                    if (Integer.valueOf(b14.getText().toString()) == user3) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright3=true;
KeepPlaying3=false;

                    }
                    if (Integer.valueOf(b14.getText().toString()) == user4) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright4=true;
KeepPlaying4=false;

                    }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b15.setVisibility(View.GONE);
                    if (Integer.valueOf(b15.getText().toString()) == user1) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright1=true;
                        KeepPlaying1=false;
                    }
                    if (Integer.valueOf(b15.getText().toString()) == user2) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright2=true;
                        KeepPlaying2=false;
                    }
                    if (Integer.valueOf(b15.getText().toString()) == user3) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright3=true;
                        KeepPlaying3=false;

                    }
                    if (Integer.valueOf(b15.getText().toString()) == user4) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright4=true;
KeepPlaying4=false;

                    }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b16.setVisibility(View.GONE);
                    if (Integer.valueOf(b16.getText().toString()) == user1) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright1=true;
KeepPlaying1=false;
                    }
                    if (Integer.valueOf(b16.getText().toString()) == user2) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright2=true;
KeepPlaying2=false;
                    }
                    if (Integer.valueOf(b16.getText().toString()) == user3) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright3=true;
KeepPlaying3=false;

                    }
                    if (Integer.valueOf(b16.getText().toString()) == user4) {
                        Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                        aretheyright4=true;
KeepPlaying4=false;

                    }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });


    }

    public void fivePlayer() {
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        b10.setVisibility(View.VISIBLE);
        b11.setVisibility(View.VISIBLE);
        b12.setVisibility(View.VISIBLE);
        b13.setVisibility(View.VISIBLE);
        b14.setVisibility(View.VISIBLE);
        b15.setVisibility(View.VISIBLE);
        b16.setVisibility(View.VISIBLE);
        b17.setVisibility(View.VISIBLE);
        b18.setVisibility(View.VISIBLE);
        b19.setVisibility(View.VISIBLE);
        b20.setVisibility(View.VISIBLE);
        b21.setVisibility(View.GONE);
        b22.setVisibility(View.GONE);
        b23.setVisibility(View.GONE);
        b24.setVisibility(View.GONE);
        final int min=1;
        final int max=20;
        final int user1=new Random().nextInt((max-min)+1)+min;
        final int user2=new Random().nextInt((max-min)+1)+min;
        final int user3=new Random().nextInt((max-min)+1)+min;
        final int user4=new Random().nextInt((max-min)+1)+min;
        final int user5=new Random().nextInt((max-min)+1)+min;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setVisibility(View.GONE);
                if (Integer.valueOf(b1.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b1.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b1.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 3", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b1.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 4", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b1.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setVisibility(View.GONE);
                if (Integer.valueOf(b2.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b2.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b2.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 3", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b2.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b2.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setVisibility(View.GONE);
                if (Integer.valueOf(b3.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b3.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b3.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b3.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b3.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setVisibility(View.GONE);
                if (Integer.valueOf(b4.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b4.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b4.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b4.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b4.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setVisibility(View.GONE);
                if (Integer.valueOf(b5.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b5.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b5.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b5.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b5.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setVisibility(View.GONE);
                if (Integer.valueOf(b6.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b6.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b6.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 3", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b6.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b6.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setVisibility(View.GONE);
                if (Integer.valueOf(b7.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b7.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 2", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b7.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b7.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b7.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setVisibility(View.GONE);
                if (Integer.valueOf(b8.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b8.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b8.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b8.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b8.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setVisibility(View.GONE);
                if (Integer.valueOf(b9.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b9.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b9.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b9.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b9.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 5", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b10.setVisibility(View.GONE);
                if (Integer.valueOf(b10.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b10.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b10.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b10.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b10.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b11.setVisibility(View.GONE);
                if (Integer.valueOf(b11.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b11.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b11.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b11.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b11.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b12.setVisibility(View.GONE);
                if (Integer.valueOf(b12.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b12.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b12.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b12.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b12.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b13.setVisibility(View.GONE);
                if (Integer.valueOf(b13.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b13.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b13.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b13.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b13.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b14.setVisibility(View.GONE);
                if (Integer.valueOf(b14.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b14.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b14.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b14.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b14.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b15.setVisibility(View.GONE);
                if (Integer.valueOf(b15.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b15.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b15.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b15.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b15.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b16.setVisibility(View.GONE);
                if (Integer.valueOf(b16.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b16.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b16.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b16.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b16.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b17.setVisibility(View.GONE);
                if (Integer.valueOf(b17.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b17.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b17.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b17.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b17.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b18.setVisibility(View.GONE);
                if (Integer.valueOf(b18.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b18.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b18.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b18.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b18.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b19.setVisibility(View.GONE);
                if (Integer.valueOf(b19.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b19.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b19.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b19.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b19.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b20.setVisibility(View.GONE);
                if (Integer.valueOf(b20.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b20.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b20.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b20.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b20.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

    }

    public void sixPlayer() {
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        b10.setVisibility(View.VISIBLE);
        b11.setVisibility(View.VISIBLE);
        b12.setVisibility(View.VISIBLE);
        b13.setVisibility(View.VISIBLE);
        b14.setVisibility(View.VISIBLE);
        b15.setVisibility(View.VISIBLE);
        b16.setVisibility(View.VISIBLE);
        b17.setVisibility(View.VISIBLE);
        b18.setVisibility(View.VISIBLE);
        b19.setVisibility(View.VISIBLE);
        b20.setVisibility(View.VISIBLE);
        b21.setVisibility(View.VISIBLE);
        b22.setVisibility(View.VISIBLE);
        b23.setVisibility(View.VISIBLE);
        b24.setVisibility(View.VISIBLE);
        final int min=1;
        final int max=24;
        final int user1=new Random().nextInt((max-min)+1)+min;
        final int user2=new Random().nextInt((max-min)+1)+min;
        final int user3=new Random().nextInt((max-min)+1)+min;
        final int user4=new Random().nextInt((max-min)+1)+min;
        final int user6=new Random().nextInt((max-min)+1)+min;
        final int user5=new Random().nextInt((max-min)+1)+min;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setVisibility(View.GONE);
                if (Integer.valueOf(b1.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b1.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b1.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b1.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if (Integer.valueOf(b1.getText().toString()) == user5) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if (Integer.valueOf(b1.getText().toString()) == user6) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setVisibility(View.GONE);
                if (Integer.valueOf(b2.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b2.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b2.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b2.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b2.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b2.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }

                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setVisibility(View.GONE);
                if (Integer.valueOf(b3.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b3.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b3.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 3", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b3.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 4", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b3.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 5", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b3.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }

                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setVisibility(View.GONE);
                if (Integer.valueOf(b4.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b4.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b4.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b4.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b4.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b4.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 6", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }

                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setVisibility(View.GONE);
                if (Integer.valueOf(b5.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 1", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b5.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b5.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b5.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b5.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b5.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }

                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setVisibility(View.GONE);
                if (Integer.valueOf(b6.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b6.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b6.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b6.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b6.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b6.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }

                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setVisibility(View.GONE);
                if (Integer.valueOf(b7.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b7.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b7.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b7.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b7.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b7.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }

                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setVisibility(View.GONE);
                if (Integer.valueOf(b8.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b8.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b8.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b8.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b8.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b8.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setVisibility(View.GONE);
                if (Integer.valueOf(b9.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b9.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b9.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b9.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b9.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b9.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b10.setVisibility(View.GONE);
                if (Integer.valueOf(b10.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b10.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b10.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b10.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b10.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b10.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b11.setVisibility(View.GONE);
                if (Integer.valueOf(b11.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b11.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b11.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b11.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b11.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b11.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b12.setVisibility(View.GONE);
                if (Integer.valueOf(b12.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b12.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b12.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b12.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b12.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b12.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b13.setVisibility(View.GONE);
                if (Integer.valueOf(b13.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b13.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b13.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b13.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b13.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b13.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b14.setVisibility(View.GONE);
                if (Integer.valueOf(b14.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b14.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b14.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b14.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b14.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b14.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b15.setVisibility(View.GONE);
                if (Integer.valueOf(b15.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b15.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b15.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b15.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b15.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b15.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b16.setVisibility(View.GONE);
                if (Integer.valueOf(b16.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b16.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b16.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b16.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b16.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b16.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b17.setVisibility(View.GONE);
                if (Integer.valueOf(b17.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b17.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b17.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b17.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b17.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b17.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b18.setVisibility(View.GONE);
                if (Integer.valueOf(b18.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b18.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b18.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b18.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b18.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b18.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b19.setVisibility(View.GONE);
                if (Integer.valueOf(b19.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b19.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b19.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b19.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b19.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b19.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b20.setVisibility(View.GONE);
                if (Integer.valueOf(b20.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b20.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b20.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b20.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b20.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b20.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b21.setVisibility(View.GONE);
                if (Integer.valueOf(b21.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b21.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b21.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b21.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b21.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b21.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b22.setVisibility(View.GONE);
                if (Integer.valueOf(b22.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b22.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b22.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b22.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b22.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b22.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b23.setVisibility(View.GONE);
                if (Integer.valueOf(b23.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b23.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b23.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b23.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b23.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 5", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b23.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b24.setVisibility(View.GONE);
                if (Integer.valueOf(b24.getText().toString()) == user1) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright1=true;
KeepPlaying1=false;
                }
                if (Integer.valueOf(b24.getText().toString()) == user2) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright2=true;
KeepPlaying2=false;
                }
                if (Integer.valueOf(b24.getText().toString()) == user3) {
                    Toast.makeText(getApplicationContext(), "GAME OVER,suer 3", Toast.LENGTH_SHORT).show();
                    aretheyright3=true;
KeepPlaying3=false;

                }
                if (Integer.valueOf(b24.getText().toString()) == user4) {
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright4=true;
KeepPlaying4=false;

                }
                if(Integer.valueOf(b24.getText().toString()) == user5){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright5=true;
KeepPlaying5=false;

                }
                if(Integer.valueOf(b24.getText().toString()) == user6){
                    Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                    aretheyright6=true;
KeepPlaying6=false;

                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==true && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false)
                {
                    Toast.makeText(getApplicationContext(), "user 3 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==true && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 2 wins", Toast.LENGTH_SHORT).show();
                    finish();

                } if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==true && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 4 wins", Toast.LENGTH_SHORT).show();
                    finish();

                }
                if(KeepPlaying1==true && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==true && KeepPlaying6==false){
                    Toast.makeText(getApplicationContext(), "user 5 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }if(KeepPlaying1==false && KeepPlaying2==false && KeepPlaying3==false && KeepPlaying4==false && KeepPlaying5==false && KeepPlaying6==true){
                    Toast.makeText(getApplicationContext(), "user 6 wins", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

    }


}
