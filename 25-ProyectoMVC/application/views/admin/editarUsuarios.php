<?php
  $dataHeader['titulo'] = "Editar Usuario";
  $this->load->view('layouts/header', $dataHeader);
?>
<?php
  $dataSidebar['session'] = $session;
  $dataSidebar['optionSelected'] = 'openEditarUser';
  $this->load->view('layouts/sidebar', $dataSidebar);
?>
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <div class="col-12 m-0 p-3">
          <form action="<?=base_url('index.php/Personas/editarUsuario')?>" method="post">
            <div class="row p-0 m-0 text-center">
              <label for="" class="text-primary form-label"><h1><b>INGRESE LA CEDULA DEL USUARIO A BUSCAR</b></h1></label>
              <div class="col-10 ms-3">
                <input type="text" name="cedulaBuscar" class="form-control">
              </div>
              <div class="col-1">
                <input type="submit" class="btn btn-primary" value="Buscar">
              </div>
            </div>
          </form>
        </div>
      </div>

<?php
  $this->load->view('layouts/footer');
?>