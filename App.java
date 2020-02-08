package com.epam.MavenDemo;
import java.io.*;
import java.util.*;


interface Candy
{
public void cal(int n);
}

interface Chocolates
{
public void cal1(int n);
}


class Candies implements Candy,Chocolates
{
public int candy_wt=10,total_cand_wt,total_cho_wt,choc_wt=5;
public void cal(int n)
{
total_cand_wt=n*candy_wt;
}
public void cal1(int n)
{
total_cho_wt=n*choc_wt;
}
}


class Sweets extends Candies
{
public int  sweet_wt,candies_wt;
public void identify(String a)
{
candies_wt=super.total_cand_wt;
if(a.equals("GulabJamun"))
{
sweet_wt=50;
}
else
{
sweet_wt=60;
}
}
}

class Gift extends Sweets
{
int d,j=0;
float[] array=new float[20];
static int i=1;
float totalWeight,c;
public void sort(int n)
{
float temp;
for(int i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
if(array[j]>array[j+1])
{
temp=array[j];
array[j]=array[j+1];
array[j+1]=temp;
}
}
}
System.out.println("After sorting all the individual weights of the gifts are:");
for(int i=0;i<n;i++)
{
System.out.println(array[i]+" ");
}

}
public void display()
{

totalWeight=sweet_wt+candies_wt+total_cho_wt;
array[j++]=totalWeight;
System.out.println("Total weight of gift-"+i+" is:"+totalWeight);
i += 1;
}
}




public class App {

public static void main(String[] args) {
int c,ch,i;
int no_of_gifts;
String s;

Gift g=new Gift();


Scanner sc=new Scanner(System.in);
System.out.println("Enter number of gifts received on New-Year:");
no_of_gifts=sc.nextInt();
for(i=0;i<no_of_gifts;i++)
{
System.out.println("Items in "+(i+1)+" gift are:");
System.out.println("Enter number of candies");
c=sc.nextInt();
g.cal(c);
System.out.println("Enter sweet name");
s=sc.next();
g.identify(s);
System.out.println("Enter number of chocolates");
ch=sc.nextInt();
g.cal1(ch);
g.display();

}
g.sort(no_of_gifts);

}
}








