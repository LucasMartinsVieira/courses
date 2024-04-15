const fs = require("fs");

if (!fs.existsSync("./myfolder")) {
  console.log("Doesn't exist");
  fs.mkdirSync("My folder");
} else if (fs.existsSync("./myfolder")) {
  console.log("Exist");
}
