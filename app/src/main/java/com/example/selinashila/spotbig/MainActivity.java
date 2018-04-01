package com.example.selinashila.spotbig;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view){
        if(view.getId()==R.id.btn_play){
            EditText editText =(EditText)findViewById(R.id.inputUname);
            String str = editText.getText().toString();
            Intent intent = new Intent(MainActivity.this,GameActivity.class);
            intent.putExtra("UserName",str);
            startActivity(intent);
        }

    }
}
