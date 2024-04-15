function retornaFuncao(nome) {
  // const nome = 'Lucas';
  return function() {
    return nome;
  };
}

const funcao = retornaFuncao('Lucas');
const funcao2 = retornaFuncao('Martins');
console.log(funcao());
console.log(funcao2());

