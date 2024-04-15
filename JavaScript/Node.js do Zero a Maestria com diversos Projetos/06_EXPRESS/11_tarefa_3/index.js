const express = require("express");
const app = express();
const path = require("path");

const basePath = path.join(__dirname, "templates");
const port = 5000;

const items = require("./items");

app.use("/items", items);

app.use(express.static("public"));

app.get("/", (req, res) => {
  res.sendFile(`${basePath}/index.html`);
});

app.listen(port, () => {
  console.log(`Server running on port ${port}`);
});
