const express = require("express");
const router = express.Router();

const path = require("path");
const basePath = path.join(__dirname, "../templates");

router.get("/add", (req, res) => {
  res.sendFile(`${basePath}/userform.html`);
});

router.post("/save", (req, res) => {
  console.log(req.body);

  const name = req.body.name;
  const age = req.body.age;

  res.sendFile(`${basePath}/userform.html`);
  console.log(`The name of the user is ${name} and he is ${age} years old`);
});

router.get("/:id", (req, res) => {
  const id = req.params.id;

  console.log(`We are searching for user: ${id}`);

  res.sendFile(`${basePath}/users.html`);
});

module.exports = router;
