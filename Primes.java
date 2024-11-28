public class Primes {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        printPrime(n);
    }
public static boolean[] arrPrime(int n){
    boolean[]arr1=new boolean[n+1];
    arr1[0]=true;
    arr1[1]=true;
    for(int i=2;i<arr1.length;i++){
        for(int j=0;j<arr1.length;j++){
            if(j%i==0&&j!=i)
            arr1[j]=true;
        }

    }return arr1;
}public static void printPrime(int n){
    double c=0.0;
    boolean[]arr=arrPrime(n);
    System.out.println("Prime numbers up to "+n+":");
    for(int i=0;i<arr.length;i++){
        if(!arr[i])
        {System.out.println(i);
            c++;}
            
    }int x=(int) ((c/n)*100);
    System.out.println("There are "+(int)c+" primes between 2 and "+n+" ("+x+"% are primes)");
}
}