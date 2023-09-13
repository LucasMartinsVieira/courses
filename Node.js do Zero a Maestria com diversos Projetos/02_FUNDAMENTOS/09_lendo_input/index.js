const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout,
})

readline.question(`What's your favorite programming language? `, (language) => {
  if (language == "Python" || language == "python") {
    console.log("Python é lento")
  } else {
    console.log(`Mine is ${language}`)
  }
  readline.close()
})
