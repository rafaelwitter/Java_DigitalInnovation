
const db = require('./_database')

async function dropTables(){
  await connect()
  await query(`DROP TABLE evento CASCADE`)
  await query(`DROP TABLE participante CASCADE`)
  await query(`DROP TABLE evento_participante CASCADE`)
  await end()

  console.log("Tabelas removidas");
}

dropTables()
