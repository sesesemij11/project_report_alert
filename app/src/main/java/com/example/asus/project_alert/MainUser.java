package com.example.asus.project_alert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainUser extends AppCompatActivity {

    String[] Movies = new String[]{
            "Harry Portter Season 1",
            "Harry Portter Season 2",
            "Harry Portter Season 3",
            "Harry Portter Season 4",
            "Harry Portter Season 5",
            "Harry Portter Season 6",
            "Harry Portter Season 7",
            "Fantastic Beast",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_user);

        ImageButton alert = findViewById(R.id.alert);
        ListView movieList = (ListView)findViewById(R.id.textView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Movies);

        movieList.setAdapter(adapter);

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainUser.this, report.class);
                startActivity(intent);
            }
        });
    }
}
