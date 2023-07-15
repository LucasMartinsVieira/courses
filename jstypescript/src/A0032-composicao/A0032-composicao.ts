export class Car {
  private readonly engine = new Engine()

  on(): void {
    this.engine.on
  }

  accelerate(): void {
    this.engine.accelerate()
  }

  stop(): void {
    this.engine.stop()
  }

  off(): void {
    this.engine.off()
  }
}

export class Engine {
  on(): void {
    console.log('Engine is on...')
  }

  accelerate(): void {
    console.log('Engine is accelerating...')
  }

  stop(): void {
    console.log('Engine is stopped...')
  }

  off(): void {
    console.log('Engine is off...')
  }
}

const car = new Car()
car.on()
car.accelerate()
car.stop()
car.off()
