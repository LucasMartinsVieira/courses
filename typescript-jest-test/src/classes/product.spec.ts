import { Product } from './product';

const createSut = (name: string, price: number): Product => {
  return new Product(name, price);
};

describe('Product', () => {
  afterEach(() => jest.clearAllMocks());

  it('it should have properties name and price', () => {
    const sut = createSut('Shirt', 49.9);
    expect(sut).toHaveProperty('name', 'Shirt');
    expect(sut.price).toBeCloseTo(49.9);
  });
});
