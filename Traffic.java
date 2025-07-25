import java.util.Scanner;

public class Traffic {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        String a;
        System.out.println("Enter(Red,Yellow,green):-");
        a=inp.nextLine();
        switch(a)
        {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Go slow");
                break;
            case "Green":
                System.out.println("Go");
            default:
                System.out.println("Invalid colour");

        }
    }
}
