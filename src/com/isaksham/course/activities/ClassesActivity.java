package com.isaksham.course.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.isankalan.R;

public class ClassesActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.classes_activity);
		ListView classesList = (ListView) findViewById(R.id.classes_list);
		String[] values = new String[] { "Class 1", "Class 2", "Class 3",
				"Class 4", "Class 5", "Class 6", "Class 7", "Class 8" };
		ArrayAdapter<String> adapter = new ClassesAdapter(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, values);
		classesList.setAdapter(adapter);
	}

}
