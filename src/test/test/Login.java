package test.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends Activity {

    private static final int REQUEST_CODE = 3434;

    EditText text1;
    EditText text2;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.login);
        text1 = (EditText) findViewById(R.id.EditText01);
        text2 = (EditText) findViewById(R.id.EditText02);
        text1.setText(getIntent().getStringExtra("Value1"));
        text2.setText(getIntent().getStringExtra("Value2"));
    }

    public void onClick(View view) {

        Intent i = new Intent(this, Login_Status.class);
        i.putExtra("Value1", text1.getText().toString());
        i.putExtra("Value2", text2.getText().toString());
        startActivityForResult(i, REQUEST_CODE);

    }

    @Override
    public void finish() {
        super.finish();

    }

}
