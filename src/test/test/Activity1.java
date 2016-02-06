package test.test;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Activity1 extends Activity {

    private static final int REQUEST_CODE = 3434;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
    }

    public void onClick(View view) {
        finish();
        Intent i = new Intent(this, Activity2.class);
        i.putExtra("Value1", "Value one from Activity1 ");
        i.putExtra("Value2", "Value two from Activity1");
        startActivityForResult(i, REQUEST_CODE);
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
