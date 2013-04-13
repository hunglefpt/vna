package com.vietnamairline.vnaandroid.claimmissingmile;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

import com.vietnamairline.vnaandroid.R;
import com.vietnamairline.vnaandroid.core.GlobalParams;

public class AcClaimMissingMilePartner extends Activity {

	LinearLayout lnCMMPartner, lnCMMNonPartner;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ac_claim_missing_mile_partner);
		lnCMMPartner = (LinearLayout) findViewById(R.id.lnCMMPartner);
		lnCMMNonPartner = (LinearLayout) findViewById(R.id.lnCMMNonPartner);
		if (getIntent().getStringExtra(GlobalParams.CMM_AIRLINES_PARTNERS) != null) {
			lnCMMNonPartner.setVisibility(View.GONE);
			lnCMMPartner.setVisibility(View.VISIBLE);
		}
		if (getIntent().getStringExtra(GlobalParams.CMM_NON_AIRLINES_PARTNERS) != null) {
			lnCMMNonPartner.setVisibility(View.VISIBLE);
			lnCMMPartner.setVisibility(View.GONE);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ac_claim_missing_mile_partner, menu);
		return true;
	}

}
