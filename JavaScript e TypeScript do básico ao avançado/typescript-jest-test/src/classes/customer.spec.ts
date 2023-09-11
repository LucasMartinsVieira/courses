import { EnterpriseCustomer, IndividualCustomer } from './customer';

const createIndidualCustomer = (
  firstName: string,
  lastName: string,
  cpf: string,
): IndividualCustomer => {
  return new IndividualCustomer(firstName, lastName, cpf);
};

const createEnterpriseCustomer = (
  name: string,
  cnpj: string,
): EnterpriseCustomer => {
  return new EnterpriseCustomer(name, cnpj);
};

describe('Individual Customer', () => {
  afterEach(() => jest.clearAllMocks());

  it('it should have firstName, lastName and cpf', () => {
    const sut = createIndidualCustomer('Lucas', 'Martins', '111.111.111-11');
    expect(sut).toHaveProperty('firstName', 'Lucas');
    expect(sut).toHaveProperty('lastName', 'Martins');
    expect(sut).toHaveProperty('cpf', '111.111.111-11');
  });

  it('it should have methods to get name and IDN ', () => {
    const sut = createIndidualCustomer('Lucas', 'Martins', '111.111.111-11');
    expect(sut.getName()).toBe('Lucas Martins');
    expect(sut.getIDN()).toBe('111.111.111-11');
  });
});

describe('Enterprise Customer', () => {
  afterEach(() => jest.clearAllMocks());

  it('it should have name and cnpj', () => {
    const sut = createEnterpriseCustomer('Meta', '111.111.111-11');
    expect(sut).toHaveProperty('name', 'Meta');
    expect(sut).toHaveProperty('cnpj', '111.111.111-11');
  });

  it('it should have methods to get name and IDN ', () => {
    const sut = createEnterpriseCustomer('Meta', '111.111.111-11');
    expect(sut.getName()).toBe('Meta');
    expect(sut.getIDN()).toBe('111.111.111-11');
  });
});
