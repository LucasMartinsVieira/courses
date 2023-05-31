// IIFE -> Immediatelly Invoked Function Expression

(function(idade, peso, altura) {
// (() => {
  const sobrenome = 'Martins';

  const criaNome = (nome) => {
    return nome + ' ' + sobrenome;
  }

  const falaNome = () => {
    console.log(criaNome('Lucas'))
  }

  falaNome();
  console.log(idade, peso, altura);

})(19, 75, 1.80);

const nome = 'Qualquer Coisa';

// const qualquerCoisa = () => {
//   console.log(12123413);
// }
//
// qualquerCoisa();
