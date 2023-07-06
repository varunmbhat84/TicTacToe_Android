package com.example.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9 ;
    int turn;
    int draw;
    Button playAgain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        playAgain = (Button) findViewById(R.id.playAgainButton);
        turn = 1;
        draw = 1;

        playAgain.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        });




        button1.setOnClickListener(view -> {

            if(button1.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    button1.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button1.setText("O");
                }

            }
            endGame();
            draw++;
        });
        button2.setOnClickListener(view -> {

            if(button2.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    button2.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button2.setText("O");
                }

            }
            endGame();
            draw++;
        });
        button3.setOnClickListener(view -> {

            if(button3.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    button3.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button3.setText("O");
                }

            }
            endGame();
            draw++;
        });
        button4.setOnClickListener(view -> {

            if(button4.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    button4.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button4.setText("O");
                }

            }
            endGame();
            draw++;
        });
        button5.setOnClickListener(view -> {

            if(button5.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    button5.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button5.setText("O");
                }

            }
            endGame();
            draw++;
        });
        button6.setOnClickListener(view -> {

            if(button6.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    button6.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button6.setText("O");
                }

            }
            endGame();
            draw++;
        });
        button7.setOnClickListener(view -> {

            if(button7.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    button7.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button7.setText("O");
                }

            }
            endGame();
            draw++;
        });
        button8.setOnClickListener(view -> {

            if(button8.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    button8.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button8.setText("O");
                }

            }
            endGame();
            draw++;
        });
        button9.setOnClickListener(view -> {

            if(button9.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    button9.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    button9.setText("O");
                }

            }
            endGame();
            draw++;
        });


    }

    public void endGame () {
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;

        a = button1.getText().toString();
        b = button2.getText().toString();
        c = button3.getText().toString();

        d = button4.getText().toString();
        e = button5.getText().toString();
        f = button6.getText().toString();

        g = button7.getText().toString();
        h = button8.getText().toString();
        i = button9.getText().toString();

        if(a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;

        }
        if(a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("X") && e.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }


        if(a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("O") && e.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(end) {
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            playAgain.setVisibility(View.VISIBLE);
        }
        if (draw == 9 && !end ) {
            Toast.makeText(MainActivity.this, "Draw Game!", Toast.LENGTH_LONG).show();
            playAgain.setVisibility(View.VISIBLE);
        }
    }
}