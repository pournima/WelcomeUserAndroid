package com.pack.assignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeUserAssignmentActivity extends Activity {
    /** Called when the activity is first created. */
  EditText txtUserName;
  EditText txtUserAge;
  Button buttonOk;
  
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        txtUserName=(EditText)findViewById(R.id.userName);
        txtUserAge=(EditText)findViewById(R.id.userAge);
        buttonOk=(Button)findViewById(R.id.buttonOk);
        
        buttonOk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				
				Intent intent=new Intent(WelcomeUserAssignmentActivity.this,HomeUser.class);
				
				Bundle bundle=new Bundle();
				bundle.putString("Name", txtUserName.getText().toString());
				bundle.putString("Age", txtUserAge.getText().toString());
				intent.putExtras(bundle);
				
				//intent.putExtra("Name", txtUserName.getText().toString());
				//intent.putExtra("Age", txtUserAge.getText().toString());
				
				startActivity(intent);
				
			}
		});
        
        
        
    }
}