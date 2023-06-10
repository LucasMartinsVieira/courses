/*
Lucas Vieira tem 19 anos, peso 80 kg tem 1.73 de altura e seu IMC é de 25.890120378 Lucas Vieira nasceu em 2003
 */

const nome = "Lucas";
const sobrenome = "Vieira";
const idade = 19;
const peso = 80;
const altura = 1.73;
let imc; // peso / altura * altura

imc = peso / (altura * altura);

let anoNacismento;

anoNacismento = 2023 - idade

// console.log(nome + ' ' + sobrenome + ' tem ' + idade + ' tem ' + altura + ' de altura e seu IMC é de: ' + imc + ' ' + nome + ' ' + sobrenome + ' nasceu em ' + anoNacismento);
console.log(nome, sobrenome, 'tem', idade, 'tem', altura, 'de altura e seu IMC é de:', imc, nome, sobrenome, 'nasceu em', anoNacismento);

// Template Strings
console.log(` ${nome} ${sobrenome} tem ${idade} de idade, tem ${altura} de altura e seu IMC é de ${imc}, nasceu em ${anoNacismento}. `);
