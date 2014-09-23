package com.felight.isha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GreetUserActivity extends Activity {
	
	Button btnActivityForResult;
	TextView tvResult;
	
	@Override
	protected void onStart() {
		super.onStart();
		OnClickListener click = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//tvResult.setText("Success");
				Intent intent = new Intent(getBaseContext(), ApplicationFormActivity.class);
				//startActivity(intent);
				startActivityForResult(intent, 1);
				
			}
		};
		
		btnActivityForResult.setOnClickListener(click);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
		
		
		tvResult.setText("Success from onActivityResult " + intent.getStringExtra("name"));
	}
	
	
	public void greetUser(View view){
		EditText etFirstName = (EditText) findViewById(R.id.etFirstName);
		EditText etLastName = (EditText) findViewById(R.id.etLastName);
		
		String fname = etFirstName.getText().toString();
		String lname = etLastName.getText().toString();
		
		
		tvResult.setText("Hello " + fname + " " + lname);
	}
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.greetuser_layout);
		tvResult = (TextView) findViewById(R.id.tvResult);
		btnActivityForResult = (Button) findViewById(R.id.btnActivityForResult);
		
	}

}
