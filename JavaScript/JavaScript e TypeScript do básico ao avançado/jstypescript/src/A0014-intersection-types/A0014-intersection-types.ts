type HasName = { name: string }
type HasSurname = { surname: string }
type HasAge = { age: number }
type Person = HasName & HasSurname & HasAge // AND

type AB = 'A' | 'B'
type AC = 'A' | 'C'
type AD = 'D' | 'A'

type Intersection = AB & AC & AD

const person: Person = {
  name: 'Lucas',
  surname: 'Martins',
  age: 19,
}

console.log(person)

export { person }
