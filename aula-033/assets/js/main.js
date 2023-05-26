const pessoa = {
  nome: 'Lucas',
  sobrenome: 'Martins',
  idade: 19,
  endereco: {
    rua: 'Av Brasil',
    numero: 320,
  }
};

// const { nome, sobrenome, endereco: { rua: r = 123, numero}, endereco} = pessoa;
// console.log(nome, sobrenome, r, numero, endereco);

const { nome, ...resto } = pessoa;
console.log(resto);
