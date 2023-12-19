const http = require('http')

const port = 3333

const server = http.createServer((req, res) => {
  res.statusCode = 200
  res.setHeader('Contenty-Type', "text/html")
  res.end('<h1>My Server using only node!</h1>')
})

server.listen(port, () => {
  console.log(`Server running on ${port} port`)
})
