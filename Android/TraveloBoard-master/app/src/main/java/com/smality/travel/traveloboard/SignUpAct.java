package com.smality.travel.traveloboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpAct extends AppCompatActivity {

    Animation frombottom, fromtop;
    Button btnjoin;
    TextView textView2;
    EditText email, complete_name, username, location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        btnjoin = (Button) findViewById(R.id.btnjoin);
        textView2 = (TextView) findViewById(R.id.textView2);

        email = (EditText) findViewById(R.id.editText2);
        complete_name = (EditText) findViewById(R.id.editText5);
        location = (EditText) findViewById(R.id.editText3);
        username = (EditText) findViewById(R.id.editText7);

        btnjoin.startAnimation(frombottom);

        textView2.startAnimation(fromtop);

        email.startAnimation(fromtop);
        complete_name.startAnimation(fromtop);
        location.startAnimation(fromtop);
        username.startAnimation(fromtop);


        btnjoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email_ =email.getText().toString();
                String completeName =complete_name.getText().toString();
                String location_ =location.getText().toString();
                String username_ =username.getText().toString();

               String fulldata= email_+" "+completeName+" "+location_+" "+username_;

                Intent intent = new Intent(v.getContext(), GetData.class);

                Bundle b=new Bundle();
                b.putString("formdata", fulldata);
                intent.putExtras(b);

                startActivity(intent);



            }
        });


    }
}
