package com.felight.isha;

import java.net.URI;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BuiltInAppActivity extends Activity {

	public void openApp(View view) {
		switch (view.getId()) {
		case R.id.btnCamera:
			Intent cameraIntent = new Intent(
					android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivity(cameraIntent);
			break;

		case R.id.btnCall:
			Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("+919632188899"));
			startActivity(callIntent);
			break;
			
		case R.id.btnDailer:
			Intent dailIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.felight.com"));
			startActivity(dailIntent);
			break;

		default:
			break;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.built_in_app_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.built_in_app, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
