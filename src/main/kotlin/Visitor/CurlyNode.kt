package Visitor

class CurlyNode: Node() {
    val children: MutableList<Node> = mutableListOf()

    override fun accept(visitor: Visitor) {
        visitor.visitCurly(this)
    }
}