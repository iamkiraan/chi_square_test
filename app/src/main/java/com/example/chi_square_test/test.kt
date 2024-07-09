package com.example.chi_square_test

import java.util.Scanner

class test {
    /* the chi square test uses the sample statistics
    X^2 = E(i=1 to n) (0i-ei)^2/ei
    where
     oi= observed number in its
     ei =  expected number in i th class
     for uniform distribution , ei is given by
     ei = N/n
      n-> number of classes
      N-> total number of observation
     */
    fun check(){
        val scanner  = Scanner(System.`in`)
        println("enter the value of aplha")
        val aplha = scanner.nextInt()

        println("enter the number of data")
        val n =  scanner.nextInt()
        println("enter the data")
        val data = arrayOfNulls<Any>(200)
        for(i in 1..n){
            data[i] = scanner.nextInt()

        }
        for(i in 1..n){
            if(data[i] in 0..0.1.toInt()){



            }
        }
    }



}
