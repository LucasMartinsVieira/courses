// Reduce

// Some todos os números
// Retorne um array so com os pares (filter)
// Retorne um array com o dobro dos valores (map)
const numeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27]

const total = numeros.reduce((acumulador, valor) => {
  // if (valor % 2 === 0) acumulador.push(valor);
  // acumulador.push(valor * 2)

  acumulador += valor
  return acumulador
})

// console.log(total);

// Retorne a pessoa mais velha
const pessoas = [
  { nome: 'Luiz', idade: 62 },
  { nome: 'Maria', idade: 23 },
  { nome: 'Eduardo', idade: 55 },
  { nome: 'Letícia', idade: 19 },
  { nome: 'Rosana', idade: 32 },
  { nome: 'Wallace', idade: 47 },
]

const maisVelha = pessoas.reduce((accumulador, valor) => {
  // console.log(accumulador, valor);
  if (accumulador.idade > valor.idade) return accumulador
  return valor
})

console.log(maisVelha)
