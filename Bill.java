import java.util.Scanner;


public class Bill{
    public void billsplit(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the bill Amount: ");
        double amount=sc.nextDouble();
        System.out.print("Enter the tip amount: ");
        double tip =sc.nextDouble();
        System.out.print("Enter the number of people: ");
        int person=sc.nextInt();

        if(amount > 0 && tip >= 0 ){
            double splited_amount= (amount+tip)/person;
            System.out.print("Each person have to pay: "+splited_amount);

        }
    }
    public static void main(String[] args){
        Bill b1=new Bill();
        b1.billsplit();
    }
}