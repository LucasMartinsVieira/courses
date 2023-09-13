const inquirer = require('inquirer')
const chalk = require('chalk')

inquirer.prompt([
  {
    name: 'p1',
    message: 'Qual o seu nome? '
  },
  {
    name: 'p2',
    message: 'Qual a sua idade? '
  },
]).then((answers) => {
  const nome = answers.p1
  const idade = (parseInt(answers.p2))

  console.log(chalk.bgYellow.black(`Meu nome é: ${nome} e tenho ${idade} anos.`))
}).catch((err) => {
  console.log(`Erro: ${err}`)
})
