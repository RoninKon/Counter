package com.example.counter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  static final String KEY_COUNT = "key";
    private int count = 0;
    private Button button;
private TextView textCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCount = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(listener);
    }
    //public void onCountClick(View view){
     //count++;
        //textCount.setText(Integer.toString(count));
    //}
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            count++;
            textCount.setText(Integer.toString(count));
        }

    };
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState ) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "onSaveInstanceState", Toast.LENGTH_SHORT);
        toast.show();
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "onRestoreInstanceState", Toast.LENGTH_SHORT);
        toast.show();
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt(KEY_COUNT);
    }
    @Override
    protected void onStart() {

        Toast toast = Toast.makeText(this, "Старт активности", Toast.LENGTH_SHORT);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(this, "Стоп активности", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT, 0,0);
        toast.show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Toast toast = Toast.makeText(this, "Уничтожение активности", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0,0);
        toast.show();
        super.onDestroy();
    }

    @Override
    protected void onPause() {

        Toast toast = Toast.makeText(this, "onPause", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
        super.onPause();
    }
    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(this, " onResume", Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
        super.onResume();
    }

        

}