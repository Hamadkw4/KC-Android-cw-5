package com.example.hamad12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView hamadK=findViewById(R.id.imageView14);
        TextView hamadK1=findViewById(R.id.textView4);
        TextView hamadK2=findViewById(R.id.textView5);
        TextView hamadK3=findViewById(R.id.textView6);
        TextView hamadK4=findViewById(R.id.textView7);
        TextView hamadK5=findViewById(R.id.textView8);
        TextView hamadK6=findViewById(R.id.textView9);
        TextView hamadK7=findViewById(R.id.textView10);
        TextView hamad90=findViewById(R.id.textView13);

        Bundle bundle = getIntent().getExtras();

        // name
        String NAME=bundle.getString("name");
        hamadK5.setText(NAME);

        // ID
        int ID= bundle.getInt("ID");
        hamadK6.setText(String.valueOf(ID));



        //   Country
       String country=bundle.getString("Country");
       hamad90.setText(country);







    }
}