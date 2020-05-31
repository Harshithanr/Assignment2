package com.ito.assignment.multi_threading;

public class OddEvenNumbers {
	 
	boolean odd;
	int count = 1;
	int MAX = 100;
 
	public void printOdd() {
		
		
		synchronized (this) {
			while (count < MAX) {
				
 
				while (!odd) {
					try {
						
						wait();
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread  :" + count);
				count++;
				odd = false;
				notify();
			}
		}
	}
 
	public void printEven() {
 
		
		synchronized (this) {
			while (count < MAX) {
				
 
				while (odd) {
					try {
						
						wait();
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even Thread :" + count);
				count++;
				odd = true;
				notify();
 
			}
		}
	}
 
	public static void main(String[] args) {
 
		OddEvenNumbers oep = new OddEvenNumbers();
		oep.odd = true;
		Thread t1 = new Thread(new Runnable() {
 
			
			public void run() {
				oep.printEven();
 
			}
		});
		Thread t2 = new Thread(new Runnable() {
 
		public void run() {
			oep.printOdd();
 
			}
		});
 
		t1.start();
		t2.start();
 
 
	}
}