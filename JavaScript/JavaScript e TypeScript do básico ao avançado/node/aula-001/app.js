// const mod1 = require('./mod1')
// const falaNome = require('./mod1').falaNome
// const falaNome = require('./mod1').falaNome

// console.log(mod1.falaNome())

// const { nome, sobrenome, falaNome } = require('./mod1')

// console.log(falaNome())

const path = require('path')
const axios = require('axios')

const { Pessoa } = require('./mod1')

const p1 = new Pessoa('Lucas')
console.log(p1)

axios('https://www.otaviomiranda/files/json/pessoas.json')
  .then(response => console.log(response.data))
  .catch((err) => console.log(err))


