fun main() {

    guessTheNumberGame()
}


fun guessTheNumberGame() {
    println("Welcome to guess the number game")
    val first = getInt("Enter the number you want the generator to start at: ")
    val last = getInt("Enter the number you want the generator to end at: ")
    val answer = (first..last).random()

    var attempt = 0
    while (true) {
        println("Guess ${++attempt}")
        val guess = getInt("Enter your guess: ")
        when {
            guess == answer -> {
                println("Correct")
                break
            }
            guess > answer -> println("Lower")
            else -> println("Higher")


        }
    }

}

fun getInt(message: String = ""): Int {
    print(message)
    return Integer.valueOf(readln())
}