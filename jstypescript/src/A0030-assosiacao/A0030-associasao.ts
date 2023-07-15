export class Writer {
  private _tool: Tool | null = null

  constructor(private _name: string) { }

  get name(): string {
    return this._name
  }

  set tool(tool: Tool | null) {
    this._tool = tool
  }

  get tool(): Tool | null {
    return this._tool
  }

  write(): void {
    if (this.tool === null) {
      console.log('I cant write without a tool...')
      return
    }

    this.tool.write()
  }
}

export abstract class Tool {
  constructor(private _name: string) { }
  abstract write(): void

  get name(): string {
    return this._name
  }
}

export class Pen extends Tool {
  write(): void {
    console.log(`${this.name} is writting...`)
  }
}

export class Typewriter extends Tool {
  write(): void {
    console.log(`${this.name} is typing...`)
  }
}

const writer = new Writer('Lucas')
const pen = new Pen('Bic')
const typewriter = new Typewriter('Machine')

console.log(writer.name)
console.log(pen.name)
console.log(typewriter.name)

writer.tool = pen
writer.tool = typewriter
writer.tool = null
writer.write()
