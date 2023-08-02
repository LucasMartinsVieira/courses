import { screen } from '@testing-library/react';
import { Heading } from '.';
import { customRender } from '@/utils/custom-render';

describe('<Heading />', () => {
  it('It should render a heading', () => {
    customRender(<Heading>Hi</Heading>);
    const element = screen.getByRole('heading', { name: /hi/i });
    expect(element).toHaveStyleRule('font-size', '5rem')
  });
});
