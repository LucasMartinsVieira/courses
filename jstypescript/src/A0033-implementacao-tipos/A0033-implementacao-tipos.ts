type TypeName = {
  name: string
}

type TypeSurname = {
  surname: string
}

type TypeFullName = {
  fullName: () => string
}

export class Person implements TypeName, TypeSurname, TypeFullName {
  constructor(public name: string, public surname: string) {}

  fullName(): string {
    return this.name + ' ' + this.surname
  }
}

const person = new Person('Lucas', 'Martins')
console.log(person.fullName())
