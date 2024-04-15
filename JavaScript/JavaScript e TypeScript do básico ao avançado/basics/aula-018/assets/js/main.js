// const nome01 = 'Lucas';
// const sobrenome01 = 'Vieira';
// const idade01 = 19;
//
// const nome02 = 'Maria';
// const sobrenome02 = 'Oliveira';
// const idade02 = 39;

// const pessoa1 = {
//   nome: 'Lucas',
//   sobrenome: 'Vieira',
//   idade: 19
// };
//
// const pessoa2 = {
//   nome: 'Maria',
//   sobrenome: 'Oliveira',
//   idade: 39
// };
//

//                  Paramêtro
// function criaPessoa(nome, sobrenome, idade) {
//   return {
//     // nome: nome,
//     // sobrenome: sobrenome,
//     // idade: idade
//     nome,
//     sobrenome,
//     idade,
//   };
// }

//                         Argumentos
// const pessoa1 = criaPessoa('Lucas', 'Vieira', 19);
// const pessoa2 = criaPessoa('Maria', 'Oliveira', 29);
// const pessoa3 = criaPessoa('João', 'Otávio', 82);
// const pessoa4 = criaPessoa('Juan', 'Lara', 12);
// const pessoa5 = criaPessoa('Eduardo', 'Moreira', 20);
//
// console.log(pessoa2.nome, pessoa2.sobrenome,pessoa2.idade);

const pessoa1 = {
  nome: 'Lucas',
  sobrenome: 'Vieira',
  idade: 19,

  fala() {
    // console.log('Hello, World!');
    console.log(`${this.nome} ${this.sobrenome} says hello...`);
    console.log(`He's only ${this.idade}...`);
  },

  incrementaIdade() {
    this.idade++;
  }
};

pessoa1.fala();
pessoa1.incrementaIdade();
pessoa1.fala();
pessoa1.incrementaIdade();
pessoa1.fala();
pessoa1.incrementaIdade();
pessoa1.fala();
