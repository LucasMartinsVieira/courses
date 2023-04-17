/*
Primitivos (imutáveis) - String, number, boolean, undefined, null (bigint, symbol) - Valores Copiados
 */

// let nome = 'Lucas';
// console.log(`Faz o ${nome[0]} agora ${nome}`);

// let a = 'A';
// let b = a; // Cópia
// console.log(a, b);
//
// a = 'Outra Coisa';
// console.log(a, b);


/*
Referência (mútavel) - array, object, function - Valores passados por referência
*/

// let a = [1, 2, 3];
// // let b = a;
// let b = [...a];
// let c = b;
//
// console.log(a, b);
//
// a.push(4);
// console.log(a, b);
//
// b.pop()
// console.log(a, b);
//
// a.push('Lucas');
// console.log(c);


const a = {
  nome: 'Lucas',
  sobrenome: 'Vieira'
};

// const b = a;
const b = {...a};

a.nome = 'João';
console.log(a);
console.log(b);
