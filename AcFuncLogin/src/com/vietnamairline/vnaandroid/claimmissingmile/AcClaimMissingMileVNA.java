package com.vietnamairline.vnaandroid.claimmissingmile;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.vietnamairline.vnaandroid.R;

public class AcClaimMissingMileVNA extends FragmentActivity implements
		OnClickListener {
	TextView tvMembershipNo, tvMemberName;
	Spinner spCarrier, spBookingClass, spFromCountry, spToCountry;
	Button btDateFlightPicker;
	EditText edtFlightNumber, edtTicketNumber;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ac_claim_missing_mile_vna);
		initlayout();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ac_claim_missing_mile_vn, menu);
		return true;
	}

	private void initlayout() {
		tvMembershipNo = (TextView) findViewById(R.id.tvMembershipNo);
		tvMemberName = (TextView) findViewById(R.id.tvMemberName);
		spCarrier = (Spinner) findViewById(R.id.spCarrier);
		spBookingClass = (Spinner) findViewById(R.id.spBookingClass);
		spToCountry = (Spinner) findViewById(R.id.spToCountry);
		btDateFlightPicker = (Button) findViewById(R.id.btDateFlightPicker);
		btDateFlightPicker.setOnClickListener(this);
		edtFlightNumber = (EditText) findViewById(R.id.edtFlightNumber);
		edtTicketNumber = (EditText) findViewById(R.id.edtTicketNumber);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btDateFlightPicker:
			DialogFragment newFragment = new DatePickerFragment();
			newFragment.show(getSupportFragmentManager(), "timePicker");
			break;

		default:
			break;
		}
	}
}
