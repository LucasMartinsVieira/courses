type Age = number;
type Person = {
  name: string,
  age: Age,
  salary: number,
  preferedColor?: string
}

type ColorRGB = 'Red' | 'Green' | 'Blue'
type ColorCMYK = 'Cyan' | 'Magenta' | 'Yellow' | 'Black'
type PreferedColor = ColorRGB | ColorCMYK

const person: Person = {
  name: 'Lucas',
  age: 19,
  salary: 200_000, // 200000
}

export function setPreferedColor(person: Person, color: PreferedColor): Person {
  return { ...person, preferedColor: color }
}

console.log(setPreferedColor(person, 'Blue'))
console.log(person)

export default 1
