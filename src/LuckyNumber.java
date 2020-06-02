import java.util.Scanner;

public class LuckyNumber {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner kb=new Scanner(System.in);
            System.out.println("enter a number between 1 to 10:");
            int num=kb.nextInt();
            System.out.println(Tryno(num));
        }
        public static String Tryno(int num)
        {

            if(num==9)
                return "congratulations you win!";
            else if(num>10 || num<1)
                return "invalid number";
            else
                return "sorry you lose";

        }

    }
