// function saudacao(nome) {
  // console.log('Hi, Mom 🥰')
  // console.log('How can i be homophobic? My bitch is gay')
  // console.log(`Bom dia ${nome}!`)
//   return `Bom dia ${nome}`;
// }

// const nome = "Lucas";
//
// saudacao(nome);
// saudacao('Thiago');

// const variavel = saudacao('Lucas')
// console.log(variavel)

// function soma(x, y) {
function soma(x = 1, y = 1) {
  const resultado = x + y;
  return resultado;
}

// console.log(soma(3, 2));
// console.log(soma(8, 4));
// console.log(soma(9, 7));

// const resultado = soma('Luiz', ' Otávio');
// console.log(resultado);

// const raiz = function(n) { // Função Anonima
// const raiz = (n) => { // Arrow function
//   return n ** 0.5;
// }

// Simplificado - Arrow function
const raiz = n => n ** 0.5;

console.log(raiz(9));
console.log(raiz(49));
console.log(raiz(4));
