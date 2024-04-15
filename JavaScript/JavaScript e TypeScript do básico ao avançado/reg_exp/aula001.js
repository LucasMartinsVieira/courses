// g -global (encontra todas a ocorrencias)]
// i - insensitive
// (()()) grups
// | or

const { texto } = require('./base');

const regExp1 = /(maria|joão|Luiz)(, hose sua esposa)/i;
const found = regExp1.exec(texto);

if(found){
console.log(found[0]);
console.log(found[1]);
console.log(found[2]);
}
