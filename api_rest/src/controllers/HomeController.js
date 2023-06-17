import Aluno from '../models/Aluno';

class HomeController {
  async index(req, res) {
    const novoAluno = await Aluno.create({
      nome: 'Lucas',
      sobrenome: 'Martins',
      email: 'lucas@gmail.com',
      idade: 19,
      peso: 75,
      altura: 1.7,
    });
    res.json(novoAluno);
  }
}

export default new HomeController();
