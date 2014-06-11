package com.example.podpinaniekomponentow;

import android.R.integer;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	Button b;
	TextView t;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b = (Button) findViewById(R.id.button1);
		t = (TextView) findViewById(R.id.textView1);
		b.setText("Czeœæ, jestem napisem!");
		t.setTextColor(Color.LTGRAY);
		t.setText("Ja te¿ jestem napisem, ale kolorowym!");

	}
}
