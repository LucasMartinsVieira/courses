// Declaração de Função (function hoisting)

function falaOi() {
  console.log('Oi');
}


// First-class objects (Objetos de primeira classe)
// Function Expression

const souUmDado = function() {
  console.log('Sou um Dado.');
};

// souUmDado();

function executaFuncao(funcao) {
  funcao();
}

executaFuncao(souUmDado);

// Arrow function

const funcaoArrow = () => {
  console.log('Sou uma arrow function.');
}

funcaoArrow();

// Dentro de um objeto

const obj = {
  // falar: function() {
  falar() {
    console.log('Estou falando...');
  }
};

obj.falar();
