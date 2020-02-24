package com.example.logoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.logoquiz.models.PlayerDetails;

public class MainActivity extends AppCompatActivity {
    private TextView mGreetings;
    private EditText mText;
    private Button mButton;
    private PlayerDetails mPlayerDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        mGreetings =(TextView) findViewById(R.id.greetings);
        mText=(EditText) findViewById(R.id.main_text_edit);
        mButton= (Button) findViewById(R.id.button);
        mPlayerDetails = new PlayerDetails();
        mButton.setEnabled(false);


        mText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mButton.setEnabled(true);
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name= mText.getText().toString();
               mPlayerDetails.setPlayerName(name);
                Intent gameActivity =new Intent(MainActivity.this, Game.class);
                startActivity(gameActivity);
            }
        });
    }
}
