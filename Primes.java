public class Primes {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        printPrime(n);
    }
public static boolean[] arrPrime(int n){
    boolean[]arr1=new boolean[n];
    arr1[0]=true;
    arr1[1]=true;
    for(int i=2;i<arr1.length;i++){
        for(int j=0;j<arr1.length;j++){
            if(j%i==0&&j!=i)
            arr1[j]=true;
        }

    }return arr1;
}public static void printPrime(int n){
    int c=0;
    boolean[]arr=arrPrime(n);
    for(int i=0;i<arr.length;i++){
        if(!arr[i])
        {System.out.println(i);
            c++;}
    }System.out.println(c+"%");
}
}