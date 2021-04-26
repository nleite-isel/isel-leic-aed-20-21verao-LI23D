package aula16.stack

interface IntStack {
	fun push(i: Int)
	fun pop(): Int
	val isEmpty: Boolean
}