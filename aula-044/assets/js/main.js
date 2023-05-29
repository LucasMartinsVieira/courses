// try {
//   console.log(naoExisto);
// } catch (e) {
//   console.log('naoExisto não existe.')
//   console.log(e);
// }

const soma = (x, y) => {
  if (typeof x !== "number" || typeof y !== "number") {
    throw new ReferenceError("x e y presicam ser números");
  }

  return x + y;
};

try {
  console.log(soma(1, 2));
  // console.log(soma("1", 2));
} catch (e) {
  // console.log(e);
  console.log('Alguma coisa mais amigável pro usuário.');
}
