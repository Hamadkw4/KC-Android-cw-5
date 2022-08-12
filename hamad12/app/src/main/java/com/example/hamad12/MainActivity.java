package com.example.hamad12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hamad=findViewById(R.id.nt1);
        TextView hamad1=findViewById(R.id.textView2);
        EditText hamad2=findViewById(R.id.nt2);
        EditText hamad3=findViewById(R.id.ABCD);
        EditText hamad0=findViewById(R.id.editTextTextPersonName1);
        ImageView hamad5=findViewById(R.id.imageView);
        Button hamad9=findViewById(R.id.button);






        hamad9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String g1= hamad3.getText().toString();
                int g2=Integer.parseInt(hamad2.getText().toString());
                String g3= hamad0.getText().toString();






   Intent kw3= new Intent(MainActivity.this, MainActivity2.class);
                       kw3.putExtra("name",g1);
                       kw3.putExtra("ID",g2);
                       kw3.putExtra("Country",g3);

                startActivity(kw3);




            }
        });







            }




    }
