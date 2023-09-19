fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    //1

    val age1: Int = 42
    val age2: Int = 21
    println(age1)
    println(age2)

    //2

    val avg1: Int =(age1 + age2)/2
    println(avg1)

    //3
  val age3: Int =  42
    val age4: Int = 21
     val avg2: Double = (42+21)/2.toDouble()
    println(avg2)

     //4

     val  firstName: String = "denis"
     val  lastName: String = "kapaciev"

    //5


     val fullName: String = firstName + " " + lastName
     println(fullName)

   //6

     val myDetails: String = fullName
    println(myDetails)

    //7


    //8
    val coordinates3D = Triple(9, 8, 23)
    val month = coordinates3D.first
    val day = coordinates3D.second
    val year = coordinates3D.third
    println(coordinates3D)
    
   //9





    //10























}