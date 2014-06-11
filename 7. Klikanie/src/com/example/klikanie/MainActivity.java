package com.example.klikanie;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
public class MainActivity extends Activity  {

	Button b1;
	TextView t1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button) findViewById(R.id.button1);
		t1=(TextView)findViewById(R.id.textView1);		
	}
	public void obslugaKlikniecia(View v){
		Toast.makeText(getApplicationContext(),"Om nom nom", Toast.LENGTH_SHORT).show();
		t1.setText("To jest test");
		t1.setTextColor(Color.GREEN);
		
	}

}
