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

INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A', '1', 'Riz Basmati long grain de qualité supérieure\r\nRiz basmati long grain de qualité supérieure. Matière première importée d Inde ou du Pakistan.\r\nSemoule de BLE dur de qualité supérieure.', 'Riz Basmati le paquet 1kg ', 'Riz Basmati ', '0.8', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A', '2', 'Riz Basmati long grain de qualité supérieure\r\nRiz basmati long grain de qualité supérieure. Matière première importée d Inde ou du Pakistan.\r\nSemoule de BLE dur de qualité supérieure.', 'Riz Basmati le paquetRiz B 2kg ', 'Riz Basmati ', '1', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '3', 'Riz Basmati long grain de qualité supérieure\r\nRiz basmati long grain de qualité supérieure. Matière première importée d Inde ou du Pakistan.\r\nSemoule de BLE dur de qualité supérieure', 'Riz Basmati le paquet 5kg ', 'Riz Basmati ', '2.5', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '4', 'Pâtes alimentaires de qualité supérieure\r\nSemoule de BLE dur de qualité supérieure.\r\nPeut contenir des traces d œufs.', 'Pâtes Coquillettes le paquet de 1 kg', 'Pâtes 1kg ', '0.60', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '5', 'Pâtes alimentaires de qualité supérieure\r\nSemoule de BLE dur de qualité supérieure.\r\nPeut contenir des traces d œufs.', 'Pâtes Coquillettes le paquet de 2 kg', 'Pâtes 2kg ', '1.2', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '6', 'Pâtes alimentaires de qualité supérieure\r\nSemoule de BLE dur de qualité supérieure.\r\nPeut contenir des traces d œufs.', 'Pâtes Coquillettes le paquet de 5 kg', 'Pâtes 5kg ', '2', NULL, NULL, '1', '2', NULL, NULL);
 
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '7', 'Ingrédients : 100% semoule de BLE dur de qualité supérieure', 'Pâtes Spaghetti Panzani\r\nle paquet de 1 kg', 'Spaghetti 1 kg', '1', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '8', 'Ingrédients : 100% semoule de BLE dur de qualité supérieure', 'Pâtes Spaghetti Panzani\r\nle paquet de 3 kg', 'Spaghetti 3 kg', '1.5', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '9', 'Ingrédients : 100% semoule de BLE dur de qualité supérieure', 'Pâtes Spaghetti Panzani\r\nle paquet de 5 kg', 'Spaghetti 5 kg', '2.5', NULL, NULL, '1', '2', NULL, NULL);
 
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '10', 'Couscous moyens\r\nSemoule de BLE dur de qualité supérieure.', 'Couscous grain moyen paquet de 1 kg', 'Couscous 1 kg', '1.10', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '11', 'Couscous moyens\r\nSemoule de BLE dur de qualité supérieure.', 'Couscous grain moyen paquet de 3 kg', 'Couscous 3 kg', '2.50', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '12', 'Couscous moyens\r\nSemoule de BLE dur de qualité supérieure.', 'Couscous grain moyen paquet de 5 kg', 'Couscous 5 kg', '3.50', NULL, NULL, '1', '2', NULL, NULL);

INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '13', 'Blé dur précuit.\r\nPeut contenir des traces de soja.', 'Blé délicat Carrefour\r\nla boîte de 1kg', 'Blé délicat 1kg', '1.34', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '14', 'Blé dur précuit.\r\nPeut contenir des traces de soja.', 'Blé délicat Carrefour\r\nla boîte de 2kg', 'Blé délicat 2kg', '2.1', NULL, NULL, '1', '2', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '15', 'Blé dur précuit.\r\nPeut contenir des traces de soja.', 'Blé délicat Carrefour\r\nla boîte de 5kg', 'Blé délicat 5kg', '3.2', NULL, NULL, '1', '2', NULL, NULL);

INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '16', 'Lentillesss vertes sachet 1kg\r\n100% lentilles vertes', 'Lentilles vertes le paquet de 1kg', 'Blé délicat 1kg', '1.1', NULL, NULL, '1', '1', NULL, NULL); 
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '17', 'Lentilles vertes sachet 1kg\r\n100% lentilles vertes', 'Lentilles vertes le paquet de 2kg', 'Blé délicat 2kg', '2.1', NULL, NULL, '1', '1', NULL, NULL); 
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '18', 'Lentilles vertes sachet 1kg\r\n100% lentilles vertes', 'Lentilles vertes le paquet de 2kg', 'Blé délicat 5kg', '3.5', NULL, NULL, '1', '1', NULL, NULL); 

INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '19', 'Lentilles corail\r\nPeut contenir des céréales contenant du gluten.', 'Lentilles corail la boîte de 1kg', 'Lentilles corail 1kg', '1.8', NULL, NULL, '1', '1', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '20', 'Lentilles corail\r\nPeut contenir des céréales contenant du gluten.', 'Lentilles corail la boîte de 2kg', 'Lentilles corail 2kg', '3', NULL, NULL, '1', '1', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '21', 'Lentilles corail\r\nPeut contenir des céréales contenant du gluten.', 'Lentilles corail la boîte de 5kg', 'Lentilles corail 5kg', '4.5', NULL, NULL, '1', '1', NULL, NULL);

INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '22', 'Pois cassés. Peut contenir des traces de gluten', 'Pois cassé 1kg', 'Pois cassé la boite de 1kg', '1.8', NULL, NULL, '1', '1', NULL, NULL);
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '23', 'Pois cassés. Peut contenir des traces de gluten', 'Pois cassé 2kg', 'Pois cassé la boite de 2kg', '3.5', NULL, NULL, '1', '1', NULL, NULL); 
INSERT INTO produit ( typeProduit, id, description, libelle, libelleCourt, prix, adulte, sexe, idTypeProduit, idNatureAliment, idNatureFourniture, idNatureVetement)VALUES ('A',  '24', 'Pois cassés. Peut contenir des traces de gluten', 'Pois cassé 5kg', 'Pois cassé la boite de 5kg', '4.5', NULL, NULL, '1', '1', NULL, NULL); 

INSERT INTO association(raisonSociale,siret,ape,dateAcceptation,dateFin) VALUES ('Croix Rouge','80295478500028','0001A',NULL,NULL);
INSERT INTO association(raisonSociale,siret,ape,dateAcceptation,dateFin) VALUES ('Resto Du Coeur','80295478500029','0002A',NULL,NULL);
INSERT INTO association(raisonSociale,siret,ape,dateAcceptation,dateFin) VALUES ('Action Contre La Faim','80295478500030','0011A',NULL,NULL);
INSERT INTO association(raisonSociale,siret,ape,dateAcceptation,dateFin) VALUES ('Aide Et Action','80295478500050','0070A',NULL,NULL);
INSERT INTO association(raisonSociale,siret,ape,dateAcceptation,dateFin) VALUES ('Human Appeal','80295478500060','00501A',NULL,NULL);
INSERT INTO packAssociation(id,dateAjout) VALUES (1,NULL);
INSERT INTO packAssociation(id,dateAjout) VALUES (2,NULL);
INSERT INTO packAssociation(id,dateAjout) VALUES (3,NULL);
INSERT INTO pack(id,libelle,prix) VALUES (1,pack1,10.0);
INSERT INTO pack(id,libelle,prix) VALUES (2,pack2,20.0);
INSERT INTO pack(id,libelle,prix) VALUES (3,pack3,30.0);
INSERT INTO packDonateur(id,dateModification) VALUES (1,NULL);
INSERT INTO packDonateur(id,dateModification) VALUES (2,NULL);
INSERT INTO packDonateur(id,dateModification) VALUES (3,NULL);
INSERT INTO don(id,dateDon) VALUES (1,NULL);
INSERT INTO don(id,dateDon) VALUES (2,NULL);
INSERT INTO don(id,dateDon) VALUES (3,NULL);
 