// 3 - generics
function showData<T>(arg: T): string {
	return `The data is ${arg}`;
}

console.log(showData(5));
console.log(showData("Testing generic"));
console.log(showData(true));
console.log(showData(["test"]));

// 2 - generic constraints
function showProductName<T extends { name: string }>(obj: T) {
	return `The product name is ${obj.name}`;
}

const myObj = { name: "Door", color: "White" };
const otherProduct = { name: "Car", wheels: 4, engine: 1.0 };
const thirdObj = { price: 19.99, category: "Clothe" };

console.log(showProductName(myObj));
console.log(showProductName(otherProduct));

// console.log(showProductName(thirdObj));

// 3 - generics + interfaces
interface MyObject<T, U, Q> {
	name: string;
	wheels: T;
	engine: U;
	color: Q;
}

type Car = MyObject<number, number, string>;
type Pen = MyObject<boolean, boolean, string>;

const myCar: Car = { name: "Fusca", wheels: 4, engine: 1.0, color: "White" };
const myPen: Pen = { name: "Bic", wheels: false, engine: false, color: "Blue" };

console.log(myCar);
console.log(myPen);

// 4 - Type parameters
// function getSomeKey<T, K extends keyof T>(obj: T, key: K) {
// 	return `The key ${key} is on the object e has the value of ${obj[key]}`;
// }

function getSomeKey<T, K extends keyof T>(obj: T, key: K) {
	return `A chave ${String(key)} tem o valor ${obj[key]}`;
}

const server = {
	hd: "2TB",
	ram: "32GB",
};

console.log(getSomeKey(server, "ram"));
// console.log(getSomeKey(server, "test"));

// 5 - keyof type operator
type Character = { name: string; age: number; hasDriveLicense: boolean };
type C = keyof Character;

function showCharName(obj: Character, name: C): string {
	return `${obj[name]}`;
}

const myChar: Character = {
	name: "Lucas",
	age: 20,
	hasDriveLicense: true,
};

console.log(showCharName(myChar, "name")); // console.log(showCharName(myChar, "test"));

// 6 - typeof type operator
const userName: string = "Lucas";

const userName2: typeof userName = "Thiago";

// const userName3: typeof userName = 14;

type x = typeof userName;

const userName4: x = "Sisleide";

// 7 - indexed access type
type Truck = { km: number; kg: number; description: string };

type Km = Truck["km"];

const newTruck: Truck = {
	km: 10000,
	kg: 5000,
	description: "Little truck",
};

function showKm(km: Km) {
	console.log(`The vehicle has a km of: ${km}`);
}

showKm(newTruck.km);

const newCar = {
	km: 5000,
	kg: 1000,
};

showKm(newCar.km);

// 8 - conditional type
interface A {}
interface B extends A {}
interface Teste {
	showName(): string;
}

type myType = B extends A ? number : string;

const someVar: myType = 5;
// const someVar2: MyType = "test";
type myTypeB = Teste extends { showName(): string } ? string : boolean;

// 9 - template literal types
type testA = "text";

type CustomType = `some ${testA}`;

const testing1: CustomType = "some text";
// const testing2: CustomType = "some text 2";

type a1 = "Testando";
type a2 = "Union";
type a3 = `${a1}` | `${a2}`;
