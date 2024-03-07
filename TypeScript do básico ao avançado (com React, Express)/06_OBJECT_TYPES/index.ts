// 1 - Object types with interfaces
interface Product {
	name: string;
	price: number;
	isAvailable: boolean;
}

function showProductDetails(product: Product) {
	console.log(
		`The product name is: ${product.name} and his price is ${product.price}`,
	);

	if (product.isAvailable) {
		console.log("The product is available");
	}
}

const product1: Product = {
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

// 2 - Optional property in interface
interface User {
	email: string;
	role?: string;
}

function showUserDetails(user: User) {
	console.log(`The user has the e-mail: ${user.email}`);

	if (user.role) {
		console.log(`The user has this role: ${user.role}`);
	}
}

const user1 = {
	email: "lucas@email.com",
};

const user2 = {
	email: "thiago@email.com",
	role: "Manager",
};

showUserDetails(user1);
showUserDetails(user2);

// 3 - Readonly
interface Car {
	brand: string;
	readonly wheels: number;
}

const fusca: Car = {
	brand: "Volkswagen",
	wheels: 4,
};

// fusca.wheels = 5;

console.log(fusca);

// 4 - Index signature
interface CoorObject {
	[index: string]: number;
}

let coords: CoorObject = {
	x: 10,
};

coords.y = 15;

// coords.z = "test";

console.log(coords);

// 5 - Extending intefaces
interface Human {
	name: string;
	age: number;
}

interface SuperHuman extends Human {
	supowers: string[];
}

const lucas: Human = {
	name: "Lucas",
	age: 20,
};

const peterParker: SuperHuman = {
	supowers: ["Spider"],
	name: "Peter Parker",
	age: 30,
};

console.log(lucas);
console.log(peterParker);

// 6 - Intersection types
interface Character {
	name: string;
}

interface Gun {
	type: string;
	caliber: number;
}

type HumanWithGun = Character & Gun;

const arnoalSchwarzenegger: HumanWithGun = {
	name: "Arnold Schwarzenegger",
	type: "Shotgun",
	caliber: 12,
};

console.log(arnoalSchwarzenegger);

// 7 - Readonly array
let myArray: ReadonlyArray<string> = ["Apple", "Orange", "Banana"];

// myArray[3] = "Papaya";

console.log(myArray);

myArray.forEach((item) => {
	console.log("Fruit: " + item);
});

myArray = myArray.map((item) => {
	return `Fruta: ${item}`;
});

// 8 - Tuples
type fiverNumbers = [number, number, number, number, number];

const myNumberArray: fiverNumbers = [0, 1, 2, 3, 4];
// const myNumberArray2: fiverNumbers = [0, 1, 2, 3, 4, 6];
// const mixedArray: fiverNumbers = ["lll", 1, true, 3, 4, 6];

console.log(myNumberArray);

type nameAndAge = [string, number];

const anotherUser: nameAndAge = ["Lucas", 20];

// anotherUser[0] = 1;

console.log(anotherUser[0]);

// 9 - Readonly tuples
function showNumbers(numbers: readonly [number, number]) {
	// numbers[0] = 10
	console.log(numbers[0]);
	console.log(numbers[1]);
}

showNumbers([1, 2]);
