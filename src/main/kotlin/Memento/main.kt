package Memento

import java.util.*

fun main() {
    val editor = TextEditor()
    var input: String?

    while (true) {
        print("Команды add, edit, watch, cancel, exit:")
        input = readLine()

        if (input == "add") {
            println("Введите текст для добавления:")
            val text = readLine() ?: ""
            editor.add(text)
        } else if (input == "edit") {
            println("Введите текст для изменения:")
            val text = readLine() ?: ""
            editor.edit(text)
        } else if (input == "watch") {
            editor.watch()
        } else if (input == "cancel") {
            editor.cancel()
        } else if (input == "exit") {
            break
        } else {
            println("Incorrect input")
        }
    }
}