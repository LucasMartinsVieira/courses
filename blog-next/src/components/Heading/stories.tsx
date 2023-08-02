import { Heading, HeadingProps } from '.';
import { Meta, Story } from '@storybook/react';

export default {
  title: 'Heading',
  component: Heading,
  args: {
    children: 'Something',
  },
} as Meta;

export const Template: Story<HeadingProps> = (args) => (
  <div style={{ maxWidth: '36rem' }}>
    <Heading {...args} />;
  </div>
);
