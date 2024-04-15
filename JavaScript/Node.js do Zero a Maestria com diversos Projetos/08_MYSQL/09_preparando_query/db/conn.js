const mysql = require("mysql2");
const pool = mysql.createPool({
  connectionLimit: 10,
  host: "localhost",
  user: "node_user",
  password: "p4ad89",
  database: "nodemysql",
});

module.exports = pool;
