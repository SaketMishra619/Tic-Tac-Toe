package com.saketapp.tic_tac_toe;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset;
    int turn = 0, a;
    TextView e1;
    Dialog MyCustomDialog;
    Button play_button;
    TextView c1, c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        btn5 = findViewById(R.id.b5);
        btn6 = findViewById(R.id.b6);
        btn7 = findViewById(R.id.b7);
        btn8 = findViewById(R.id.b8);
        btn9 = findViewById(R.id.b9);
        reset = findViewById(R.id.b10);
        e1 = findViewById(R.id.textView);
        MyCustomDialog = new Dialog(this);
      btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if (btn1.getText().toString().equals("")) {
                    if (turn == 0) {
                        turn = 1;
                        btn1.setText("O");
                        e1.setText(R.string.player_x_turn);
                        win();
                    } else {
                        turn = 0;
                        btn1.setText("X");
                        e1.setText(R.string.player_o_turn);
                        win();
                    }
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn2.getText().toString().equals("")) {
                    if (turn == 0) {
                        turn = 1;
                        btn2.setText("O");
                        e1.setText(R.string.player_x_turn);
                        win();
                    } else {
                        turn = 0;
                        btn2.setText("X");
                        e1.setText(R.string.player_o_turn);
                        win();
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn3.getText().toString().equals("")) {
                    if (turn == 0) {
                        turn = 1;
                        btn3.setText("O");
                        e1.setText(R.string.player_x_turn);
                        win();
                    } else {
                        turn = 0;
                        btn3.setText("X");
                        e1.setText(R.string.player_o_turn);
                        win();
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn4.getText().toString().equals("")) {
                    if (turn == 0) {
                        turn = 1;
                        btn4.setText("O");
                        e1.setText(R.string.player_x_turn);
                        win();
                    } else {
                        turn = 0;
                        btn4.setText("X");
                        e1.setText(R.string.player_o_turn);
                        win();
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn5.getText().toString().equals("")) {
                    if (turn == 0) {
                        turn = 1;
                        btn5.setText("O");
                        e1.setText(R.string.player_x_turn);
                        win();
                    } else {
                        turn = 0;
                        btn5.setText("X");
                        e1.setText(R.string.player_o_turn);
                        win();
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn6.getText().toString().equals("")) {
                    if (turn == 0) {
                        turn = 1;
                        btn6.setText("O");
                        e1.setText(R.string.player_x_turn);
                        win();
                    } else {
                        turn = 0;
                        btn6.setText("X");
                        e1.setText(R.string.player_o_turn);
                        win();
                    }
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn7.getText().toString().equals("")) {
                    if (turn == 0) {
                        turn = 1;
                        btn7.setText("O");
                        e1.setText(R.string.player_x_turn);
                        win();
                    } else {
                        turn = 0;
                        btn7.setText("X");
                        e1.setText(R.string.player_o_turn);
                        win();
                    }
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn8.getText().toString().equals("")) {
                    if (turn == 0) {
                        turn = 1;
                        btn8.setText("O");
                        e1.setText(R.string.player_x_turn);
                        win();
                    } else {
                        turn = 0;
                        btn8.setText("X");
                        e1.setText(R.string.player_o_turn);
                        win();
                    }
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn9.getText().toString().equals("")) {
                    if (turn == 0) {
                        turn = 1;
                        btn9.setText("O");
                        e1.setText(R.string.player_x_turn);
                        win();
                    } else {
                        turn = 0;
                        btn9.setText("X");
                        e1.setText(R.string.player_o_turn);
                        win();
                    }
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

    }

    public void win() {
        if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_LONG).show();
            a = 1;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_LONG).show();
            a = 1;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_LONG).show();
            a = 1;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_LONG).show();
            a = 1;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_LONG).show();
            a = 1;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_LONG).show();
            a = 1;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_LONG).show();
            a = 1;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_LONG).show();
            a = 1;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_LONG).show();
            a = 2;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_LONG).show();
            a = 2;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_LONG).show();
            a = 2;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_LONG).show();
            a = 2;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_LONG).show();
            a = 2;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_LONG).show();
            a = 2;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_LONG).show();
            a = 2;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_LONG).show();
            a = 2;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
        else if (!btn1.getText().toString().equals("") && !btn2.getText().toString().equals("") && !btn3.getText().toString().equals("") && !btn4.getText().toString().equals("") && !btn5.getText().toString().equals("") && !btn6.getText().toString().equals("") && !btn7.getText().toString().equals("") && !btn8.getText().toString().equals("") && !btn9.getText().toString().equals("")) {
            Toast.makeText(this, "Match is Draw", Toast.LENGTH_LONG).show();
            a = 3;
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            reset.setEnabled(false);
            Show_My_Dialog();
        }
    }

    public void clear() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        turn = 0;
        e1.setText(R.string.player_o_turn);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit");
        builder.setMessage("Are You Sure?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", null);
        builder.setCancelable(false);
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void Show_My_Dialog() {
        MyCustomDialog.setContentView(R.layout.my_custom_dialog_result);
        play_button = MyCustomDialog.findViewById(R.id.button);
        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomDialog.dismiss();
                clear();
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                reset.setEnabled(true);
            }
        });
        MyCustomDialog.setCancelable(false);
        c1 = MyCustomDialog.findViewById(R.id.textView1);
        c2 = MyCustomDialog.findViewById(R.id.textView2);
        if (a == 1) {
            c1.setText(R.string.congratulation);
            c2.setText(R.string.player_o_wins);
        } else if (a == 2) {
            c1.setText(R.string.congratulation);
            c2.setText(R.string.player_x_wins);
        } else if (a == 3) {
            c1.setText(R.string.oops);
            c2.setText(R.string.match_is_draw);
        }
        MyCustomDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        MyCustomDialog.show();
    }

}
