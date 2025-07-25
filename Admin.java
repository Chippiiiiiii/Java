import java.util.Scanner;
public class Admin {
    public static void main(String[] args)
    {
        int failcount=0;
        String pass="Sissy";
        while(true)
        {Scanner input=new Scanner(System.in);

            System.out.println("Enter username:-");
            String a=input.nextLine();
            System.out.println("Enter your Password:-");
            String b=input.nextLine();
            boolean password=pass.equals("sissy");
            if(!a.equals("admin")&& !password) {

                failcount++;
                System.out.println("Login failed:-" + failcount);
            }
            else{
                System.out.println("Login successful");
            }
            System.out.println("No of times Failoed attempts:-"+failcount);
            System.out.println("Tharun p\n2024503579");

        }}}