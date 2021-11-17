package com.w3resource.test

object Scala_BasicTest extends App{

  //Question -2
  val numList = new Scala_Basics()
  val diffNum= numList.sumTest(3,6)
  val sameNum = numList.sumTest(4,4)
  println("Different numbers result : "+diffNum)
  println("Same number result: "+sameNum)
  //Question - 3
  val abn = new Scala_Basics()
   // abn.absoluteDiffOfNum()
    println("Result: " +abn.diff(51))
    println("Result: " +abn.diff(50.9F))
    println("Result: " +abn.diff(78.3F))
  //Question = 4
   //abn.checkCondition(23,56)//true
   abn.checkCondition(30,30)//result
   abn.checkCondition(25,25)//result
   //abn.checkCondition(45,22)//true
   //abn.checkCondition(45,45) //true
  println("checkCon : "+abn.checkCon(30,30))
  println("checkCon : "+abn.checkCon(45,22))
  //Question -5
  println("checkVal : "+abn.checkVal(68))
  println("checkVal : "+abn.checkVal(280))
  println("checkVal : "+abn.checkVal(80))
  //Question -6
  println("Check the String pre condition "+abn.checkStringPrefix("if Sravani"))
  println("Check the String pre condition "+abn.checkStringPrefix("Vamsi"))
  //Question -7
  println("Check the String pre condition "+abn.question_7("if Sravani",2))
  println("Check the String pre condition "+abn.question_7("Sravanii",7))
  //Question-8
  abn.question_8("sravani")
  abn.question_8("vamsi")
  //Question - 9
  println("String print.."+abn.question_9("Tarak"))
  println("String print.."+abn.question_9("Ta"))
  println("String print.."+abn.question_9("T"))
  //Question 10
  println("String first and last char.."+abn.question_10("Tarak"))
  println("String first and last char.."+abn.question_10("Ta"))
  println("String first and last char.."+abn.question_10("T"))
  //Question -11
  abn.question_11(112)
  abn.question_11(120)
  abn.question_11(140)
  abn.question_11(152)
  //Question -12
  println("String repeat char.."+abn.question_12("sravani"))
  println("String repeat char.."+abn.question_12("sra"))
  println("String repeat char.."+abn.question_12("sr"))
  //Question_13
  println("String repeat char.."+abn.question_13("scala"))
  println("String repeat char.."+abn.question_13("Scala"))
  println("String repeat char.."+abn.question_13("song"))
  //Question_14
  println("Temperature.."+abn.question_14(-1,150))
  println("Temperature.."+abn.question_14(120,-20))
  println("Temperature.."+abn.question_14(20,20))
  //Question 15,16
  println("100 to 200 range.."+abn.question_15(-1,150))
  println("100 to 200 range.."+abn.question_15(10,25))
  println("range 20 to 50: " + abn.question_16(11, 20, 12))
  println("range 20 to 50:  30, 130, 17 " + abn.question_16(30, 130, 17))
  println("range 20 to 50: " + abn.question_16(25, 35, 50))
  println("range 20 to 50: " + abn.question_16(15, 12, 8))
  //Question 18
  println("firstString 'yt' replace : "+abn.question_18("sytravani"))
  println("firstString 'yt' replace : "+abn.question_18("vamsi"))
  println("firstString 'yt' replace : "+abn.question_18("yytytyt"))
  println("firstString 'yt' replace : "+abn.question_18(".yt.."))
  //Question_19
  abn.question_19(34,67,89)
  abn.question_19(56,89,0)
  abn.question_19(0,0,0)
  abn.question_19(78,34,34)
  //Question 20
  println("Result: (78,95) : " + abn.question_20(78,95));
  println("Result: (95,95) : " + abn.question_20(95,95));
  println("Result: (99,70) :  " + abn.question_20(99,70));
  println(abn.check("Hope all is well",'l'))
  println(abn.check("i am fine",'e'))
  println(abn.check("Every day is good",'o'))
}


class Scala_Basics() {
  /*Question -2 ....
Write a Scala program to compute the sum of the two given integer values.
 If the two values are the same, then return triples their sum.*/
  def sumTest(x: Int,y: Int) :Int ={
    if(x == y)
      (x+y) * 3
    else
      x+y
  }

  /* Question -3 ....
  Write a Scala program to get the
  absolute difference between n and 51. If n is greater than 51 return triple the absolute difference
    n is any type*/

