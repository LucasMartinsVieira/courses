function decorator(classPrototype: any, name: string | symbol): any {
  let valueProperty: any
  return {
    get: () => valueProperty,
    set: (value: any) => {
      if (typeof value === 'string') {
        valueProperty = value.split('').reverse().join('')
      }
      valueProperty = value
    },
  }
}

export class Person {
  @decorator
  name: string
  @decorator
  surname: string
  @decorator
  age: number

  constructor(name: string, surname: string, age: number) {
    this.name = name
    this.surname = surname
    this.age = age
  }

  method(msg: string): string {
    return `${this.name} ${this.surname}: ${msg}`
  }

  get fullName(): string {
    return `${this.name} + ' ' + ${this.surname}`
  }

  set fullName(value: string) {
    const words = value.split(/\s+/g)
    const firstName = words.shift()
    if (!firstName) return
    this.name = firstName
    this.surname = words.join(' ')
  }
}

const person = new Person('Lucas', 'Martins', 19)
// person.method = () => 'HIIIIIIIIIIIIIIII'
const method = person.method('PALMEIRAS')
console.log(method)
