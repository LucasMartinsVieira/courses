// Optional Chaining and Null Coalescing Operator
type Doc = {
  title: string
  text: string
  date?: Date
}

const doc: Doc = {
  title: "The title",
  text: "The text",
  // date: new Date(),
}

console.log(doc.date?.toDateString() ?? `Data doesn't exist.`)
console.log(undefined ?? `2- Data doesn't exist.`)
console.log(null ?? `3- Data doesn't exist.`)
console.log(false ?? `4- Data doesn't exist.`)
console.log(0 ?? `5- Data doesn't exist.`)
console.log('' ?? `6- Data doesn't exist.`)
