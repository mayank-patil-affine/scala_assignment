@main def entryPoint()  ={
//Q1. Write a program to check whether a person is eligible for voting or not ?
def check_vote_eligible(age:Int):Unit={
    if (age>=18){
    println("Eligible for voting..!")
    }
    else {
    println("Not Eligible for voting..!")
    }
}
//Q2. Write a program to check whether a number entered by user is even or odd.
def check_odd_even(num:Int):Unit={
    if (num%2==0){
    println("No. is Even..! "+num)
    }
    else {
    println("No. is Odd..! "+num)
    }
}
//Q3. Write a program to check whether a number is divisible by 7 or not.
def check_div_seven(num:Int):Unit={
    if (num%7==0){
    println(s"$num is divisible by 7..!")
    }
    else {
    println(s"$num is not divisible by 7..!")
    }
}
//Q4. Write a program to display "Hello" if a number entered by user is a multiple of five , otherwise print "Bye".
def check_multi_five(num:Int):Unit={
    if (num.toString.endsWith("0") || num.toString.endsWith("5")){
    println("Hello")
    }
    else {
    println("Bye")
    }
}
/*Q5. Write a program to calculate the electricity bill (accept number of unit from user) according to the following criteria :
             Unit                                                     Price
            First 100 units                                               no charge
            Next 100 units                                              Rs 5 per unit
            After 200 units                                             Rs 10 per unit
(For example if input unit is 350 than total bill amount is Rs2000)*/
def generate_elec_bill(unit:Int):Unit={
    if (unit>200){
    var nunit=unit-100
    var bill=100*5
    nunit=nunit-100
    bill=bill+nunit*10
    println(s"$bill is your bill..!")
    }
    else if (unit>100 && unit<=200){
    var nunit=unit-100
    var bill=nunit*5
    println(s"$bill is your bill..!")
    }
    else{
    var bill=0
    println(s"$bill is your bill..!")
    }
    }
//Q6. Write a program to display the last digit of a number.(hint : any number % 10 will return the last digit)
def get_lastdigit(num:Int):Unit={
    val lastdigit=num%10
    println(s"$lastdigit is lastdigit..!")
    }

//Q7.Write a program to check whether the last digit of a number( entered by user ) is divisible by 3 or not.
def get_lastdigit_div_three(num:Int):Unit={
    val lastdigit=num%10
    if (lastdigit%3==0){
    println(s"$lastdigit is divisible by 3..!")
    }
    else {
    println(s"$lastdigit is not divisible by 3..!")
    }
    }
/*Q8. Write a program to accept percentage from the user and display the grade according to the following criteria:
Marks                                    Grade
> 90                                       A
> 80 and <= 90                             B
>= 60 and <= 80                            C
below 60                                   D
*/
def get_grade(percnt:Float):Unit={
    if (percnt>90.0f){
    println("A")
    }
    else if (percnt> 80.0f && percnt<= 90.0f){
    println("B")
    }
    else if (percnt>= 60 && percnt<= 80){
    println("C")
    }
    else if (percnt< 60){
    println("D")
    }
}

/*Q9. Write a program to accept the cost price of a bike and display the road tax to be paid
according to the following criteria :
Cost price (in Rs)                Tax
> 100000                          15%
> 50000 and <= 100000             10%
<= 50000                          5%
*/

def calculate_tax(price:Float):Unit={
    if (price>100000){
    var tax:Float=price*0.15f
    println(s"$tax is your road tax..!")
    }
    else if (price>50000 && price<= 100000){
    var tax:Float=price*0.10f
    println(s"$tax is your road tax..!")
    }
    else {
    var tax:Float=price*0.05f
    println(s"$tax is your road tax..!")
    }
    }


//Q10. Write a program to check whether an years is leap year or not.
def check_leap_year(year:Int):Unit={
    if (year%4==0){
    println(s"$year is a leap year..!")
    }
    else {
    println(s"$year is nota leap year..!")
    }
    }

//// question1
println("question1")
//checking for age 18
check_vote_eligible(18)
//checking for age 16
check_vote_eligible(16)

//// question2
println("question2")
// checking with no.12
check_odd_even(12)
// checking with no.7
check_odd_even(7)

//// question3
println("question3")
// checking with no.14
check_div_seven(14)
// checking with no.13
check_div_seven(13)

//// question4
println("question4")
// checking with no.35
check_multi_five(35)
// checking with no.30
check_multi_five(30)
// checking with no.21
check_multi_five(21)

//// question5
println("question5")
// checking with no.350
generate_elec_bill(350)
// checking with no.150
generate_elec_bill(150)
// checking with no.21
generate_elec_bill(50)

// question6
println("question6")
get_lastdigit(1000)
get_lastdigit(4354)
get_lastdigit(43)

////// question7
println("question7")
// checking with no.7
get_lastdigit_div_three(7)
// checking with no.6
get_lastdigit_div_three(6)

////// question8
println("question8")
// checking with no.40
get_grade(40)
// checking with no.70
get_grade(70)
// checking with no.85
get_grade(85)
// checking with no.95
get_grade(95)

////// question9
println("question9")
// checking with no.120000
calculate_tax(120000)
// checking with no.20000
calculate_tax(20000)
// checking with no.2000
calculate_tax(2000)

////// question10
println("question10")
check_leap_year(2012)
check_leap_year(2013)
check_leap_year(2020)

}
