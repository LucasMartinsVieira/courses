const inquirer = require('inquirer')

inquirer.prompt([
  {
    name: 'p1',
    message: 'What is the first grade?'
  },
  {
    name: 'p2',
    message: 'What is the second grade?'
  }
]).then((answers) => {
  const media = (parseInt(answers.p1) + parseInt(answers.p2) / 2)
  console.log(`The media is: ${media}`)
}).catch(err => console.log(err))
