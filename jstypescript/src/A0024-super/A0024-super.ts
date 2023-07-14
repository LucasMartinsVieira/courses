export class Person {
  constructor(public name: string, public surname: string, private age: number, protected id: string) {}

  getAge(): number {
    return this.age
  }

  getId(): string {
    return this.id
  }

  getFullName(): string {
    return this.name + ' ' + this.surname
  }
}

export class Student extends Person {
  constructor(name: string, surname: string, age: number, id: string, public classRoom: string) {
    super(name, surname, age, id)
  }

  getFullName(): string {
    console.log('Doing something before')
    const result =  super.getFullName()
    return result + ' HEYYYYYY'
  }
}

export class Client extends Person {
  getFullName(): string {
    return 'This comes from Client' + this.name + ' ' + this.surname
  }
}

const person = new Person('Lucas', 'Martins', 19, '000.000.000-00')
const student = new Student('Lucas', 'Martins', 19, '000.000.000-00', '0001')
const client = new Client('Lucas', 'Martins', 19, '000.000.000-00')

// console.log(person.getFullName())
// console.log(student.getFullName())
// console.log(client.getFullName())

console.log(student)
