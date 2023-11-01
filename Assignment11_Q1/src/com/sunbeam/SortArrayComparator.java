package com.sunbeam;

import java.util.Comparator;

public class SortArrayComparator implements Comparator<Double> {

	@Override
	public int compare(Double ele1, Double ele2) {
		int diff = Double.compare(ele1, ele2);
		return diff;
	}

}
