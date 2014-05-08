package com.ly2314.activitytest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment1 extends Fragment {
	public MyFragment1()
	{
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.fragment1, container, false);
		return super.onCreateView(inflater, container, savedInstanceState);
	}
}
