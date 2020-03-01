-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 01 mars 2020 à 22:28
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `jee_projet_quizz`
--

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Structure de la table `question`
--

DROP TABLE IF EXISTS `question`;
CREATE TABLE IF NOT EXISTS `question` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `intitule` varchar(255) NOT NULL,
  `quizz_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `question`
--

INSERT INTO `question` (`id`, `intitule`, `quizz_id`) VALUES
(1, 'Quelle exception est levée lors de l’initialisation du Servlet échoue?', 1),
(2, 'Lesquels des énoncés suivants sont corrects au sujet du status de la réponse Http?', 1),
(3, 'Le langage JAVA est ...?', 2),
(4, 'Java est un langage développé par ... ?', 2),
(5, 'Pourquoi les chats miaulent-ils ?', 3),
(6, 'Il faut promener son chien :', 3),
(7, 'Le lapin a une vision de :', 3);

-- --------------------------------------------------------

--
-- Structure de la table `quizz`
--

DROP TABLE IF EXISTS `quizz`;
CREATE TABLE IF NOT EXISTS `quizz` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `titre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `quizz`
--

INSERT INTO `quizz` (`id`, `titre`) VALUES
(1, 'Quizz sur le JEE'),
(2, 'Quizz sur le Java'),
(3, 'Quizz sur les animaux');

-- --------------------------------------------------------

--
-- Structure de la table `reponsesquestions`
--

DROP TABLE IF EXISTS `reponsesquestions`;
CREATE TABLE IF NOT EXISTS `reponsesquestions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `reponse` varchar(255) NOT NULL,
  `est_correct` tinyint(1) NOT NULL,
  `question_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reponsesquestions`
--

INSERT INTO `reponsesquestions` (`id`, `reponse`, `est_correct`, `question_id`) VALUES
(1, 'ServletException', 1, 1),
(2, 'RemoteException', 0, 1),
(3, 'IOException', 0, 1),
(4, 'SocketException', 0, 1),
(5, 'Un statut de 500 à 599 indique une erreur dans le client', 0, 2),
(6, 'Un statut de 400 à 499 indique une erreur dans le serveur.', 0, 2),
(7, 'Un statut de 300 à 399 sont des messages d’information.', 0, 2),
(8, 'Un statut de 200 à 299 signifie la requête de succès.', 1, 2),
(9, 'Compilé', 0, 3),
(10, 'Interprété', 0, 3),
(11, 'Compilé et interprété', 1, 3),
(12, 'Ni compilé ni interprété', 0, 3),
(13, 'Hewlett-Packard', 0, 4),
(14, 'Sun Microsystems', 1, 4),
(15, 'Microsoft', 0, 4),
(16, 'Oracle', 0, 4),
(17, 'Pour attirer l\'attention', 0, 5),
(18, 'Parce qu\'ils ont faim', 0, 5),
(19, 'Car ils veulent dormir', 0, 5),
(20, 'Pour attirer l\'attention et surtout quand ils ont faim', 1, 5),
(21, 'Au moins une fois par jour', 1, 6),
(22, 'Une fois par semaine', 0, 6),
(23, 'Pas besoin, il peut aller dans les toilettes', 0, 6),
(24, 'Quand on veut\r\n', 0, 6),
(25, '90°\r\n', 0, 7),
(26, '180°\r\n', 0, 7),
(27, '340°\r\n', 1, 7),
(28, '360°\r\n', 0, 7);

-- --------------------------------------------------------

--
-- Structure de la table `reponsesutilisateurs`
--

DROP TABLE IF EXISTS `reponsesutilisateurs`;
CREATE TABLE IF NOT EXISTS `reponsesutilisateurs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `reponse_question_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=166 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reponsesutilisateurs`
--

INSERT INTO `reponsesutilisateurs` (`id`, `reponse_question_id`) VALUES
(165, 14),
(164, 10);

-- --------------------------------------------------------

--
-- Structure de la table `score`
--

DROP TABLE IF EXISTS `score`;
CREATE TABLE IF NOT EXISTS `score` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `meilleur_score` int(11) NOT NULL,
  `dernier_score` int(11) NOT NULL,
  `utilisateur_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `score`
--

INSERT INTO `score` (`id`, `meilleur_score`, `dernier_score`, `utilisateur_id`) VALUES
(1, 100, 0, 4),
(4, 33, 33, 1),
(5, 66, 66, 2),
(6, 0, 0, 3),
(7, 0, 0, 5),
(8, 100, 100, 6);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `prenom` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `prenom`, `nom`) VALUES
(1, 'Jean', 'Kourin'),
(2, 'Noé', 'Omil'),
(3, 'Kevin', 'Jules'),
(4, 'Baptiste', 'Jean'),
(5, 'Arnaud', 'Louis'),
(6, 'Noelle', 'Amary');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
