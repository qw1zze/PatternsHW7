package Visitor

class RoundNode: Node() {
    override fun accept(visitor: Visitor) {
        visitor.visitRound(this)
    }
}