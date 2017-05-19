package kr.p_e.mprof.www.intro;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Constants
    private final int LOGIN_SUSSESS = 1;

    AlertDialog.Builder dialog;
    EditText id,pw;
    Button login_button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        login_button = (Button)findViewById(R.id.button7);
        id = (EditText)findViewById(R.id.editText);
        pw = (EditText)findViewById(R.id.editText2);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id.getText().toString().equals("manzi") && pw.getText().toString().equals("0815"))
                {
                    Toast.makeText(getApplicationContext(),"로그인에 성공하였습니다.",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, Settings.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"로그인에 실패하였습니다.",Toast.LENGTH_SHORT).show();
                    pw.setText("");
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        dialog = new AlertDialog.Builder(MainActivity.this);

        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        dialog.setNegativeButton("NO", null);

        dialog.setTitle("Exit App?");
        dialog.setMessage("");
        dialog.show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
    }
}
