let x = 10
x = 0b1010
const y  = 10;
let a = 100 as const

const person = {
  name: 'Lucas' as const,
  surname: 'Martins',
}

function chooseColor(color: 'Red' | 'Yellow' | 'Blue') {
  return color
}

console.log(chooseColor('Yellow'))

// person.name = 'Thiago'

// Module mode
export default 1;
