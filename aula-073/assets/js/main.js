// const produto = { nome: 'Produto', preco: 1.8 }
// const caneca = { ...produto,
//   material: 'porcelana',
// }
// const caneca = Object.assign({}, produto, { material: 'porcelana' });
// const caneca = { nome: produto.nome, preco: produto.preco }
//
// caneca.nome = 'Lucas Martins'
// caneca.preco = 2.5
//
// console.log(produto)
// console.log(caneca)

const produto = { nome: 'Produto', preco: 1.8 }
// Object.defineProperty(produto, 'nome', {
//   writable: false,
//   configurable: false,
//   value: 'Qualquer outra coisa',
// })
// console.log(Object.getOwnPropertyDescriptor(produto, 'nome'))
// console.log(Object.values(produto))
// console.log(Object.entries(produto))
// console.log(produto)

// for (let [chave, valor] of Object.entries(produto)) {
for (let valor of Object.entries(produto)) {
  // console.log(chave, valor)
  console.log(valor[0], valor[1])
}
