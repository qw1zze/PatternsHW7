package Iterator

import java.util.Timer
import java.util.TimerTask

fun main() {
    val photos = listOf("first", "second", "third", "forth", "fifth")

    val iterator = PersIterator(photos)

    val task = object: TimerTask() {
        override fun run() {
            println(iterator.next())
        }
    }

    val timer = Timer()
    timer.scheduleAtFixedRate(task, 0, 1000)
}