/**
 * 
 */
package com.leetcode;

/**
 * @author Syed Irfan
 *
 */
public class HighestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"flow","fl", "flowrish"}));
		System.out.println("fl".indexOf("flow"));
	}
	
	 public static String longestCommonPrefix(String[] strs) {
	     if(strs.length == 0) {
	    	 return "";
	     }
	     if(strs.length == 1) {
	    	 return strs[0];
	     }
	     
	     String prefix = strs[0];
	     for (int i = 1; i < strs.length; i++) {

	         while (strs[i].indexOf(prefix) != 0) {
	             prefix = prefix.substring(0, prefix.length() - 1);
	             if (prefix.isEmpty()) return "";
	         }
	     }
	     return prefix;
	  }

}
