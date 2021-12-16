package ma.education.tp2.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;

import ma.education.tp1.introduction.Salle;
import java.lang.reflect.Constructor;




public class TestReflection {
	public static void main (String[] args) throws ClassNotFoundException {
		
	          
	         
	         Class c =Class.forName(" ma.education.tp1.introduction.Salle");
	          Field[] attributes = c.getDeclaredFields();
	       for(Field f : attributes){
	    	   System.out.println(f.getName());
	       }
	       Method[] methodes =c.getDeclaredMethods();
	       for(Method m : methodes){
	    	   System.out.println(m.getName());
	    	   
	       }
//	       ResourceBundle rb = ResourceBundle.getBundle("ma.education.tp2.reflection.param");
//	       String value = rb.getString("key1");
//	       Class c = Class.forName(value);
//	       Constructor[] consts = c.getDeclaredConstructors();
//	       consts[0].setAccessible(true);
//	       Object o1 =consts[0].newInstance(null);	
//	       consts[1].setAccessible(true);
//	       Object o2 =consts[1].newInstance("Salle informatique");	
//	       consts[2].setAccessible(true);
//	       Object o3 =consts[2].newInstance(2,"Salle");	
	        
	       
	       
	}
}
