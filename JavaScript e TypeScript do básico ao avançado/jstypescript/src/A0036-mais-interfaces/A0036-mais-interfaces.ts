// Declaration merging
interface Person {
  name: string
}

interface Person {
  readonly surname: string
  readonly adresses: readonly string[]
  readonly age?: number
}

export const person: Person = {
  name: 'Lucas',
  surname: "Martins",
  adresses: ['Av. Brasil'],
  age: 19,
}

console.log(person)
