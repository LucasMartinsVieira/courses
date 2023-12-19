const url = require('url')
const address = 'https://www.mywebsite.com/catalog?product=chair'
const parsedUrl = new url.URL(address)

console.log(parsedUrl.host)
console.log(parsedUrl.pathname)
console.log(parsedUrl.search)
console.log(parsedUrl.searchParams)
console.log(parsedUrl.searchParams.get('product'))
