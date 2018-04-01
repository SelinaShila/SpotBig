package com.example.selinashila.spotbig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

 private Button num1,num2,num3,num4;
   TextView pointView;
   int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        String username = getIntent().getStringExtra("UserName");
        TextView tv =(TextView)findViewById(R.id.TV);
        tv.setText(username);
        Buttons();
        Point();

    }
   private void Buttons(){
        num1=(Button)findViewById(R.id.Num1);


      num2=(Button)findViewById(R.id.Num2);


      num3=(Button)findViewById(R.id.Num3);


      num4=(Button)findViewById(R.id.Num4);

   }
   private void Point(){

       pointView =(TextView)findViewById(R.id.pointView);
       pointView.setText(String.valueOf(i));
   }
   public void onClick(View v){
       if(v.getId()==R.id.Num2){
           i++;
           Point();
       }
       else {
           i--;
           Point();
       }
   }
}
