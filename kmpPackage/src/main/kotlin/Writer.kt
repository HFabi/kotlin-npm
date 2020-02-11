class Writer {

    @JsName("writeToConsole")
    fun writeToConsole(message: String) {
        println(message)
    }

    @JsName("helloWorld")
    fun helloWorld() {
        println("Hello World!")
    }

    @JsName("append")
    fun append(message: String) {
        println("Hello $message")
    }
}