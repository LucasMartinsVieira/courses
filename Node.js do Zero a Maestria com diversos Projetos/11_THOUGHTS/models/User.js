const { DataTypes } = require("sequelize");

const db = require("../db/conn");

const User = db.define("user", {
  name: {
    type: DataTypes.STRING,
    required: true,
  },

  email: {
    type: DataTypes.STRING,
    required: true,
  },

  password: {
    type: DataTypes.STRING,
    required: true,
  },
});

module.exports = User;
