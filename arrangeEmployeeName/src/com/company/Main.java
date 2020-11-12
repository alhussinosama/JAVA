package com.company;
import java.io.*;
public class Main {
        public static void main(String args[])throws IOException {

            String numberOfEmployee;

            int n,i,j;

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("\n\nHow many Employee Name you want to enter :- ");

            numberOfEmployee =br.readLine();

            n=Integer.parseInt(numberOfEmployee);

            String a[]=new String[n];

            for(i=0;i<a.length;i++) {

                System.out.print("\nEnter "+i+" Employee Name:- ");

                a[i]=br.readLine();

            }

            System.out.println("\nSorted Employee : ");

            for(i=0;i<a.length;i++) {

                for(j=i+1;j<a.length;j++)

                {

                    if(a[j].compareTo(a[i])<0) {

                        String t=a[i];

                        a[i]=a[j];

                        a[j]=t;

                    }

                }

                System.out.println(a[i]);

            }

        }

    }

