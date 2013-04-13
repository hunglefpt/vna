package com.vietnamairline.vnaandroid.myaccount;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AcFuncMyAccountAdapter extends FragmentPagerAdapter{
	
	private static final String[] CONTENT = new String[] { "My Profile", "My Contact", "Preferances",
		"My Account", "Change Password" };
	
	public AcFuncMyAccountAdapter(FragmentManager fm) {
		super(fm);		
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = new Fragment();
    	switch (position) {
    	case 0:
    		fragment = new AcFuncMyProfile();
			break;
    	case 1:
			fragment = new AcMyContact();
			break;

		default:
			
			break;
		}
        return fragment;
	}

	@Override
    public CharSequence getPageTitle(int position) {
        return CONTENT[position % CONTENT.length].toUpperCase();
    }
	
	@Override
	public int getCount() {
		
		return CONTENT.length;
	}

}
