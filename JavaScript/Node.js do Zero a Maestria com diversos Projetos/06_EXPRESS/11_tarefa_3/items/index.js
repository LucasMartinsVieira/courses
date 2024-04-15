const express = require("express");
const router = express.Router();

const path = require("path");
const basePath = path.join(__dirname, "../templates");

router.get("/", (req, res) => {
  res.sendFile(`${basePath}/items.html`);
});

router.get("/:id", (req, res) => {
  const id = req.params.id;
  console.log(`The item ID is ${id}`);
  res.sendFile(`${basePath}/items.html`);
});

module.exports = router;
