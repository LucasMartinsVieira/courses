// Construtora -> molde (classe)
function Pessoa(nome, sobrenome) {
  this.nome = nome;
  this.sobrenome = sobrenome;
  // this.nomeCompleto = () => ` ORIGINAL ${this.nome} ${this.sobrenome}`;
}

// instância
const pessoa1 = new Pessoa ('Luiz', 'O.') // Pessoa = funcão Construtora
const pessoa2 = new Pessoa ('Maria', 'A.') // Pessoa = funcão Construtora
const data = new Date(); // Date = Função Construtora

Pessoa.prototype.nomeCompleto = function() {
  return `${this.nome} ${this.sobrenome}`;
}

console.dir(pessoa1)
console.dir(data.getFullYear())
