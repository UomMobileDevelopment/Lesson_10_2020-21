package gr.uom.android.lesson_09_2018_19;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        TextView txtGreeting = findViewById(R.id.txtGreeting);

        String givenName = intent.getStringExtra("name");

        txtGreeting.setText("Hello there, "+givenName+ " !!");
    }
}
