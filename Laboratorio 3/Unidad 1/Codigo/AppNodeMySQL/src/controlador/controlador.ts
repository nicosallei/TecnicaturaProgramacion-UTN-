import { Request, Response } from "express";
import { cxMysql } from '../mysqldb';

export const getArticulos = (req:Request, res:Response) => new Promise((resolve, reject) => {
    cxMysql.getConnection((err, connection) => {
        if (err){ 
          console.error(err);
          res.send(err);
          return;
        }
        console.log('MySQL Connection: ', connection.threadId);
        connection.query('SELECT * FROM articulo limit 10', (err, results) => {
          if (err) console.error(err);
          //console.log('User Query Results: ', results);
          res.send(results)
        });
        
      });
  }); 

export const getArticulosXID = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const idArt = parseInt(req.params.id);
    cxMysql.getConnection((err, connection) => {
        if (err){
          console.error(err);
          res.send(err);
          return;
        } 
        connection.query('SELECT * FROM articulo WHERE id = ?', [idArt], (err, results) => {
          if (err) console.error(err);
          res.send(results)
        });
      });
  });

export const crearArticulo = (req:Request, res:Response) => new Promise((resolve, reject) => {
    
    const {fechaAlta, codigo, denominacion, precio, publicado} = req.body;
    var values = [fechaAlta, codigo, denominacion, precio, publicado];
    cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else{
            let sql:string = 'INSERT INTO articulo(fechaAlta, codigo, denominacion, precio, publicado) VALUES (?, ?, ?, ?, ?)';
            connection.query(sql, values, (err, results) => {
                if (err) {
                  console.error(err);
                  res.json({message:"Error al tratar de insertar"})
                }else{
                  res.json({message:"Articulo Insertado con exito"})
                }
              });
        }          
      });
});

export const actualizarArticulo = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const {id, fechaAlta, codigo, denominacion, precio, publicado} = req.body;
    var values = [fechaAlta, codigo, denominacion, precio, publicado, id];
    cxMysql.getConnection((err, connection) => {
        if (err) {
            console.error(err);
            res.send(err);
            return;
        }
        else{
            let sql:string = 'UPDATE articulo SET fechaAlta=?, codigo=?, denominacion=?, precio=?, publicado=? WHERE id=?';
            connection.query(sql, values, (err, results) => {
                if (err) {
                  console.error(err);
                  res.json({message:"Error al actualizar " + err})
                }else{
                  res.json({message:"Articulo Actualizado con exito"})
                }
               
              });
        }          
      });
});

export const eliminarArticulo = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const idArt = parseInt(req.params.id);
    cxMysql.getConnection((err, connection) => {
          if (err) {
            console.error(err);
            res.send(err);
            return;
          }
          connection.query('DELETE FROM articulo WHERE id = ?', [idArt],(err, results) => {
          if (err) {
            console.error(err);
            res.json({message:"Error al tratar de Eliminar"})
          }else{
            res.json({message:"Articulo Eliminado con exito"})
          }
          
        });
      });
});