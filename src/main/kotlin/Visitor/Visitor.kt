package Visitor

interface Visitor {
    fun visitRound(node: RoundNode)
    fun visitSquare(node: SquareNode)
    fun visitCurly(node: CurlyNode)
}