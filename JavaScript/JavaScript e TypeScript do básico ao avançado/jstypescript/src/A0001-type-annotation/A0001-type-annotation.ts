// eslint-disable

// Basic types
let nome: string = 'Lucas'
let idade: number = 19
let adulto: boolean = true
let simbolo: symbol = Symbol('qualque simbolo')
// let big: bigint = 10n

// Arrays
let arrayNumbers: Array<number> = [1, 2, 3]
let arrayNumbers2: number[] = [1, 2, 3]
let arrayStrings: Array<string> = ['a', 'b', 'b']
let arrayStrings2: string[] = ['a', 'b', 'b']

// Objects
let person: { name: string, age: number, adult?: boolean } = {
  name: 'Lucas',
  age: 30,
}

// Functions
function sum(x: number, y: number): number {
  return x + y
}

const sum2: (x: number, y: number) => number = (x, y) => x + y
