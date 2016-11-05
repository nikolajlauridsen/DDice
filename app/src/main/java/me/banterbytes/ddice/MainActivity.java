package me.banterbytes.ddice;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.Format;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static String roll_die(int sides){
        int number = (int) (Math.random()*sides+1);
        return String.format(Locale.FRANCE, "D%d : %d", sides, number);
    }

    public void rollD4(View view){
        String roll = roll_die(4);
        appendHistory(roll);
        TextView roll_result = (TextView) findViewById(R.id.roll_result);
        roll_result.setText(roll);
    }

    public void rollD6(View view){
        String roll = roll_die(6);
        appendHistory(roll);
        TextView roll_result = (TextView) findViewById(R.id.roll_result);
        roll_result.setText(roll);
    }

    public void rollD8(View view){
        String roll = roll_die(8);
        appendHistory(roll);
        TextView roll_result = (TextView) findViewById(R.id.roll_result);
        roll_result.setText(roll);
    }

    public void rollD10(View view){
        String roll = roll_die(10);
        appendHistory(roll);
        TextView roll_result = (TextView) findViewById(R.id.roll_result);
        roll_result.setText(roll);
    }

    public void rollD12(View view){
        String roll = roll_die(12);
        appendHistory(roll);
        TextView roll_result = (TextView) findViewById(R.id.roll_result);
        roll_result.setText(roll);
    }

    public void rollD20(View view){
        String roll = roll_die(20);
        appendHistory(roll);
        TextView roll_result = (TextView) findViewById(R.id.roll_result);
        roll_result.setText(roll);
    }

    public void rollD100(View view){
        String roll = roll_die(100);
        appendHistory(roll);
        TextView roll_result = (TextView) findViewById(R.id.roll_result);
        roll_result.setText(roll);
    }

    public void appendHistory(String roll_result){
        LinearLayout history = (LinearLayout) findViewById(R.id.history);
        TextView rollView = new TextView(this);
        rollView.setText(roll_result);
        rollView.setGravity(Gravity.CENTER);
        history.addView(rollView, 0);
    }

}
