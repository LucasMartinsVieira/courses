// const pessoa = {
//   nome: 'Lucas',
//   sobrenome: 'Martins',
// }

// const pessoa1 = new Object();
// pessoa1.nome = 'Thiago';
// pessoa1.sobrenome = 'Martins';
// pessoa1.idade = 23;
// pessoa1.falarNome = function() {
//   return(`${this.nome} está falando seu nome.`);
// }
// pessoa1.getDataNascimento = function() {
//   const dataAtual = new Date();
//   return dataAtual.getFullYear() - this.idade;
// }
//
// for (let chave in pessoa1) {
//   console.log(pessoa1[chave])
// }

// delete pessoa1.nome
// console.log(pessoa1.falarNome())
// console.log(pessoa1.getDataNascimento())

// console.log(pessoa, pessoa1);

// const chave = 'nome';
// console.log(pessoa.nome);
// console.log(pessoa.sobrenome);
// console.log(pessoa['sobrenome']);
// console.log(pessoa[chave]);

// Factory function / Construct functions / Classe

// function criaPessoa(nome, sobrenome) {
// function criaPessoa(nome, sobrenome) {
//   return {
//     nome,
//     sobrenome,
//     get nomeCompleto() {
//       return `${this.nome} ${this.sobrenome}`
//     }
//   };
// }
//
// const p1 = criaPessoa('Lucas', 'Martins');
// console.log(p1.nomeCompleto);

function Pessoa(nome, sobrenome) {
  this.nome = nome
  this.sobrenome = sobrenome

  Object.freeze(this)
}

const p1 = new Pessoa('Lucas', 'Martins')
delete p1.nome
const p2 = new Pessoa('Thiago', 'Martins')
console.log(p1)
console.log(p2)

// const p2 = {};
// p2.nome = 'Thiago'
// p2.sobrenome = 'Martins'
