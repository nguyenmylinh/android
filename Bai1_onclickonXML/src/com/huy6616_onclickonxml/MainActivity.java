package com.huy6616_onclickonxml;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tong(View v)
    {
    	EditText txtsa = (EditText)findViewById(R.id.txtsoa);
    	int a = Integer.parseInt(txtsa.getText().toString());
    	EditText txtbbb = (EditText)findViewById(R.id.txtsob);
    	int b = Integer.parseInt(txtbbb.getText().toString());
    	int c = a+ b;
    	TextView tv = (TextView)findViewById(R.id.txtketqua);
    	tv.setText(c + "");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
