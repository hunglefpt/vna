/*
 * Name: $RCSfile: AcFuncHome.java,v $
 * Version: $Revision: 1.00 $
 * Date: $Date: 2013/04/10 18:17:50 $
 *
 * Copyright (C) 2013 FPT Software. All rights reserved.
 */
package com.vietnamairline.vnaandroid.startup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.vietnamairline.vnaandroid.R;
import com.vietnamairline.vnaandroid.claimmissingmile.AcClaimMissingMile;
import com.vietnamairline.vnaandroid.myaccount.AcFuncMyAccount;

public class AcFuncHome extends Activity implements OnClickListener
{

	private TextView txvNewPromotion;
	private TextView txvMyAccount;
	private TextView txvClaimMissingMiles;
	private TextView txvRegisterPromotion;
	private TextView txvMileEstimation;
	private TextView txvRedeemMiles;
	private TextView txvBuyOrTransMile;
	private TextView txvSendRequest;
	private TextView txvMore;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ac_func_home);
		instLayout();
	}

	/**
	 * instance layout
	 */
	private void instLayout()
	{
		txvNewPromotion = (TextView) findViewById(R.id.txvNewPromotion);
		txvNewPromotion.setOnClickListener(this);
		txvMyAccount = (TextView) findViewById(R.id.txvMyAccount);
		txvMyAccount.setOnClickListener(this);
		txvClaimMissingMiles = (TextView) findViewById(R.id.txvClaimMissingMiles);
		txvClaimMissingMiles.setOnClickListener(this);
		txvRegisterPromotion = (TextView) findViewById(R.id.txvRegisterPromotion);
		txvRegisterPromotion.setOnClickListener(this);
		txvMileEstimation = (TextView) findViewById(R.id.txvMileEstimation);
		txvMileEstimation.setOnClickListener(this);
		txvRedeemMiles = (TextView) findViewById(R.id.txvRedeemMiles);
		txvRedeemMiles.setOnClickListener(this);
		txvBuyOrTransMile = (TextView) findViewById(R.id.txvBuyOrTransMile);
		txvBuyOrTransMile.setOnClickListener(this);
		txvSendRequest = (TextView) findViewById(R.id.txvSendRequest);
		txvSendRequest.setOnClickListener(this);
		txvMore = (TextView) findViewById(R.id.txvMore);
		txvMore.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		Intent intent;
		switch (v.getId())
		{
			case R.id.txvNewPromotion:
				break;
				
			case R.id.txvMyAccount:
				intent = new Intent(this, AcFuncMyAccount.class);
				startActivity(intent);
				break;
				
			case R.id.txvClaimMissingMiles:
				intent = new Intent(AcFuncHome.this, AcClaimMissingMile.class);
				startActivity(intent);
				break;
				
			case R.id.txvRegisterPromotion:
				break;
				
			case R.id.txvMileEstimation:
				break;
				
			case R.id.txvRedeemMiles:
				break;
				
			case R.id.txvBuyOrTransMile:
				break;
				
			case R.id.txvMore:
				break;
				
			default:
				break;
		}
	}
}
