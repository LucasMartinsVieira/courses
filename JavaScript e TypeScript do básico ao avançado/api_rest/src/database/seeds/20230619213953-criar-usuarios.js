const bcriptjs = require('bcryptjs');

module.exports = {
  async up(queryInterface, Sequelize) {
    await queryInterface.bulkInsert('People', [
      {
        nome: 'Lucas',
        email: 'lucas@email.com',
        password_hash: await bcriptjs.hash('123456', 8),
        created_at: new Date(),
        updated_at: new Date(),
      },
      {
        nome: 'Lucas2',
        email: 'lucas2@email.com',
        password_hash: await bcriptjs.hash('123456', 8),
        created_at: new Date(),
        updated_at: new Date(),
      },
      {
        nome: 'Lucas3',
        email: 'lucas3@email.com',
        password_hash: await bcriptjs.hash('123456', 8),
        created_at: new Date(),
        updated_at: new Date(),
      },
    ], {});
  },

  async down() {},
};
