package aula19.dintlist

// Double linked list, with sentinel
class DIntList {
    private var list: IntNode? = IntNode() // Sentinel node
    private var size = 0
    // Methods
    fun addFront(v: Int) {
        //  Create new node with value v
        val newNode: IntNode = IntNode(v)
        // Set auxiliary references "prevNode" and "nextNode"
        var prevNode: IntNode? = list // Points to sentinel
        var nextNode: IntNode? = list!!.next // Points to first node
        // Connect new node after sentinel node
        prevNode!!.next = newNode
        newNode.previous = prevNode
        newNode.next = nextNode
        nextNode!!.previous = newNode
        // Increment size
        ++size
    }

    fun removeFront(): Int? {
        // TODO
        return null
    }

//    fun isEmpty(): Boolean = // TODO

    // index belongs to [0, size]
    fun insert(v: Int, index: Int) {
        // TODO
    }
}

















