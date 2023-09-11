/**
 * && -> false && true -> false
 * || ->  true && false 
 * FALSY
 *
 * false
 * 0
 * '' "" ´´ ¨¨
 * null/undefined
 * NaN
 */

// console.log('Luiz Otávio' && true && NaN);
// console.log('Luiz' && undefined && 'Maria');

// function falaOi() {
//   return 'Oi';
// }
//
// const vaiExecutar = 'Joãozinho';
//
// console.log(vaiExecutar && falaOi());
// console.log(0 || false || null || "Luiz Otávio" || true);

const corUsuario = 'amarelo';
// const corUsuario = null;
const corPadrao = corUsuario || 'preto';

console.log(corPadrao);
