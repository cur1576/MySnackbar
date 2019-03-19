package com.example.mysnackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String forUndo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clear(View view) {
        final TextView tv = findViewById(R.id.tv);
        forUndo = tv.getText().toString();
        tv.setText("");
        Snackbar sb = Snackbar.make(findViewById(R.id.constraintLayout),"Rückgangig",Snackbar.LENGTH_LONG);
        sb.setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(forUndo);
            }
        });
        sb.show();
    }
}
