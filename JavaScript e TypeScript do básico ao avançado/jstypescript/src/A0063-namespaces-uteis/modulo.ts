import _ from 'lodash'

_.mul = function(array: number[]): number {
  return array.reduce((total, current) => total * current, 1)
}


global.MYGLOBAL = 'LOOK AT HIM'

export default _
