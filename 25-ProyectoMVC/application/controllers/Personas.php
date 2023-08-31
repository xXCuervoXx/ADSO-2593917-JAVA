<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Personas extends CI_Controller {
    public function __construct(){
		parent::__construct();
        $this->load->helper('form');
        $this->load->model('PersonasModel');
        $this->load->database();
        
	}
    public function index(){
        
    }
    public function consultarUsuarios(){
        $datos['personas'] = $this->PersonasModel->consultarPersonas();
        var_dump($datos['personas']);
        $this->load->view('admin/verUsuarios',$datos);
    }

	public function crearUsuario(){
		$data["cedula"] = $this->input->post("cedula");
        $data["nombres"] = $this->input->post("nombres");
        $data["apellidos"] = $this->input->post("apellidos");
        $data["telefono"] = $this->input->post("telefono");
        $data["direccion"] = $this->input->post("direccion");
        $data["email"] = $this->input->post("email");
        $data["foto"] = $this->input->post("foto");
        $this->PersonasModel->insertarPersona($data);
        redirect('admin/inicio/openCreateUser');
	}
    public function editarUsuario(){
        $cedulaBuscar = $this->input->post("cedulaBuscar");
        $this->PersonasModel->editUsuario($cedulaBuscar);
    }
    public function eliminar($persona_cedula){
        $this->PersonasModel->deletePersona($persona_cedula);
        redirect('admin/inicio/openDeleteUsers');
        
    }



}
