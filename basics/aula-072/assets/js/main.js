// defineProperty defineProperties

function Produto(nome, preco, estoque) {
  this.nome = nome
  this.preco = preco

  let estoquePrivaado = estoque
  Object.defineProperty(this, 'estoque', {
    enumerable: true, // Mostra a chave
    configurable: true, // configurável
    get: function() {
      return estoque;
    },
    set: function(valor) {
      if (typeof valor !== 'number') {
        throw new TypeError('Mensagem');
      }

      estoquePrivaado = valor;
      // console.log(valor)
    },
  })
}

const p1 = new Produto('Camiseta', 20, 3)
// console.log(p1);
p1.estoque = 'fjafljdaslajdfslk'
console.log(p1.estoque)
