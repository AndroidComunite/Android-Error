
package com.gustavo.androiderror;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3 extends Activity{

	public static TextView t;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main3x);
		
		t = (TextView) findViewById(R.id.textView1);
	}
      
}
