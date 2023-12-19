const fs = require('fs')

fs.unlink('archive.txt', (err) => {
  if (err) {
    console.log(err)
    return
  }

  console.log('Archive removed')
})
