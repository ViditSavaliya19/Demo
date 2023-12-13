package com.example.totg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCount = findViewById(R.id.btnCount);
        EditText edtAmount = findViewById(R.id.edtAmount);
        EditText edtRate = findViewById(R.id.edtRate);
        EditText edtYear = findViewById(R.id.edtYear);
        TextView txtAnswer=findViewById(R.id.txtAnswer);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = edtAmount.getText().toString();
                String rate = edtRate.getText().toString();
                String year = edtYear.getText().toString();

                if(amount.isEmpty())
                {
                    edtAmount.setError("Please enter amount");
                }
                else if(rate.isEmpty())
                {
                    edtRate.setError("Please enter rate");
                }
                else if(year.isEmpty())
                {
                    edtYear.setError("Please enter year");
                }
                else
                {
                    txtAnswer.setText(amount+" "+rate+" "+year);
                    Toast.makeText(MainActivity.this,amount+" "+rate+" "+year,Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}