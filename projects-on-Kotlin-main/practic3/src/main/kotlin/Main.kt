import kotlin.random.Random

fun main(args: Array<String>) {
//1
    val myAge = 15
    val isTeenager: Boolean = myAge > 13 && myAge < 19
    println(isTeenager)

//2
    val theirAge = 30
    val bothTeenagers = 30 > myAge && myAge > 19
    println(bothTeenagers)

//3
    val reader: String = "Dima"
    val author: String = "Richard Lucas"
    val authorIsReader = author == reader
    println(authorIsReader)

//4
    val readerBeforeAuthor = author > reader
    println(readerBeforeAuthor)

//5
    val myAge2 = 18
    if(myAge2 > 13 && myAge2 < 19)
        println("teenager")
    else
        println("no teenager")

//6

//7
    var counter = 1

    while (counter <= 10) {
        print(counter)
        print(" ")
        counter = counter + 1
    }

//8
    val counter1 = 0
    var roll = 0
    do {
        roll = Random.nextInt(6)
        println(roll)

            break
    }
        while (0 < 5)


//9
    val range = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in range)
        println(i)

//10
    val range1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in range1)
        println(i * i)

//11
    var sum = 0
    for (row in 0 until 8) {
        if (row % 2 == 0) {
            continue
        }

        for (column in 0 until 8) {
            sum += row * column
        }
    }

    print("Результат: $sum")






}