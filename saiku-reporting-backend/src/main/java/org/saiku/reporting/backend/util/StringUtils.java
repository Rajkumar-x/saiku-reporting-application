/*******************************************************************************
 * Copyright 2013 Marius Giepz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.saiku.reporting.backend.util;
import java.util.Random;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.JSONTokener;
//import org.saiku.adhoc.model.master.SaikuColumn;
//
	public class StringUtils {
	//	
		public static String randomString20() {
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		return sb.toString();
	}
//
//	public static String getUniqueColumnName(String name, List<SaikuColumn> columns) {
//
//		List<String> colNames = new ArrayList<String>();
//
//		for (SaikuColumn col : columns) {
//			colNames.add(col.getName());
//		}
//
//		return getUniqueName(name, colNames);
//
//	}
//
//	/**
//	 * @param name
//	 * @param colNames
//	 * @return
//	 */
//	public static String getUniqueName(String name, List<String> colNames) {
//		int i = 0;
//		
//		String uniqueColumnName = name;
//
//		while (colNames.contains(uniqueColumnName)||uniqueColumnName.equals("")) {
//			i++;
//			uniqueColumnName = name + " " + i;
//		}
//
//		return uniqueColumnName;
//	}
//	
//	public static String prettyfyJson(String json) throws JSONException{
//		JSONTokener tokener = new JSONTokener(json);
//		JSONObject finalResult = new JSONObject(tokener);
//		return finalResult.toString(4); 
//	}
//
}
