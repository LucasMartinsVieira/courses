enum Colors {
  RED = 10,
  BLUE = 100,
  YELLOW = 200,
}

enum Colors {
  PURPLE = 'PURPLE',
  GREEN = 201,
  PINK
}

function chooseColor(color: Colors): void {
  console.log(Colors[color])
}

chooseColor(Colors.PURPLE)

// console.log(Colors)
// console.log(Colors.RED)
// console.log(Colors[10])
// console.log(Colors.PURPLE)
