package com.pack.assignment;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeUser extends Activity{
	

	TextView txtName;
	TextView txtAge;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.welcome);
		
		txtName=(TextView)findViewById(R.id.Name);
		txtAge=(TextView)findViewById(R.id.Age);
		
		String user=getIntent().getExtras().getString("Name");
		txtName.setText(user);
		
		String age=getIntent().getExtras().getString("Age");
		txtAge.setText(age);
		
	}

	
}
