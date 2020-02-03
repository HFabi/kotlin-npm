const kmppackage = require('kmppackage')

var msg = 'Hello App';
console.log(msg)

kmppackage.helloMessage("Hello Package")
console.log(kmppackage.b)

var calculator = new kmppackage.Calculator()
console.log(calculator)
console.log(calculator.add(1,1))
console.log(calculator.subtract(2,1))
//console.log(calculator.multiply(2,3))
//console.log(calculator.divide(2,2))
console.log(calculator.PI)

