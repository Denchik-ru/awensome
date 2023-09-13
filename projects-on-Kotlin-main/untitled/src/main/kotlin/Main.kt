import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    //exercise1
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved += 1
    println(exercisesSolved)

    //exercise2

    val year: Int = 18
    println(year)

    //exercise3

    val year1: Double = 18.0
    val year2: Double = 30.0
    println((year1 + year2)/2)

    //exercise4
    val testNumber: Int = 9
    val evenOdd: Int = 9%2
    println(evenOdd)

    //exercise5

    var answer: Int = 0
    answer += ((1 + 10)* 10)shr 3
    println(answer)

    //exercise6
    val age: Int = 16
    println(age)
    val age1: Int = 30
    println(age1)

    //exercise7

    val a: Int = 46
    val b: Int = 10
    //1
    val answer1: Int = (a * 100) + b // = 4610
    println(answer1)
    //2
    val answer2: Int = (a * 100) + (b * 100) // = 5600
    println(answer2)
    //3
    val answer3: Int = (a * 100) + (b / 10) // = 4601
    println(answer3)

    //exercise8
    var result: Int = (5 * 3) - ((4 / 2) * 2)
    println(result)

    //exercise9
    val a1: Double = 19.0
    val b2: Double = 57.0
    val average: Double = (a1 + b2)/2
    println(average)

    //exercise13

    val x1: Double = 3.0
    val y1: Double = 5.0
    val x2: Double = 7.0
    val y2: Double = 9.0
    val distance: Double = sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)))
    println(distance)

    //exercise11

    val fahrenheit: Double = 73.0
    val celcius: Double = ((73.0-32.0) * 5.0) / 9.0
    println(celcius)



















}