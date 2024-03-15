package Visitor

class Transformer: Visitor {
    private val tree: MutableList<Node> = mutableListOf()

    override fun visitRound(node: RoundNode) {
        tree.add(RoundNode())
    }

    override fun visitSquare(node: SquareNode) {
        tree.add(SquareNode())
    }

    override fun visitCurly(node: CurlyNode) {
        val squareBracketNode = SquareNode()
        node.children.forEach { it.accept(this) }
        squareBracketNode.children.addAll(tree)
        tree.clear()
        tree.add(squareBracketNode)
    }

    fun getTree(): List<Node> {
        return tree
    }
}