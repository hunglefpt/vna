package com.vietnamairline.vnaandroid.myaccount;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.vietnamairline.vnaandroid.R;

public class AcFuncMyProfile extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {		
		View view = inflater.inflate(R.layout.ac_func_my_profile, container, false);
		Spinner spinner = (Spinner) view.findViewById(R.id.spNameConvention);
		List<String> list = new ArrayList<String>();
		list.add("Family / Given");
		list.add("Given / Family");		
		ArrayAdapter<String> nameAdapter = new ArrayAdapter<String>(this.getActivity(), R.layout.ac_my_spinner,	android.R.id.text1, list);		
		nameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(nameAdapter);
		return view;
	}
}
