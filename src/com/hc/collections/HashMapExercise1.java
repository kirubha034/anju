package com.hc.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise1 {
	public static void main(String[] args) {    
	    //Creating map of Department    
	    Map<Integer,Department> map=new HashMap<Integer,Department>();    
	    
	    //Creating Books    
	    Department dept1=new Department(91052,"Anju");    
	    Department dept2=new Department(91053,"Ajita");   
	    Department dept3=new Department(97769,"Divya");   
	    
	    //Adding Departments to map   
	    map.put(1,dept1);  
	    map.put(2,dept2);  
	    map.put(3,dept3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, Department> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Department b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.empId+" "+b.name);   
	    }    
	}    

}
