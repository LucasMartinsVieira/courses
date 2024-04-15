describe('Primitive values', () => {
  it('it should test jest assertions', () => {
    const number = 10;

    expect(number).toBeGreaterThan(9);
    expect(number).toBeGreaterThanOrEqual(10);
    expect(number).toBeLessThan(11);
    expect(number).toBeLessThanOrEqual(10);

    expect(number).toBeCloseTo(10.001);
    expect(number).toBeCloseTo(9.996);

    expect(number).not.toBeNull();

    expect(number).toHaveProperty('toString');
  });

  it('it should split tests', () => {
    const number = 10;

    expect(number).toBe(10);
    expect(number).toEqual(10);

    expect(number).not.toBeFalsy();
    expect(number).toBeTruthy();
  });
});

describe('Objects', () => {
  it('it should test jest assertions with objects', () => {
    const person = { name: 'Lucas', age: 19 };
    const anotherPeson = { ...person };

    expect(person).toEqual(anotherPeson);
    expect(person).toHaveProperty('age');
    expect(person).toHaveProperty('age', 19);
    expect(person).not.toHaveProperty('lastName');

    expect(person.name).toBe('Lucas');
  });
});
