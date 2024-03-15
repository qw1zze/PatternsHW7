package Visitor

sealed class Node {
    abstract fun accept(visitor: Visitor)
}