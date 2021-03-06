package com.example.androideventhandlersandlisteners;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);
        myButton.setBackgroundColor(Color.RED);
        myButton.setText("Continue");
        myButton.setTextColor(Color.WHITE);
        RelativeLayout.LayoutParams buttonDetails=
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        myLayout.addView(myButton,buttonDetails);
        EditText username = new EditText(this);
        myButton.setId((int)1);
        username.setId((int)2);
        RelativeLayout.LayoutParams usernameDetails =
                new RelativeLayout.LayoutParams(
                  RelativeLayout.LayoutParams.WRAP_CONTENT,
                  RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        usernameDetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        username.setWidth(px);
        usernameDetails.setMargins(0,0,0,50);
        myLayout.addView(username,usernameDetails);
        setContentView(myLayout);


        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView m = (TextView) findViewById(R.id.btn);
                        m.setText("Btn Clicked");
                    }
                }
        );

        btn.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View v) {
                        TextView m = (TextView) findViewById(R.id.btn);
                        m.setText("Long Btn Clicked");
                        return true;
                    }
                }
        );

    }
}