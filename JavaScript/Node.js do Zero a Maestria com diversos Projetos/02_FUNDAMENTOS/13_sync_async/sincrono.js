const fs = require('fs')

console.log('Início')

fs.writeFileSync('arquivo.txt', 'hi')

console.log('Fim')
