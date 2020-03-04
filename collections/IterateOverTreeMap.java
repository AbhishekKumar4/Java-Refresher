package com.abhishek;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class IterateOverTreeMap {

	public static void main(String args[]) {

		Map<String, String> sampleMap = new TreeMap<String, String>();
		sampleMap.put("key1", "value1");
		sampleMap.put("key2", "value2");
		sampleMap.put("key3", "value3");
		sampleMap.put("key4", "value4");

		Iterator<Entry<String, String>> iterator = sampleMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			System.out.println("Key is : " + entry.getKey() + " and value is : " + entry.getValue());
		}

	}

}
