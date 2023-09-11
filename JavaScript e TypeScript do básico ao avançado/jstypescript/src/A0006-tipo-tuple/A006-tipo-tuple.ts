// Tuple
const clientData1: readonly [number, string] = [1, 'Lucas']
const clientData2: [number, string, string] = [1, 'Lucas', 'Martins']
const clientData3: [number, string, string?] = [1, 'Lucas', 'Martins']
const clientData4: [number, string, ...string[]] = [1, 'Lucas', 'Martins']

// clientData1[0] = 100
// clientData1[1] = 'Carolina'
// clientData1.pop()

console.log(clientData1)
console.log(clientData2)
console.log(clientData3)
console.log(clientData4)

// Readonly Array
const array1: readonly string[] = ['Lucas', 'Martins', 'Vieira']
const array2: ReadonlyArray<string> = ['Lucas', 'Martins', 'Vieira']

console.log(array1)
console.log(array2)
