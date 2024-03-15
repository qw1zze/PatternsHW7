package Visitor

fun main() {
    println("Введите выражение:")
    val input= readLine() ?: ""

    val root = CurlyNode()
    val first_square = SquareNode()
    val first_round = RoundNode()
    val furst_curly = CurlyNode()
    val second_round = RoundNode()
    val third_round = RoundNode()

    root.children.add(first_square)
    first_square.children.add(first_round)
    first_square.children.add(furst_curly)
    first_square.children.add(third_round)
    furst_curly.children.add(second_round)

    val transformer = Transformer()

    root.accept(transformer)

    val res = convert(transformer.getTree())
    println("Результат: $res")
}

fun convert(list: List<Node>): String {
    val res = StringBuilder()
    list.forEach { node ->
        when (node) {
            is RoundNode -> res.append("()")
            is SquareNode -> res.append("[]")
            is CurlyNode -> res.append("{}")
        }
    }
    return res.toString()
}