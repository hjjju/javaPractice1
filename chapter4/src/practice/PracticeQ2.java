package practice;

public class PracticeQ2 {
    public static void main(String[] args) {


        for(int i =2 ; i <10;i++){
            for(int j = 1; j <10; j++){
                if(i %2 != 0){
                    continue;
                }
                System.out.println( i + " X " + j  + " = " + i*j);
            }
            System.out.println();
        }



    }




}
