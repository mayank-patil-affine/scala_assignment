/*################################################################################################################################################
1: Create a Class with instance attributes
Write a Scala program to create a Vehicle class with max_speed and mileage instance attributes.*/
class Vehicle(var name : String,var max_speed: Int=0,var mileage:Float=0.0f);
object printclass {
  def main(args:Array[String]): Unit ={
    var vehicle1= new Vehicle(name="Aston Martin",max_speed=200,mileage=20.2f)
    println(vehicle1.name)
    println(vehicle1.mileage)
    println(vehicle1.max_speed)
  }
}
/*#####################################################################################################################################################
2: Create a child class Bus that will inherit all of the variables and methods of the Vehicle class

	class Vehicle(name : String, max_speed : Int , mileage : Int ){}

Create a Bus object that will inherit all of the variables and methods of the parent Vehicle class and display it.

Expected Output:
	Vehicle Name: School Volvo Speed: 180 Mileage: 12*/

	class Bus() extends Vehicle {

	};
	object Bus {
	  def main(args:Array[String]): Unit ={
	    var bus1= new Bus()
	    bus1.name="volvo"
	    bus1.mileage=22.33f
	    bus1.max_speed=169
	    print_details(bus1)
	  }
	  def print_details(p: Bus): Unit ={
	    println(s"Vehicle Name: ${p.name} Speed: ${p.max_speed}  Mileage: ${p.mileage} ")
	  }
	}

/*######################################################################################################################################################
3: Create a Bus class that inherits from the Vehicle class. Give the capacity argument of Bus.seating_capacity() a default value of 50.
Use the following code for your parent Vehicle class.

class Vehicle(name : String, max_speed : Int , mileage : Int ){
	 def seating_capacity(capacity : String){
		print("The seating capacity of a"+ {name} + " is "+{capacity}+" passengers")
	 }
}

Expected Output:
	The seating capacity of a bus is 50 passengers*/

  class Vehicle(var name : String="",var max_speed: Int=0,var mileage:Float=0.0f){
    def seating_capacity(capacity: String) {
      print("The seating capacity of a " + {name} + " is " + {capacity} + " passengers")
    }
  };

  object Vehicle {
    def main(args:Array[String]): Unit ={
      var vehicle1= new Vehicle(name="Aston Martin",max_speed=200,mileage=20.2f)
      println(vehicle1.name)
      println(vehicle1.mileage)
      println(vehicle1.max_speed)
    }
  }


  class Bus() extends Vehicle {

  };
  object Bus {
    def main(args:Array[String]): Unit ={
      var bus1= new Bus()
      bus1.name="volvo"
      bus1.mileage=22.33f
      bus1.max_speed=169
      print_details(bus1)
      bus1.seating_capacity("60")
    }
    def print_details(p: Bus): Unit ={
      println(s"Vehicle Name: ${p.name} Speed: ${p.max_speed}  Mileage: ${p.mileage} ")
    }
  }

  /*#####################################################################################################################################################
  4. Define a property that must have the same value for every class instance (object)
  Define a class attribute”color” with a default value white. I.e., Every Vehicle should be white.

  Use the following code for this exercise.

  class Vehicle(name : String, max_speed : Int , mileage : Int ){

  }

  class Bus extends Vehicle{
  }

  class Bus extends Vehicle{
  }

  Expected Output:
  	Color: White, Vehicle name: School Volvo, Speed: 180, Mileage: 12
  	Color: White, Vehicle name: Audi Q5, Speed: 240, Mileage: 18*/

  class Vehicle(var name : String="",var max_speed: Int=0,var mileage:Float=0.0f, val color: String="White"){
  def seating_capacity(capacity: String) {
    print("The seating capacity of a " + {name} + " is " + {capacity} + " passengers")
  }
};

object Vehicle {
  def main(args:Array[String]): Unit ={
    var vehicle1= new Vehicle(name="Aston Martin",max_speed=200,mileage=20.2f)
    print_details(vehicle1)
  }

  def print_details(p: Vehicle): Unit = {
    println(s"Color: ${p.color}, Vehicle Name: ${p.name} Speed: ${p.max_speed}  Mileage: ${p.mileage} ")
  }
}

class Bus() extends Vehicle {

};
object Bus {
  def main(args:Array[String]): Unit ={
    var bus1= new Bus()
    bus1.name="volvo"
    bus1.mileage=22.33f
    bus1.max_speed=169
    print_details(bus1)
    bus1.seating_capacity("60")
  }
  def print_details(p: Bus): Unit ={
    println(s"Color: ${p.color}, Vehicle Name: ${p.name} Speed: ${p.max_speed}  Mileage: ${p.mileage} ")
  }

}
/*####################################################################################################################################################################################
5. Create a Bus child class that inherits from the Vehicle class.
The default fare charge of any vehicle is seating capacity * 100.
If Vehicle is Bus instance, we need to add an extra 10% on full fare as a maintenance charge.
So total fare for bus instance will become the final amount = total fare + 10% of the total fare.
Note: The bus seating capacity is 50. so the final fare amount should be 5500.
You need to override the fare() method of a Vehicle class in Bus class.
Use the following code for your parent Vehicle class.
We need to access the parent class from inside a method of a child class.*/

class Vehicle(var name : String="",var mileage:Int=0,var capacity: Int=0){
  def fare(): Int = {
    return capacity * 100
  }
};

class Bus extends Vehicle{
  // write your code here
  override def fare: Int = {
    var fare_o =(capacity * 100)
    var maintain_charge=(fare_o*(10.0/100.0)).toInt
    return fare_o+maintain_charge

  }
};
object Bus {
  def main(args:Array[String]): Unit ={
    val School_bus = new Bus()
    School_bus.name="School Volvo"
    School_bus.capacity=50
    School_bus.mileage=12
    print("Total Bus fare is:" + School_bus.fare())

  }
/*##################################################################################################################################################################################
6. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
by creating a class named 'Triangle' without any parameter in its constructor.*/
class Triangle {
    def area(base:Int,height:Int):Unit={
      println(0.5 * base * height)
    }
    def perimeter(base:Int,height:Int,hypot:Int):Unit={
      println(base + height + hypot)
    }
}

object Triangle {
  def main(args:Array[String]): Unit ={
    var tri1= new Triangle()
    println("Area is: ")
    tri1.area(base=3,height=4)
    println("Perimeter is: ")
    tri1.perimeter(base=3,height=4,hypot=5)

  }
}

/*###################################################################################################################################################################################
7. Print the average of three numbers entered by user by creating
a class named 'Average' having a method to calculate and print the average.*/
class Average(num1:Int,num2:Int,num3:Int) {
  def print_avg():Unit={
     println((num1+num2+num3)/3)
  }

}
object Average {
  def main(args:Array[String]): Unit ={
    var avg1= new Average(2,3,8)
    println("Average is: ")
    avg1.print_avg()

  }
}
