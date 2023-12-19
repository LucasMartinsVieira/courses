const path = require('path')

// Absolute path
console.log(path.resolve('test.txt'))

// Form a path
const midFolder = 'essays'
const fileName = 'lucas.txt'

const finalPath = path.join('/', 'archives', midFolder, fileName)

console.log(finalPath)
