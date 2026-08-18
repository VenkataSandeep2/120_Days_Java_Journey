package com.practise;

public class String5 
{
	
	    public static void main(String[] args)
	    {
	        // Different String Initializations
	        String s1 = "Hello";
	        String s2 = "hello";
	        String s3 = "Hello World";
	        String s4 = "   Java Programming   ";
	        String s5 = "Hi Dear    ";
	        String s6 = "HELLO";

	        System.out.println("===== ORIGINAL STRINGS =====");
	        System.out.println("s1 = " + s1);
	        System.out.println("s2 = " + s2);
	        System.out.println("s3 = " + s3);
	        System.out.println("s4 = " + s4);
	        System.out.println("s5 = " + s5);
	        System.out.println("s6 = " + s6);

	        // 1. length()
	        System.out.println("\n===== length() =====");
	        System.out.println("Length of String s1 ->"+s1.length());
	        System.out.println("Length of String s2 "+s2.length());
	        System.out.println("Length of String s3 "+s3.length());
	        System.out.println("Length of String s4 "+s4.length());
	        System.out.println("Length of String s5 "+s5.length());
	        System.out.println("Length of String s6 "+s6.length());
	        
	        // 2. charAt()
	        System.out.println("\n===== charAt() =====");
	        System.out.println("Chracters of s1 ->"+s1.charAt(0));
	        System.out.println("Chracters of s1 "+s1.charAt(1));
	        System.out.println("Chracters of s1 "+s1.charAt(2));
	        System.out.println("Chracters of s1 "+s1.charAt(3));
	        System.out.println("Chracters of s1 "+s1.charAt(4));
	        System.out.println();
	        System.out.println(s2.charAt(4));
	        System.out.println(s2.charAt(0));
	        System.out.println(s3.charAt(4));
	        System.out.println(s3.charAt(0));
	        System.out.println(s4.charAt(4));
	        // 3. equals()
	        System.out.println("\n===== equals() =====");
	        System.out.println(s1.equals(s2));
	        System.out.println(s1.equals("Hello"));
	        System.out.println(s1.equals(s6));

	        // 4. equalsIgnoreCase()
	        System.out.println("\n===== equalsIgnoreCase() =====");
	        System.out.println(s1.equalsIgnoreCase(s2));
	        System.out.println(s1.equalsIgnoreCase(s6));

	        // 5. contains()
	        System.out.println("\n===== contains() =====");
	        System.out.println(s3.contains("World"));
	        System.out.println(s3.contains("Java"));

	        // 6. indexOf()
	        System.out.println("\n===== indexOf() =====");
	        System.out.println(s1.indexOf('l'));
	        System.out.println(s3.indexOf("World"));

	        // 7. lastIndexOf()
	        System.out.println("\n===== lastIndexOf() =====");
	        System.out.println(s1.lastIndexOf('l'));

	        // 8. startsWith()
	        System.out.println("\n===== startsWith() =====");
	        System.out.println(s1.startsWith("He"));
	        System.out.println(s1.startsWith("Hi"));

	        // 9. endsWith()
	        System.out.println("\n===== endsWith() =====");
	        System.out.println(s1.endsWith("lo"));
	        System.out.println(s1.endsWith("o"));

	        // 10. trim()
	        System.out.println("\n===== trim() =====");
	        System.out.println("Before Trim: " + s4);
	        System.out.println("After Trim : " + s4.trim());

	        // 11. compareTo()
	        System.out.println("\n===== compareTo() =====");
	        System.out.println(s1.compareTo(s2));
	        System.out.println("Apple".compareTo("Ball"));

	        // 12. compareToIgnoreCase()
	        System.out.println("\n===== compareToIgnoreCase() =====");
	        System.out.println(s1.compareToIgnoreCase(s2));
	        System.out.println(s1.compareToIgnoreCase(s6));

	        // 13. replace()
	        System.out.println("\n===== replace() =====");
	        System.out.println(s1.replace('l', 'x'));
	        System.out.println(s5.replace("Hi", "Hello"));

	        // 14. substring()
	        System.out.println("\n===== substring() =====");
	        System.out.println(s1.substring(1));
	        System.out.println(s1.substring(1, 4));

	        // 15. toUpperCase()
	        System.out.println("\n===== toUpperCase() =====");
	        System.out.println(s1.toUpperCase());

	        // 16. toLowerCase()
	        System.out.println("\n===== toLowerCase() =====");
	        System.out.println(s6.toLowerCase());
	    }
	}