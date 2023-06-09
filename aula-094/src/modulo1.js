export const nome = 'Lucas'
export const sobrenome = 'Martins'
export const idade = 30

// export { nome, sobrenome, idade, soma }

// export default function soma(x, y) {
export function soma(x, y) {
  return x + y
}

export default class Pessoa {
  constructor(nome, sobrenome) {
    this.nome = nome
    this.sobrenome = sobrenome
  }
}

// export const lucas = (x, y) => x * y;

// export { nome as default, sobrenome, idade, soma}
// export { nome, sobrenome, idade, soma }
