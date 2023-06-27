import React from 'react';
import GlobalStyles from './styles/GlobalStyles';
import Login from './pages/login';
import Header from './components/Header';

function App() {
  return (
    <>
      <Header />
      <Login />
      <GlobalStyles />
    </>
  );
}

export default App;
