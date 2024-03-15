package Memento

import java.util.Stack

data class Text(val text:String)

class TextEditor {
    private var text: String = ""
    private val file: Stack<Text> = Stack()

    fun add(text: String) {
        file.push(Text(text))
        this.text = text
    }

    fun edit(text: String) {
        if (file.isNotEmpty()) {
            file.push(Text(text))
            this.text = text
        } else {
            println("Нет текста для изменения")
        }
    }

    fun watch() {
        println(text)
    }

    fun cancel() {
        if (file.isNotEmpty()) {
            text = file.pop().text
            print("Отмена произведена")
        } else {
            println("Нет изменений")
        }
    }
}