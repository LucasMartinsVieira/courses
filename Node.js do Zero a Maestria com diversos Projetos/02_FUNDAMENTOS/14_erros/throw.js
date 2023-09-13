const x = '10'

// Check if 10 is a number

if (!Number.isInteger(x)) {
  throw new Error('The value of x is not a integer!')
}

console.log('Rest of the code')
