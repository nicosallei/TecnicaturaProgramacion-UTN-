import {Router} from 'express'
import {getArticulos, getArticulosXID, crearArticulo, actualizarArticulo, eliminarArticulo} from './controlador/controlador'

const router = Router();

router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));

router.get('/articulos', getArticulos);
router.get('/articulos/:id', getArticulosXID);
router.post('/insert', crearArticulo);//insert
router.put('/update', actualizarArticulo);//update
router.delete('/delete/:id', eliminarArticulo);//eliminar

export default router;