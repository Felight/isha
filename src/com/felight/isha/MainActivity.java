package com.felight.isha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(1, 1, 1, "Help");
		menu.add("Settings");
		menu.add("About App");
		menu.add("Donate");
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int currentapiVersion = android.os.Build.VERSION.SDK_INT;
		if (currentapiVersion >= android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH){
		    // Do something for froyo and above versions
		} else{
		    // do something for phones running an SDK before froyo
		}
		
		Toast.makeText(getBaseContext(), item.getTitle() + " Selected", 3000).show();
		
		if(item.getTitle().equals("About App")){
			Intent intent = new Intent(getBaseContext(), AboutAppActivity.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void navigator(View view) {

		switch (view.getId()) {
		case R.id.btnGoToSimpleCalculator:

			Intent intentA = new Intent(getBaseContext(), SimpleCalculatorActivity.class);
			intentA.putExtra("newstype", "Apple");
			startActivity(intentA);
			break;

		case R.id.btnGoToGreetUser:

			Intent intentB = new Intent(getBaseContext(), GreetUserActivity.class);
			intentB.putExtra("newstype", "Google");
			startActivity(intentB);
			break;
			
		default:
			break;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainactivity_layout);
	}

	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		finish();
	}
}
