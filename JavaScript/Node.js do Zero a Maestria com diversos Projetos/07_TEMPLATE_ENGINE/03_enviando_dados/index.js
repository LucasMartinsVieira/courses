const express = require("express");
const exphbs = require("express-handlebars");

const app = express();

app.engine("handlebars", exphbs.engine());
app.set("view engine", "handlebars");

app.get("/", (req, res) => {
  const user = {
    name: "Lucas",
    surname: "Vieira",
    age: 20,
  };

  const word = "Test";

  res.render("home", { user, word });
});

app.listen(3000, () => {
  console.log(`Server running!`);
});
