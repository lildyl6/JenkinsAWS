package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(13));
    }

    public static int fibonacci(int x){
        if(x <= 1){
            return 0;
        } else if(x <= 3){
            return 1;
        } else{
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
}