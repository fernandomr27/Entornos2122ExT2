import java.util.Scanner;

public class Problema3 {
    public String numbers(){
        Scanner sc = new Scanner(System.in);
        String text = "";
        String multi3 = "Fizz";
        String multi5 = "Buzz";
        String multi7 = "Foo";
        String multi11 = "Boo";
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
            else if (i % 7 == 0){
                text = multi7;
            }
            else if (i % 11 == 0){
                text = multi11;
            }
            else if (i % 7 == 0 && i % 11 == 0){
                text = multi7 + multi11;
            }
            
             var = text += i;

        }
        return var;
    }
}
