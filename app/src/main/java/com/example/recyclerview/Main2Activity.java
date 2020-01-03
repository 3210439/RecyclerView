package com.example.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, description;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mainImageView = findViewById(R.id.imageView2);
        title = findViewById(R.id.textView3);
        description = findViewById(R.id.textView4);

        getData();
        setData();
    }

    private void getData(){
        if(getIntent().hasExtra("images") &&
                getIntent().hasExtra("title") && getIntent().hasExtra("description"))
        {
            data1 = getIntent().getStringExtra("title");
            data2 = getIntent().getStringExtra("description");
            myImage = getIntent().getIntExtra("images", 1);

        } else{
            Toast.makeText(this,"No data", Toast.LENGTH_SHORT).show();
        }


    }

    private void setData() {
        title.setText(data1);
        description.setText(data2);
        mainImageView.setImageResource(myImage);
    }
}
