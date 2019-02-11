package com.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	RadioButton radioButton;
	RadioGroup radioGroup1, radioGroup2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Finding both radio group IDs
		radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
		radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);

		// Implementing click listener on button
		findViewById(R.id.click_here).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Finding checked button ID from radio group
				int selectid = radioGroup1.getCheckedRadioButtonId();

				// Finding radio button ID from selectid
				radioButton = (RadioButton) findViewById(selectid);

				// Showing a toast by displaying checked radio button text
				Toast.makeText(MainActivity.this, radioButton.getText(),
						Toast.LENGTH_SHORT).show();

			}
		});

		// Implementing checked change listener on radio group2
		radioGroup2.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {

				// Finding ID/Position of radio group child
				int pos = radioGroup2.indexOfChild(findViewById(checkedId));

				// Now finding radio button
				radioButton = (RadioButton) findViewById(checkedId);

				// Applying switch case for all radio buttons and displaying
				// there position and text via Toast
				switch (pos) {
				case 0:
					Toast.makeText(
							getBaseContext(),
							"You have Clicked RadioButton " + pos
									+ " and Title : " + radioButton.getText(),
							Toast.LENGTH_SHORT).show();
					break;
				case 1:
					Toast.makeText(
							getBaseContext(),
							"You have Clicked RadioButton " + pos
									+ " and Title : " + radioButton.getText(),
							Toast.LENGTH_SHORT).show();
					break;
				case 2:
					Toast.makeText(
							getBaseContext(),
							"You have Clicked RadioButton " + pos
									+ " and Title : " + radioButton.getText(),
							Toast.LENGTH_SHORT).show();
					break;
				case 3:
					Toast.makeText(
							getBaseContext(),
							"You have Clicked RadioButton " + pos
									+ " and Title : " + radioButton.getText(),
							Toast.LENGTH_SHORT).show();
					break;
				}
			}

		});

	}

}
