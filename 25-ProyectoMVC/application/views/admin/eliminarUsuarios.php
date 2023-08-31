<?php
  $dataHeader['titulo'] = "Eliminar Usuarios";
  $this->load->view('layouts/header', $dataHeader);
?>
<?php
  $dataSidebar['session'] = $session;
  $dataSidebar['optionSelected'] = 'openDeleteUsers';
  $this->load->view('layouts/sidebar', $dataSidebar);
?>
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <div class="col-12 m-0 p-3">
          <h1 class="text-primary text-center">TABLA CON LISTA DE USUARIOS</h1>
          <br>
          <table class="col-12 border border-1 table table-striped">
            <thead>
              <th>#</th>
              <th>cedula</th>
              <th>Nombres</th>
              <th>Apellidos</th>
              <th>Telefono</th>
              <th>Direccion</th>
              <th>Email</th>
              <th>foto</th>
            </thead>
            <tbody>
              <?php
              $count=0;
                foreach ($personas as $persona) {
                  echo '
                      <tr>
                        <td>'.++$count.'</td>    
                        <td>'.$persona->cedula.'</td>    
                        <td>'.$persona->nombres.'</td>    
                        <td>'.$persona->apellidos.'</td>    
                        <td>'.$persona->telefono.'</td>    
                        <td>'.$persona->direccion.'</td>    
                        <td>'.$persona->email.'</td>    
                        <td>'.$persona->foto.'</td>
                        <td><a href="'.base_url('index.php/Personas/eliminar/'.$persona->cedula).'" type="button" class="btn btn-danger">Eliminar</a></td>    
                      </tr>    
                    ';
                }
              ?>
                
            </tbody>
          </table>
        </div>
      </div>

<?php
  $this->load->view('layouts/footer');
?>

      

?>