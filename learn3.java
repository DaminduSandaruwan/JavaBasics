public class learn3 {
    int x;
  
    public learn3(int y) { //Constructor
      x = y;
    }
  
    public static void main(String[] args) {
      learn3 myObj = new learn3(52);
      System.out.println(myObj.x);
    }
  }