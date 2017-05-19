package kr.p_e.mprof.www.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
            }
        });


    }
}
