type MyType = number

export const arrayNumbers: Array<number> = [1, 2, 3, 4, 5, 6]
console.log(arrayNumbers)

export async function promiseAsync() {
  return 1
}

export function myPromise(): Promise<MyType | number> {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(1)
    }, 1000)
  })
}

promiseAsync().then((result) => console.log(result + 1))
myPromise().then((result) => console.log(result + 1))
