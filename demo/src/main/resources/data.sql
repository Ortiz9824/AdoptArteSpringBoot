-- Script de inicialización de datos para AdoptArte

-- Insertar especies de mascotas
INSERT INTO especie_mascota (Especie) VALUES 
('Perro'),
('Gato'),
('Conejo'),
('Hamster');

-- Insertar tamaños de mascotas
INSERT INTO tamaño_mascota (Tamaño) VALUES 
('Pequeño'),
('Mediano'),
('Grande');

-- Insertar estados de mascotas
INSERT INTO estado_mascota (Estado) VALUES 
('Disponible'),
('En proceso de adopción'),
('Adoptado'),
('En tratamiento médico');

-- Insertar perfiles de usuario
INSERT INTO perfil (descripcion_perfil) VALUES 
('Administrador'),
('Veterinario'),
('Voluntario'),
('Adoptante'),
('Afiliado');

-- Insertar usuarios de ejemplo
INSERT INTO usuario (NOMBRE_USUARIO, APELLIDO_USUARIO, DOCUMENTO_USUARIO, EMAIL_USUARIO, PASSWORD_USUARIO, DIRECCION_USUARIO, TELEFONO_USUARIO, Rol_ID_ROL) VALUES 
('Admin', 'Sistema', '12345678', 'admin@adoptarte.com', 'admin123', 'Calle 123 #45-67', '3001234567', 1),
('Juan', 'Pérez', '87654321', 'juan@email.com', 'password123', 'Carrera 45 #78-90', '3007654321', 4),
('María', 'García', '11223344', 'maria@email.com', 'password123', 'Avenida 68 #12-34', '3001122334', 4);

-- Insertar mascotas de ejemplo
INSERT INTO mascota (NOMBRE_MASCOTA, RAZA_MASCOTA, EDAD_MASCOTA, DESCRIPCION, Especie_Mascota_ID_Especie_Mascota, Tamaño_Mascota_ID_Tamaño_Mascota, Estado_Mascota_ID_Estado_Mascota, URL_IMAGEN_MASCOTA) VALUES 
('Max', 'Labrador', '3 años', 'Perro muy cariñoso y juguetón. Le encanta jugar con niños y es muy obediente.', 1, 3, 1, '/images/Perro1.png'),
('Luna', 'Persa', '2 años', 'Gata tranquila y cariñosa. Perfecta para familias con niños pequeños.', 2, 1, 1, '/images/negrito.jpeg'),
('Rocky', 'Bulldog', '4 años', 'Perro calmado y protector. Ideal para personas que buscan un compañero fiel.', 1, 2, 1, '/images/Perro2.jpg'),
('Mimi', 'Siamés', '1 año', 'Gata activa y curiosa. Le encanta explorar y jugar con juguetes.', 2, 1, 1, '/images/Perro3.jpg');

-- Insertar eventos de ejemplo
INSERT INTO evento (NOMBRE_EVENTO, FECHA_EVENTO, DIRECCION_EVENTO, DESCRIPCION_EVENTO, Usuario_ID_USUARIO_ADMIN_REFUGIO) VALUES 
('Jornada de Adopción', '2024-02-15', 'Parque Simón Bolívar', 'Ven y conoce a nuestras mascotas en busca de un hogar', 1),
('Vacunación Gratuita', '2024-02-20', 'Centro Comercial Gran Estación', 'Vacunación gratuita para mascotas de la comunidad', 1),
('Charla sobre Cuidado Animal', '2024-02-25', 'Biblioteca Nacional', 'Aprende sobre el cuidado responsable de mascotas', 1);
