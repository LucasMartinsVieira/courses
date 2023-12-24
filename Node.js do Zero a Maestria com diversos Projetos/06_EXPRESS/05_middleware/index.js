const express = require("express");
const app = express();
const port = 3000;

const path = require("path");

const basePath = path.join(__dirname, "templates");

const checkAuth = (req, res, next) => {
  req.authStatus = true;

  if (req.authStatus) {
    console.log("You are logged in, you can continue");
    next();
  } else {
    console.log("Is not logged in, please log in to continue");
    next();
  }
};

app.use(checkAuth);

app.get("/", (req, res) => {
  res.sendFile(`${basePath}/index.html`);
});

app.listen(port, () => {
  console.log(`Server running on port ${port}`);
});
