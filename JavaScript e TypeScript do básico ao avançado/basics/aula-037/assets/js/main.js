// const nome = 'Lucas Martins';
const nomes = ["Lucas", "Martins", "Vieira"];

// for (let i = 0; i < nomes.length; i++) {
//   console.log(nomes[i]);
// }
//
// console.log("#######");
//
// for (let i in nomes) {
//   console.log(nomes[i]);
// }
//
// console.log("#######");
//
// for (const valor of nomes) {
//   console.log(valor);
// }
//
// console.log("#######");

// nomes.forEach(function (elemento) {
//   console.log(elemento);
// });

// nomes.forEach(elemento => {
//   console.log(elemento);
// });

nomes.forEach(function (valor, indicie, array) {
  console.log(valor, indicie, array);
});
