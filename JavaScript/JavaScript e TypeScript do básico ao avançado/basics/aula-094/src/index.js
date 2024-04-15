// import { nome as nome2, sobrenome, idade, soma, Pessoa as Laele } from './modulo1'
// import * as MeuModulo from './modulo1'
// import qualquerNome from './modulo1'

// console.log(qualquerNome(5, 5))
// console.log(qualquerNome)
// console.log(MeuModulo)

// const p1 = new Laele('Lucas', 'Martins')
// console.log(p1)

// const nome = 'Lucas'
//
// console.log(nome, nome2, sobrenome, idade)
// console.log(soma(5, 5))

// import multiplica, {nome, sobrenome, idade, soma} from './modulo1'
// console.log(multiplica(5, 40))
// console.log(nome, sobrenome, idade, soma(2, 10))

import Pessoa, { nome, sobrenome } from './modulo1'

const p1 = new Pessoa('Lucas', 'Martins')
console.log(p1)
console.log(nome)
console.log(sobrenome)
