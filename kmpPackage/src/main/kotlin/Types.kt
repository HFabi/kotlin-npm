class Types {

    var myString: String = ""
    var myBoolean: Boolean = true
    var myInteger: Int = 10
    var myLong: Long = 100000
    var myFloat: Float = 2f
    var myDouble: Double = 2.0

    var myNullableString: String? = null

    var myStringArray: Array<String> = arrayOf("3", "4", "a")


    @JsName("printNames")
    fun printNames(nameList: Array<String>) {
        nameList.forEach { println(it) }
    }

    @JsName("printNamesNullable")
    fun printNames(nameList: Array<String?>) {
        nameList.forEach { println(it) }
    }

    @JsName("printNullable")
    fun printNames(nameList: Array<String>?) {
        nameList?.forEach { println(it) }
    }
}