const kmppackage = require('kmppackage')

/* ------------------------------------------------- */

console.log(kmppackage.outsideClassVariable)
kmppackage.outsideClassFunction("outside class")
console.log("\n")

/* ------------------------------------------------- */

const writer = new kmppackage.Writer()
writer.writeToConsole("Hello Writer")
writer.helloWorld()
writer.append("Kotlin")
console.log("\n")

/* ------------------------------------------------- */

const visibility = new kmppackage.Visibility()
//visibility.privateFunction() // visibility.privateFunction is not a function
//visibility.protectedFunction() // visibility.protectedFunction is not a function
//visibility.internalFunction() // visibility.internalFunction is not a function
visibility.publicFunction()

visibility.privateFunctionWithAnnotation()      
visibility.protectedFunctionWithAnnotation()
visibility.internalFunctionWithAnnotation()
visibility.publicFunctionWithAnnotation()
console.log("\n")

/* ------------------------------------------------- */

const types = new kmppackage.Types()
types.myString = "test string"
types.myString = 1234
types.myBoolean = true
types.myBoolean = "Hello world"
types.myInteger = 123
types.myLong = 213
types.myLong = undefined
types.myFloat = 213
types.myDouble = 213

types.myNullableString = "test string"
types.myString = null
types.myNullableString = null

types.myStringArray = ["a","b","c"]

//types.printNames(null)  // Cannot read property 'length' of null
//types.printNamesNullable(null) // Cannot read property 'length' of null
types.printNullable(null)

/* ------------------------------------------------- */

const queue = new kmppackage.GenericQueue()
queue.addElement("a")
queue.addElement(1)
queue.addElement(false)
while (queue.hasNextElement()){
    console.log(queue.nextElement())
}
console.log("\n")

/* ------------------------------------------------- */

const calculator = new kmppackage.Calculator()
console.log(calculator)
console.log(calculator.add(1,1))
console.log(calculator.subtract(2,1))
console.log(calculator.PI)
console.log("\n")

/* ------------------------------------------------- */


