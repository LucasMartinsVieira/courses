const fs = require('fs').promises

module.exports = (caminho, dados) => {
  fs.writeFile(caminho, dados, { flag: 'w', encoding: 'utf8' })
}

// fs.writeFile(caminhoArquivo, 'Frase 1\n', { flag: 'a', encoding: 'utf8' })