  //Input from console
   def absoluteDiffOfNum(): Unit = {
    println("Enter the num value :")
    val num:Int = scala.io.StdIn.readInt()
    val absoluteNum:Int = num - 51
    if (num > 51)
      println("absolute diff is greater then the value " + absoluteNum * 3)
    else
      println("Absolute difference is" + absoluteNum)
  }
  //input from code
  def diff(v: Float):Float ={
    val num1:Float = Math.abs(v - 51)
    if(v > 51)
      num1 * 3
    else
      num1
  }
  /* Question -4
    Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.
   */
  def checkCondition(x: Int,y:Int):Unit ={
    if(x > 30 || y > 30 )
      println("true")
    else
      println(s"checkCondition Result ${x+y}")
  }
  //solution with boolean result
  def checkCon(x:Int,y:Int) : Boolean = {
    x > 30 || y > 30 || x + y == 30
  }
  /*Question - 5
  Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300
   */
  def checkVal(x:Int): Boolean ={
    math.abs(100-x) <= 20 || math.abs(300-x) <= 20
  }
  /*Write a Scala program to create a new string where 'if' is added to the front of a given string.
   If the string already begins with 'if', return the string unchanged.
   */
  def checkStringPrefix(s : String):String={
    if(s.startsWith("if"))
      s
    else
      "if"+s
  }
  /*
   Write a Scala program to remove the character in a given position of a given string.
   The given position will be in the range 0...string length -1 inclusive
   */
  def question_7(s:String, n:Int):Unit={
    s.take(n) + s.drop(n+1)
  }
  /*
  Write a Scala program to exchange the first and last characters in a given string and return the new string
   */
  def question_8(str:String):Unit={
    /*val firstStr = str.charAt(0)
    val lastChar = str.charAt(str.length() - 1)
    val result = lastChar+str.substring(1, str.length()-1)+firstStr*/
    //println(result)
    val res = str.charAt(str.length() - 1) + str.substring(1, str.length()-1) + str.charAt(0)
    val res1 = str.takeRight(1)+ str.substring(1,str.length-1) + str.take(1)
    println(res)
    println(res1)
  }
  /* Question -9
   Write a Scala program to create a new string which is 4 copies of the 2 characters of a given string.
   If the given string length is less than 2 return the original string.
    */
  def question_9(str:String):String={
    if(str.length < 2)
      str
    else {
      str.substring(0,2) * 4
      //str.take(2)*4
    }
  }
  /*
  Write a Scala program to create a new string with the last char added
  at the front and back of a given string of length 1 or more.
   */
  def question_10(str:String): String ={
    if(str.length > 1) {
      str.takeRight(1) + str + str.takeRight(1)
      //str.takeRight(1) + str + str.charAt(str.length() - 1)
    }
    else
      str
  }
  /*
  Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7
   */
  def question_11(i : Int): Unit ={
    if(i % 3 ==0 || i % 7 == 0)
      println(s"$i Positive number")
    else
      println("not a positive number")
  }
  /*
  Write a Scala program to create a new string taking the first
  3 characters of a given string and return the string with the 3 characters added at both the front and back.
  If the given string length is less than 3, use whatever characters are there
   */
  def question_12(str:String):String ={
    if(str.length() < 3) {
      str * 3
    }
    else {
       str.substring(0,3)+str+str.substring(0,3)
    }
  }
  /*
  Write a Scala program to check whether a given string starts with 'Sc' or not
   */
  def question_13(str:String): Boolean ={
    str.startsWith("Sc")
  }
  /*
  Write a Scala program to check whether one of the given
  temperatures is less than 0 and the other is greater than 100
   */
  def question_14(temp1:Int,temp2:Int): Boolean = {
    (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)
  }
  /*
     Write a Scala program to check two given integers whether either of them is in the range 100..200 inclusive.
   */
  def question_15(x:Int,y:Int):Boolean ={
    (x >= 100 && x <=200) && (y >= 100 && y <=200)
  }
  /*
  Write a Scala program to check whether three (x,y,z)given integer values are in the range 20..50 inclusive.
   Return true if 1 or more of them are in the said range otherwise false.
   */
  def question_16(x:Int,y:Int,z:Int): Boolean = {
    (x >= 20 && x <=50) && (y >= 20 && y <=50) && (z >= 20 && z <=50)
  }
  /*
  Write a Scala program to check whether a string 'yt' appears at index 1 in a given string.
   If it appears return a string without 'yt' otherwise return the original string
   */
  def question_18(name:String):String={
    if(name.indexOf("yt")== 1)
      name.replaceFirst("yt","")
    else
      name
  }
  /*
  Write a Scala program to check the largest number among three given integers
   */
  def question_19(x:Int,y:Int,z:Int) = {

    val highestNum = List(x,y,z).max
    println("highest num ..."+highestNum)
  }
  /*
  Write a Scala program to check which number is nearest to the value 100 among two given integers.
  Return 0 if the two numbers are equal
   */
  def question_20(x:Int,y:Int): Int ={
    val x_abs =math.abs(x - 100)
    val y_abs=  math.abs(y - 100)
    if(x_abs == y_abs) 0
    else if(x_abs < y_abs) x
    else y

  }
  /*Write a Scala program to check whether two given positive integers have the same last digit.
   */
  def check(str:String,l:Char):Boolean={
    val counts = str.count(_ == l)
    counts >= 2 && counts <=4
  }
  /*
  Write a Scala program to create a new string which is n (non-negative integer ) copies of a given string.
   */
  def test(str1: String, n: Int): String = {
    str1 * n;
  }
  /*
  Write a Scala program to convert the last 4 characters of a given string in upper case.
  If the length of the string has less than 4 then uppercase all the characters.

   */
  def test1(str1: String): String = {
    str1.take(str1.length() - 4) + str1.drop(str1.length() - 4).toUpperCase()
  }
}

