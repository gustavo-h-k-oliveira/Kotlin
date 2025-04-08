import kotlin.random.Random

fun main() {
    throwTheDice()
    interlude()
    pressTheButton()
    interlude()
    countThePizza()
    interlude()
    fizzBuzz()
    interlude()
    printWords(words)
}

fun interlude() {
    println("\n-----\n")
}

fun throwTheDice() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

    println("The first dice number is $firstResult and the second dice number is $secondResult.")
    println(if (firstResult != secondResult) "You won! :)" else "You lose :(")
}

// Strongly typed
enum class Answer {
    A, B, X, Y
}

fun pressTheButton() {
    print("Press a button to continue: ")
    val button = readLine()?.uppercase()

    val answer = try {
        Answer.valueOf(button!!)
    } catch (_: IllegalArgumentException) {
        null
    }

    val buttonPressed = when (answer) {
        Answer.A -> "Yes"
        Answer.B -> "No"
        Answer.X -> "Menu"
        Answer.Y -> "Nothing"
        null -> "There is no such button."
    }
    println("Action: $buttonPressed")
}

fun countThePizza() {
    var pizzaSlices = 0
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There`s only $pizzaSlices slice(s) of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun fizzBuzz() {
    for (i in 1..100) {
        val answer = when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i
        }
        print("$answer ")
    }
    println()
}

val words = listOf("dinosaur", "limousine", "magazine", "language")

fun printWords(words: List<String>) {
    for (word in words) {
        val firstLetter = word[0].uppercaseChar()
        if (firstLetter == 'L') {
            print("$word ")
        }
    }
}