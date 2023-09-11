import Sequelize, { Model } from 'sequelize';
import bcriptjs from 'bcryptjs';

export default class User extends Model {
  static init(sequelize) {
    super.init({
      nome: {
        type: Sequelize.STRING,
        defaultvalue: '',
        validate: {
          len: {
            args: [3, 255],
            msg: 'campo nome deve ter entre 3 e 255 caracteres.',
          },
        },
      },
      email: {
        type: Sequelize.STRING,
        defaultvalue: '',
        unique: {
          msg: 'Email já existe.',
        },
        validate: {
          isEmail: {
            msg: 'Email inválido.',
          },
        },
      },
      password_hash: {
        type: Sequelize.STRING,
        defaultvalue: '',
      },
      password: {
        type: Sequelize.STRING,
        defaultvalue: '',
        validate: {
          len: {
            args: [6, 50],
            msg: 'A senha precisa ter entre 6 e 50 caracteres.',
          },
        },
      },
    }, {
      sequelize,
    });
    this.addHook('beforeSave', async (user) => {
      if (user.password) {
        user.password_hash = await bcriptjs.hash(user.password, 8);
      }
    });
    return this;
  }

  passwordIsValid(password) {
    return bcriptjs.compare(password, this.password_hash);
  }
}
