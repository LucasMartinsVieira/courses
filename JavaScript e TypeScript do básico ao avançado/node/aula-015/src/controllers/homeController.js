exports.paginaInicial = (req, res) => {
  req.session.usuario = { nome: 'Lucas', logado: true }
  req.flash('info', 'Olá, Mundo!')
  req.flash('error', 'Oldsdasdo!')
  req.flash('sucess', 'Masdasundo!')
  console.log(req.flash('error'), req.flash('info'), req.flash('sucess'))
  res.render('index')
  return
}

exports.trataPost = (req, res) => {
  // res.send('Ei, sou sua nova rota de POST.')
  res.send(req.body)
  return
}
