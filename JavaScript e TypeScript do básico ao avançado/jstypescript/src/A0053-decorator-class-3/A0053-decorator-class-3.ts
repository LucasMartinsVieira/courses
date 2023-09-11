function reverseNameAndColor(param1: string, param2: string) {
  // Closure
  return function <T extends new (...args: any[]) => any>(target: T) {
    console.log('I am the decorator e i received', target)
    return class extends target {
      name: string
      color: string

      constructor(...args: any[]) {
        super(...args)
        this.name = this.reverse(args[0])
        this.color = this.reverse(args[1])
      }

      reverse(value: string): string {
        return value.split('').reverse().join('') + ' ' + param1 + ' ' + param2
      }
    }
  }
}


@reverseNameAndColor('Value1', 'Value2')
export class Animal {
  constructor(public name: string, public color: string) {
    console.log('I am the Class')
  }
}

const animal = new Animal('capybara', 'purple')
console.log(animal)
