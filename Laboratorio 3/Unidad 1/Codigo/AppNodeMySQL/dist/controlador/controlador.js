"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.eliminarArticulo = exports.actualizarArticulo = exports.crearArticulo = exports.getArticulosXID = exports.getArticulos = void 0;
const mysqldb_1 = require("../mysqldb");
const getArticulos = (req, res) => new Promise((resolve, reject) => {
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM articulo limit 10', (err, results) => {
            if (err)
                console.error(err);
            //console.log('User Query Results: ', results);
            res.send(results);
        });
    });
});
exports.getArticulos = getArticulos;
const getArticulosXID = (req, res) => new Promise((resolve, reject) => {
    const idArt = parseInt(req.params.id);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        connection.query('SELECT * FROM articulo WHERE id = ?', [idArt], (err, results) => {
            if (err)
                console.error(err);
            res.send(results);
        });
    });
});
exports.getArticulosXID = getArticulosXID;
const crearArticulo = (req, res) => new Promise((resolve, reject) => {
    const { fechaAlta, codigo, denominacion, precio, publicado } = req.body;
    var values = [fechaAlta, codigo, denominacion, precio, publicado];
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else {
            let sql = 'INSERT INTO articulo(fechaAlta, codigo, denominacion, precio, publicado) VALUES (?, ?, ?, ?, ?)';
            connection.query(sql, values, (err, results) => {
                if (err) {
                    console.error(err);
                    res.json({ message: "Error al tratar de insertar" });
                }
                else {
                    res.json({ message: "Articulo Insertado con exito" });
                }
            });
        }
    });
});
exports.crearArticulo = crearArticulo;
const actualizarArticulo = (req, res) => new Promise((resolve, reject) => {
    const { id, fechaAlta, codigo, denominacion, precio, publicado } = req.body;
    var values = [fechaAlta, codigo, denominacion, precio, publicado, id];
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else {
            let sql = 'UPDATE articulo SET fechaAlta=?, codigo=?, denominacion=?, precio=?, publicado=? WHERE id=?';
            connection.query(sql, values, (err, results) => {
                if (err) {
                    console.error(err);
                    res.json({ message: "Error al actualizar " + err });
                }
                else {
                    res.json({ message: "Articulo Actualizado con exito" });
                }
            });
        }
    });
});
exports.actualizarArticulo = actualizarArticulo;
const eliminarArticulo = (req, res) => new Promise((resolve, reject) => {
    const idArt = parseInt(req.params.id);
    mysqldb_1.cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        connection.query('DELETE FROM articulo WHERE id = ?', [idArt], (err, results) => {
            if (err) {
                console.error(err);
                res.json({ message: "Error al tratar de Eliminar" });
            }
            else {
                res.json({ message: "Articulo Eliminado con exito" });
            }
        });
    });
});
exports.eliminarArticulo = eliminarArticulo;
