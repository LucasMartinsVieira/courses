const { Sequelize } = require("sequelize");

const sequelize = new Sequelize("nodemvc", "node_user", "p4ad89", {
  host: "localhost",
  dialect: "mysql",
});

try {
  sequelize.authenticate();
  console.log("Connected to MySQL!");
} catch (error) {
  console.log(`Unable to connect: ${error}`);
}

module.default = sequelize;
