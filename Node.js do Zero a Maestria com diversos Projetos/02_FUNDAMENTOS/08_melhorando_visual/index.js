const chalk = require('chalk')

const grade = 10

if (grade >= 7) {
  console.log(chalk.green.bold('Congratulations! you are approved'))
} else {
  console.log(chalk.bgRed.black.bold('Sorry, you are not approved :('))
}
