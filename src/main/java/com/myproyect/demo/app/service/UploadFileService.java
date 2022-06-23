package com.myproyect.demo.app.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.myproyect.demo.app.data.Computador;
import com.myproyect.demo.app.data.Insumos;
import com.myproyect.demo.app.data.Proveedor;
import com.myproyect.demo.app.data.Usuario;
import com.myproyect.demo.app.security.UsuarioService;

@Service
public class UploadFileService {
	@Autowired
	UsuarioService usuarioService;
	List<Usuario> listUsuario = new ArrayList<>();
	
	@Autowired
	ProveedorService proveedorService;
	List<Proveedor> listProveedor = new ArrayList<>();
	
	@Autowired
	InsumosService insumosService;
	List<Insumos> listInsumos = new ArrayList<>();
	
	@Autowired
	ComputadorService computadorService;
	List<Computador> listComputador = new ArrayList<>();
	
	
	
	public void guardarFileProveedor(MultipartFile file)throws IOException{
		System.out.println("fileC"+ file.getOriginalFilename());
		InputStream file1 = file.getInputStream();
		XSSFWorkbook libroProveedor = new XSSFWorkbook(file1);
		XSSFSheet hojaProveedor = libroProveedor.getSheetAt(0);
		Iterator<Row> filasProveedor = hojaProveedor.iterator();
		Iterator<Cell> celdasProveedor;
		Row fila;
		Cell celda;
		filasProveedor.next();
		while(filasProveedor.hasNext()) {
			fila = filasProveedor.next();
			celdasProveedor = fila.cellIterator();
			Proveedor proveedor = new Proveedor();
			while (celdasProveedor.hasNext()) {
				celda=celdasProveedor.next();
				int index = celda.getColumnIndex();
				switch(index) {
					case 0:{
						break;
					}
					case 1:{
						proveedor.setCorreo(celdasProveedor.toString());
						break;
					}
					case 2:{
						proveedor.setEstado(celdasProveedor.toString());
						break;
					}
					case 3:{
						proveedor.setNombreProveedor(celdasProveedor.toString());
						break;
					}/*
					case 4:{
						proveedor.setTelefono(celdasProveedor.toString());
						break;
					}*/
					default:break;
				}
			}
			this.listProveedor.add(proveedor);
		}
		libroProveedor.close();
		this.proveedorService.saveAll(listProveedor);
	}
	public void guardarFile(MultipartFile path)throws IOException{

		System.out.println("fileC"+ path.getOriginalFilename());
		InputStream file = path.getInputStream();
		XSSFWorkbook libro = new XSSFWorkbook(file);
		XSSFSheet hoja = libro.getSheetAt(0);
		Iterator<Row> filas = hoja.iterator();
		Iterator<Cell> celdas;
		Row fila;
		Cell celda;
		filas.next();
		while(filas.hasNext()) {
			fila = filas.next();
			celdas = fila.cellIterator();
			Usuario usuario = new Usuario();
			while(celdas.hasNext()) {
				celda = celdas.next();
				int index = celda.getColumnIndex();
				switch(index) {
					case 0: {
						//usuario.setIdUsuario((long) celda.getNumericValue());
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 1: {
						usuario.setPassword(celda.toString());
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 2: {
						usuario.setDni(Integer.valueOf(celda.toString()));
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 3: {
						usuario.setEmail(celda.toString());
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 4: {
						usuario.setEstado(celda.toString());
						System.out.println(index);
						System.out.println(celda);
						break;
					}/*crear un paquete adicional para convercion de fecha en un metodo
					case 5: {
						usuario.setFechaIngreso(formato.parse(celda.toString()));
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 6: {
						usuario.setFechadenacimiento(formato.parse(celda.toString()));
						System.out.println(index);
						System.out.println(celda);
						break;
					}*/
					case 7: {
						usuario.setHorario(celda.toString());
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 8: {
						usuario.setNombre(celda.toString());
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 9: {
						usuario.setTelefono(celda.toString());
						System.out.println(index);
						System.out.println(celda);
						break;
					}/*
					case 10: {
						usuario.setAreaidArea((usuario) celda.getColumnIndex());
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 11: {
						usuario.setIdCalendario(Integer.valueOf(celda.toString()));
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 12: {
						usuario.setIdInventario(inventario.getIdInventario);
						System.out.println(index);
						System.out.println(celda);
						break;
					}
					case 13: {
						usuario.setIdRol(rol.idrol.valueOf(celda.toString()));
						System.out.println(index);
						System.out.println(celda);
						break;
					}*/
				}
			}
			this.listUsuario.add(usuario);
		}
		libro.close();
		this.usuarioService.saveAll(listUsuario);
	}
	

	
	public void guardarFileInsumos(MultipartFile file)throws IOException{
		System.out.println("fileC"+ file.getOriginalFilename());
		InputStream file2 = file.getInputStream();
		XSSFWorkbook libroInsumos = new XSSFWorkbook(file2);
		XSSFSheet hojaInsumos = libroInsumos.getSheetAt(0);
		Iterator<Row> filasInsumos = hojaInsumos.iterator();
		Iterator<Cell> celdasInsumos;
		Row row;
		Cell cell;
		filasInsumos.next();
		while(filasInsumos.hasNext()) {
			Insumos insumos = new Insumos();
			row = filasInsumos.next();
			celdasInsumos = row.cellIterator();
			while (celdasInsumos.hasNext()) {
				cell=celdasInsumos.next();
				int index = cell.getColumnIndex();
				switch(index) {
					case 0:{
						insumos.setIdInsumo(null);
						break;
					}
					case 1:{
						insumos.setCantidadDisponible(null);
						break;
					}
					case 2:{
						insumos.setDescripcion(null);
						break;
					}
					case 3:{
						insumos.setEstado(null);
						break;
					}
					case 4:{
						insumos.setIdProveedor(null);
						break;
					}
					case 5:{
						insumos.setIdUsuario(index);
						break;
					}
					case 6:{
						insumos.setNombreInsumo(null);
						break;
					}
					case 7:{
						insumos.setIdInventario(null);
						break;
					}
					default:break;
				}
			}
			this.listInsumos.add(insumos);
		}
		libroInsumos.close();
		/*this.insumosService.saveAll(listInsumos);*/
	}
	
	public void guardarFileComputador(MultipartFile file)throws IOException{
		System.out.println("fileC"+ file.getOriginalFilename());
		InputStream file3 = file.getInputStream();
		XSSFWorkbook libroComputador = new XSSFWorkbook(file3);
		XSSFSheet hojaComputador = libroComputador.getSheetAt(0);
		Iterator<Row> filasComputador = hojaComputador.iterator();
		Iterator<Cell> celdasComputador;
		Row row;
		Cell cell;
		filasComputador.next();
		while(filasComputador.hasNext()) {
			Computador computador = new Computador();
			row = filasComputador.next();
			celdasComputador = row.cellIterator();
			while (celdasComputador.hasNext()) {
				cell=celdasComputador.next();
				int index = cell.getColumnIndex();
				switch(index) {
					case 0:{
						computador.setIdComputador(null);
						break;
					}
					case 1:{
						computador.setColor(null);
						break;
					}
					case 2:{
						computador.setDescripcion(null);
						break;
					}
					case 3:{
						computador.setEstado(null);
						break;
					}
					case 4:{
						computador.setIdUsuarios(index);
						break;
					}
					case 5:{
						computador.setMarca(null);
						break;
					}
					case 6:{
						computador.setModelo(null);
						break;
					}
					case 7:{
						computador.setIdInventario(null);
						break;
					}
					default:break;
				}
			}
			this.listComputador.add(computador);
		}
		libroComputador.close();
		/*this.computadorService.saveAll(listComputador);*/
	}
	
}
