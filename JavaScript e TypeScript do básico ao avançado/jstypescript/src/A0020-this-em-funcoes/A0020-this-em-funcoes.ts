export function fn(this: Date, name: string, age: number): void {
  console.log(this)
  console.log(name, age)
}

fn.call(new Date(), 'Lucas', 19)
fn.apply(new Date(), ['Lucas', 19])
