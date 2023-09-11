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
  getFullName(): string {
    return 'This comes from Student' + this.name + ' ' + this.surname
  }
}

export class Client extends Person {
  getFullName(): string {
    return 'This comes from Client' + this.name + ' ' + this.surname
  }
}

const person = new Person('Lucas', 'Martins', 19, '000.000.000-00')
const student = new Student('Lucas', 'Martins', 19, '000.000.000-00')
const client = new Client('Lucas', 'Martins', 19, '000.000.000-00')

console.log(person.getFullName())
console.log(student.getFullName())
console.log(client.getFullName())
