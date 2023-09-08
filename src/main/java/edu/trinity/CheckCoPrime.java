package edu.trinity;

public class CheckCoPrime {
    private int GDC (int num1, int num2){
        int gdc = 1;
        for (int i = 1; i <= num1 && i <= num2; i++){
            if (num1%i == 0 && num2%i == 0){
                gdc = i;
            }
        }
        return gdc;
    }

    public boolean coPrime(int num1, int num2){
        return GDC(num1, num2) == 1;
    }
}
