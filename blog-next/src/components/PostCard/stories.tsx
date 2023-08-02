import { PostCard, PostCardProps } from '.';
import { Meta, Story } from '@storybook/react';

export default {
  title: 'PostCard',
  component: PostCard,
  args: {
    slug: 'default-slug',
    title: 'defaul-title',
    cover: 'default-cover',
  },
} as Meta;

export const TypeScriptCover: Story<PostCardProps> = (args) => (
  <div style={{ maxWidth: '36rem' }}>
    <PostCard {...args} />;
  </div>
);

export const JavaScriptCover: Story<PostCardProps> = (args) => (
  <div style={{ maxWidth: '36rem' }}>
    <PostCard {...args} />;
  </div>
);

JavaScriptCover.args = {
  cover: 'dsjdlsajdkljadlsj',
}
