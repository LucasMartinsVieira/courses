import { ReactNode } from 'react';
import { Container } from './styled';

export type HeadingProps = {
  children: ReactNode;
};

export const Heading = ({ children }: HeadingProps) => {
  <Container>{children}</Container>;
};
