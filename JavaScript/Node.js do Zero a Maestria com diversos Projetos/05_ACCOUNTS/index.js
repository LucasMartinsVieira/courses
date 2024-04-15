const inquirer = require("inquirer");
const chalk = require("chalk");
const fs = require("fs");

const operation = () => {
  inquirer
    .prompt([
      {
        type: "list",
        name: "action",
        message: "What you want to do?",
        choices: [
          "Create Account",
          "Check Balance",
          "Deposit",
          "Withdraw Money",
          "Quit",
        ],
      },
    ])
    .then((answer) => {
      const action = answer["action"];

      if (action === "Create Account") {
        createAccount();
      } else if (action == "Check Balance") {
        getAccountBalance();
      } else if (action == "Deposit") {
        deposit();
      } else if (action == "Withdraw Money") {
        withdraw();
      } else if (action == "Quit") {
        console.log(chalk.bgBlue.black("Thanks for using accounts!"));
        process.exit();
      }
    })
    .catch((err) => console.log(err));
};

const createAccount = () => {
  console.log(chalk.bgGreen.black("Congratulation on choosing our bank!"));
  console.log(chalk.green("Set your account options below"));

  buildAccount();
};

const buildAccount = () => {
  inquirer
    .prompt([
      {
        name: "accountname",
        message: "Type a name for your account:",
      },
    ])
    .then((answer) => {
      const accountName = answer["accountname"];
      console.info(accountName);

      if (!fs.existsSync("accounts")) {
        fs.mkdirSync("accounts");
      }

      if (fs.existsSync(`accounts/${accountName}.json`)) {
        console.log(
          chalk.bgRed.black(
            "This account already exists, choose another name!",
          ),
        );
        buildAccount();
        return;
      }

      fs.writeFileSync(
        `accounts/${accountName}.json`,
        '{"balance": 0}',
        (err) => {
          console.log(err);
        },
      );

      console.log(
        chalk.green("Congratulations, your account has been created!"),
      );

      operation();
    })
    .catch((err) => console.log(err));
};

const deposit = () => {
  inquirer
    .prompt([
      {
        name: "accountName",
        message: "What is the name of your account?",
      },
    ])
    .then((answer) => {
      const accountName = answer["accountName"];

      if (!checkAccount(accountName)) return deposit();

      inquirer
        .prompt([
          {
            name: "amount",
            message: "How much you want to deposit",
          },
        ])
        .then((answer) => {
          const amount = answer["amount"];

          addAmount(accountName, amount);
          operation();
        })
        .catch((err) => console.log(err));
    })
    .catch((err) => console.log(err));
};

const checkAccount = (accountName) => {
  if (!fs.existsSync(`accounts/${accountName}.json`)) {
    console.log(
      chalk.bgRed.black("This account does not exist, choose another name"),
    );
    return false;
  }

  return true;
};

const addAmount = (accountName, amount) => {
  const accountData = getAccount(accountName);

  if (!amount) {
    console.log(chalk.bgRed.black("An error happened, try again later!"));
    return deposit();
  }

  accountData.balance = parseFloat(amount) + parseFloat(accountData.balance);
  fs.writeFileSync(
    `accounts/${accountName}.json`,
    JSON.stringify(accountData),
    (err) => {
      console.log(err);
    },
  );

  console.log(
    chalk.green(`The value of R$${amount} has been deposited on your account!`),
  );
};

const getAccount = (accountName) => {
  const accountJSON = fs.readFileSync(`accounts/${accountName}.json`, {
    encoding: "utf8",
    flag: "r",
  });

  return JSON.parse(accountJSON);
};

const getAccountBalance = () => {
  inquirer
    .prompt([
      {
        name: "accountName",
        message: "What is the name of your account?",
      },
    ])
    .then((answer) => {
      const accounName = answer["accountName"];

      if (!checkAccount(accounName)) return getAccountBalance();

      const accountData = getAccount(accounName);

      console.log(
        chalk.bgBlue.black(
          `Hello, the balance of your account is R$${accountData.balance}`,
        ),
      );

      operation();
    })
    .catch((err) => console.log(err));
};

const withdraw = () => {
  inquirer
    .prompt([
      {
        name: "accountName",
        message: "What is the name of your account",
      },
    ])
    .then((answer) => {
      const accountName = answer["accountName"];

      if (!checkAccount(accountName)) return withdraw();

      inquirer
        .prompt([
          {
            name: "amount",
            message: "How much you want to withdraw?",
          },
        ])
        .then((answer) => {
          const amount = answer["amount"];

          removeAmount(accountName, amount);
        })
        .catch((err) => console.log(err));
    })
    .catch((err) => console.log(err));
};

const removeAmount = (accountName, amount) => {
  const accountData = getAccount(accountName);

  if (!amount) {
    console.log(chalk.bgRed.black("An error happened, try again later!"));
    return withdraw();
  }

  if (accountData.balance < amount) {
    console.log(chalk.bgRed.black("Value unavailable!"));
    return operation();
  }

  accountData.balance = parseFloat(accountData.balance) - parseFloat(amount);

  fs.writeFileSync(
    `accounts/${accountName}.json`,
    JSON.stringify(accountData),
    (err) => console.log(err),
  );

  console.log(
    chalk.green(`A withdraw of R$${amount} was made from your account!`),
  );
  operation();
};

operation();
