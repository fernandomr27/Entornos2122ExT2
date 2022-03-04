import java.util.Scanner;

public class Problema2 {
    public String numbers(){
        Scanner sc = new Scanner(System.in);
        String text = "";
        String multi3 = "Fizz";
        String multi5 = "Buzz";
        String var = "";
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i =0;i<num1 && i>num2;i++){
            if (i % 3 == 0){
                text =  multi3;
            }
            else if (i % 5 == 0 ){
                text = multi5;
            }
            else if (i % 3 == 0 && i % 5 == 0){
                text = multi3 + multi5;
            }
             var = text += i;

        }
        return var;
    }
}
