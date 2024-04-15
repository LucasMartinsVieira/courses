const fs = require('fs')

const oldArchive = 'archive.txt'
const newArchive = 'newarchive.txt'

fs.rename(oldArchive, newArchive, (err) => {
  if (err) {
    console.log(err)
    return
  }

  console.log(`The archive '${oldArchive}' was renamed to '${newArchive}'`)
})
