CREATE TABLE `Patient` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`FIO` TEXT NOT NULL,
	`dateBirth` DATE NOT NULL,
	`login` TEXT NOT NULL,
	`hashPassword` TEXT NOT NULL,
	`numberPolicy` INT NOT NULL,
	`typePolis` INT NOT NULL,
	`sex` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Doctor` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`FIO` INT NOT NULL,
	`speciality` INT NOT NULL,
	`classification` INT NOT NULL,
	`rating` INT NOT NULL,
	`login` TEXT NOT NULL,
	`hashPassword` TEXT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Schedule` (
	`appointment_id` INT NOT NULL AUTO_INCREMENT,
	`idPatient` INT NOT NULL,
	`Medical_card_id` INT NOT NULL,
	`idDoctor` INT NOT NULL,
	`DateTime` DATETIME NOT NULL,
	`numberOffice` INT NOT NULL,
	`analysis_id` INT NOT NULL,
	`diagnosis_id` INT NOT NULL,
	`prescription_id` INT NOT NULL,
	PRIMARY KEY (`appointment_id`)
);

CREATE TABLE `Specialization` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`specialization_name` TEXT NOT NULL,
	`responsobilities` TEXT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Classification` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`classification_name` TEXT NOT NULL,
	`classification_salary_coefficient` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Prescription` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`schedule_id` INT NOT NULL,
	`medication_id` INT NOT NULL,
	`dosage` INT NOT NULL,
	`instructions` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Diagnosis` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` TEXT NOT NULL,
	`description` TEXT NOT NULL,
	`teraphy` TEXT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Medication` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` TEXT NOT NULL,
	`manufacturer` TEXT NOT NULL,
	`dosage_form` TEXT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Insurance_policy` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`patient_id` INT NOT NULL,
	`policy_number` INT NOT NULL,
	`insurance_company` TEXT NOT NULL,
	`expire_from` DATETIME NOT NULL,
	`expire_to` DATETIME NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Medical_card` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`patient_id` INT NOT NULL,
	`card_number` INT NOT NULL,
	`insurance_policy_id` INT NOT NULL,
	`register_date` DATETIME NOT NULL,
	`appointment_id` INT NOT NULL,
	`analysis_id` INT NOT NULL,
	`diagnosis_id` INT NOT NULL,
	`prescription_id` INT NOT NULL,
	`procedure_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Analysis` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`result_table` TEXT NOT NULL,
	`common_result` TEXT NOT NULL,
	`date` DATETIME NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Procedure` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`procedure_name` TEXT NOT NULL,
	`procedure_time` INT NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Doctor` ADD CONSTRAINT `Doctor_fk0` FOREIGN KEY (`speciality`) REFERENCES `Specialization`(`id`);

ALTER TABLE `Doctor` ADD CONSTRAINT `Doctor_fk1` FOREIGN KEY (`classification`) REFERENCES `Classification`(`id`);

ALTER TABLE `Schedule` ADD CONSTRAINT `Schedule_fk0` FOREIGN KEY (`idPatient`) REFERENCES `Patient`(`id`);

ALTER TABLE `Schedule` ADD CONSTRAINT `Schedule_fk1` FOREIGN KEY (`Medical_card_id`) REFERENCES `Medical_card`(`id`);

ALTER TABLE `Schedule` ADD CONSTRAINT `Schedule_fk2` FOREIGN KEY (`idDoctor`) REFERENCES `Doctor`(`id`);

ALTER TABLE `Schedule` ADD CONSTRAINT `Schedule_fk3` FOREIGN KEY (`analysis_id`) REFERENCES `Analysis`(`id`);

ALTER TABLE `Schedule` ADD CONSTRAINT `Schedule_fk4` FOREIGN KEY (`diagnosis_id`) REFERENCES `Diagnosis`(`id`);

ALTER TABLE `Schedule` ADD CONSTRAINT `Schedule_fk5` FOREIGN KEY (`prescription_id`) REFERENCES `Prescription`(`id`);

ALTER TABLE `Prescription` ADD CONSTRAINT `Prescription_fk0` FOREIGN KEY (`schedule_id`) REFERENCES `Schedule`(`id`);

ALTER TABLE `Prescription` ADD CONSTRAINT `Prescription_fk1` FOREIGN KEY (`medication_id`) REFERENCES `Medication`(`id`);

ALTER TABLE `Insurance_policy` ADD CONSTRAINT `Insurance_policy_fk0` FOREIGN KEY (`patient_id`) REFERENCES `Patient`(`id`);

ALTER TABLE `Medical_card` ADD CONSTRAINT `Medical_card_fk0` FOREIGN KEY (`patient_id`) REFERENCES `Patient`(`id`);

ALTER TABLE `Medical_card` ADD CONSTRAINT `Medical_card_fk1` FOREIGN KEY (`insurance_policy_id`) REFERENCES `Insurance_policy`(`id`);

ALTER TABLE `Medical_card` ADD CONSTRAINT `Medical_card_fk2` FOREIGN KEY (`appointment_id`) REFERENCES `Schedule`(`id`);

ALTER TABLE `Medical_card` ADD CONSTRAINT `Medical_card_fk3` FOREIGN KEY (`analysis_id`) REFERENCES `Analysis`(`id`);

ALTER TABLE `Medical_card` ADD CONSTRAINT `Medical_card_fk4` FOREIGN KEY (`diagnosis_id`) REFERENCES `Diagnosis`(`id`);

ALTER TABLE `Medical_card` ADD CONSTRAINT `Medical_card_fk5` FOREIGN KEY (`prescription_id`) REFERENCES `Prescription`(`id`);

ALTER TABLE `Medical_card` ADD CONSTRAINT `Medical_card_fk6` FOREIGN KEY (`procedure_id`) REFERENCES `Procedure`(`id`);













