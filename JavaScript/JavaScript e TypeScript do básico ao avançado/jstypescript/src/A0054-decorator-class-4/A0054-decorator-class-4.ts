interface Constructor {
  new(...args: any[]): any
}

function reverseNameAndColor(param1: string, param2: string) {
  // Closure
  return function(target: Constructor) {
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

function anotherDecorator(param1: string) {
  return function anotherDecorator(target: Constructor) {
    console.log('I am the second DECORATOR ' + param1 )
    return target
  }
}

@anotherDecorator('The param of the anotherDecorator') // 2
@reverseNameAndColor('Value1', 'Value2') // 1
export class Animal {
  constructor(public name: string, public color: string) {
    console.log('I am the Class')
  }
}

const animal = new Animal('capybara', 'purple')
console.log(animal)
