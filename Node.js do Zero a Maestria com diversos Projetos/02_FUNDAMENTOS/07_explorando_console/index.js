const x = 10
const y = 'Some text'
const z = [1, 2, 3]

console.log(x, y, z)

// Counting of values
console.count(`O valor de x é: ${x}, count`)
console.count(`O valor de x é: ${x}, count`)
console.count(`O valor de x é: ${x}, count`)
console.count(`O valor de x é: ${x}, count`)

// Variables between strings
console.log('%s', y)

// Clean console
setTimeout(() => {
  console.clear()
}, 2000)
