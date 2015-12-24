package com.isaksham.course.activities;

import com.example.isankalan.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ClassesAdapter extends ArrayAdapter<String> {

	public ClassesAdapter(Context context, int resource,
			int textViewResourceId, String[] objects) {
		super(context, resource, textViewResourceId, objects);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		String listItem = this.getItem(position);

		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) this.getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.classes_adapter_view,
					parent, false);
		}

		TextView displayText = (TextView) convertView.findViewById(R.id.title);
		displayText.setText(listItem);

		return convertView;

	}
}
