package com.e.jihclesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class lesson6 extends AppCompatActivity {

        Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnC, btnboth, btnperc, btndivis, btnmulti, btnminus, btnplus, btnequal;
        TextView nulll, nulll2;
        String preview, operation, start, end;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            numbers();
            ClearPlusMinusPer();
            btnSolves();
            btnOperation();
        }

        public void btnSolves(){
            View.OnClickListener solves = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start = nulll.getText().toString();
                    switch (v.getId()){
                        case R.id.btnPlus:
                            operation = "+";
                            break;
                        case R.id.btnMinus:
                            operation = "-";
                            break;
                        case R.id.btnmulti:
                            operation = "*";
                            break;
                        case R.id.btndivis:
                            operation = "/";
                            break;

                    }
                    preview = start + operation;
                    nulll2.setText(preview);
                    nulll.setText("0");

                }
            };
            btnplus.setOnClickListener(solves);
            btnminus.setOnClickListener(solves);
            btnmulti.setOnClickListener(solves);
            btndivis.setOnClickListener(solves);

        }
        public void btnOperation() {
            View.OnClickListener answer = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    end = nulll.getText().toString();
                    int var1 = Integer.parseInt(start);
                    int var2 = Integer.parseInt(end);
                    int total = 0;
                    if (operation.equals("+")) {
                        total = var1 + var2;
                    } else if (operation.equals("-")) {
                        total = var1 - var2;
                    } else if (operation.equals("*")) {
                        total = var1 * var2;
                    } else if (operation.equals("/")) {
                        total = var1 / var2;
                    }
                    preview = start + operation + end + " = " + total;

                    nulll.setText(preview);
                    nulll.setText("" + total);

                }

            };
            btnequal.setOnClickListener(answer);
        }

        public void ClearPlusMinusPer(){
            View.OnClickListener clear_pl_min = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String viewT = nulll.getText().toString();
                    int intviewT = Integer.parseInt(viewT);
                    switch (v.getId()){
                        case R.id.btnboth:
                            if(intviewT > 0){
                                nulll.setText("-" + viewT);
                            }else{
                                intviewT = intviewT * (-1);
                                nulll.setText(""+intviewT);
                            }
                            break;
                        case R.id.btnC:
                            nulll.setText("0");
                            nulll2.setText("");
                            break;


                    }

                }
            };

            btnC.setOnClickListener(clear_pl_min);
            btnboth.setOnClickListener(clear_pl_min);

        }

        private void numbers() {
            View.OnClickListener button_num = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String first_num = nulll.getText().toString();
                    String second_num = "";
                    String result = "";
                    switch (view.getId()) {
                        case R.id.btn0:
                            second_num = "0";
                            break;
                        case R.id.btn1:
                            second_num = "1";
                            break;
                        case R.id.btn2:
                            second_num = "2";
                            break;
                        case R.id.btn3:
                            second_num = "3";
                            break;
                        case R.id.btn4:
                            second_num = "4";
                            break;
                        case R.id.btn5:
                            second_num = "5";
                            break;
                        case R.id.btn6:
                            second_num = "6";
                            break;
                        case R.id.btn7:
                            second_num = "7";
                            break;
                        case R.id.btn8:
                            second_num = "8";
                            break;
                        case R.id.btn9:
                            second_num = "9";
                            break;
                    }
                    if (first_num.equals("0")) {
                        result = second_num;
                    } else {
                        result = first_num + second_num;
                    }
                    nulll.setText(result);

                }
            };

            btn0.setOnClickListener(button_num);
            btn1.setOnClickListener(button_num);
            btn2.setOnClickListener(button_num);
            btn3.setOnClickListener(button_num);
            btn4.setOnClickListener(button_num);
            btn5.setOnClickListener(button_num);
            btn6.setOnClickListener(button_num);
            btn7.setOnClickListener(button_num);
            btn8.setOnClickListener(button_num);
            btn9.setOnClickListener(button_num);

        }
    public void idEquals(){
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn0 = findViewById(R.id.btn0);
        btnC = findViewById(R.id.btnC);
        btnplus = findViewById(R.id.btnPlus);
        btnminus = findViewById(R.id.btnMinus);
        btnboth = findViewById(R.id.btnboth);
        btnperc = findViewById(R.id.btnperc);
        btnequal = findViewById(R.id.btnequal);
        btndivis = findViewById(R.id.btndivis);
        btnmulti = findViewById(R.id.btnmulti);

        nulll = findViewById(R.id.nulll);
        nulll2 = findViewById(R.id.nulll2);
    }
}