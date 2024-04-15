// Factory Function (funao fábrica)
function criaPessoa(nome, sobrenome, altura, peso) {
  return {
    nome,
    sobrenome,
    get nomeCompleto() {
      return `${this.nome} ${this.sobrenome}`
    },

    set nomeCompleto(valor) {
      valor = valor.split(' ');
      this.nome = valor.shift();
      this.sobrenome = valor.join(' ');
      console.log(valor);
    },
    // fala: function(assunto) {
    fala(assunto = 'falando sobre NADA') {
      return `${this.nome} está ${assunto}.`
    },
    altura,
    peso,
    // imc() {
    get imc() {
      const indice = this.peso / this.altura ** 2
      return indice.toFixed(2)
    },
  }
}

const p1 = criaPessoa('Lucas', 'Martins', 1.73, 73)
const p2 = criaPessoa('Thiago', 'Martins', 1.81, 77)
const p3 = criaPessoa('Maria', 'Martins', 1.64, 58)

console.log(p1.imc);
console.log(p2.imc);
console.log(p3.imc);

// p1.nomeCompleto = 'Maria Oliveira Silva'
// console.log(p1.nome);
// console.log(p1.sobrenome);
// console.log(p1.nomeCompleto)
// console.log(p1.fala());
// console.log(p1.imc());
// console.log(p1.imc);
