package com.revature.eval.java.core;

import java.util.List;

class BinarySearch<T> {
	private List<T> sortedList;

	public int indexOf(T t) {		
		 
		
		
		 if(this.sortedList.contains(t)) {
		  return  this.sortedList.indexOf(t);	 	  
		 }else return -1;
		 
		 
	}
	public BinarySearch(List<T> sortedList) {
		super();
		this.sortedList = sortedList;
	}

	public List<T> getSortedList() {
		return sortedList;
	}

	public void setSortedList(List<T> sortedList) {
		this.sortedList = sortedList;
	}
	
	public static void Main(String[] args){
		
	}
     
}