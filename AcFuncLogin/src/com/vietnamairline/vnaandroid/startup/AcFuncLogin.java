/*
 * Name: $RCSfile: AcFuncLogin.java,v $
 * Version: $Revision: 1.00 $
 * Date: $Date: 2013/04/10 18:17:50 $
 *
 * Copyright (C) 2013 FPT Software. All rights reserved.
 */
package com.vietnamairline.vnaandroid.startup;

import com.vietnamairline.vnaandroid.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AcFuncLogin extends Activity implements OnClickListener
{
	private Button btLogin;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ac_func_login);
		instLayout();
	}
	
	/**
	 * instance layout
	 */
	private void instLayout()
	{
		btLogin = (Button) findViewById(R.id.btLogin);
		btLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		switch (v.getId()) {
		case R.id.btLogin:
			Intent intent = new Intent(this, AcFuncHome.class);
			startActivity(intent);
			break;

		default:
			break;
		}
	}

}
