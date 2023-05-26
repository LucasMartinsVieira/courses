// let a = 'A'; // B
// let b = 'B'; // C
// let c = 'C'; // A

// const numeros = [1, 2, 3];
// [a, b, c] = numeros;
// [a, b, c] = [b, c, a];

// console.log(a, b, c);

// .. rest, ... spread (operator)
// const numeros = [100, 200, 300, 400, 500, 600, 700, 800, 900];

// const [um, dois, tres, ...resto] = numeros;
// console.log(um, dois, tres);
// console.log(resto);

// const [um, , tres, , cinco, , sete] = numeros;
// console.log(um, tres, cinco);

const numeros = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
]

// const [,[,,seis]] = numeros;
// console.log(seis);

const [lista1, lista2, lista3] = numeros;
console.log(lista3[2]);

// console.log(numeros[1][2]);
