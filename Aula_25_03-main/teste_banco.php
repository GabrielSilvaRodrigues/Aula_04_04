<?php
    $banco = new PDO('sqLite:meu_banco.db');
    $sql = 'SELECT * FROM';
    $stmt = $banco->query($sql);
    $tables = $stmt->fetchAll(PDO::FETCH_ASSOC);
?>