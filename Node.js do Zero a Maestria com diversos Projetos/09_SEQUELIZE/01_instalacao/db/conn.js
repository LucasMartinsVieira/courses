const { Sequelize } = require("sequelize");

const sequelize = new Sequelize("nodesequelize", "node_user", "p4ad89", {
  host: "localhost",
  dialect: "mysql",
});

try {
  sequelize.authenticate();
  console.log("Conected sucessfuly with Sequelize!");
} catch (err) {
  console.log("Unable to connect: ", err);
}

module.exports = sequelize;
