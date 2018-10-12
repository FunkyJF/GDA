INSERT INTO Personne(typePersonne,id,prenom,nom,email) VALUES('Association',1,'olie','Condor','olie.condor@gmail.com');
INSERT INTO Personne(typePersonne,id,prenom,nom,email) VALUES('Association',2,'alain','Therieur','at@gmail.com');
INSERT INTO Personne(typePersonne,id,prenom,nom,email) VALUES('Administrateur',3,'jean','Bon','jb@gmail.com');
INSERT INTO Personne(typePersonne,id,prenom,nom,email) VALUES('Donateur',4,'jean','Phil','jp@gmail.com');

INSERT INTO naturealiment (id, nature) VALUES ('1', 'Légumes secs');
INSERT INTO naturealiment (id, nature) VALUES ('2', 'Féculents');
INSERT INTO naturealiment (id, nature) VALUES ('3', 'Les matières grasses'); 
INSERT INTO naturealiment (id, nature) VALUES ('4', 'Les purées en poudre'); 
INSERT INTO naturealiment (id, nature) VALUES ('5', 'Les conserve légumes');
INSERT INTO naturealiment (id, nature) VALUES ('6', 'Les conserve viandes');
INSERT INTO naturealiment (id, nature) VALUES ('7', 'Les plats cuisinés');
INSERT INTO naturealiment (id, nature) VALUES ('8', 'Petit déjeuner');


INSERT INTO naturefourniture (id, nature) VALUES ('1', 'Petites fournitures');
INSERT INTO naturefourniture (id, nature) VALUES ('2', 'Ecriture et Dessin');
INSERT INTO naturefourniture (id, nature) VALUES ('3', 'Cahier et papeterie');
INSERT INTO naturefourniture (id, nature) VALUES ('4', 'Cartable et trousse'); 
INSERT INTO naturefourniture (id, nature) VALUES ('5', 'Calculatrice');

INSERT INTO naturevetement (id, nature) VALUES ('1', 'Chaussure');
INSERT INTO naturevetement (id, nature) VALUES ('2', 'sous-vêtements');
INSERT INTO naturevetement (id, nature) VALUES ('3', 'Vêtement');
INSERT INTO naturevetement (id, nature) VALUES ('4', 'Survêtement');

INSERT INTO typeproduit (id, Type) VALUES ('1', 'Alimentaire');
INSERT INTO typeproduit (id, Type) VALUES ('2', 'Vestimentaire');
INSERT INTO typeproduit (id, Type) VALUES ('3', 'Fourniture scolaire');

INSERT INTO produit (typeProduit, id, description, libelle, libelleCourt, prix, idTypeProduit, idNatureAliment) VALUES ('Aliment', 1,'Riz Basmati long grain de qualité supérieure\r\nRiz basmati long grain de qualité supérieure. Matière première importée d\Inde ou du Pakistan.', 'Riz Basmati le paquet 1kg ', 'Riz Basmati ', 0.8, 1, 2);
INSERT INTO produit (typeProduit, id, description, libelle, libelleCourt, prix, idTypeProduit, idNatureAliment) VALUES ('Aliment', 3,'Riz Basmati long grain de qualité supérieure\r\nRiz basmati long grain de qualité supérieure. Matière première importée d Inde ou du Pakistan.', 'Riz Basmati le paquet 5kg ', 'Riz Basmati ', 2.5, 1, 2);
INSERT INTO produit (typeProduit, id, description, libelle, libelleCourt, prix, idTypeProduit, idNatureAliment) VALUES ('Aliment', 4, 'Pâtes alimentaires de qualité supérieure\r\nSemoule de BLE dur de qualité supérieure.\r\nPeut contenir des traces d\œufs.','Pâtes Coquillettes le paquet de 1 kg', 'Pâtes 1kg ', 0.60, 1, 2);
INSERT INTO produit (typeProduit, id, description, libelle, libelleCourt, prix, idTypeProduit, idNatureAliment) VALUES ('Aliment', 5, 'Pâtes alimentaires de qualité supérieure\r\nSemoule de BLE dur de qualité supérieure.\r\nPeut contenir des traces d\œufs.', 'Pâtes Coquillettes le paquet de 2 kg', 'Pâtes 2kg ', 1.2, 1, 2);
INSERT INTO produit (typeProduit, id, description, libelle, libelleCourt, prix, idTypeProduit, idNatureAliment) VALUES ('Aliment', 6, 'Pâtes alimentaires de qualité supérieure\r\nSemoule de BLE dur de qualité supérieure.\r\nPeut contenir des traces d\œufs.', 'Pâtes Coquillettes le paquet de 5 kg', 'Pâtes 5kg ', 2, 1, 2)