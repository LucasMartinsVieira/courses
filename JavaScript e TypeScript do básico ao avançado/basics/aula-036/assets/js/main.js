const frutas = [ 'Pera', 'Maça', 'Uva' ];

// for (let i = 0; i < frutas.length; i++) {
//   console.log(frutas[i]);
// }

const pessoa = {
  nome: 'Lucas',
  sobrenome: 'Martins',
  idade: 19
};

// const chave = 'nome';
// console.log(pessoa.nome);
// console.log(pessoa[chave]);

// for (let i in frutas) {
//   console.log(frutas[i]);
// }

for (let chave in pessoa) {
  console.log(chave, pessoa[chave])
}
