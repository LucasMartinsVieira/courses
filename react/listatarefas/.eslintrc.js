module.exports = {
  env: {
    browser: true,
    es2021: true,
  },
  extends: 'airbnb',
  overrides: [
    {
      env: {
        node: true,
      },
      files: [
        '.eslintrc.{js,cjs}',
      ],
      parser: '@babel/eslint-parser',
      parserOptions: {
        sourceType: 'script',
      },
    },
  ],
  parserOptions: {
    ecmaVersion: 'latest',
    sourceType: 'module',
  },
  rules: {
    'react/jsx-filename-extension': 'off',
    'react/prefer-stateless-function': 'off',
    'react/state-in-constructor': 'off',
    'import/no-duplicates': 'off',
    'react/forbid-prop-types': 'off'
  },
};
