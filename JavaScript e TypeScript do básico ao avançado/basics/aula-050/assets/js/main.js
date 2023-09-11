// arguments sustenta todos os argumentos enviados, só com a palavra function

// function funcao(a, b = 2, c = 4) {
//   // let total = 0
//   // for (let argumento of arguments) {
//   //   total += argumento;
//   // }
//   //
//   // console.log(total);
//   // b = b || 0;
//   console.log(a + b + c)
// }
//
// funcao(2, undefined, 20);
// function funcao({ nome, sobrenome, idade }) {
// function funcao([ valor1, valor2, valor3 ]) {
//   console.log(valor1, valor2, valor3);
//   // console.log(nome, sobrenome, idade);
// }
//
// let obj = { nome: 'Lucas', sobrenome: 'Martins', idade: 19 }
// // funcao({ nome: 'Lucas', sobrenome: 'Martins', idade: 19 });
// // funcao(obj);
// funcao(['Lucas', 'Martins', '19']);

// const conta = (operador, acumulador, ...numeros) => {
const conta = (...args) => {
  // console.log(operador, acumulador, numeros);
  // for(let numero of numeros) {
    // if (operador === '+') acumulador += numero;
    // if (operador === '-') acumulador -= numero;
    // if (operador === '/') acumulador /= numero;
    // if (operador === '*') acumulador *= numero;
  // }
    // console.log(operador, acumulador, numeros);
    console.log(...args);

  // console.log(acumulador);
};

conta('+', 1, 20, 30, 40, 50);
