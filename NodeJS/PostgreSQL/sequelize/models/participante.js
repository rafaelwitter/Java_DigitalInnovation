const Sequelize = require('sequelize')
const sequelize = require('../_database')

//cria o objeto participante
const Participante = sequelize.define('participante', {
  nome: {
    type: Sequelize.STRING
  },
})

module.exports = Participante

//cria a conexao com participante e evento em evento_participante
const Evento = require('./evento')
Participante.belongsToMany(Evento, {through: 'evento_participante'});
