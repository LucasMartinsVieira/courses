const http = require('http')

const port = 3333

const server = http.createServer((req, res) => {
  res.write('Hi on HTTP')
  res.end()
})

server.listen(port, () => {
  console.log(`Server running on ${port} port`)
})
