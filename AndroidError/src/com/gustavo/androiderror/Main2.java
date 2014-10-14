package com.gustavo.androiderror;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2 extends Activity{

	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2x);
		
		b = (Button) findViewById(R.id.button1);
		//Cria uma atividade para o botão
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Main3.t.setText("O valor do float é: " + MainActivity.f);
				Intent intent = new Intent();
				intent.setClass(Main2.this, Main3.class);
				startActivity(intent);
				
			}
		});
		
	}
	
	

}
