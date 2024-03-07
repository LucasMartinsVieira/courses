function showProductDetails(product) {
    console.log("The product name is: ".concat(product.name, " and his price is ").concat(product.price));
    if (product.isAvailable) {
        console.log("The product is available");
    }
}
var product1 = {
    name: "T-Shirt",
    price: 19.99,
    isAvailable: true,
};
showProductDetails(product1);
showProductDetails({
    name: "Cargo Jeans",
    price: 49.99,
    isAvailable: false,
});
function showUserDetails(user) {
    console.log("The user has the e-mail: ".concat(user.email));
    if (user.role) {
        console.log("The user has this role: ".concat(user.role));
    }
}
var user1 = {
    email: "lucas@email.com",
};
var user2 = {
    email: "thiago@email.com",
    role: "Manager",
};
showUserDetails(user1);
showUserDetails(user2);
var fusca = {
    brand: "Volkswagen",
    wheels: 4,
};
// fusca.wheels = 5;
console.log(fusca);
var coords = {
    x: 10,
};
coords.y = 15;
// coords.z = "test";
console.log(coords);
var lucas = {
    name: "Lucas",
    age: 20,
};
var peterParker = {
    supowers: ["Spider"],
    name: "Peter Parker",
    age: 30,
};
console.log(lucas);
console.log(peterParker);
var arnoalSchwarzenegger = {
    name: "Arnold Schwarzenegger",
    type: "Shotgun",
    caliber: 12,
};
console.log(arnoalSchwarzenegger);
// 7 - Readonly array
var myArray = ["Apple", "Orange", "Banana"];
// myArray[3] = "Papaya";
console.log(myArray);
myArray.forEach(function (item) {
    console.log("Fruit: " + item);
});
myArray = myArray.map(function (item) {
    return "Fruta: ".concat(item);
});
var myNumberArray = [0, 1, 2, 3, 4];
// const myNumberArray2: fiverNumbers = [0, 1, 2, 3, 4, 6];
// const mixedArray: fiverNumbers = ["lll", 1, true, 3, 4, 6];
console.log(myNumberArray);
var anotherUser = ["Lucas", 20];
// anotherUser[0] = 1;
console.log(anotherUser[0]);
// 9 - Readonly tuples
function showNumbers(numbers) {
    // numbers[0] = 10
    console.log(numbers[0]);
    console.log(numbers[1]);
}
showNumbers([1, 2]);
