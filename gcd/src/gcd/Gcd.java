/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author User
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Euklidischer Algorithmus: " + gcdEuclidean(24,16));
        System.out.println("Primfaktorzerlegung: " + gcdPrimeFactors(24,16));
    }
    
    public static int gcdEuclidean(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcdEuclidean(b,a%b);
    }
    
    public static int gcdPrimeFactors(int a, int b){
        int n = 2;
        int p = 1;
        while(a!=1||b!=1){
            if(a%n==0&&b%n==0){
                p *= n;
                a /= n;
                b /= n;
            }
            else if(a%n==0){
                a /= n;
            }
            else if(b%n==0){
                b /= n;
            }
            else{
                n++;
            }
        }
        return p;
    }
}
