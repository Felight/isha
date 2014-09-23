package com.felight.isha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalculatorActivity extends Activity {
	EditText etNumber1;
	EditText etNumber2;
	TextView tvResult;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("SimpleCalculatorActivity", "OnCreate has been Called");
		setContentView(R.layout.simple_calculator_layout);
		etNumber1 = (EditText) findViewById(R.id.etFirstNumber);
		etNumber2 = (EditText) findViewById(R.id.etSecondNumber);
		tvResult = (TextView) findViewById(R.id.tvResult);
		
		Intent intent = getIntent();
		
		String newstype = intent.getStringExtra("newstype");
		
		if(newstype.equals("Apple")){
			tvResult.setText("I will display apple news only");
		}
		
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.i("SimpleCalculatorActivity", "OnStart has been Called");
		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.i("SimpleCalculatorActivity", "OnResume has been Called");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.i("SimpleCalculatorActivity", "OnPause has been Called");
	}
	
	@Override
	protected void onStop() {
		
		super.onStop();
		
		Log.i("SimpleCalculatorActivity", "OnStop has been Called");
	}
	
	@Override
	protected void onDestroy() {
		Log.i("SimpleCalculatorActivity", "OnDestroy has been Called");
		super.onDestroy();
		
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i("SimpleCalculatorActivity", "OnRestart has been Called");
	}
	

	public void compute(View view){
		double num1 = Double.parseDouble(etNumber1.getText().toString());
		double num2 = Double.parseDouble(etNumber2.getText().toString());
		
		switch(view.getId()){
		case R.id.btnAdd:
			tvResult.setText((num1 + num2) + "");
			break;
		case R.id.btnSub:
			tvResult.setText((num1 - num2) + "");
			break;
		case R.id.btnMul:
			tvResult.setText((num1 * num2) + "");
			break;
		case R.id.btnMod:
			tvResult.setText((num1 % num2) + "");
			break;
			
		} 
	}
}
