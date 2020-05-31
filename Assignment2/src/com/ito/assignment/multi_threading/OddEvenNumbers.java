package com.ito.assignment.multi_threading;

//OddThread to print odd numbers
//Calls printOdd() method of SharedPrinter class until limit is exceeded.
class OddThread extends Thread
{
	int limit;
	sharedPrinter printer;
	public OddThread(int limit, sharedPrinter printer)
	{
		this.limit = limit;
		this.printer = printer;
	}
	@Override
	public void run() 
	{
		int oddNumber = 1;        //First odd number is 1
		while (oddNumber <= limit)
		{
			printer.printOdd(oddNumber);       //Calling printOdd() method of SharedPrinter class
			oddNumber = oddNumber + 2;         //Incrementing to next odd number
		}
	}
}
//EvenThread to print even numbers.
//Calls printEven() method of SharedPrinter class until limit is exceeded.
class EvenThread extends Thread
{
	int limit;
	sharedPrinter printer;
	public EvenThread(int limit, sharedPrinter printer)
	{
		this.limit = limit;
		this.printer = printer;
	}
	@Override
	public void run() 
	{
		int evenNumber = 2;           //First even number is 2
		while (evenNumber <= limit)
		{
			printer.printEven(evenNumber);          //Calling printEven() method of SharedPrinter class
			evenNumber = evenNumber + 2;           //Incrementing to next even number
		}
	}
}
class sharedPrinter
{

	boolean isOddPrinted = false;

	synchronized void printOdd(int number)
	{
		while (isOddPrinted)
		{
			try
			{
				wait();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+number);
		isOddPrinted = true;
		try
		{
			Thread.sleep(100);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		notify();
	}
//Synchronized printEven() method to print even numbers. It is executed by EvenThread.
//First checks isOddPrinted, 
//if isOddPrinted is false then it waits until next odd number is printed by OddThread
//If isOddPrinted is true then it prints next even number, sets isOddPrinted to false
//sleeps for 1 second before notifying OddThread
	synchronized void printEven(int number)
	{
		while (! isOddPrinted)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+number);
		isOddPrinted = false;
		try
		{
			Thread.sleep(100);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		notify();
	}
}
//Main Class
public class OddEvenNumbers 
{
public static void main(String[] args) 
{
sharedPrinter printer = new sharedPrinter();
OddThread oddThread = new OddThread(100, printer);
oddThread.setName("Odd-Thread");
EvenThread evenThread = new EvenThread(100, printer);
evenThread.setName("Even-Thread");
oddThread.start();
evenThread.start();
}
}