require('jwt')
require('config')

const generateToken = (payload) => {
    return jwt.sign(payload, config.privateKey, config.authOptions)
}

export {
    generateToken,
}