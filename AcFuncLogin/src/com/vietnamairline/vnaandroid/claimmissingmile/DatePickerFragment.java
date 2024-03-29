package com.vietnamairline.vnaandroid.claimmissingmile;

import java.util.Calendar;

import com.vietnamairline.vnaandroid.R;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

public class DatePickerFragment extends android.support.v4.app.DialogFragment
		implements DatePickerDialog.OnDateSetListener {
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		// Use the current date as the default date in the picker
		final Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);

		// Create a new instance of DatePickerDialog and return it
		return new DatePickerDialog(getActivity(), this, year, month, day);
	}

	public void onDateSet(DatePicker view, int year, int month, int day) {
		Button btDateFlightPicker = (Button) getActivity().findViewById(
				R.id.btDateFlightPicker);
		btDateFlightPicker.setText("" + day + '/' + (month+1) + '/' + year);
	}

}
