package com.felight.isha;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ToastAndNotificationActivity extends Activity {
	
	public void createNotification(View view){
		
		NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		
		Notification.Builder builder = new Notification.Builder(getBaseContext());
		Bitmap icon = BitmapFactory.decodeResource(getBaseContext().getResources(),
                R.drawable.icon);
		
		
		builder.setAutoCancel(true)
		.setContentInfo("Your time is running out.. Click here avail the offer")
		.setContentText("More info here")
		.setLargeIcon(icon)
		.setSmallIcon(R.drawable.icon);
		
		Notification notification = builder.getNotification();//new Notification(R.drawable.icon, "Your time is running out.. Click here avail the offer", System.currentTimeMillis());
		//led 
		
		notification.ledARGB = 0xFFff0000;
		notification.flags = Notification.FLAG_SHOW_LIGHTS;
		notification.ledOnMS = 100; 
		notification.ledOffMS = 100; 
	    
	    
		manager.notify(1, notification);
	
		MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.alert);
		mediaPlayer.setLooping(false);
		mediaPlayer.seekTo(43);
		mediaPlayer.start();
		
		Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
		vibrator.vibrate(3000);
		
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toast_and_notification);
	}

	public void doSomething(View view){
		
		Utils.toastItBaby(getBaseContext(),"this is message");
		
	}
}
