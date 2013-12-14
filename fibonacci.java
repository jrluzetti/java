public class fibonacci {

    public static void main(String[] args) {
       double p1=0;
       double p2=1;
       double r=0;

       for (int i=1;i<1500;i++){       
           r=p1+p2;
           p1=p2;
           p2=r;
           System.out.println(+i+" - "+r);
       }
    }
