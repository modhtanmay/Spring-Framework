package com.tanmay.spring;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	private Map<String, String> mObj = new HashMap<String,String>();

	public Map<String, String> getmObj() {
		return mObj;
	}

	public void setmObj(Map<String, String> mObj) {
		this.mObj = mObj;
	}

	public int getTotalCurrencyValue(String value) {
		value = value.toUpperCase();
		int currVal = 0;
		for(String keystr : mObj.keySet()) {
			if(value.contains(keystr)) {
				currVal = Integer.parseInt(value.substring(0, value.indexOf(keystr)))*Integer.parseInt(mObj.get(keystr));
			}
		}
		return currVal;
	}
}
