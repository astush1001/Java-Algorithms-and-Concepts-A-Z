public class ArmstrongNo{
    public static void main(String[] args){
        int n=153; //1,2,153,1634
        int temp=n;
        int r=0;
        int sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+(r*r*r);
        }
        if(temp==sum){
            System.out.println("Armstrong"); 
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}