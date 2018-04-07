package com.example.rutbiton.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button instruction_btn;
    private Button play_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instruction_btn=(Button)findViewById(R.id.bottom);
        instruction_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                instructionActinity();
            }
        });
    }
   public void instructionActinity(){
       Intent intent= new Intent(this,Instructions_Activity.class);
       startActivity(intent);
   }
}
