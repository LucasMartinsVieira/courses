const { Sequelize } = require("sequelize");

const sequelize = new Sequelize("thoughts", "node_user", "p4ad89", {
  host: "localhost",
  dialect: "mysql",
});

try {
  sequelize.authenticate();
  console.log("Connected sucessfuly");
} catch (err) {
  console.log(`Unable to connect: ${err}`);
}

module.exports = sequelize;
