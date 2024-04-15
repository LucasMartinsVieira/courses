// 1 - void function
var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
function withoutReturn() {
    console.log("returns void");
}
withoutReturn();
// 2 - callback as a argument
function greeting(name) {
    return "Hello, ".concat(name);
}
function preGreeting(f, userName) {
    console.log("Preparing function!");
    var greet = f(userName);
    console.log(greet);
}
preGreeting(greeting, "Lucas");
// 3 - Generic function
function firstElement(arr) {
    return arr[0];
}
console.log(firstElement([1, 2, 3]));
console.log(firstElement([true, false, false]));
console.log(firstElement(["Sisleide", "Thiago", "Lucas"]));
function mergeObj(obj1, obj2) {
    return __assign(__assign({}, obj1), obj2);
}
var newObj = mergeObj({ name: "Lucas" }, { age: 20, job: "developer" });
console.log(newObj);
// 4 - constraints
function biggestNumber(a, b) {
    var biggest;
    if (+a > +b) {
        biggest = a;
    }
    else {
        biggest = b;
    }
    return biggest;
}
console.log(biggestNumber(5, 2));
console.log(biggestNumber("10", "5"));
// 5 - Especify argument type
function mergeArrays(arr1, arr2) {
    return arr1.concat(arr2);
}
console.log(mergeArrays([1, 2, 3], [4, 5, 6]));
console.log(mergeArrays([1, 2, 3], ["teste"]));
// 6 - optional parameters
function modernGreet(name, greet) {
    if (greet) {
        return "Hello ".concat(greet, " ").concat(name, ", how you doing?");
    }
    return "Hello ".concat(name);
}
console.log(modernGreet("Lucas"));
console.log(modernGreet("Lucas", "Sr."));
// 7 - default parameter
function defaultParam(n, m) {
    if (m === void 0) { m = 10; }
    return n + m;
}
console.log(defaultParam(2));
console.log(defaultParam(2 + 5));
// 8 - unknown
function doSomething(x) {
    if (typeof x === "number") {
        console.log("É um número!");
    }
    else {
        console.log("Não é um número!");
    }
}
doSomething(1);
doSomething("true");
// 9 - never
function showErrorMsg(msg) {
    throw new Error(msg);
}
// showErrorMsg("Vish...");
// 10 - rest operator as a param
function sumAll() {
    var n = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        n[_i] = arguments[_i];
    }
    return n.reduce(function (number, sum) { return sum + number; });
}
console.log(sumAll(1, 2, 3, 4, 5));
console.log(sumAll(5, 5, 10));
// 11 - destructuring
function showProductDetails(_a) {
    var name = _a.name, price = _a.price;
    return "O nome do produto \u00E9 ".concat(name, " e o seu pre\u00E7o \u00E9 R$").concat(price);
}
var shirt = { name: "T-Shirt", price: 59.99 };
console.log(showProductDetails(shirt));
