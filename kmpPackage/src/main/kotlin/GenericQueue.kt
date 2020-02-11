class GenericQueue<T>(val name: String) {

    private var elements: MutableList<T> = mutableListOf()

    @JsName("addElement")
    fun addElement(element: T) {
        elements.add(element)
    }

    @JsName("nextElement")
    fun nextElement(): T? {
        return if (hasNextElement()) {
            elements.removeAt(0)
        } else {
            null
        }
    }

    @JsName("hasNextElement")
    fun hasNextElement(): Boolean = elements.size > 0
}