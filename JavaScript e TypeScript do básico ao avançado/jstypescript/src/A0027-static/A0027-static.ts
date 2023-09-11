export class Person {
  static standardAge = 0
  static standardId = '000.000.000-00'


  constructor(
    public name: string,
    public surname: string,
    public age: number,
    public id: string
  ) {}

  normalMethod(): void {
    console.log(Person.standardAge, Person.standardId)
  }

  static createPerson(name: string, surname: string): Person {
    return new Person(name, surname, Person.standardAge, Person.standardId)
  }
}

const person1 = new Person('Lucas', 'Martins', 19, '123.456.798-00')
const person2 = Person.createPerson('Thiago', 'Martins')
console.log(person1)
console.log(person2)
person1.normalMethod()
console.log(Person.standardAge, Person.standardId)
