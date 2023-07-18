namespace MyNamespace {
  export const nameNamespace = 'Lucas'

  export class PersonNamespace {
    constructor(public name: string) { }
  }

  const personNamespace = new PersonNamespace('Lucas')
  console.log(personNamespace)

  export namespace AnotherNamespace {
    export const nameNamespace = 'Name in another namespace'
  }
}

const PersonNamespace = new MyNamespace.PersonNamespace('Lucas')
console.log(PersonNamespace)
console.log(MyNamespace.nameNamespace)
console.log(MyNamespace.AnotherNamespace.nameNamespace)

export default 1
