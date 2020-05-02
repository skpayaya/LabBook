package com.cg.iter.staticdb;

import java.util.HashMap;

import com.cg.iter.entity.Product;
import com.cg.iter.entity.Productv1;

public class ProductDBv1 {
static HashMap<Integer, Productv1> productIdMap = getProductIdMap();
	
	static {
		if (productIdMap == null) {
			productIdMap = new HashMap<Integer, Productv1>();
			Productv1 indiaproduct = new Productv1(1, "Pen", 10000,"Write");
			Productv1 chinaproduct = new Productv1(4, "Pencil", 20000,"Write");

			productIdMap.put(1, indiaproduct);
			productIdMap.put(4, chinaproduct);

		}
}
		public static HashMap<Integer,Productv1> getProductIdMap(){
			return productIdMap;
		}
}
