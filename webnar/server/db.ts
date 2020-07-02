import * as mongoose from 'mongoose'

class DataBase{

    private dburl = 'mongodb://127.0.0.1/Dates'
    private dbconnection
    
    constructor(){}
        
    createConnection(){
        mongoose.connect(this.dburl);
        this.logger(this.dburl)
    }
        
    logger(uri){
        this.dbconnection = mongoose.connection;
        this.dbconnection.on('connected', () => console.log("mongoose conectado."))
        this.dbconnection.on('error', error => console.error.bind(console, "erro na conexão: " + error))
    }
}

export default DataBase;