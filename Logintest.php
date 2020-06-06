<?php 
    $HostName = "localhost";
    $HostUser = "id13957989_kpgold";
    $HostPass = "1?Uogr8<qL=])]Mv";
    $DB = "id13957989_kpgoldcarwash";

    if($_SERVER['REQUEST_METHOD']=='POST'){
        $con = mysqli_connect($HostName,$HostUser,$HostPass,$DB);
        
        $email = $_POST['email'];
        $password = $_POST['password'];

        $sql = "SELECT role FROM users WHERE email='$email' AND password='$password'";

        $result = mysqli_query($con,$sql);
        $check = mysqli_fetch_array($result);

        if(isset($check))
        {
            echo "success";
        } else {
           echo "failure";
        }
         mysqli_close($con);
    }
?>