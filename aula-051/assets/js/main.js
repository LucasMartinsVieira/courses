// function soma(a, b) {
//   return a + b
// }

// document.addEventListener('click', () => {
//   document.body.style.backgroundColor = 'green';
// })

// function criaPessoa(nome, sobrenome) {
//   return {
//     // nome: nome, sobrenome: sobrenome
//     nome, sobrenome
//   };
// }
//
// const p1 = criaPessoa('Lucas', 'Martins');
// const p2 = {
//   nome: 'Thiago',
//   sobrenome: 'Martins'
// }
// console.log(p1);
// console.log(p2);

// function falaFrase(comeco) {
//   function falaResto(resto) {
//     return comeco + ' ' + resto
//   }
//   return falaResto
// }
//
// const olaMundo = falaFrase('Olá');
// console.log(olaMundo('Mundo!'));

// function duplica(n) {
//   return n * 2;
// }
//
// function triplica(n) {
//   return n * 3;
// }
//
// function quadriplica(n) {
//   return n * 4;
// }

function criaMultiplicador(multiplicador) {
  return function(n) {
    return n * multiplicador;
  };
}

const duplica = criaMultiplicador(2);
const triplica = criaMultiplicador(3);
const quadriplica = criaMultiplicador(4);

console.log(duplica(2));
console.log(triplica(2));
console.log(quadriplica(2));
