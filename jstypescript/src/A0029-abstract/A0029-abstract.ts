export abstract class Character {
  protected abstract emoji: string

  constructor(
    protected name: string,
    protected attack: number,
    protected life: number
  ) {}

  strike(character: Character): void {
    this.catchphrase()
    character.loseLife(this.attack)
  }

  loseLife(attackForce: number): void {
    this.life -= attackForce
    console.log(`${this.emoji} - ${this.name} now have this ${this.life} much life...`)
  }

  abstract catchphrase(): void
}

export class Warrior extends Character {
  protected emoji = '\u{1F9DD}'

  catchphrase(): void {
    console.log(this.emoji + ' WARRIOR IS ATACKING!!!')
  }
}

export class Monster extends Character {
  protected emoji = '\u{1F9DF}'

  catchphrase(): void {
    console.log(this.emoji + ' MONSTER IS ATACKING!!!')
  }
}

const warrior = new Warrior('Warrior', 100, 1000)
const monster = new Monster('Monster', 87, 1000)

warrior.strike(monster)
warrior.strike(monster)
warrior.strike(monster)

monster.strike(warrior)
monster.strike(warrior)
monster.strike(warrior)
