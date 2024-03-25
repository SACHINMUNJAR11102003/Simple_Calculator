package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    StringBuilder inputStringBuilder=new StringBuilder();


    int res,command;
    StringBuilder inp1,inp2;

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public StringBuilder getInp2() {
        return inp2;
    }

    public void setInp2(StringBuilder inp2) {
        this.inp2 = inp2;
    }

    public StringBuilder getInp1() {
        return inp1;
    }

    public void setInp1(StringBuilder inp1) {
        this.inp1 = inp1;
    }

    TextView textView_1,textView_2,textView_3,
    textView_4,textView_5,textView_6,textView_7,
            textView_8,textView_9,textView_0,
    textView_equalTO,textView_clear;

    EditText input_output_bar;
    ImageView img_button_add,img_button_subtract;
    TextView txt_button_multiply,txt_button_devide;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_0=findViewById(R.id.input_0);
        textView_1=findViewById(R.id.input_1);
        textView_2=findViewById(R.id.input_2);
        textView_3=findViewById(R.id.input_3);
        textView_4=findViewById(R.id.input_4);
        textView_5=findViewById(R.id.input_5);
        textView_6=findViewById(R.id.input_6);
        textView_7=findViewById(R.id.input_7);
        textView_8=findViewById(R.id.input_8);
        textView_9=findViewById(R.id.input_9);
        textView_clear=findViewById(R.id.input_clear);
        textView_equalTO=findViewById(R.id.input_equalTO);

        input_output_bar=findViewById(R.id.input_output_bar);
        img_button_add=findViewById(R.id.command_add);
        img_button_subtract=findViewById(R.id.command_subtract);
        txt_button_devide=findViewById(R.id.command_devide);
        txt_button_multiply=findViewById(R.id.command_product);

        textView_0.setOnClickListener(getDigitClickListener("0"));
        textView_1.setOnClickListener(getDigitClickListener("1"));
        textView_2.setOnClickListener(getDigitClickListener("2"));
        textView_3.setOnClickListener(getDigitClickListener("3"));
        textView_4.setOnClickListener(getDigitClickListener("4"));
        textView_5.setOnClickListener(getDigitClickListener("5"));
        textView_6.setOnClickListener(getDigitClickListener("6"));
        textView_7.setOnClickListener(getDigitClickListener("7"));
        textView_8.setOnClickListener(getDigitClickListener("8"));
        textView_9.setOnClickListener(getDigitClickListener("9"));

        textView_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_output_bar.setText("");
            }
        });

        textView_equalTO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        img_button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input_output_bar.getText().toString().length()>0){
                    String inp=input_output_bar.getText().toString();
                    StringBuilder inpStr=new StringBuilder(inp);
                    setInp1(inpStr);

                    int len=inp.length();
                    inputStringBuilder.delete(0,len);

                    input_output_bar.setText("");
                    setCommand(1);
                }else {
                    Toast.makeText(MainActivity.this, "Please give a valid Input", Toast.LENGTH_SHORT).show();
                }

            }
        });

        img_button_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input_output_bar.getText().toString().length()>0){
                    String inp=input_output_bar.getText().toString();
                    StringBuilder inpStr=new StringBuilder(inp);
                    setInp1(inpStr);

                    int len=inp.length();
                    inputStringBuilder.delete(0,len);

                    input_output_bar.setText("");
                    setCommand(2);
                }else {
                    Toast.makeText(MainActivity.this, "Please give a valid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });

        txt_button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input_output_bar.getText().toString().length()>0){
                    String inp=input_output_bar.getText().toString();
                    StringBuilder inpStr=new StringBuilder(inp);
                    setInp1(inpStr);

                    int len=inp.length();
                    inputStringBuilder.delete(0,len);

                    input_output_bar.setText("");
                    setCommand(3);
                }else {
                    Toast.makeText(MainActivity.this, "Please give a valid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });

        txt_button_devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input_output_bar.getText().toString().length()<1){
                    String inp=input_output_bar.getText().toString();
                    StringBuilder inpStr=new StringBuilder(inp);
                    setInp1(inpStr);

                    int len=inp.length();
                    inputStringBuilder.delete(0,len);

                    input_output_bar.setText("");
                    setCommand(4);
                }else {
                    Toast.makeText(MainActivity.this, "Please give a valid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textView_equalTO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inp=input_output_bar.getText().toString();
                StringBuilder inpStr=new StringBuilder(inp);
                setInp2(inpStr);
                int inp1_1=Integer.parseInt(getInp1().toString());
                int inp2_1=Integer.parseInt(getInp2().toString());
                int command1=getCommand();
                if (command1==1){
                    setRes(inp1_1+inp2_1);
                    int res1=getRes();
                    input_output_bar.setText(""+res1);
                    //input_output_bar.setText(getRes());
                } else if (command1==2) {
                    setRes(inp1_1-inp2_1);
                    int res1=getRes();
                    input_output_bar.setText(""+res1);
                    //input_output_bar.setText(getRes());
                } else if (command1==3) {
                    setRes(inp1_1*inp2_1);
                    int res1=getRes();
                    input_output_bar.setText(""+res1);
                    //input_output_bar.setText(getRes());
                } else if (command1==4) {
                    setRes(inp1_1/inp2_1);
                    int res1=getRes();
                    input_output_bar.setText(""+res1);
                    //input_output_bar.setText(getRes());
                }
                else {
                    Toast.makeText(MainActivity.this, "Please give a valid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    private View.OnClickListener getDigitClickListener(final String digit) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputStringBuilder.append(digit);
                input_output_bar.setText(inputStringBuilder.toString());
            }
        };
    }

}