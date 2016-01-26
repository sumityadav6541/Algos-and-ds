import java.util.*;

public class SherlockandBeast {

    static void findDescent(int num){
        if(num<=0){
            System.out.println("-1");
        }
        int[] cont=new int[num];
        int countThree=0;
        int countFive=num;
            
        for(int i=0;i<num;i++){
            cont[i]=5;
        }
        
        for(int i=num;i>0;i--){            
            if(countThree%5==0 && countFive%3==0){
                for(int x:cont)
                    System.out.print(x);
                System.out.println();
                return;
            }
            cont[i-1]=3;
            countThree++;
            countFive--;
        }
        
        if(countThree%5==0 && countFive%3==0){
                for(int x:cont)
                    System.out.print(x);
                System.out.println();
                return;
        }
        
        System.out.println("-1");
          
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            findDescent(n);
        }
    }
}
