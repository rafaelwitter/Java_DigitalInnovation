import * as mongoose from 'mongoose'

const CrushSchema = new mongoose.Schema({
    nome: {type: String, required: true},
    apelido: {type: String, required: true, unique: true}, 
    createdAt: {typr: Date, default: Date.now}
})

export default mongoose.model('Dates', CrushSchema)