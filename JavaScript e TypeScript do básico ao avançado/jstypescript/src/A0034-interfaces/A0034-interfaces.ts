interface TypeName {
  name: string
}

interface TypeSurname {
  surname: string
}

interface TypeFullName {
  fullName(): string
}

type TypePerson = TypeName & TypeSurname & TypeFullName
interface TypePerson2 extends TypeName, TypeSurname, TypeFullName { }

export class Person implements TypePerson2 {
  constructor(public name: string, public surname: string) { }

  fullName(): string {
    return this.name + ' ' + this.surname
  }
}

const personObj: TypePerson2 = {
  name: "Lucas",
  surname: "Martins",
  fullName(): string {
    return this.name + ' ' + this.surname
  }
}

const person = new Person('Lucas', 'Martins')
console.log(person.fullName())
console.log(personObj.fullName())
