function decorator(
  classProtoype: any,
  nameMethod: string | symbol,
  index: number
): any {
  console.log(classProtoype)
  console.log(nameMethod)
  console.log(index)
  return 'Something'
}

export class Person {
  name: string
  surname: string
  age: number

  constructor(name: string, surname: string, age: number) {
    this.name = name
    this.surname = surname
    this.age = age
  }

  method(@decorator msg: string): string {
    return `${this.name} ${this.surname}: ${msg}`
  }

  get fullName(): string {
    return `${this.name} + ' ' + ${this.surname}`
  }

  set fullName(value: string) {
    const words = value.split(/\s+/g)
    const firstName = words.shift()
    if (!firstName) return
    this.name= firstName
    this.surname= words.join(' ')
  }
}

const person = new Person('Lucas', 'Martins', 19)
// person.method = () => 'HIIIIIIIIIIIIIIII'
const method = person.method('PALMEIRAS')
console.log(method)
