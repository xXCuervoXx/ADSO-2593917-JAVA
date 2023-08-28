<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class PersonasModel extends CI_Model {
	public $table = 'personas';
	public function __construct(){
        $this->load->database();
    }

	public function getPersonaByEmail($email){
		$this->db->where('email', $email);
		$registros = $this->db->get('personas')->result();

		if (sizeof($registros)!=0) {
			return $registros[0];
		}else{
			return null;
		}
	}

	function insertarPersona($data){
		$this->db->insert($this->table, $data);
		// $this->load->view('admin/crearUsuario');
	}

	function editPersona($cedula){

	}

	public function consultarPersonas(){


		// $this->db->select('*');
		// $this->db->from('personas');
		// return $this->db->get()->result();
		$this->db->select();
        $this->db->from($this->personas);
        $query = $this->db->get();
		if($query->num_rows()>0){
			return $query->result();
			print_r($query);
		}else{
			return FALSE;
		}
        // $query = $this->db->query("SELECT * FROM personas")->result();
		// var_dump($query);
		// if($query->num_rows()>0){
		// 	return $query;
		// }else{
		// 	return [];
		// }
		
		
	}

}
