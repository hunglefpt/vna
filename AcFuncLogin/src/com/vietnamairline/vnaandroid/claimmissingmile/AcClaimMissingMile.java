package com.vietnamairline.vnaandroid.claimmissingmile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import com.vietnamairline.vnaandroid.R;
import com.vietnamairline.vnaandroid.core.GlobalParams;

public class AcClaimMissingMile extends Activity implements OnClickListener {
	RelativeLayout layout_claim_vna, layout_claim_partners,
			layout_claim_nonpartners;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ac_claim_missing_mile);
		layout_claim_vna = (RelativeLayout) findViewById(R.id.layout_claim_vna);
		layout_claim_vna.setOnClickListener(this);
		layout_claim_partners = (RelativeLayout) findViewById(R.id.layout_claim_partners);
		layout_claim_partners.setOnClickListener(this);
		layout_claim_nonpartners = (RelativeLayout) findViewById(R.id.layout_claim_nonpartners);
		layout_claim_nonpartners.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent;
		switch (v.getId()) {
		case R.id.layout_claim_vna:
			intent = new Intent(AcClaimMissingMile.this,
					AcClaimMissingMileVNA.class);
			startActivity(intent);
			break;
		case R.id.layout_claim_partners:
			intent = new Intent(AcClaimMissingMile.this,
					AcClaimMissingMilePartner.class);
			intent.putExtra(GlobalParams.CMM_AIRLINES_PARTNERS, "true");
			startActivity(intent);
			break;
		case R.id.layout_claim_nonpartners:
			intent = new Intent(AcClaimMissingMile.this,
					AcClaimMissingMilePartner.class);
			intent.putExtra(GlobalParams.CMM_NON_AIRLINES_PARTNERS, "true");
			startActivity(intent);
			break;
		default:
			break;
		}
	}
}
