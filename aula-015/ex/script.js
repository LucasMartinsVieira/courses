const numero = Number(prompt("Digite um número"));
const numeroTitulo = document.getElementById("numero-titulo");
const raiz = document.getElementById("raiz");
const inteiro = document.getElementById("inteiro");
const nan = document.getElementById("nan");
const arr_baixo = document.getElementById("arr_baixo");
const arr_cima = document.getElementById("arr_cima");
const decimais = document.getElementById("decimais");


numeroTitulo.innerHTML = numero;
raiz.innerHTML = `<p>A Raiz quadrada: ${Math.sqrt(numero)} </p>`;
inteiro.innerHTML = `<p>${numero} é inteiro: ${Number.isInteger(numero)} </p>`;
nan.innerHTML = `<p>é NaN: ${isNaN(numero)}</p>`;
arr_baixo.innerHTML = `<p>Arrendondado para baixo: ${Math.floor(numero)} </p>`;
arr_cima.innerHTML = `<p>Arrendondado para cima: ${Math.ceil(numero)} </p>`;
decimais.innerHTML = `<p>Com duas casas decimais: ${numero.toFixed(2)} </p>`;
