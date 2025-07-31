package com.tnsif.inheritance;

public class MultiLevelInheritanceDemo {
     public static void main(String args[]) {
    	 City city=new City();
    	 city.setCityName("nashik");
    	 city.setArea(264.2f);
    	 city.setStateName("Maharashtra");
    	 city.setLanguage("marathi");
    	 city.setCountryName("India");
    	 city.setCapital("Delhi");
    	 System.out.println(city);
     }
}
