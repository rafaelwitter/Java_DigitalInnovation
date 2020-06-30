const Sequelize = require('sequelize')
const sequelize = require('../_database')

//cria o objeto evento
const Evento = sequelize.define('evento', {
  nome: {
    type: Sequelize.STRING
  },
})
module.exports = Evento

//cria a conexao com participante e evento em evento_participante
const Participante = require('./participante')
Evento.belongsToMany(Participante, {through: 'evento_participante'});
