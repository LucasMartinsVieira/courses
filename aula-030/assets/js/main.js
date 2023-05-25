const dia = new Date();

function getWeekDay(diaSemanaNum) {
  const diaSemanaText = ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sábado'];
  return diaSemanaText[diaSemanaNum];
  // let diaSemanaText
  // switch (diaSemanaNum) {
  //   case 0:
  //     diaSemanaText = 'Domingo'
  //     return diaSemanaText
  //   case 1:
  //     diaSemanaText = 'Segunda-Feira'
  //     return diaSemanaText
  //   case 2:
  //     diaSemanaText = 'Terça-Feira'
  //     return diaSemanaText
  //   case 3:
  //     diaSemanaText = 'Quarta-Feira'
  //     return diaSemanaText
  //   case 4:
  //     diaSemanaText = 'Quinta-Feira'
  //     return diaSemanaText
  //   case 5:
  //     diaSemanaText = 'Sexta-Feira'
  //     return diaSemanaText
  //   case 6:
  //     diaSemanaText = 'Sábado'
  //     return diaSemanaText
  //
  //   default:
  // }
}

function getMonthName(monthNum) {
  const monthName = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'];
  return monthName[monthNum];
  // let monthName
  // switch (monthNum) {
  //   case 0:
  //     monthName = 'Janeiro'
  //     return monthName
  //   case 1:
  //     monthName = 'Fevereiro'
  //     return monthName
  //   case 2:
  //     monthName = 'Março'
  //     return monthName
  //   case 3:
  //     monthName = 'Abril'
  //     return monthName
  //   case 4:
  //     monthName = 'Maio'
  //     return monthName
  //   case 5:
  //     monthName = 'Junho'
  //     return monthName
  //   case 6:
  //     monthName = 'Julho'
  //     return monthName
  //   case 7:
  //     monthName = 'Agosto'
  //     return monthName
  //   case 8:
  //     monthName = 'Setembro'
  //     return monthName
  //   case 9:
  //     monthName = 'Outubro'
  //     return monthName
  //   case 10:
  //     monthName = 'Novembro'
  //     return monthName
  //   case 11:
  //     monthName = 'Dezembro'
  //     return monthName
  // }
}

function zeroAEsquerda(num) {
  return num >= 10 ? num : `0${num}`;
}

const diaSemanaNum = dia.getDay()
const dayOfMonth = dia.getDate()
const monthNum = dia.getMonth()

const diaSemanaText = getWeekDay(diaSemanaNum);
const monthNameText = getMonthName(monthNum);
const yearNameText = dia.getFullYear();
const hourText = zeroAEsquerda(dia.getHours());
const minText = zeroAEsquerda(dia.getMinutes());

const msg = `${diaSemanaText}, ${dayOfMonth} de ${monthNameText} de ${yearNameText} ${hourText}:${minText}`

function getResultado(msg) {
  const h1 = document.querySelector('.container h1');
  return (h1.innerHTML = msg)
}

getResultado(msg)

const resultado = document.querySelector('#resultado');
const data2 = new Date();
const opcoes = {
  dateStyle: 'full',
  timeStyle: 'short',
}

// resultado.innerHTML = data2.toLocaleString('pt-BR', opcoes);
resultado.innerHTML = data2.toLocaleString('pt-BR', { dateStyle: 'full', timeStyle: 'short'});
