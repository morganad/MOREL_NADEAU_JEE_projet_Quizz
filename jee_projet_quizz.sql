-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 02 mars 2020 à 17:42
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
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

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
(7, 'Le lapin a une vision de :', 3),
(8, 'Lequel des éléments suivants n’est pas un concept POO en Java ?', 2),
(9, 'Quand la surcharge de méthode est-elle déterminée ?', 2),
(10, 'Quand la surcharge ne se produit pas ?', 2),
(11, 'Quel concept de Java est un moyen de convertir des objets du monde réel en termes de classe ?', 2),
(12, 'Comment s’appelle-t-on dans le cas où l’objet d’une classe mère est détruit donc l’objet d’une classe fille sera détruit également ?', 2),
(13, ' L’interprétation des programmes Java est effectuée par :', 2),
(14, 'Le marcassin est un', 3),
(15, 'Comment se nomme la femelle du lièvre ?', 3),
(16, 'Lequel de ces oiseaux peut voler à reculons ?', 3),
(17, 'Quel poisson possède environ 700 dents ?', 3),
(18, 'Combien de tentacules se trouvent sur la tête de la limace ?', 3),
(19, 'Quel mammifère est surnommé la licorne de mer ?', 3),
(20, 'Quelle annotation lie un paramètre de requête JPA à un argument de méthode ?', 1),
(21, 'Parmi les 4 réponses, qu\'est-ce qui agit comme un Front Controller dans Sptring Web App ?', 1),
(22, 'Qu\'est-ce que l’injection de dépendance ?', 1);

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
) ENGINE=MyISAM AUTO_INCREMENT=89 DEFAULT CHARSET=latin1;

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
(28, '360°\r\n', 0, 7),
(29, 'Héritage', 0, 8),
(30, 'Encapsulation', 0, 8),
(31, 'Polymorphisme', 0, 8),
(32, 'Compilation', 1, 8),
(33, 'Au moment de l\'exécution', 0, 9),
(34, 'Au moment de la compilation', 1, 9),
(35, 'Au moment du codage', 0, 9),
(36, 'Au moment de l\'éxécution', 0, 9),
(37, 'Quand il y a plusieurs méthodes avec le même nom mais avec une signature de méthode différente et un nombre ou un type de paramètres différent', 0, 10),
(38, 'Quand il y a plusieurs méthodes avec le même nom, le même nombre de paramètres et le type mais une signature différente', 1, 10),
(39, 'Quand il y a plusieurs méthodes avec le même nom, la même signature, le même nombre de paramètres mais un type différent', 0, 10),
(40, 'Quand il y a plusieurs méthodes avec le même nom, la même signature mais avec différente signature', 0, 10),
(41, 'Polymorphisme', 0, 11),
(42, 'Encapsulation', 0, 11),
(43, 'Abstraction', 1, 11),
(44, 'Héritage', 0, 11),
(45, 'Agrégation', 0, 12),
(46, 'Composition', 1, 12),
(47, 'Encapsulation', 0, 12),
(48, 'Association', 0, 12),
(49, 'API', 0, 13),
(50, 'JDK', 0, 13),
(51, 'JVM', 1, 13),
(52, 'AWT', 0, 13),
(53, 'Oiseau', 0, 14),
(54, 'Crustacé', 0, 14),
(55, 'Reptile', 0, 14),
(56, 'Mammifère', 1, 14),
(57, 'La lévrière', 0, 15),
(58, 'La hase', 1, 15),
(59, 'La lapine', 0, 15),
(60, 'La lièvre', 0, 15),
(61, 'La mésange', 0, 16),
(62, 'Le rouge gorge', 0, 16),
(63, 'Le colibri', 1, 16),
(64, 'Le moineau', 0, 16),
(65, 'Le brochet', 1, 17),
(66, 'La truite', 0, 17),
(67, 'La carpe', 0, 17),
(68, 'Le goujon', 0, 17),
(69, 'Onze', 0, 18),
(70, 'Deux', 0, 18),
(71, 'Quatre', 1, 18),
(72, 'Huit', 0, 18),
(73, 'Le requin blanc', 0, 19),
(74, 'Le narval', 1, 19),
(75, 'L\'espadon', 0, 19),
(76, 'La licorne', 0, 19),
(77, '@Param', 1, 20),
(78, '@QueryParam', 0, 20),
(79, '@RequestParam', 0, 20),
(80, '@QueryParameter', 0, 20),
(81, '@RestController', 0, 21),
(82, 'DispatcherServlet', 1, 21),
(83, 'Models', 0, 21),
(84, 'View', 0, 21),
(85, 'C\'est un design pattern qui implémente le pattern Inversion de contrôle(inversion of control, IoC) pour des applications logicielles', 1, 22),
(86, 'C\'est l’un des modules de Spring', 0, 22),
(87, ' C\'est une technique pour obtenir des dépendances de n\'importe quel projet', 0, 22),
(88, 'Il est utilisé pour promouvoir un couplage étroit dans le code', 0, 22);

-- --------------------------------------------------------

--
-- Structure de la table `reponsesutilisateurs`
--

DROP TABLE IF EXISTS `reponsesutilisateurs`;
CREATE TABLE IF NOT EXISTS `reponsesutilisateurs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `reponse_question_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=187 DEFAULT CHARSET=latin1;

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
