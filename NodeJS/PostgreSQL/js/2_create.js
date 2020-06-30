const db = require('./_database')

async function createTables(){
  await connect()

  await query(`CREATE TABLE evento(
   id serial PRIMARY KEY,
   nome VARCHAR (50) UNIQUE NOT NULL
  )`)

  await query(`CREATE TABLE participante(
   id serial PRIMARY KEY,
   nome VARCHAR (50) UNIQUE NOT NULL
  )`)

  await query(`CREATE TABLE evento_participante(
    evento_id integer NOT NULL,
    participante_id integer NOT NULL,
    PRIMARY KEY (evento_id, participante_id),
    FOREIGN KEY (evento_id) REFERENCES evento (id),
    FOREIGN KEY (participante_id) REFERENCES participante (id)
  )`)

  await end()

  console.log("Tabelas Criadas");
}

createTables()
