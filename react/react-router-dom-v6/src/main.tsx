import React from 'react'
import ReactDOM from 'react-dom/client'
import { About } from './components/About'
import { Home } from './components/Home'
import { Menu } from './components/Menu'
import { Posts } from './components/Posts'
import { Redirect } from './components/Redirect'
import './styles/global.css'

import { BrowserRouter, Route, Routes } from 'react-router-dom'
import { NotFound } from './components/NotFound'
import { Post } from './components/Post'

ReactDOM.createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    <BrowserRouter>
      <Menu />
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/about' element={<About />} />
        {/* <Route path='/posts/:id' element={<Posts />} /> */}
        <Route path='/posts/' element={<Posts />}>
          <Route path=':id' element={<Post />} />
        </Route>
        <Route path='/posts' element={<Posts />} />
        <Route path='/redirect' element={<Redirect />} />
        <Route path='*' element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  </React.StrictMode>,
)
