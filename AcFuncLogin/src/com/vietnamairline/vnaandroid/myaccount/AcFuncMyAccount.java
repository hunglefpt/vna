/*
 * Name: $RCSfile: AcFuncMyAccount.java,v $
 * Version: $Revision: 1.00 $
 * Date: $Date: 2013/04/10 18:17:50 $
 *
 * Copyright (C) 2013 FPT Software. All rights reserved.
 */
package com.vietnamairline.vnaandroid.myaccount;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.vietnamairline.vnaandroid.R;
import com.vietnamairline.vnaandroid.libraries.TitlePageIndicator;

public class AcFuncMyAccount extends FragmentActivity{

	FragmentPagerAdapter adapter;
	ViewPager pager;
	TitlePageIndicator indicator;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ac_func_my_account);
		adapter = new AcFuncMyAccountAdapter(getSupportFragmentManager());
		pager = (ViewPager)findViewById(R.id.pager);
		pager.setAdapter(adapter);
		indicator = (TitlePageIndicator)findViewById(R.id.indicator);
		indicator.setViewPager(pager);
	}
}
