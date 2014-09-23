package com.felight.isha;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnotherActivity extends Activity {
	
	public void changeText(View view){
		TextView tvObj = (TextView) findViewById(R.id.textView1);
		tvObj.setText("All the best Felightiens");
		tvObj.setTextSize(50.5f);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.another_layout);
		
		
	}
	
	

}
