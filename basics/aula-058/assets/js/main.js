// Função constutora -> Objetos
// Função fábrica -> Objetos
// Construtora -> Pessoa (new)

function Pessoa(nome, sobrenome) {
  // Atributos ou Métodos Privados
  const ID = 123456;

  const metodoInterno = () => {
    
  };

  // Atributos ou Métodos Públicos
  this.nome = nome;
  this.sobrenome = sobrenome;

  this.metodo = () => {
    console.log(`${this.nome} Sou um método`);
  }
}


const p1 = new Pessoa('Lucas', 'Martins');
const p2 = new Pessoa('Thiago', 'Martins');

console.log(typeof p1.nome);
console.log(p2.nome);

p1.metodo();
