import java.util.Scanner;
public class RunBloodData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the blood type of patient: ");
        String input1 = sc.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = sc.nextLine();
        
        if(input1.isEmpty()&&input2.isEmpty()){
            BloodData bd1 = new BloodData();
            bd1.display();           
        }
        
        else if((input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB"))
                &&(input2.equals("+")||input2.equals("-"))){
                BloodData bd2 = new BloodData();
                bd2.setBloodType(input1);
                bd2.setRhFactor(input2);
                bd2.display();
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}