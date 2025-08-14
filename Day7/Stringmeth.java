class Stringmeth
{
   public static void main(String atb[])
   {
     String str = "Hello World";
     System.out.println(str.length());       
     System.out.println(str.charAt(0));


     String a = "Java";
     String b = "java";

     System.out.println(a.equals(b));         
     System.out.println(a.equalsIgnoreCase(b)); 
     System.out.println(a.compareTo(b));     

     System.out.println(str.indexOf("o"));   
     System.out.println(str.lastIndexOf("o")); 
     System.out.println(str.contains("World")); 

     System.out.println(str.substring(0, 5)); 
     System.out.println(str.substring(6));   


     String str2 = "Java";

     System.out.println(str.toUpperCase());  
     System.out.println(str.toLowerCase());  

     String str3 = "  Hello Java  ";

     System.out.println(str.trim());  
     System.out.println(str.replace("Java", "World")); 


     String str4 = "apple,banana,grape";

     String[] fruits = str.split(",");
     for (String fruit : fruits) {
       System.out.println(fruit);
      }

     String joined = String.join(" | ", fruits);
     System.out.println(joined); 
 

     String name = "Jaishankar";
     int age = 25;

     String formatted = String.format("Name: %s, Age: %d", name, age);
     System.out.println(formatted); // Name: Jaishankar, Age: 25


     int num = 100;
     String str7 = String.valueOf(num);      
     System.out.println(str + " is a string");


     String str5 = "";
     String str6 = "   ";

     System.out.println(str5.isEmpty());  
     System.out.println(str6.isBlank());    
     }
}       
