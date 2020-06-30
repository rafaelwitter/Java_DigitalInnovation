const sequelize = require('../_database')

//criada a variavel models para atribuir os objetos,
// participante e eventos
const models = {
  evento: require('./evento'),
  participante: require('./participante'),
  sequelize: sequelize
}

module.exports = models
