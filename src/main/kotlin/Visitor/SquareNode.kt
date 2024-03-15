package Visitor

class SquareNode: Node() {
    val children: MutableList<Node> = mutableListOf()

    override fun accept(visitor: Visitor) {
        visitor.visitSquare(this)
    }
}