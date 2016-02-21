package test.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Status extends Activity {

    private static final int REQUEST_CODE = 3434;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_status);
        EditText text2 = (EditText) findViewById(R.id.EditText02);
        text2.setText(getIntent().getStringExtra("Value1") + " " + getIntent().getStringExtra("Value2"));

    }

    /*
     @Override
     protected void onActivityResult(int requestCode, int resultCode, Intent data) {
     if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
     if (data.hasExtra("returnKey1")) {
     TextView tv = (TextView) findViewById(R.id.TextView02);
     tv.setText("Result from Activity 2:\n"
     + data.getExtras().getString("returnKey1"));
     }
     }
     }*/
}
