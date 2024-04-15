// defineProperty defineProperties

function Produto(nome, preco, estoque) {
  this.nome = nome
  this.preco = preco

  Object.defineProperty(this, 'estoque', {
    enumerable: true, // Mostra a chave
    value: estoque, // valor
    writable: false, // Pode alterar
    configurable: false, // configurável
  })

  // Object.defineProperties(this, {
  //   nome: {
  //     enumerable: true, // Mostra a chave
  //     value: nome, // valor
  //     writable: false, // Pode alterar
  //     configurable: false, // configurável
  //   },
  //   preco: {
  //     enumerable: true, // Mostra a chave
  //     value: preco, // valor
  //     writable: false, // Pode alterar
  //     configurable: false, // configurável
  //   },
  // })
}

const p1 = new Produto('Camiseta', 20, 3)
console.log(p1);
// delete p1.estoque
// console.log(Object.keys(p1))

for (let chave in p1) {
  console.log(chave)
}
