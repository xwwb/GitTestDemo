package xw.com.gittestdemo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 private  int i=0;
 private int c=0;
 private int b=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et = findViewById(R.id.editText);
//        et.setFocusable(true);
//        et.setFocusableInTouchMode(true);
        et.requestFocus();

    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //提交了
        //又提交了

    }

    @Override

    protected void onStop() {
        super.onStop();

    }
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (){
//
//        }
        /////
        /////

////
        ///bbbbbbb
        //aaaa
        //111111
        //8888888888
        //111111
    }
}
