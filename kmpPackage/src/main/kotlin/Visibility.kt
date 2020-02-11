class Visibility {

    // variables and constants

    var visibilityVariable: String = "variable"
    val visibilityConstant: String = "constant"

    // kotlin modifier

    private fun privateFunction() {
        println("called private function")
    }

    protected fun protectedFunction() {
        println("called protected function")
    }

    internal fun internalFunction() {
        println("called internal function")
    }

    fun publicFunction() {
        println("called public function")
    }

    // kotlin modifier with js annotation

    @JsName("privateFunctionWithAnnotation")
    private fun privateFunctionWithAnnotation() {
        println("called private function with annotation")
    }

    @JsName("protectedFunctionWithAnnotation")
    protected fun protectedFunctionWithAnnotation() {
        println("called protected function with annotation")
    }

    @JsName("internalFunctionWithAnnotation")
    internal fun internalFunctionWithAnnotation() {
        println("called internal function with annotation")
    }

    @JsName("publicFunctionWithAnnotation")
    fun publicFunctionWithAnnotation() {
        println("called public function with annotation")
    }
}