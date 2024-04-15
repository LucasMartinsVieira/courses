export class Enterprise {
  readonly name: string // public not necessary
  protected readonly collaborators: Collaborator[] = []
  private readonly cnpj: string

  constructor(name: string, cnpj: string) {
    this.name = name
    this.cnpj = cnpj
  }

  addCollaborator(collaborator: Collaborator): void {
    this.collaborators.push(collaborator)
  }

  showCollaborators(): void {
    for (const collaborator of this.collaborators) {
      console.log(collaborator)
    }
  }
}

export class Meta extends Enterprise {
  constructor() {
    super('Meta', '11.111.111/0001-11')
  }

  popCollaborator(): Collaborator | null {
    const collaborator = this.collaborators.pop()

    if (collaborator) return collaborator
    return null
  }
}

export class Collaborator {
  constructor(public readonly name: string, public readonly surname: string) { }
}

const enterprise1 = new Meta()
const collaborator1 = new Collaborator('Lucas', 'Martins')
const collaborator2 = new Collaborator('Maria', 'Xiquinha')
const collaborator3 = new Collaborator('Thiago', 'Martins')
enterprise1.addCollaborator(collaborator1)
enterprise1.addCollaborator(collaborator2)
enterprise1.addCollaborator(collaborator3)
const removedCollaborator = enterprise1.popCollaborator()

console.log(removedCollaborator)
console.log(enterprise1)

// console.log(enterprise1.name)

