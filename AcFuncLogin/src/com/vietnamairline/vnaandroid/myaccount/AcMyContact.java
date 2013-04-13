/*
 * Name: $RCSfile: AcMyContact.java,v $
 * Version: $Revision: 1.00 $
 * Date: $Date: 2013/04/10 18:17:50 $
 *
 * Copyright (C) 2013 FPT Software. All rights reserved.
 */
package com.vietnamairline.vnaandroid.myaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vietnamairline.vnaandroid.R;

public class AcMyContact extends Fragment
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.ac_my_contact, container, false);
		
		return view;
	}	
}
