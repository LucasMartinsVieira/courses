// Array<T> - T[]
export function multiplyArgs(...args: Array<number>): number {
  return args.reduce((acc, value) => acc * value, 1)
}

export function toUpperCase(...args: string[]): string[] {
  return args.map(value => value.toUpperCase())
}

const result = multiplyArgs(1, 2, 3)
const concatResult = toUpperCase('a', 'b', 'c');

console.log(result, concatResult)
