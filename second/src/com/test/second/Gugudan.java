package com.test.second;

public class Gugudan {
	public static void main(String[] args) {
		gugudan(2, 5);
	}
	public static void gugudan(int n1, int n2){
		for(int i = n1 ; i <= n2 ; i++) {
			for(int z = 1 ; z <= 9 ; z++) {
				if( (i*z)%2 == 0) {
					System.out.printf("%d * %d = %d\n",i,z,i*z);
				}
			}
			System.out.println();
		}
	}
}
