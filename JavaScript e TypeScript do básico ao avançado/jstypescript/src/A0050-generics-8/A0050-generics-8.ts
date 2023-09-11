// Record
const object1: Record<string, string | number> = {
  name: 'Lucas',
  surname: 'Martins',
  age: 19
}

console.log(object1)

type PersonProtocol = {
  name?: string
  surname?: string
  age?: number
}

// Required
type PersonRequired = Required<PersonProtocol>

// Partial
type PersonPartial = Partial<PersonRequired>

// Readonly
type PersonReadonly = Readonly<PersonRequired>

// Pick
type PersonPick = Pick<PersonRequired, 'name' | 'surname'>

const object2: PersonRequired = {
  name: 'Lucas',
  surname: 'Martins',
  age: 19
}

console.log(object2)

// Extract and Exclude
type ABC = 'A' | 'B' | 'C'
type CDE = 'C' | 'D' | 'E'
type TypeExclude = Exclude<ABC, CDE>
type TypeExtract = Extract<ABC, CDE>


//
type AccountMongo = {
  _id: string,
  name: string,
  age: number,
  surname: string
}

type AccountApi = Pick<AccountMongo, Exclude<keyof AccountMongo, '_id'>> & {
  id: string
}

const accountMongo: AccountMongo = {
  _id: 'djsalkdjasljdkj129u31jas',
  name: 'Lucas',
  age: 19,
  surname: "Martins"
}

function mapAccount(accountMongo: AccountMongo): AccountApi {
  const { _id, ...accountData } = accountMongo
  return { ...accountData, id: _id }
}

const accountApi = mapAccount(accountMongo)
console.log('API:')
console.log(accountApi)

// Module mode
export default 1
