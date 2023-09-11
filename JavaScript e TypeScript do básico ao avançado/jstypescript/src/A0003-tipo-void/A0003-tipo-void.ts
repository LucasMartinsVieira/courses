function withoutReturn(...args: string[]): void {
  console.log(args.join(' '))
}

const person = {
  name: 'Lucas',
  surname: 'Martins',

  showName(): void {
    console.log(this.name + ' ' + this.surname);
  }
}

withoutReturn('Lucas', 'Martins')
person.showName();

export { person }
