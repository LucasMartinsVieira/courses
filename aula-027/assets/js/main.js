// Operadores Ternários: (condicao) ? 'Valor Verdadeiro' : 'Valor Falso';

const pontuacaoUsuario = 1000;

const nivelUsuario = pontuacaoUsuario >= 1000 ? 'Usuario VIP' : 'Usuario Normal';
console.log(nivelUsuario);
// console.log(pontuacaoUsuario >= 1000 ? 'Usuario VIP' : 'Usuario Normal');

const corUsuario = null;
const corPadrao = corUsuario || 'Preta';

console.log(corPadrao)

