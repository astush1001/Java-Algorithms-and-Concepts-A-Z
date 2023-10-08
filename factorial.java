class Factorial {

    public long getFactorial(int N) {
        long result = 1;
        for(long i = 2; i <= N ; i++){
            result = result * i;
        }
        
        return result;
    }
}
