// const falar = {
//   falar() {
//     console.log(`${this.nome} está falando.`)
//   },
// }
//
// const comer = {
//   comer() {
//     console.log(`${this.nome} está comendo.`)
//   },
// }
//
// const beber = {
//   beber() {
//     console.log(`${this.nome} está bebendo.`)
//   },
// }
//
// // const pessoaPrototype = { ...falar, ...comer, ...beber }
// const pessoaPrototype = Object.assign({}, falar, comer, beber)
//
// function criaPessoa(nome, sobrenome) {
//   return Object.create(pessoaPrototype, {
//     nome: { value: nome },
//     sobrenome: { value: sobrenome },
//   })
// }
//
// const p1 = criaPessoa('Lucas', 'Martins')
// const p2 = criaPessoa('Thiago', 'M.')
// console.log(p2)

// Map

const pessoas = [
  { id: 3, nome: 'Luiz' },
  { id: 2, nome: 'Maria' },
  { id: 1, nome: 'Helena' },
]

// const novasPessoas = {}
//
// for (const { id, nome } of pessoas) {
//  class Pessoa {
//   constructor(nome, sobrenome) {
//     this.nome = nome;
//     this.sobrenome = sobrenome;
//   }
//  novasPessoas[id] = { id, nome}
// }

const novasPessoas = new Map()
for (const pessoa of pessoas) {
  const { id } = pessoa
  novasPessoas.set(id, { ...pessoas })
}

for (const pessoas of novasPessoas.keys()) {
  console.log(pessoas)
}

novasPessoas.delete(2)
console.log(novasPessoas)
