const express = require('express');
const morgan = require('morgan');
const ejsMate = require('ejs-mate');

const path = require('path');

const app = express();

app.engine('ejs', ejsMate)
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'pages'));
app.use(morgan('dev'));






app.get('/', (req, res) => {
    res.render('index')
})

app.listen(3000, () => {
    console.log('Connection On')
})