"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const controlador_1 = require("./controlador/controlador");
const router = express_1.Router();
router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));
router.get('/articulos', controlador_1.getArticulos);
router.get('/articulos/:id', controlador_1.getArticulosXID);
router.post('/insert', controlador_1.crearArticulo); //insert
router.put('/update', controlador_1.actualizarArticulo); //update
router.delete('/delete/:id', controlador_1.eliminarArticulo); //eliminar
exports.default = router;
