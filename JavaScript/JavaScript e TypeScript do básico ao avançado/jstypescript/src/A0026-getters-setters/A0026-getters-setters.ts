export class Person {
  constructor(
    private name: string,
    private surname: string,
    private age: number,
    private _id: string
  ) {
    this.id = _id
  }

  set id(id: string) {
    console.log('SETTER CALLED')
    this._id = id
  }

  get id(): string {
    console.log('GETTER CALLED')
    return this._id.replace(/\D/g, '')
  }
}

const person = new Person('Lucas', 'Martins', 19, '123.456.798-00')
person.id = '123.456.798-99'
console.log(person.id)
