object quest2 extends App {
//Q1. Write a program to print all the prime numbers between two given numbers by creating a function.

import io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer
//initializing an empty array buffer
val ints = ArrayBuffer[Int]()
println("enter the start seq to generate prime no. :")
var n1 = readInt
println("enter the end seq to generate prime no. :")
var n2 = readInt
def checkPrime(num: Int): Boolean =
  (num > 1) && !(2 to scala.math.sqrt(num).toInt).exists(x => num % x == 0)
def gen_prime_seq(n1:Int,n2:Int):Unit={
for (number <- n1 to n2 ) {
  //println(number)
  if (checkPrime(number) ) {
    ints.append(number)
  }
}
var lints = ints.toList
println("printing list:\n " + lints)
}

//Q2. Write a Program to print the Fibonacci sequence of a number.

import io.StdIn.readInt
println("enter a positive integer ")
val input: Int = readInt
def get_fibonacci(nterms:Int):Unit={
  var n1=0
  var n2=1
  var count=0
  var nth=n1+n2
  // check if the number of terms is valid
  if (nterms <= 0){
    println("Please enter a positive integer")
  }
  // if there is only one term, return n1
  else if (nterms == 1){
    println("Fibonacci sequence")
    println(n1)
  }
  // generate fibonacci sequence
  else{
    print("Fibonacci sequence:")
    while (n1 <= nterms) {
      println(n1)
      nth = n1 + n2
      // update values
      n1 = n2
      n2 = nth
      count += 1
    }
  }
}

//Q3. Given a array of N positive integers and an integer X.
//The task is to find the frequency of X in Array.
import io.StdIn._
val arr1: Array[Int] =Array(1,2,2,2,3,3,3,3,4,4,4,5,5,5,6,6,6,6,5,5,4,3,2,1)
println(s"enter a positive integer to search in ${arr1.toList}")
val input1: Int = readInt

def get_num_count(input:Int,arr:Array[Int]):Unit={
  println(arr.count(x=>x==input))
}
//Q4. Write the code using function in scala for below problems:-
//a.
def peakElement(arr:Array[Int]):Unit={
  val newarr=arr.sorted
  val gnum=newarr(newarr.length-1)
  print(arr.indexOf(gnum))
}
//b.
val N = 5
val S = 12
val arr2=Array(1,2,3,7,5)
import scala.util.control.Breaks._
def subArraySum(n:Int,s:Int,arr:Array[Int]):Unit={
  breakable{
  for (i<-0 until n){
    var count=0
    for (j<- i until n){
      count = count + arr(j)
      if (count == s) {
        println(s"$i to $j")
        break
      }
    }
  }
  }
}
//c.
val arr3=Array[Int](34,43,43,54,65)
def reverselist(arr:Array[Int]):Unit={
  var lst=List[Int]()
  println(arr.toList)
  for (i <- arr){
    lst=i::lst
  }
  println(s"reversed list of $lst")
}
//d.
//#insertion sort
val arr4=Array[Int](43,34,32,54,65)
val n=5
def sortArray1(arr:Array[Int],n:Int):Unit= {
  for (i <- 1 until n) {
    var value=arr(i)
    var hole=i
    while (hole>0 && arr(hole-1)>value){
      arr(hole)=arr(hole-1)
      hole=hole-1
    }
    arr(hole)=value
  }
  println(arr.toList)
}
//#####################################
// Bubble sort
def sortArray2(arr:Array[Int],n:Int):Unit= {
  for (k<-1 to n-1){
  for (i <- 0 until n - 1) {
    var temp = 0
    if (arr(i) > arr(i + 1)) {
      temp = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = temp
    }
  }
}
  println(arr.toList)
}
//######################################
// selection sort

def sortArray3(arr:Array[Int],n:Int):Unit= {
  for (i <- 0 until n - 1) {
    var imin = i
    var temp = 0
    for (j <- i + 1 to n - 1) {
      if (arr(j) < arr(imin)) {
        imin = j
      }
      temp = arr(i)
      arr(i) = arr(imin)
      arr(imin) = temp

    }
  }
  println(arr.toList)
}

//e.
val arr6=Array[String]("moramore","mororo", "mororo", "morot")
val numer=4
def longestCommonPrefix(arr:Array[String],n:Int):Unit= {
  var sorarr=arr.sorted
  println(sorarr.toList)
  var str_s=sorarr(0).split("")
  var str_b=sorarr(sorarr.length-1).split("")
  var temp=Array("")
  if (str_s.length>str_b.length){
    temp = str_b
    str_b=str_s
    str_s=temp
  }
  var f_str=""
  for (i <- 0 until str_s.length){
    if (str_s(i)==str_b(i)){
      f_str=f_str+str_s(i)
    }
  }
  println(f_str)
}
//f.
val arr7=Array("geeks", "for", "geeks", "contribute", "practice")
val word1= "geeks"  //"the"
val word2=  "practice" //"fox"
def shortestDistance(arr:Array[String],word1:String,word2:String):Unit= {
  val dist=(arr.lastIndexOf(word1)-arr.lastIndexOf(word2)).abs
  println(dist)
}


//// question1
println("question1")
gen_prime_seq(n1,n2)

//// question2
println("question2")
get_fibonacci(input)

//// question3
println("question3")
get_num_count(input1,arr1)

//// question4
println("question4")
println("question4-a")
peakElement(Array(213,509,129,898,766,198,131))
println("question4-b")
subArraySum(N,S,arr2)
println("question4-c")
reverselist(arr3)
println("question4-d")
//insertion sort
println("insertion sort")
sortArray1(arr4,n)
// Bubble sort
println("Bubble sort")
sortArray2(arr4,n)
// selection sort
println("selection sort")
sortArray3(arr4,n)
println("question4-e")
longestCommonPrefix(arr6,numer)
println("question4-f")
shortestDistance(arr7,word1,word2)


}
