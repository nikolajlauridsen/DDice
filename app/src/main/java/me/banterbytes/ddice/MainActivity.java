package me.banterbytes.ddice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.Format;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static int roll_die(int sides){
        return (int) (Math.random()*sides+1);
    }

    public void rollD6(View view){
        int roll = roll_die(6);
        String result_string = String.format(Locale.FRANCE, "%d", roll);
        TextView roll_result = (TextView) findViewById(R.id.roll_result);
        roll_result.setText(result_string);
    }
}
