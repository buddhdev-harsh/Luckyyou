package com.example.ht501.luckyyou;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;
import static android.view.View.GONE;


public class SinglePlayer extends AppCompatActivity {
   Button b1,b2,b3,b4,b5,b6,b7,b8;
   Boolean kp1=true,kp2=true,kp3=true,kp4=true,kp5=true,kp6=true,kp7=true,kp8=true;
   Boolean cli1=false,cli2=false,cli3=false,cli4=false,cli5=false,cli6=false,cli7=false,cli8=false;
    final int min=1;
    final int max=8;
   private int count=0;
   private int play=0;
    int gen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);


        b1=(Button)findViewById(R.id.btn25);
        b2=(Button)findViewById(R.id.btn26);
        b3=(Button)findViewById(R.id.btn27);
        b4=(Button)findViewById(R.id.btn28);
        b5=(Button)findViewById(R.id.btn29);
        b6=(Button)findViewById(R.id.btn30);
        b7=(Button)findViewById(R.id.btn31);
        b8=(Button)findViewById(R.id.btn32);


       final int user=new Random().nextInt((max-min)+1)+min;
       final int cpu=new Random().nextInt((max-min)+1)+min;
       Toast.makeText(getApplicationContext(),"inputs are given",Toast.LENGTH_SHORT).show();
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               b1.setVisibility(GONE);
               count++;
               cli1=true;
               if(count>play){
                   gen=new Random().nextInt((8-2)+1)+1;
               }
               if(Integer.valueOf(b1.getText().toString())==user) {
                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                   kp1=false;

               }
               if(kp1==false)
               {
                   Toast.makeText(getApplicationContext(), "cpu wins", Toast.LENGTH_SHORT).show();
                    finish();
               }
               if(kp1==true) {
                   switch (gen) {

                       case 2:
                           if (kp2 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }

                           }
                           b2.setVisibility(GONE);
                           if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                   Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                   finish();
                           }
                           break;


                       case 3:
                           if (kp3 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b3.setVisibility(GONE);
                           if (Integer.valueOf(b3.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 4:
                           if (kp4 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                            }
                           b4.setVisibility(GONE);
                           if (Integer.valueOf(b4.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 5:
                           if (kp5 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b5.setVisibility(GONE);
                           if (Integer.valueOf(b5.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 6:
                           if (kp6 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b6.setVisibility(GONE);
                           if (Integer.valueOf(b6.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 7:
                           if (kp7 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);

                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b7.setVisibility(GONE);
                           if (Integer.valueOf(b7.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 8:
                           if (kp8 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b8.setVisibility(GONE);
                           if (Integer.valueOf(b8.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                   }
               }
           }
       });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               b2.setVisibility(GONE);
               count++;
               if(count>play){
                   gen=new Random().nextInt((max-min)+1)+min;
               }
               if(Integer.valueOf(b2.getText().toString())==user) {
                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                   kp2=false;

               }
               if(kp2==false)
               {
                   Toast.makeText(getApplicationContext(), "cpu wins", Toast.LENGTH_SHORT).show();
                    finish();
               }
               if(kp2==true) {
                   switch (gen) {
                       case 1:
                           if (kp1 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }

                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b1.setVisibility(GONE);
                           if (Integer.valueOf(b1.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;

                       case 3:
                           if (kp2 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b3.setVisibility(GONE);
                           if (Integer.valueOf(b3.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 4:
                           if (kp4 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }

                       }
                           b4.setVisibility(GONE);
                           if (Integer.valueOf(b4.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 5:
                           if (kp5 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b5.setVisibility(GONE);
                           if (Integer.valueOf(b5.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 6:
                           if (kp6 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b6.setVisibility(GONE);
                           if (Integer.valueOf(b6.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 7:
                           if (kp7 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b7.setVisibility(GONE);
                           if (Integer.valueOf(b7.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 8:
                           if (kp8 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b8.setVisibility(GONE);
                           if (Integer.valueOf(b8.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                   }
               }
           }
       });
       b3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               b3.setVisibility(GONE);
               count++;
               if(count>play){
                   gen=new Random().nextInt((max-min)+1)+min;
               }
               if(Integer.valueOf(b3.getText().toString())==user) {
                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                   kp3=false;

               }
               if(kp3==false)
               {
                   Toast.makeText(getApplicationContext(), "cpu wins", Toast.LENGTH_SHORT).show();
                    finish();
               }
               if(kp3==true) {
                   switch (gen) {
                       case 1:
                           if (kp1 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b1.setVisibility(GONE);
                           if (Integer.valueOf(b1.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 2:
                           if (kp2 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                   }
                           b2.setVisibility(GONE);
                           if (Integer.valueOf(b2.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;


                       case 4:
                           if (kp4 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }

                           b4.setVisibility(GONE);
                           if (Integer.valueOf(b4.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 5:
                           if (kp5 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                   }
                           b5.setVisibility(GONE);
                           if (Integer.valueOf(b5.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 6:
                           if (kp6 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b6.setVisibility(GONE);
                           if (Integer.valueOf(b6.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 7:
                           if (kp7 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                       }

                           b7.setVisibility(GONE);
                           if (Integer.valueOf(b7.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 8:
                           if (kp8 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b8.setVisibility(GONE);
                           if (Integer.valueOf(b8.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                   }
               }
           }
       });
       b4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               b4.setVisibility(GONE);
               count++;
               if(count>play){
                   gen=new Random().nextInt((max-min)+1)+min;
               }
               if(Integer.valueOf(b4.getText().toString())==user) {
                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                   kp4=false;

               }
               if(kp4==false)
               {
                   Toast.makeText(getApplicationContext(), "cpu wins", Toast.LENGTH_SHORT).show();
                    finish();
               }
               if(kp4==true) {
                   switch (gen) {
                       case 1:if (kp1 == false) {
                           if (kp1 == true) {
                               b1.setVisibility(GONE);
                               if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                   Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                   finish();
                               }
                               break;
                           }
                           if (kp2 == true) {
                               b2.setVisibility(GONE);
                               if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                   Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                   finish();
                               }
                               break;
                           }
                           if (kp3 == true) {
                               b3.setVisibility(GONE);
                               if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                   Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                   finish();
                               }
                               break;
                           }
                           if (kp4 == true) {
                               b4.setVisibility(GONE);
                               if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                   Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                   finish();
                               }
                               break;
                           }
                           if (kp5 == true) {
                               b5.setVisibility(GONE);
                               if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                   Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                   finish();
                               }
                               break;
                           }
                           if (kp6 == true) {
                               b6.setVisibility(GONE);
                               if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                   Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                   finish();
                               }
                               break;
                           }
                           if (kp7 == true) {
                               b7.setVisibility(GONE);
                               if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                   Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                   finish();
                               }
                               break;

                           }
                           if (kp8 == true) {
                               b8.setVisibility(GONE);
                               if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                   Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                   finish();
                               }
                               break;

                           }
                           }
                           b1.setVisibility(GONE);
                           if (Integer.valueOf(b1.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 2:
                           if (kp2 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b2.setVisibility(GONE);
                           if (Integer.valueOf(b2.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 3:
                           if (kp3 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b3.setVisibility(GONE);
                           if (Integer.valueOf(b3.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;

                       case 5:
                           if (kp5 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b5.setVisibility(GONE);
                           if (Integer.valueOf(b5.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 6:
                           if (kp6 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b6.setVisibility(GONE);
                           if (Integer.valueOf(b6.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 7:
                           if (kp7 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   b8.setVisibility(GONE);

                                   break;

                               }
                           }
                           b7.setVisibility(GONE);
                           if (Integer.valueOf(b7.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 8:
                           if (kp8 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b8.setVisibility(GONE);
                           if (Integer.valueOf(b8.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                   }
               }
           }
       });
       b5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               b5.setVisibility(GONE);
            count++;
               if(count>play){
                   gen=new Random().nextInt((max-min)+1)+min;
               }
               if(Integer.valueOf(b5.getText().toString())==user) {
                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                   kp5=false;

               }
               if(kp5==false)
               {
                   Toast.makeText(getApplicationContext(), "cpu wins", Toast.LENGTH_SHORT).show();
                    finish();
               }
               if(kp5==true) {
                   switch (gen) {
                       case 1:
                           if (kp1 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b1.setVisibility(GONE);
                           if (Integer.valueOf(b1.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 2:
                           if (kp2 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;

                               }
                           }
                           b2.setVisibility(GONE);
                           if (Integer.valueOf(b2.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 3:
                           if (kp3 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);

                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);

                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b3.setVisibility(GONE);
                           if (Integer.valueOf(b3.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 4:
                           if (kp4 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }
                                   break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b4.setVisibility(GONE);
                           if (Integer.valueOf(b4.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;

                       case 6:
                           if (kp6 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   } break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b6.setVisibility(GONE);
                           if (Integer.valueOf(b6.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 7:
                           if (kp7 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }   break;
                               }
                               if (kp5 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b7.setVisibility(GONE);
                           if (Integer.valueOf(b7.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 8:
                           if (kp8 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   } break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }


                           }
                           b8.setVisibility(GONE);
                           if (Integer.valueOf(b8.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                   }
               }
           }
       });
       b6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               b6.setVisibility(GONE);
               count++;
               if(count>play){
                   gen=new Random().nextInt((max-min)+1)+min;
               }
               if(Integer.valueOf(b6.getText().toString())==user) {
                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                   kp6=false;

               }
               if(kp6==false)
               {
                   Toast.makeText(getApplicationContext(), "cpu wins", Toast.LENGTH_SHORT).show();
                    finish();
               }
               if(kp6==true) {
                   switch (gen) {
                       case 1:
                           if (kp1 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   } break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }    break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }    break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   } break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }


                               break;
                           }
                           b1.setVisibility(GONE);
                           if (Integer.valueOf(b1.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 2:
                           if (kp2 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }    break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }

                           }
                           b2.setVisibility(GONE);
                           if (Integer.valueOf(b2.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 3:
                           if (kp3 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b3.setVisibility(GONE);
                           if (Integer.valueOf(b3.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 4:
                           if (kp4 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }

                           b4.setVisibility(GONE);
                           if (Integer.valueOf(b4.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 5:
                           if (kp5 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }       break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }  break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }    break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }

                           b5.setVisibility(GONE);
                           if (Integer.valueOf(b5.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;

                       case 7:
                           if (kp7 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }    break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }    break;
                               }
                               if (kp5 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }    break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b7.setVisibility(GONE);
                           if (Integer.valueOf(b7.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 8:
                           if (kp8 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   } break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                   }
                           b8.setVisibility(GONE);
                           if (Integer.valueOf(b8.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                   }
               }
           }
       });
       b7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               b7.setVisibility(GONE);
               count++;
               if(count>play){
                   gen=new Random().nextInt((max-min)+1)+min;
               }

               if(Integer.valueOf(b7.getText().toString())==user) {
                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                   kp7=false;

               }
               if(kp7==false)
               {
                   Toast.makeText(getApplicationContext(), "cpu wins", Toast.LENGTH_SHORT).show();
                    finish();
               }
               if(kp7==true) {
                   switch (gen) {
                       case 1:
                           if (kp1 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }        break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   } break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b1.setVisibility(GONE);
                           if (Integer.valueOf(b1.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 2:
                           if (kp2 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }    break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b2.setVisibility(GONE);
                           if (Integer.valueOf(b2.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 3:
                           if (kp3 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   } break;

                               }
                           }
                           b3.setVisibility(GONE);
                           if (Integer.valueOf(b3.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 4:
                           if (kp4 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }    break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b4.setVisibility(GONE);
                           if (Integer.valueOf(b4.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 5:
                           if (kp5 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b5.setVisibility(GONE);
                           if (Integer.valueOf(b5.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 6:
                           if (kp6 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b6.setVisibility(GONE);
                           if (Integer.valueOf(b6.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;

                       case 8:
                           if (kp8 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }   break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b8.setVisibility(GONE);
                           if (Integer.valueOf(b8.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                   }
               }
           }
       });
       b8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               b8.setVisibility(GONE);
            count++;
               if(count>play){
                   gen=new Random().nextInt((7-1)+1)+1;
               }
               if(Integer.valueOf(b8.getText().toString())==user) {
                   Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                   kp8=false;

               }
               if(kp8==false)
               {
                   Toast.makeText(getApplicationContext(), "cpu wins", Toast.LENGTH_SHORT).show();
                    finish();
               }
               if(kp8==true) {
                   switch (gen) {
                       case 1:
                           if (kp1 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }                break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b1.setVisibility(GONE);
                           if (Integer.valueOf(b1.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 2:
                           if (kp2 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   } break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b2.setVisibility(GONE);
                           if (Integer.valueOf(b2.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 3:
                           if (kp3 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b3.setVisibility(GONE);
                           if (Integer.valueOf(b3.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 4:
                           if (kp4 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b4.setVisibility(GONE);
                           if (Integer.valueOf(b4.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 5:
                           if (kp5 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b5.setVisibility(GONE);
                           if (Integer.valueOf(b5.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 6:
                           if (kp6 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b6.setVisibility(GONE);
                           if (Integer.valueOf(b6.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;
                       case 7:
                           if (kp7 == false) {
                               if (kp1 == true) {
                                   b1.setVisibility(GONE);
                                   if (Integer.valueOf(b1.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp2 == true) {
                                   b2.setVisibility(GONE);
                                   if (Integer.valueOf(b2.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp3 == true) {
                                   b3.setVisibility(GONE);
                                   if (Integer.valueOf(b3.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp4 == true) {
                                   b4.setVisibility(GONE);
                                   if (Integer.valueOf(b4.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp5 == true) {
                                   b5.setVisibility(GONE);
                                   if (Integer.valueOf(b5.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp6 == true) {
                                   b6.setVisibility(GONE);
                                   if (Integer.valueOf(b6.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;
                               }
                               if (kp7 == true) {
                                   b7.setVisibility(GONE);
                                   if (Integer.valueOf(b7.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                               if (kp8 == true) {
                                   b8.setVisibility(GONE);
                                   if (Integer.valueOf(b8.getText().toString()) == cpu) {
                                       Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                                       Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                                       finish();
                                   }break;

                               }
                           }
                           b7.setVisibility(GONE);
                           if (Integer.valueOf(b7.getText().toString()) == cpu) {
                               Toast.makeText(getApplicationContext(), "WRONG NUMBER", Toast.LENGTH_SHORT).show();
                               Toast.makeText(getApplicationContext(), "user 1 wins", Toast.LENGTH_SHORT).show();
                               finish();
                           }
                           break;

                   }
               }
           }
       });

        }
    }















