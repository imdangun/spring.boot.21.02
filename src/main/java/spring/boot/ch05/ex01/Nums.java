package spring.boot.ch05.ex01;

import java.util.Collections;
import java.util.List;

public class Nums {
	private List<Integer> nums;
	
	public Nums(List<Integer> nums) {
		this.nums = nums;
	}
	/*
	public int getMax() {
		int max = 0;
		for(int i: nums)
			if(i > max) max = i;
		return max;
	}
	*/
	public int getMax() {
		return Collections.max(nums);
	}
}
