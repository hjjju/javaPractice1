package practice;

public class PracticeQ3 {
    public static void main(String[] args) {
        for(int dan= 2; dan <10; dan++){
            for(int num = 1; num < 10; num++){
                if(dan < num){
                    break;
                }
                System.out.println(dan + " X " + num +" = " + dan*num);
            }
            System.out.println();
        }
    }
}
