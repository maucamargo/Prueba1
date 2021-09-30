package com.BO.TiendaVirtualSB;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.TiendaVirtualSB.ClienteDAO;
import com.DTO.TiendaVirtualSB.ClienteVO;



@RestController
public class ClienteController {
	
	
	@RequestMapping("/registrarPersona")
	public void registrarPersona(ClienteVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.registrarPersona(persona);
	    
	 }
	   
	 
	 
	/**
	 * permite consultar l tabla Cliente como parametro Documento 
	 * @param documento 
	 * @return
	 */
	
	@RequestMapping("/consultarPersona")
	public ArrayList<ClienteVO> consultarPersona(int documento) {
		ClienteDAO Dao=new ClienteDAO(); 
	return 	Dao.consultarPersona(documento);
		
	}



	/**
	 * permite consultar la lista de Clientes
	 * @return
	 */
	@RequestMapping("/listarPersonas")
	public ArrayList< ClienteVO> listaDePersonas() {
		ClienteDAO Dao=new ClienteDAO(); 
			
		return Dao.listaDePersonas();
		
	}


}