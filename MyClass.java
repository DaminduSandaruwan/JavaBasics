public class MyClass{
    
    public static void main(String[] args) {
        String fname = "Damindu";
        String lname = "Sandaruwan";
        System.out.println(fname.concat(lname));
        System.out.println(Math.max(25,30));
        System.out.println(Math.random());
        
        
        int day = 4;

        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        String [] names={"Damindu","Sandaruwan","Bandara"};
        System.out.println(names[1]);
        System.out.println(names.length);
    }
}