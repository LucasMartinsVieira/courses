const express = require("express");
const exphbs = require("express-handlebars");

const app = express();

app.engine("handlebars", exphbs.engine());
app.set("view engine", "handlebars");

app.get("/dashboard", (req, res) => {
  const items = ["Item A", "Item B", "Item C"];

  res.render("dashboard", {
    items,
  });
});

app.get("/post", (req, res) => {
  const post = {
    title: "Learn Node.js",
    category: "JavaScript",
    body: "This article will help you learn Node.js...",
    comments: 4,
  };

  res.render("blogpost", { post });
});

app.get("/", (req, res) => {
  const user = {
    name: "Lucas",
    surname: "Vieira",
    age: 20,
  };

  const word = "Test";

  const auth = true;
  const approved = true;

  res.render("home", { user, word, auth, approved });
});

app.listen(3000, () => {
  console.log(`Server running!`);
});
