package com.example.klikanie;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	public void obslugaKlikniecia(View v){
		Toast.makeText(getApplicationContext(),"Om nom nom", Toast.LENGTH_SHORT).show();		
	}
	
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button) findViewById(R.id.button1);
		
	}


}
