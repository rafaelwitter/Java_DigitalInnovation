import model from './model'

class Controller{
    constructor(){}

    //select all
    getDates(){
        return model.find({});
    }

    select(req, res){
        this.getDates()
        .then(dates => res.status(200).json({'result': dates}))
        .catch(err => res.status(400).json({'result': err}));
    }

    selectOne(req, res){
        const id = {_id: req.params.id}
        this.getDatesById(id)
        .then(date => res.status(200).json({'result': date}))
        .catch(err => res.status(400).json({'result': err}));
    }

    //select one
    getDatesById(id){
        return model.find(id);
    }

    delete(req, res){
        const id = {_id: req.params.id}
        this.deleteDateById(id)
        .then(date => res.status(200).json({'result': 'date excluido: '+ date}))
        .catch(err => res.status(400).json({'result': err}));
    }

    //delect one
    deleteDateById(id){
        return model.deleteOne(id);
    }

    //update one
    updateDateById(id, data){
        return model.findByIdAndUpdate(id, data);
    }

    update(req, res){
        const id = {_id: req.params.id}
        const data = req.body;
        this.updateDateById(id, data)
        .then(date => res.status(200).json({'result': 'Date alterado: '+ date}))
        .catch(err => res.status(400).json({'result': err}));
    }

    //insert one
    createUser(data){
        return model.create(data);
    }

    insert(req, res){
        const data = req.body;
        this.createUser(data)
        .then(date => res.status(200).json({'result': 'Date alterado: '+ date}))
        .catch(err => res.status(400).json({'result': err}));
    }

    
}

export default Controller;