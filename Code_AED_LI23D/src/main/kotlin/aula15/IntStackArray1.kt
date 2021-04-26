package aula15

// ANTES - Tipo agregado com metodos de extensao

//data class IntStackArray1(val stack: IntArray, var n: Int = 10) // n has a default value of 10
//
//fun IntStackArray.push(item: Int) {
//    if (n < stack.size) {
//        stack[n] = item
//        ++n
//    }
//}

// AGORA:
class IntStackArray1(capacity: Int) { // Parametros do construtor
    // Campos ou atributos
    ///*private*/ val stack: IntArray = IntArray(capacity)
    /*private*/ val stack: IntArray
    private /*public*/ var n = 0

    // Metodos
    /*public*/ /*private*/ fun isEmpty(): Boolean = n == 0

    fun push(item: Int) {
        if (n < stack.size) {
            stack[n] = item
            ++n // n indica proxima posicao livre
        }
    }

    // Assume-se que antes de invocar o método pop é testado se a pilha está vazia
    fun pop(): Int {
        --n // decrementa n para passar a apontar para o ultimo elemento
        return stack[n]
    }

    // Constructor
    init {
        stack = IntArray(capacity)
        n = 0
    }
}


fun main() {
    val intStack: IntStackArray1 = IntStackArray1(10)
    intStack.stack

    intStack.push(5)

//    println(intStack.n) // Error, private in IntStackArray
//    println(intStack.isEmpty())
}