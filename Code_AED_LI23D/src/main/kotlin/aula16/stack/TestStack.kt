package aula16.stack

fun main() {
//    val intStack = IntStackArray(5) // Array-based
//    val intStack: IntStack = IntStackArray(5) // Array-based, note the type is IntStack interface

    var intStack: IntStack // Type is IntStack interface
    // COMMENT / UNCOMMENT alternatives
//    intStack = IntStackArray(5) // Array-based
    intStack = IntStackList() // List-based

    // Pushing into the stack
    for (i in 1 until 10)
        intStack.push(i)
    // Popping from the stack
//    while (!intStack.isEmpty()) // Note the difference between using method isEmpty()
    while (!intStack.isEmpty) // and isEmpty getter property
        println(intStack.pop())
}









