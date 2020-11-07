public class MyClass {
    public static void main(String[] args) {
      Person myObj = new Person();
      //myObj.name = "John";  // error
      myObj.setName("Dami"); 
      System.out.println(myObj.getName()); // error 
    }
  } 