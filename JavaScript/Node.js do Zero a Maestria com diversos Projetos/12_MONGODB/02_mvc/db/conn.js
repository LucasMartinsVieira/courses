const { MongoClient } = require("mongodb");

const uri = "mongodb://localhost:27017/testingmongo";

const client = new MongoClient(uri);

const run = async () => {
  try {
    client.connect();
    console.log("Connected to MongoDB");
  } catch (err) {
    console.log(err);
  }
};

run();

module.exports = client;
