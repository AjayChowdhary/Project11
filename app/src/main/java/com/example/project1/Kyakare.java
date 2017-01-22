package com.example.project1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Kyakare extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kyakare);
		TextView tv=(TextView)findViewById(R.id.so);
		

        tv.setText(getIntent().getExtras().getString("the"));
      
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_kyakare, menu);
		return true;
	}

	
public void favf(View v){}
public void mainp(View v)
{Intent i=new Intent(getApplicationContext(), MainActivity.class);
startActivity(i);
	}
public void playl(View v){}
public void songl(View v){Intent i = new Intent(getApplicationContext(), PlayListActivity.class);
startActivity(i);}
}
