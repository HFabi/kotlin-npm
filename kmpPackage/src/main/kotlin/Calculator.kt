/**
 * Calculator
 */
class Calculator {

    val PI = kotlin.math.PI

    @JsName("add")
    fun add(a: Int, b: Int) = a + b

    @JsName("subtract")
    fun subtract(a: Int, b: Int) = a - b

    @JsName("multiply")
    fun multiply(a: Int, b: Int) = a * b

    @JsName("divide")
    fun divide(a: Int, b: Int) = a / b

}





