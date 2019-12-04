public class factorials {

    public static long calcFactorial(int a){

        long total=1;

        for (long i=a; i>0; i-- ){
            total*=i;

        }
        return total;
    }

    public static double calcE(){
        double e=1;
        double oldE=0;
        int n=1;


        while(e-oldE>0){
            oldE=e;
            e=oldE+(1.0/calcFactorial(n));
            n++;



        }
        return e;

    }

    public static double calcEX(int x){
        double e=1;
        double oldE=0;
        int n=1;


        while(e-oldE>0){
            oldE=e;
            e=oldE+(Math.pow(x,n)/calcFactorial(n));
            n++;

        }
        return e;


    }




    public static void main(String [] args){

        for (int i=1; i<=20; i++){
            System.out.println(calcFactorial(i));
        }
        System.out.println();
        System.out.printf("e is %2.3f \n", calcE());
        System.out.println();                

        for (int i=1; i<=5; i++){
            System.out.printf("eX is %2.3f \n", calcEX(i));

        }



    }
}
