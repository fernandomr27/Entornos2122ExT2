public class Problema1 {
    public String numbers(){
        String text = "";
        String multi3 = "Fizz";
        String multi5 = "Buzz";
        String var = "";
        for (int i =0;i<1 && i>20;i++){
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
