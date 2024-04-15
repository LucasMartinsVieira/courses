const express = require("express");
const app = express();

app.use(
  express.urlencoded({
    extended: true,
  }),
);

app.use(express.json());

// Routes/Endpoints

app.get("/", (req, res) => {
  res.json({ message: "Hello World" });
});

app.post("/createproduct", (req, res) => {
  const name = req.body.name;
  const price = req.body.price;

  console.log(name);
  console.log(price);

  res.json({ message: `The product ${name} has been created sucessfully!` });
});

app.listen(3000);
