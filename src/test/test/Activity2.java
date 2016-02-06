package test.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main2);
        EditText text1 = (EditText) findViewById(R.id.EditText01);
        EditText text2 = (EditText) findViewById(R.id.EditText02);
        text1.setText(getIntent().getStringExtra("Value1"));
        text2.setText(getIntent().getStringExtra("Value2"));
    }

    public void onClick(View view) {
        super.finish();
    }

    @Override
    public void finish() {
        Intent data = new Intent();
        data.putExtra("returnKey1", "Swinging on a star. ");
        setResult(RESULT_OK, data);
        super.finish();
    }
}
