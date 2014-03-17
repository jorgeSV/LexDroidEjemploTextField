package com.sovejo.lexdroidejemplotextfield;

import com.sovejo.lexdroidejemplotextfield.R;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.app.Activity;

public class MainActivity extends Activity 
{
	AutoCompleteTextView autoComplete01, autoComplete02;
	String[] strItems = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		autoComplete01 = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTV01);
		ArrayAdapter<String> adapter01 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, strItems);
		autoComplete01.setAdapter(adapter01);
		
		String[] strNombres = getResources().getStringArray(R.array.nombres);
		
		autoComplete02 = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTV02);
		ArrayAdapter<String> adapter02 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, strNombres);
		autoComplete02.setAdapter(adapter02);
	}

}
