package Iterator

class PersIterator<T>(private val arr: List<T>): Iterator<T> {
    private var ind = 0

    override fun hasNext(): Boolean {
        return arr.isNotEmpty()
    }

    override fun next(): T {
        if (arr.isEmpty()) {
            throw NoSuchElementException()
        }

        val el = arr[ind]
        ind = (ind + 1) % arr.size
        return el
    }
}