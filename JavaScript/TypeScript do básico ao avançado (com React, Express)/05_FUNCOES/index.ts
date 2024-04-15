// 1 - void function

function withoutReturn(): void {
	console.log("returns void");
}

withoutReturn();

// 2 - callback as a argument
function greeting(name: string): string {
	return `Hello, ${name}`;
}

function preGreeting(f: (name: string) => string, userName: string) {
	console.log("Preparing function!");

	const greet = f(userName);

	console.log(greet);
}

preGreeting(greeting, "Lucas");

// 3 - Generic function
function firstElement<T>(arr: T[]): T {
	return arr[0];
}

console.log(firstElement([1, 2, 3]));
console.log(firstElement([true, false, false]));
console.log(firstElement(["Sisleide", "Thiago", "Lucas"]));

function mergeObj<U, T>(obj1: U, obj2: T): U & T {
	return {
		...obj1,
		...obj2,
	};
}

const newObj = mergeObj({ name: "Lucas" }, { age: 20, job: "developer" });
console.log(newObj);

// 4 - constraints
function biggestNumber<T extends number | string>(a: T, b: T): T {
	let biggest: T;

	if (+a > +b) {
		biggest = a;
	} else {
		biggest = b;
	}

	return biggest;
}

console.log(biggestNumber(5, 2));
console.log(biggestNumber("10", "5"));

// 5 - Especify argument type
function mergeArrays<T>(arr1: T[], arr2: T[]): T[] {
	return arr1.concat(arr2);
}

console.log(mergeArrays([1, 2, 3], [4, 5, 6]));
console.log(mergeArrays<number | string>([1, 2, 3], ["teste"]));

// 6 - optional parameters
function modernGreet(name: string, greet?: string): string {
	if (greet) {
		return `Hello ${greet} ${name}, how you doing?`;
	}

	return `Hello ${name}`;
}

console.log(modernGreet("Lucas"));
console.log(modernGreet("Lucas", "Sr."));

// 7 - default parameter
function defaultParam(n: number, m = 10): number {
	return n + m;
}

console.log(defaultParam(2));
console.log(defaultParam(2 + 5));

// 8 - unknown
function doSomething(x: unknown) {
	if (typeof x === "number") {
		console.log("É um número!");
	} else {
		console.log("Não é um número!");
	}
}

doSomething(1);
doSomething("true");

// 9 - never
function showErrorMsg(msg: string): never {
	throw new Error(msg);
}

// showErrorMsg("Vish...");

// 10 - rest operator as a param
function sumAll(...n: number[]): number {
	return n.reduce((number, sum) => sum + number);
}

console.log(sumAll(1, 2, 3, 4, 5));
console.log(sumAll(5, 5, 10));

// 11 - destructuring
function showProductDetails({
	name,
	price,
}: { name: string; price: number }): string {
	return `O nome do produto é ${name} e o seu preço é R$${price}`;
}

const shirt = { name: "T-Shirt", price: 59.99 };
console.log(showProductDetails(shirt));
