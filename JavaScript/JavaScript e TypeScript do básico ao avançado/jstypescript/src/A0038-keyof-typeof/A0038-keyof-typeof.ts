type ColorsObj = typeof colorsObj
type ColorsKeys = keyof ColorsObj


const colorsObj = {
  red: "red",
  green: "green",
  blue: "blue",
  purple: "purple"
}

function translateColor(color: ColorsKeys, colors: ColorsObj) {
  return colors[color]
}

console.log(translateColor('red', colorsObj))
