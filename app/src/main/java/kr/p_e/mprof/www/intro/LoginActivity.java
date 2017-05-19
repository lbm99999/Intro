package kr.p_e.mprof.www.intro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button login_button;
    TextView id,pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        login_button = (Button)findViewById(R.id.button7);
        id = (TextView)findViewById(R.id.editText);
        pw = (TextView)findViewById(R.id.editText2);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id.getText() == "manzi" && pw.getText() == "0815")
                {

                }
                else {
                    Toast.makeText(getApplicationContext(), "아이디 혹은 비밀번호가 틀립니다.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
