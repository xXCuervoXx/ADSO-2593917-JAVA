<?php
  $dataHeader['titulo'] = "Crear Usuario";
  $this->load->view('layouts/header', $dataHeader);
?>
<?php
  $dataSidebar['session'] = $session;
  $dataSidebar['optionSelected'] = 'openCreateUser';
  $this->load->view('layouts/sidebar', $dataSidebar);
?>
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <div class="col-12 m-0 p-3 pb-5 border border-1">
          <h1 class="text-primary text-center">FORMULARIO DE CREACION DE USUARIOS</h1>
          <form action="<?=base_url('index.php/Personas/crearUsuario')?>" method="post">
          <div class="col">
            <div class="row mt-2">
              <label class="form-label" for=""><b><h3>Cedula:</h3></b></label>
              <input type="text" class="form-control" name="cedula" required>
            </div>
            <div class="row mt-2">
              <label class="form-label" for=""><b><h3>Nombres:</h3></b></label>
              <input type="text" class="form-control" name="nombres" required>
            </div>
            <div class="row mt-2">
              <label class="form-label" for=""><b><h3>Apellidos:</h3></b></label>
              <input type="text" class="form-control" name="apellidos" required>
            </div>
            <div class="row mt-2">
              <label class="form-label" for=""><b><h3>Telefono:</h3></b></label>
              <input type="text" class="form-control" name="telefono" required>
            </div>
            <div class="row mt-2">
              <label class="form-label" for=""><b><h3>Direccion:</h3></b></label>
              <input type="text" class="form-control" name="direccion" required>
            </div>
            <div class="row mt-2">
              <label class="form-label" for=""><b><h3>Email:</h3></b></label>
              <input type="email" class="form-control" name="email" required>
            </div>
            <div class="row mt-2">
              <label class="form-label" for=""><b><h3>Foto:</h3></b></label>
              <input type="text" class="form-control" name="foto" value="default.png">
            </div>
            <div class="row-2 text-center mt-3">
              <input type="submit" class="btn btn-outline-primary" value="Crear Usuario">
            </div>
          </form>
          </div>
        </div>
      </div>

<?php
  $this->load->view('layouts/footer');
?>