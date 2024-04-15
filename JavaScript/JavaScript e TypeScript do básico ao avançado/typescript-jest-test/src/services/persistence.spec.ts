import { Persistence } from './persistence';

describe('Persistence', () => {
  afterEach(() => jest.clearAllMocks());

  it('it should return undefined', () => {
    // System under test
    const sut = new Persistence();
    expect(sut.saveOrder()).toBeUndefined();
  });

  it('it should call console.log once', () => {
    const sut = new Persistence();
    const consoleSpy = jest.spyOn(console, 'log');
    sut.saveOrder();
    expect(consoleSpy).toHaveBeenCalledTimes(1);
  });

  it('it should call console.log once with "Successfully saved order"', () => {
    const sut = new Persistence();
    const consoleSpy = jest.spyOn(console, 'log');
    sut.saveOrder();
    expect(consoleSpy).toHaveBeenCalledWith('Successfully saved order');
  });
});
