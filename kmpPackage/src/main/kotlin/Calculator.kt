/**
 * Calculator
 */
class Calculator {

    val PI = kotlin.math.PI

    @JsName("add")
    fun add(a: Int, b: Int) = a + b

    @JsName("subtract")
    fun subtract(a: Int, b: Int) = a - b

    fun multiply(a: Int, b: Int) = a * b

    fun divide(a: Int, b: Int) = a / b

    private fun helper() {
        // empty
    }
}





