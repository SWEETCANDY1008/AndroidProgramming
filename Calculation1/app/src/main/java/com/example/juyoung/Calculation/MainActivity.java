    package com.example.juyoung.Calculation;

    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;
    import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        EditText edit1, edit2;
        Button btnAdd, btnSub, btnMul, btnDiv, btnDiv2;
        TextView textResult;
        String num1, num2;
        Float result;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setTitle("초간단 계산기");

            edit1 = (EditText) findViewById(R.id.Edit1);
            edit2 = (EditText) findViewById(R.id.Edit2);

            btnAdd = (Button) findViewById(R.id.BtnAdd);
            btnSub = (Button) findViewById(R.id.BtnSub);
            btnMul = (Button) findViewById(R.id.BtnMul);
            btnDiv = (Button) findViewById(R.id.BtnDiv);
            btnDiv2 = (Button) findViewById(R.id.BtnDiv2);

            textResult = (TextView) findViewById(R.id.TextResult);

            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if(num1 == null || num1.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else if(num2 == null || num2.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        result = Float.parseFloat(num1) + Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            });

            btnSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if(num1 == null || num1.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else if(num2 == null || num2.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        result = Float.parseFloat(num1) - Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            });

            btnMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if(num1 == null || num1.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else if(num2 == null || num2.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        result = Float.parseFloat(num1) * Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            });

            btnDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if(num1 == null || num1.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else if(num2 == null || num2.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else if(Float.parseFloat(num2) == 0) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        result = Float.parseFloat(num1) / Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            });

            btnDiv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if(num1 == null || num1.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else if(num2 == null || num2.equals("") == true) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                    else if(Float.parseFloat(num2) == 0) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        result = Float.parseFloat(num1) % Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            });
            /**
            btnAdd.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View arg0, MotionEvent arg1) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if(num1 == null || num2 == null) {
                        num1 = "0";
                        num2 = "0";
                    }
                    Toast.makeText(getApplicationContext(),"끼아아야야야야야악",Toast.LENGTH_SHORT).show();
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                    return false;
                }
            });

            btnSub.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View arg0, MotionEvent arg1) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                    return false;
                }
            });

            btnMul.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View arg0, MotionEvent arg1) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                    return false;
                }
            });

            btnDiv.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View arg0, MotionEvent arg1) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                    return false;
                }
            }); **/
        }
    }