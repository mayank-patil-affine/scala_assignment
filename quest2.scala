object quest2 extends App {
//Q1. https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/

def check_zoo(str:String):Unit={
        var str_lst=str.split("")
        var lstmap=scala.collection.mutable.Map[String, Int]()
        for (i <- str_lst.toSet.toArray){
            lstmap+= (i->str_lst.count(x=>{x==i}))
            }
        if (2*lstmap("z")==lstmap("o")){
            println("Yes")
        }
        else {
            println("No")
        }
        }

//Q2. https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisible-or-not-81b86ad7/

val len_str = "5"
val str = "21 30 25 54 60"
def lastdigit_divten(str:String,len_str:String):Unit={
    val arrdigi=str.split(" ")
    var lasdigit=""
    var num:Int=0
    for (i <- 0 until arrdigi.length){
        num=arrdigi(i).toInt%10
        lasdigit=lasdigit+num
    }
    //println(lasdigit)
    if (lasdigit.toInt%10==0){
        println("Yes")
    }
    else {
        println("No")
    }

    }
def lastdigit_divten_fast(str:String,len_str:String):Unit={
    var num=str.split(" ")
    var lasnum=num(len_str.toInt-1)
    var lasdigit=lasnum(lasnum.length-1).asDigit
    //print(lasdigit) /*
    if (lasdigit==0){
        println("Yes")
        }
    else {
        println("No")
        }// */
    }
//Q3. https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/special-number-9-a0cda359/
import scala.io.StdIn.readLine
//val len_int = readLine
def get_special_num(str: String): Unit={
  var num = str.toInt
  var newnum = num.toString.split("").map(x => x.toInt)
  var new_sum = newnum.sum
  while (new_sum % 4 != 0) {
   num = num + 1
   newnum = num.toString.split("").map(x => x.toInt)
   new_sum = newnum.sum
  }
  println(num)
 }
def get_special_num_loop(len_int:String): Unit={
 for (i <- 1 to len_int.toInt){
  var str = readLine
  get_special_num(str)
 }
 }
 //Q4. https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/excursion-2d080f3a/

 import scala.io.StdIn._
 //val len_int = readLine
 def lastdigit_divten(len_int:String):Unit={
     for (i <- 1 to len_int.toInt){
         var str = readLine
         var arr_str = str.split(" ")
         var num=((arr_str(0).toFloat/arr_str(2).toFloat).ceil+(arr_str(1).toFloat/arr_str(2).toFloat).ceil).toInt
         println(num)
       }
     }

 /*Q5.  Write a program to print following :-
 a.
 **********
 **********
 **********
 **********

 b.
 *
 **
 ***
 ****
 *****
 */
 def print_star(pattern:String): Unit ={
   var count=10
   if (pattern=="Tree"){
     for (i <- 1 to 5){
       println("*"*i)
     }
   }
   else if (pattern == "cube") {
     for (i <- 1 to 4) {
       println("*" * count)
     }
   }

 }
 /*Q6. Write a Scala program to check whether the first two characters present at the end of a given string.
 Example:
     Input string : educated
     output:  true
     Input string : ABCDEFBA
     output:  false
 */

def check_str(str2:String):Unit={
    println((str2(0),str2(1))==(str2(str2.length-2),str2(str2.length-1)))
 }

//Q7. Write a Scala program to calculate the sum of the last 3 elements of an array of integers.
//If the array length is less than 3 then return the sum of the array. Return 0 if the array is empty.
def sum_array(arr:Array[Int]):Unit={
  if (arr.isEmpty){
    println(0)
  }
  else if (arr.length<3){
    println(arr.sum)
  }
  else if (arr.length >= 3) {
    var slicearr=arr.slice(arr.length-3,arr.length)
    println(slicearr.sum)
  }
}

/*Q8. Write a Scala program to find maximum product of two integers in a given array of integers.
    Sample Input:
    nums = { 2, 3, 5, 9, 7, 5, 8, 5 }
    Sample Output:
    Pair is (9, 8), Maximum Product: 72*/

def max_product(arr:Array[Int]):Unit={
  val sort_arr=arr.sorted
  val new_elem=(sort_arr(sort_arr.length-1),sort_arr(sort_arr.length-2))
  val productof=sort_arr(sort_arr.length-1)*sort_arr(sort_arr.length-2)
  println("Pair is "+new_elem+", Maximum Product: "+productof)
}

//Q9. Write a Scala program to check if a given string is palindrome or not.
def check_palindrome(str:String):Unit={
    if (str==str.reverse){
    println("String is a Palindrome")
    }
    else {
    println("String is not a Palindrome")
    }
}
//Q10. Write a program to check if a number is the power of 2 or not.
def power_of2(num:Int):Unit={
  var twopow=2
  while (twopow<num){
    if (twopow<num){
      twopow = twopow * twopow
    }
    }
  if (num == twopow) {
    println(num + " is a power of two")
  }
  else if(twopow>num) {
    println(num+" is not a power of two")
  }
}
//Q11. https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/lunch-boxes-019bf2a5/
//var num = readLine
def get_lunchboxes(num:String):Unit={
    var t=num.toInt
    while (t > 0){
        t =t - 1
        var nm_str = readLine
        var numarr=nm_str.split(" ")
        var n =numarr(0).toInt
        var m =numarr(1).toInt
        var a_str = readLine
        var a_strarr=a_str.split(" ")
        var a=a_strarr.map(x => x.toInt)
        a=a.sorted
        var i = 0
        while (i<m && a(i)<=n){
            n=n-a(i)
            i=i+1
        }
        println(i)
    }

}


//// question1
println("question1")
check_zoo("zzzoooooo")
check_zoo("zzoooooo")

//// question2
println("question2")
lastdigit_divten(str,len_str)
lastdigit_divten_fast(str,len_str)

//// question3
//get_special_num_loop(len_int)

////  question4
//lastdigit_divten(len_int)

//// question5
println("question5")
print_star(pattern="Tree")
println("")
print_star(pattern="cube")

//// question6
println("question6")
check_str("sbcbcsb")
check_str("sbcbcst")

//// question7
println("question8")
sum_array(Array(1,2,2,2,2,3))
sum_array(Array(1,3))
sum_array(Array[Int]())

//// question8
println("question8")
max_product(Array(1,2,2,43,54,65,2,2,3))
max_product(Array(1,2,2,43,54,21,2,332,3))

//// question9
println("question9")
check_palindrome("abba")
check_palindrome("1011")
check_palindrome("1001")
check_palindrome("wow")
check_palindrome("how")

//// question10
println("question10")
power_of2(8)
power_of2(16)
power_of2(256)

//// question11
println("question11")
//get_lunchboxes(num)

}
